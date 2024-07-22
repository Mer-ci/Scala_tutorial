package demo

object demo{

    def volumeOfSphere(r2: Double): Double = {
      (4.0 / 3.0) * math.Pi * math.pow(r2, 3)
     }

         def main(args: Array[String]): Unit = {
            println()
            println("Q3 Answer:-")

            val r2 = 5.0
            val volume = volumeOfSphere(r2)
            println(s"The volume of a sphere with radius $r2 is $volume")
         }


}