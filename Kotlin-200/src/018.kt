// 018 논리 연산자(Logical Operator) && || !

fun main(args: Array<String>): Unit
{
    val a = 15
    val b = 17

    var bool: Boolean = (a - b < a + b) && (a == 15)
    println(bool) // true (true && true)

    bool = !((a + b) > (a * 3) || (b - a) > 0)
    println(bool) // false !(false || true)
}