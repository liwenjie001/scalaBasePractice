package unit3

import scala.util.control.Breaks

/**
  * author: Mr.Li 
  * create: 2018-10-21 13:51 
  * description: 一些基础的语句练习
  **/
object Demo1 {
  def main(args: Array[String]): Unit = {
    //while循环的中断
    val loop = new Breaks
    var a = 0
    loop.breakable{
      while (a <20){
        a+=1
        if(a==18){
          loop.break()
          println(a)
        }
        println(a)
      }
    }
    // 多层for循环 to 为 前闭后闭的
    for(i <- 1 to 9 ;j <- 1 to 10){
      print("i*j="+i*j + " ")

    }
    // unitl 为前闭后开的 区间
    for(i<- 1 until 3 ){
      println(i)
    }
    println()
    //for示例3：引入保护式（也称条件判断式）该语句只打印1 3。保护式满足为true则进入循环内部，满足为false则跳过，类似于continue
    for(i <- 1 to 3 ;if i != 2){
      println(i)
    }
    //for示例4：引入变量
    for (i <- 2 to 4 ;j = 10 -i){
      println(j)
    }
    //for示例5：将遍历过程中处理的结果返回到一个，使用yield关键字
    //Vector(1, 2, 3, 4, 5, 6, 7, 8, 9, 10) 返回一个Vector的集合。
    val for4 = for (i<- 1 to 10 ) yield i


    println(for4)
    //懒性: lazy 使用能在最后优化一下内存小的问题
    
  }
}
