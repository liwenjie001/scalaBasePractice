package unit3

/**
  * author: Mr.Li 
  * create: 2018-10-20 19:58 
  * description: 
  **/
object practiceDemo1 {
  def main(args: Array[String]): Unit = {
    println(makeArr(5).mkString(" "))
    // to 喝 unitl 的差别在于 until 不包含右面的数字 也就是左闭右开区间。而to是都包含的。
    for (i <- 0 until(5,2) ){
      println(i)
    }
  }
  //1、编写一段代码，将a设置为一个n个随机整数的数组，要求随机数介于0和n之间。
  def makeArr(n:Int) = {
    val a = new Array[Int](n)
    val rand = new scala.util.Random()
    for (i <- a ) yield rand.nextInt(n)
  }
  //2.编写一个循环，将整数数组中相邻的元素置换。比如Array(1, 2, 3, 4, 5)置换后为Array(2, 1, 4, 3, 5)
  def reverse(a :Array[Int])= {
    // 先把取出小标为偶数的数组的值 先赋值给 t 然后在把奇数下标的值取出来赋值给偶数，在把奇数赋值给 偶数的。
    for (i<- 0 until (a.length-1,2)){
      //这个就是把两个数据对调。
      val t = a(i)
      a(i) = a(i+1)
      a(i+1) = t
    }
  }
}
