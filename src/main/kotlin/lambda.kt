fun processaInteiro(i: Int, f: (j: Int) -> Int) : Int {
    return f(i)
}

fun invert(x: Int) = x * -1

fun Int.executa(f: (Int) -> Int) =  f(this)


fun main(){

    val n: Int = processaInteiro(10, ::invert)
    println(n)

    val n2: Int = processaInteiro(11, { x: Int -> 2 * x})
    println(n2)

    val n3: Int = processaInteiro(12, {3 * it})
    println(n3)

    val n4: Int = processaInteiro(13) {4*it}
    println(n4)

    val n5: Int = 16.executa{it * it}
    println(n5)

    val n6: Int = 17.executa(){3 * it}
    println(n6)

    val fl: (Int) -> Int = {x: Int -> 2 * x}
    val n7: Int = 18.executa(fl)
    println(n7)

    val fl2 = {y: Int -> 3 * y}
    val n8: Int = processaInteiro(19, fl2)
    println(n8)

}