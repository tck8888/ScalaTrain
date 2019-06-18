package com.tck.scala

/**
  * description:</br>
  * created on: 2019/6/18 9:00</br>
  *
  * @author tck
  * @version 1.0
  *
  */
object FunctionApp {

  def main(args: Array[String]): Unit = {
    println(add(4, 9))
    println(speed(4, 9))
    println(speed(dis = 4, time = 9))
    println(speed(time = 9, dis = 4))
    println(sum(1, 2, 3, 4))

    //条件表达式

    1 to 10
    Range(1,10,0)
  }

  def add(x: Int, y: Int): Int = {
    x + y
  }

  def dayHell(): Unit = {

  }

  def speed(dis: Float, time: Float): Float = {
    dis / time
  }

  //可变参数
  def sum(number: Int*): Int = {
    var result = 0;
    for (elem <- number) {
      result += elem
    }
    result

  }



}
