object CelsiusToFahrenheit {
  def ToFahrenheit(x: Float): Float = return x*1.8000f + 32.00f

  def main(args: Array[String]): Unit = {
    println("35 C in Fahrenheit is " + ToFahrenheit(35) + " F")
  }
}
