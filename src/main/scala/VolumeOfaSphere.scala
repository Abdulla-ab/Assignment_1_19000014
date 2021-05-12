import math.Pi

object VolumeOfaSphere {
  def VolumeSpehere(radius: Float): Float = return ((4.0/3.0) * (math.Pi) * math.pow(radius,3)).toFloat

  def main(args: Array[String]): Unit = {
    println("The Volume of a Sphere with raidus 5 is " + VolumeSpehere(5))
  }
}
