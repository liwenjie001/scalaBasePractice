package unit3

/**
  * author: Mr.Li 
  * create: 2018-11-01 21:21 
  * description: 
  **/
object ArrayDemo {
  def main(args: Array[String]): Unit = {
    val arr = Array(1, 2, 3, 4, 5)
    println(arr(1))
    for (i<- 1 to arr.length) println(i)
//    println(arr.length)
    println(1%2)
  }
}
