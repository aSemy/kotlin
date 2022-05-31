/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

@file:Suppress("DuplicatedCode")

package org.jetbrains.kotlin.fir.references.impl

import org.jetbrains.kotlin.KtSourceElement
import org.jetbrains.kotlin.fir.references.FirThisReference
import org.jetbrains.kotlin.fir.symbols.FirBasedSymbol
import org.jetbrains.kotlin.fir.visitors.*

/*
 * This file was generated automatically
 * DO NOT MODIFY IT MANUALLY
 */

internal class FirImplicitThisReference(
    override val boundSymbol: FirBasedSymbol<*>?,
    override var contextReceiverNumber: Int,
) : FirThisReference() {
    override val source: KtSourceElement? get() = null
    override val labelName: String? get() = null

    override fun <R, D> acceptChildren(visitor: FirVisitor<R, D>, data: D) {}

    override fun <D> transformChildren(transformer: FirTransformer<D>, data: D): FirImplicitThisReference {
        return this
    }

    override fun replaceBoundSymbol(newBoundSymbol: FirBasedSymbol<*>?) {}

    override fun replaceContextReceiverNumber(newContextReceiverNumber: Int) {
        contextReceiverNumber = newContextReceiverNumber
    }
}
