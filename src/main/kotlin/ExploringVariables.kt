import java.util.*

fun main(args: Array<String>) {
        //var name: String = "Edd" // No need of this, because kotlin can infer the type of data
        var name = "Edd"
        //val surname: String = "RodAri"
        val surname = "R. Arias"
        name = "Edgar"
        //surname = "Rodriguez Arias"//Cannot be changed, that reason the compiler error
        //println("Hello " + name + " " + surname)// this can be converted to a string template like:
        println("Hi $name ${surname.uppercase(Locale.getDefault())}")
        println("Your first name has: ${name.length} characters")// you could call length without () and inside {} brackets
        println("This is the way you scape the dollar symbol \$About10")
        val story = """It was a dark and stormy night
            |and the wind was really cold
            |and nobody sense its fingers""".trimMargin()

        println(story)

        val replaceAfterLast = story.replaceAfterLast("and", "&")// need new variable  because story is immutable
        println(replaceAfterLast)
    }

