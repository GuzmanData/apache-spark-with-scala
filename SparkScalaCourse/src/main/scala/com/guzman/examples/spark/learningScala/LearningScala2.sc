// Flow control


if (1 > 3) println("impossible") else println("the world makes sense!")


if (1 > 3) {
  println("impossible")
} else {
  println("the world makes sense")
}


//Matching

val number: Int = 3

number match {
  case 1 => println("One")
  case 2 => println("Two")
  case 3 => println("Three")
  case _ => println("Something else")
}


//Bucles

for (x <- 1 to 4) {
  val squared = x * x
  println(squared)
}


var x = 10

while (x >= 0) {
  println(x)
  x -= 1
}

x = 0
do {
  println(x); x += 1
} while (x <= 10)


//Expresions

{val x  = 10; x + 20}

println({val x  = 10; x + 20})




