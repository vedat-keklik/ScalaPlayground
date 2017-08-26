package main.scala.classes

class Person(name: String, age: Int) {
  override def toString = s"${getClass.getName}[name=$name]"
}
