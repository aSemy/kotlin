// IGNORE_BACKEND: WASM
// IGNORE_BACKEND_FIR: JVM_IR
// IGNORE_BACKEND: JS_IR
// TODO: muted automatically, investigate should it be ran for JS or not
// IGNORE_BACKEND: JS, NATIVE

// WITH_RUNTIME

fun foo1(x: Int): Boolean {
    when(x) {
        2 + 2 -> return true
        else -> return false
    }
}

fun foo2(x: Int): Boolean {
    when(x) {
        Integer.MAX_VALUE -> return true
        else -> return false
    }
}

fun box(): String {
    assert(foo1(4))
    assert(!foo1(1))

    assert(foo2(Integer.MAX_VALUE))
    assert(!foo2(1))

    return "OK"
}
