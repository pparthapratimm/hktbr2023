
fun fibonacci(t1: Int, n: Int, t2: Int) {
    var m1 = t1
    var m2 = t2
    while (m1 <= n) {
        print("$m1 + ")

        var sum = m1 + m2
        m1 = t2
        m2 = sum
    }
}

fun main(args: Array<String>) {
    var n = 12
    var t1 = 0
    var t2 = 1
    fibonacci(t1, n, t2)
}
