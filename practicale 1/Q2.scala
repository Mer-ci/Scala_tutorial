package demo

object demo {

    def celsiusToFahrenheit(celsius: Double): Double = {
    celsius * 1.8 + 32
  }

   def main(args: Array[String]): Unit = {
    println()
        println("Q2 Answer:-")

        val celsiusTemperature = 32.0

        val fahrenheitTemperature = celsiusToFahrenheit(celsiusTemperature)
        println(s"The temperature $celsiusTemperature°C is equal to $fahrenheitTemperature°F")
   }

}