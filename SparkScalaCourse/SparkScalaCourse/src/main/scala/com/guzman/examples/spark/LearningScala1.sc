//VALUES are inmutable constants
val hello: String = "Hello!"


//Variables are mutable
var helloThere: String = hello
helloThere = hello + " There!"

val inmutableHelloThere: String = hello + "There"


// Data types
val numberOne: Int = 1
val truth: Boolean = true
val letterA: Char = 'a'
val pi: Double = 3.14159265
val piSiglePrecision: Float = 3.14159265f
val bigNumber: Long = 1233456789
val smallNumber: Byte = 127


//Prints
println(helloThere + numberOne + truth + letterA + bigNumber)

println(f"Pi is about $piSiglePrecision%.3f")
println(f"Zero padding on the left: $numberOne%05d")

println(s"I can use the s prefix to use variable like $numberOne $truth $letterA")

println(s"I can use any expression. Like ${1 + 2}")


//Regular expression

val theUltimateAnswer: String = "to life, The universe, and everything is 42."
val pattern = """.* ([\d]+).*""".r
val pattern(answerString) = theUltimateAnswer
val answer = answerString.toInt
println(answer)


//Booleans
val isGreatet = 1 > 2
val isLesser = 1 < 2
val impossible = isGreatet & isLesser
val anotherWay = isGreatet || isLesser


val picard: String = "Picard"
val bestCaptain: String = "Picard"
val isBest: Boolean = picard == bestCaptain














