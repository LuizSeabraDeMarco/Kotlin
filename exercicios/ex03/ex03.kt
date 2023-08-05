fun main(){
    var inteiro: Int = 1
    var helloWord: String = "Hellow Word"

    println("Hellow " + "Word")
    val nome: String = "Luiz Filipe"
    println("Meu nome: $nome")
    println("1 + 2 = ${1 + 2}")
    println("10 - 2 = ${10 - 2}")
    println("4 x 2 = ${4 * 2}")
    println("20 / 11 = ${20 / 11}")
    println("20.0 / 11.0 = ${20.0 / 11.0}")
    println("10 % 3 = ${10 % 3}")

    /*
    Operadores de Comparação
     == -> Igual
     > -> maior
     < -> Menor
     >= -> Maior Igual
     <= -> Menor Igual
    */
    println("1 == 1 -> ${1 == 1}")
    println("3 == 1 -> ${3 == 1}")
    println("3 > 1 -> ${3 > 1}")
    println("3 < 1 -> ${3 < 1}")

    println("Fernando == Fernando: ${"Fernando" == "Fernando"}")
    println("Fernando != Fernando: ${"Fernando" != "Fernando"}")

    println(arrayOf(1, 2, 3) == (arrayOf(1, 2, 3)))
    println(arrayOf(1, 2, 3).contentEquals(arrayOf(1, 2, 3)))

    val array1 = arrayOf(1, 2, 3)
    val array2 = arrayOf(1, 2, 3)
    println(array1 == array2)
    println(array1.contentEquals(array2))

} 