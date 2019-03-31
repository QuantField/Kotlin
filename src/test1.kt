


fun square(x: Double):Double = x*x



data class Person(val name:String, val age:Int)

val sample = listOf(
        Person("Karl",34),
        Person("Abas",55),
        Person("Karim",45),
        Person("Keith",22)
    )

val age = sample.map{ per -> per.age}

fun main(arg : Array<String>){
    println("Hello world")
    println(sample)
    println(age)
    val min = age.min()
    val max = age.max()
    val mean = age.average()
    val count = age.count()
    println("""
        | min = $min,
        | max = $max,
        | mean = $mean,
        | count = $count
    """.trimIndent())

    val age_sorted = sample.sortedBy{ item -> item.age }
    println(age_sorted)
}
