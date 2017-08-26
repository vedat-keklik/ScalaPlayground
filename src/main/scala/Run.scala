import main.scala.classes.FirstClass

object Run extends App {
  def classes {
    val firstInstance = new FirstClass(12, 3, 0, 0)
    println(firstInstance.sum)
    println(firstInstance.diff())
    println(firstInstance.mul)
  }
  classes
}
