package unit1

/**
  * author: Mr.Li 
  * create: 2018-10-20 17:26 
  * description: 这个是scala一些基础的入门的东西。
  *
  **/
object practiceDemo1 {
  def main(args: Array[String]): Unit = {
    //1、在Scala REPL中，计算3的平方根,然后再对该值求平方。现在，这个结果与3相差多少？
    val a = math.sqrt(3)
    println(3 - a*a )
    //2.如何检测一个变量是val还是var?
    // 一个可变一个不可变，只要给其赋值就可以了
    //a =30
    var b = 3
    b = 4
    //3、Scala允许你用数字去乘一个字符串，去REPL中试一下"crazy"*3。这个操作做什么？在Scaladoc中如何找到这个操作?
    val c = "crazy" * 3
    println(c)
    // 由此可见 * 是字符串中的方法。但是java确实是没有的。

    //10 max 2的含义是什么？max方法定义在哪个类中？
    //可以看出,此方法返回两个数字中较大的那个。此方法Java中不存在，所以在RichInt中。
    println(10.00 max 2)
    println(10 max 2)
    //用BigInt计算2的1024次方
    println(BigInt(2).pow(1024))
    println()
    //6、在Scala中如何获取字符串“Hello”的首字符和尾字符？
    println("Hello"(0))
    println("Hello".take(1))
    println("Hello".reverse(0))
    println("Hello".reverse.take(1))


  }

}
