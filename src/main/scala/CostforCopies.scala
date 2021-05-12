object CostforCopies {

  def CostCopies(noOfCopies: Int): Float = return ((24.95*0.4 + 3)*50 + (24.95*0.4 + 0.75)*10).toFloat

  def main(args: Array[String]): Unit = {
    println("The Cost for 60 Copy is Rs." + CostCopies(60))
  }

}
