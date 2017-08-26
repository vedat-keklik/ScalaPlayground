package main.scala.classes


class FirstClass (val f0:Int, val f1:Int, val d0:Int = 0, private[this] var secret:Int) {
  override def toString = sum + ""
  def sum = f0+f1     // clients must call sum, not sum()
  def diff() = f0-f1  // clients may call diff or diff()
  def mul() = f0*f1   // clients may call mul or mul()

  var age = 0 // public

  /*
  on JVM, 'age' is a private field, scalac defines a getter (age()) and a setter (age_=) for it

  private int age;

  public int age();
  public void age_$eq(int);
  */

  private[this] var topSecret = 0 // Cannot be accessed from even another instance of the 'FirstClass'

  class NestedClass(val name: String) {

  }
  /*
  In Scala, each instance has its own class NestedClass , just like each instance has its own field members .
   */

}