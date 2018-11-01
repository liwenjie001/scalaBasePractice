package unit3


/**
  * author: Mr.Li 
  * create: 2018-11-01 20:52 
  * description: 
  **/
object practiceDemo2 {
  def main(args: Array[String]): Unit = {

    def makeArr(n:Int) :Array[Int] = {
      val a = new Array[Int](n)
      //创建一个对象
      val rand =  new scala.util.Random()
      for (i <- a) yield rand.nextInt(n)
    }

    println(makeArr(5).mkString(" "))

    //编写一个循环将整数数组对换相邻的元素。比如Array(1, 2, 3, 4, 5)置换后为Array(2, 1, 4, 3, 5)
    //方式1.
    def revert(n:Array[Int]):Array[Int] = {
      val arr = new Array[Int](n.length)
      for(i<-0 to n.length-1){
        if(i%2!=0){
          arr(i) = n(i-1)
          arr(i-1) = n(i)
        }
      }
      if((n.length-1)%2==0) arr(n.length-1) = n(n.length-1)
      arr
    }
    val arr = Array(1, 2, 3, 4, 5)
//    println(revert(arr).mkString(" "))

    // 方式二 使用 scala的 until
    def revert2(n:Array[Int]) = {
      //这个 until 可以设置步子大小，所以会使其for循环走的很灵活
      for (i<-0 until(n.length-1,2)){
        val t = n(i)
        arr(i) = arr(i+1)
        arr(i+1) = t
      }
    }
    revert2(arr)
    arr.foreach(println)


  }
}
