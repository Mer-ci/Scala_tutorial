package demo

object demo {


   
    def areaOfDisk(r1: Double): Double = {
      math.Pi * r1 * r1
    }

 def main(args: Array[String]): Unit = {
      println()
      println("Q1 Answr:-")

      val r1 = 5.0
      val area = areaOfDisk(r1)
      println(s"The area of a disk with radius $r1 is $area")

 }
}




