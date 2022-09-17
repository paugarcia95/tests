import kotlin.random.Random

fun main(args: Array<String>) {

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}")

//    xifra("abcdefghijklmnopqrstuvxyz")
    banner()
    pla()

    val elements = listOf("H", "He", "Li", "Be", "B", "C", "N", "O", "F", "Ne")

    println("The periodic table contains the following elements:")
    for (i in 0 until elements.size) {
        println("At position $i there are ${elements[i]}")
    }
}

fun pla() {
    val moviments = "sseoonesosnoesnosenesonsoneonesosoosososososososososososososososososossososoososossonnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnsnoesnoesnesoneseosnnsnsnnssnsnsnsnsnsnsnooon"
    var x = 0
    var y = 0

    for (m in moviments) {
        when (m) {
            'n' -> ++y
            's' -> --y
            'e' -> ++x
            'o' -> --x
            else -> println("Error")
        }
    }

    println("Posició final ($x,$y)")
}

fun banner() {
    val text = "Et faig un bizum de 25 € i llavors tindé 100 euros al banc perque abans en tenia 75"
    var resultat = ""

    for (paraula in text) {
        resultat += if (!paraula.isDigit())
            "$paraula"
        else
            "X"
    }

    println(resultat)
}

fun xifra(text: String) {
    val xifratge = 11

    for (c in text) {
        val xifrat = c.code + xifratge
        val normalitza = (xifrat - 'a'.code) % 26 + 'a'.code
        print(normalitza.toChar())
    }

    val a = Random.nextInt(1, 1000)
    var win = false
    while (!win) {
        print("Nombre: ")

        val intent = readLine()?.toIntOrNull() ?: continue

        if (intent == a)
            win = true
        else if  (intent > a )
            println("el nombre que busques es mes peque")
        else
            println("el nombre que busques es mes gran")
    }

    println("Has guanyat! El nombre era: $a")

}


