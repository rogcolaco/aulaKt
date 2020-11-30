fun main(){
    var nome: String = "Rogerio"

    var sobrenome: String?
    sobrenome = null

    var sn: String
    sn = sobrenome ?: "Colaco"

    println(sobrenome?.length)
    println(sobrenome?.capitalize())

    try{
        //println(sobrenome!!.length)
        println(sobrenome!!.capitalize())
    } catch (ne: NullPointerException){
        println("Try - Catch")
    }

    if(sobrenome != null){
        println(sobrenome.capitalize());
    }

}