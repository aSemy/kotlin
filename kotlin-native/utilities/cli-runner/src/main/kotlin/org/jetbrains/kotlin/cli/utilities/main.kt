/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the LICENSE file.
 */
package org.jetbrains.kotlin.cli.utilities

import org.jetbrains.kotlin.native.interop.gen.defFileDependencies
import org.jetbrains.kotlin.cli.bc.main as konancMain
import org.jetbrains.kotlin.cli.klib.main as klibMain
import org.jetbrains.kotlin.cli.bc.mainNoExitWithGradleRenderer as konancMainForGradle
import org.jetbrains.kotlin.backend.konan.env.setEnv
import org.jetbrains.kotlin.konan.util.usingNativeMemoryAllocator

private fun mainImpl(args: Array<String>, runFromDaemon: Boolean, konancMain: (Array<String>) -> Unit) {
    val utilityName = args[0]
    val utilityArgs = args.drop(1).toTypedArray()
    when (utilityName) {
        "konanc" ->
            konancMain(utilityArgs)

        "cinterop" -> {
            val konancArgs = invokeInterop("native", utilityArgs, runFromDaemon)
            konancArgs?.let { konancMain(it) }
        }
        "jsinterop" -> {
            val konancArgs = invokeInterop("wasm", utilityArgs, runFromDaemon)
            konancArgs?.let { konancMain(it) }
        }
        "klib" ->
            klibMain(utilityArgs)
        "defFileDependencies" ->
            defFileDependencies(utilityArgs, runFromDaemon)
        "generatePlatformLibraries" ->
            generatePlatformLibraries(utilityArgs)

        "llvm" -> runLlvmTool(utilityArgs)
        "clang" -> runLlvmClangToolWithTarget(utilityArgs)

        else ->
            error("Unexpected utility name")
    }
}

fun main(args: Array<String>) = mainImpl(args, false, ::konancMain)

private fun setupClangEnv() {
    setEnv("LIBCLANG_DISABLE_CRASH_RECOVERY", "1")
}

fun daemonMain(args: Array<String>) = usingNativeMemoryAllocator {
    setupClangEnv() // For in-process invocation have to setup proper environment manually.
    mainImpl(args, true, ::konancMainForGradle)
}