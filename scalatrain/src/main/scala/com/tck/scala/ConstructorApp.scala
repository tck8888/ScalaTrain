package com.tck.scala

/**
  * description:</br>
  * created on: 2019/6/18 12:55</br>
  *
  * @author tck
  * @version 1.0
  *
  */
object ConstructorApp {

  def main(args: Array[String]): Unit = {

  }
}

//主构造器
class Person(val name: String, val age: Int) {
  val school = "tck"
  var gender: String = _

  //附属构造器
  def this(name: String, age: Int, gender: String) {
    this(name, age)
    this.gender = gender
  }
}
