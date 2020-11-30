fun multiplos (a:Int, b:Int): Boolean {
    val c: Int = a % b
    if(c==0){
        return true
    }
    return false
}

fun multiplosPadrao (a:Int = 10, b:Int): Boolean {
    val c: Int = a % b
    if(c==0){
        return true
    }
    return false
}

infix fun Int.multiplo(b:Int):Boolean{
    return multiplos(this,b)
}

fun main(){
    println(multiplos(10,3))
    val x: Int = 10
    println(x.multiplo(2))
    println(x multiplo 3)

    println(multiplosPadrao(b=3))

    println("${if (multiplos(10,3)) "multiplo" else "Nao multiplo"}")
}