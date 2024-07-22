package demo
    object demo {

        def totalWholesaleCost(coverPrice: Double, discount: Double, copies: Int): Double = {
      

            val discountedPrice = coverPrice * (1 - discount / 100)
            
            val totalBookCost = discountedPrice * copies

            val shippingCost = if (copies <= 50) {
                3
            } else {
                3 + (copies - 50) * 0.75
            }

            totalBookCost + shippingCost

        }

        def main(args: Array[String]): Unit = {

            println()
            println("Q4 Answer")

            val coverPrice = 24.95
            val discount = 40.0
            val copies = 60

            // Calculate the total wholesale cost
            val totalCost = totalWholesaleCost(coverPrice, discount, copies)
            println(s"The total wholesale cost for $copies copies is Rs. $totalCost")

            }
        

    }