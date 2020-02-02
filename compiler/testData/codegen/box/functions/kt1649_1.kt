// IGNORE_BACKEND: WASM
// IGNORE_BACKEND_FIR: JVM_IR
interface A {
    val method : (() -> Unit)?
}

fun test(a : A) {
    if (a.method != null) {
        a.method!!()
    }
}

class B : A {
    override val method = { }
}

fun box(): String {
    test(B())
    return "OK"
}
