fun main(){
    //Lista é imutável
    var familia: List<String> = listOf("Rogerio", "Monica")

    for (integrante in familia){
        println(integrante)
    }

    println()

    val listaInteiros: List<Int> = listOf(1,2,3,4,5,6,7,8,9,10)
    for (i in 0..9){
        println(listaInteiros[i])
    }

    println()

    val listaInteiros2: List<Int> = (1..10).toList()
    for (i in 0..9){
        println(listaInteiros2[i])
    }

    println()

    val listaInteiros3: List<Int> = (1..10 step 2).toList()
    for (i in 0 until listaInteiros3.size){
        println(listaInteiros3[i])
    }
    println("Imprimindo com forEach")
    listaInteiros3.forEach { x: Int ->  println("elemento: $x") }
    println("Imprimindo com forEach 2")
    listaInteiros3.forEach { println("elemento: $it") }

    // Lista mutável
    val listaCursos: MutableList<String> = mutableListOf("ADS", "TPG", "Matematica")
    listaCursos.add("Biblioteconomia")

    println()
    listaCursos.forEach { println(it) }

    // Set e mutableSet
    val setCursos : MutableSet<String> = mutableSetOf("ADS", "SDM", "TII")
    setCursos.add("ADS")
    setCursos.add("SDM")
    setCursos.add("TMA")
    println()
    setCursos.forEach{(println(it))}

    //Map e MutableMap, HashMap
    val familiaMap: MutableMap<String, String> = mutableMapOf(
        Pair("Pai", "Nome do Pai"),
        Pair("Mae", "Nome da Mae"),
        Pair("Filho", "Nome do Filho")
    )
    //familiaMap.put("Cachorro", "Nome do Cachorro")
    familiaMap["Cachorro"] = "Nome do Cachorro"

    println()
    familiaMap.keys.forEach { println("$it - ${familiaMap[it]}") }
}