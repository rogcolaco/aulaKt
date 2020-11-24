fun main(){
    //Lista é imutável
    var familia: List<String> = listOf("Rogerio", "Monica")

    for (integrante in familia){
        println(integrante)
    }

    println("\n")

    val listaInteiros: List<Int> = listOf(1,2,3,4,5,6,7,8,9,10)
    for (i in 0..9){
        println(listaInteiros[i])
    }

    println("\n")

    val listaInteiros2: List<Int> = (1..10).toList()
    for (i in 0..9){
        println(listaInteiros2[i])
    }

    println("\n")

    val listaInteiros3: List<Int> = (1..10 step 2).toList()
    for (i in 0 until listaInteiros3.size){
        println(listaInteiros3[i])
    }
}