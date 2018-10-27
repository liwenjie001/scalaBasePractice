package unit2

/**
  * author: Mr.Li 
  * create: 2018-10-20 17:43 
  * description: 
  **/
object practiceDemo1 {
  def main(args: Array[String]): Unit = {
    //1、一个数字如果为正数，则它的signum为1;如果是负数,则signum为-1;如果为0,则signum为0.编写一个函数来计算这个值
    //这是一个简单的逻辑判断
    /*def signum(x:Int) = {
      if (x>0) println(1)
      else if (x<0) println(-1)
      else println(0)
    }
    signum(1)*/
    // scala 当中以及实现了 signum 这个方法 ，这是判断一个数 是否为正负数的。
    println(BigInt(2000).signum)
    //2、一个空的块表达式{}的值是什么？类型是什么？
    val x = {}
    println(x) //()
    //3、针对下列Java循环编写一个Scala版本:
    //         for(int i=10;i>=0;i–)System.out.println(i);
    for(i <- 1 to 10 ){
      println(i)
    }
    //4、编写一个过程countdown(n:Int)，打印从n到0的数字
    def countdown(n:Int)  = {
      // reverse 是倒叙过来的意思。
      (1 to n).reverse.foreach(println(_))
    }
    countdown(30)
    //5、编写一个for循环,计算字符串中所有字母的Unicode代码（toLong方法）的乘积。举例来说，"Hello"中所有字符串的乘积为9415087488L
    var t:Long = 1
    /*for (i <- "Hello"){
      t = t * i.toLong
    }
    println(t)*/
    //6、同样是解决前一个练习的问题，请用StringOps的foreach方式解决。
    "Hello".foreach(t*=_.toLong)
    println(t)
    //7、编写一个函数product(s:String)，计算字符串中所有字母的Unicode代码（toLong方法）的乘积
    def product(s:String):Long ={
      var t:Long = 1
      for (i<-s){
        t*=i.toLong
      }
      t
    }

  }
}
