//Single Expression - Nesses casos podemos inclusive ocultar o retorno das fuçoes

//fun processaTexto(s1: String, s2: String, processa: (String, String) -> String ): String = processa(s1,s2)
fun processaTexto(s1: String, s2: String, processa: (String, String) -> String ) = processa(s1,s2)

//fun concatena(a:String, b: String): String = "$a$b"
fun concatena(a:String, b: String) = "$a$b"

//fun inverte(a:String, b: String): String = "${a.reversed()}${b.reversed()}"
fun inverte(a:String, b: String) = "${a.reversed()}${b.reversed()}"

fun List<String>.paraCadaString(funcao: (String) -> String): List<String> {
    val returnList: MutableList<String> = mutableListOf()

    this.forEach { returnList.add(funcao(it)) }

    /*for(s in this){
        returnList.add(funcao(s))
    }*/

    return returnList
}

fun primeiraLetra(s: String): String = s.first().toString()

fun main(){

    val x = "Ola, "
    val y = "mundo"
    println(processaTexto(x,y, ::concatena))
    println(processaTexto(x,y, ::inverte))

    println(processaTexto(x, y, { a,b -> "${a.capitalize()}${b.capitalize()}" } ))

    //No caso de lambda e sendo o último parametro podemos passar fora dos parentes
    println(processaTexto(x, y) { a,b -> "${a.capitalize()}${b.capitalize()}" } )

    var familia: List<String> = listOf("Rogerio", "Monica")

    familia.paraCadaString(::primeiraLetra).forEach{(println(it))}

    //utilização do lambda para criar a funçao passada como parametro
    familia.paraCadaString { s ->  s.last().toString() }.forEach({println(it)})
}