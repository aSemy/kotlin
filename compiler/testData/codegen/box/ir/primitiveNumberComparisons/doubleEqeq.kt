// !LANGUAGE: +ProperIeee754Comparisons
// IGNORE_BACKEND: WASM
// IGNORE_BACKEND_FIR: JVM_IR
fun eqeq(x: Any, y: Any) =
        x is Double && y is Double && x == y

fun anyEqeq(x: Any, y: Any) =
        x == y

fun box(): String {
    val Z = 0.0
    val NZ = -0.0

    if (!(Z == NZ)) return "Fail 1"
    if (!eqeq(Z, NZ)) return "Fail 2"

    if (anyEqeq(Z, NZ)) return "Fail A"

    return "OK"
}