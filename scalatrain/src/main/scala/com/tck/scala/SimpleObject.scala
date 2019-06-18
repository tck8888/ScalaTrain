package com.tck.scala

/**
  * description:</br>
  * created on: 2019/6/18 12:48</br>
  *
  * @author tck
  * @version 1.0
  *
  */
object SimpleObject {

  def main(args: Array[String]): Unit = {
    val person = new People()
    person.name="tck"
    println(person.eat())
  }
}


class People {
  var name: String = _
  val age =  10
  private [this] val gender="male"

  def eat():String={
    name+"eat。。。"
  }
}