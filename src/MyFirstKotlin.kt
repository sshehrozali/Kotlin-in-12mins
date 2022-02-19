fun mycutefunction(name: String) {
    println("Why you called me $name? :/")
}

fun main() {
    println("Hello this is my First Kotlin! I am so Happy today! Wohoooooo :D")

    val MyName = "Shehroz"  // Cannot be changed
    var Height = "6ft"      // Can be changed
    println("My name is $MyName and my Height is $Height")  // Insert values

    val FirstName = "Shehroz"
    val LastName = "Ali"
    val FullName = FirstName + " " + LastName     // Concatenation
    println(FullName)

    // Integers
    val num1 = 10
    val num2 = 20

    // Operators
    val add = num1 + num2
    val subtract = num1 - num2
    val multiply = num1 * num2
    val divide = num1 / num2
    val modulo = num1 % num2

    println("$add \n $subtract \n $multiply \n $divide \n $modulo")

    val MyCar = "Nissan 180SX Dual Turbo Charged"

    // Indexing
    println(MyCar[0])
    println(MyCar[9])

    // Starts from 7th char goes to last
    println(MyCar.subSequence(7, MyCar.length - 1))

    val passing = 1
    val myscore = 2
    if (myscore > passing) {
        println("I am above and beyond! :D")
    }
    if (passing == myscore) {
        println("I passed, literally!!!!")
    }

    val names = listOf("Ali", "Sara","Koi Cool sa naam")    // Collections
    println(names[2])

    val namesV2 = mutableListOf("Ali","Sara", "Cool name again")
    namesV2.add("Cool name again 2.0")
    println(namesV2)

    for (name in namesV2) {
        println(name)
    }

    // Includes 5
    for (i in 1..5) {
        println(i)
    }

    // Excludes 5
    for (i in 1 until 5) {
        println(i)
    }

    mycutefunction("Shehroz")

    val WhatsAppStatus: String? = "kEwl<3"  // It is null
    println(WhatsAppStatus)

    if (WhatsAppStatus != null) {
        println(WhatsAppStatus)
    }
    else{
        println("Value is null")
    }
}