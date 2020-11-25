fun main(){
    val numString: String = 10.toString()
    val numDouble: Double = numString.toDouble()
    val numFloat: Float = numDouble.toFloat()
    val numInt: Int = numFloat.toInt()
    println(numInt)
    println(numInt.javaClass)

    println()
    val any: Any = "Any equivale a Object em java"
    //val any: Any = 10.56
    val string: String? = any as? String
    println(string)
    println(string?.javaClass)

    if(any is String){
        println(any.capitalize())
        println(any.length)
    }
}