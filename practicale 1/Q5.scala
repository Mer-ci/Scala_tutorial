package demo
    object demo {
        def totalRunningTime(distances: List[Double], paces: List[Double]): Double = {
     
      val totalTime = distances.zip(paces).map { case (distance, pace) => distance * pace }.sum
      totalTime
    }


    def main(args: Array[String]): Unit = {
        println()
      println("Q5 Answer")

      val distances = List(2.0, 3.0, 2.0)
     
      val paces = List(8.0, 7.0, 8.0)

      val totalTime = totalRunningTime(distances, paces)

      println(f"The total running time is $totalTime%.2f minutes")

    }

}

