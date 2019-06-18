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
  }

  def add(x: Int, y: Int): Int = {
    return x + y
  }

}
