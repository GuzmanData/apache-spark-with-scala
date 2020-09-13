// Data Structures

//Tuples
//inmutables list

val courseList = ("scala", "spark", "hdfs")
println(courseList)


println(courseList._1)
println(courseList._2)
println(courseList._3)


val keyValue = "Peru" -> "Lima"
println(keyValue._1)


val custom = ("Carlos", 25, true)




//List
// like a tuple but more functionality
//Must be of same type
val myList = List("Scala", "Spark", "Streaming", "Machine Learning")

println(myList(0))

println(myList.head)
println(myList.tail)

for (list <- myList) {
  println(list)
}

val myListReverse = myList.map((listd: String) => listd.reverse)
myListReverse.foreach(x => println(x))



val numberList = List(1, 3, 5, 6, 7, 3, 12)
val sum = numberList.reduce((x: Int, y: Int) => x + y)


//Filter
val iHateFive = numberList.filter((x: Int) => x != 5)
println(iHateFive)


val iHateThree = numberList.filter(_ != 3)
println(iHateThree)


// Concatene List
val moreNumber = List(3, 4, 2, 7)
numberList ++ moreNumber



val reversed = numberList.reverse
val sorted = numberList.sorted



val lostOfDucplicates = numberList ++ numberList
val distincValues = lostOfDucplicates.distinct
val maxValue = numberList.max
val total = numberList.sum
val hasTrhee = numberList.contains(3)


//Maps

val contryMap = Map("Peru" -> "Lima", "Venezuela" -> "Caracas", "Argentina" -> "Buenos Aires")

println(contryMap("Peru"))
println(util.Try (contryMap("peru")) getOrElse "null")