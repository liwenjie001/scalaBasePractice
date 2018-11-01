package unit4

/**
  * author: Mr.Li 
  * create: 2018-10-27 19:51 
  * description: 模式匹配
  **/
object Demo1 {
  def main(args: Array[String]): Unit = {
    var result = 0
    val op :Char = '-'
    op match {
      case '+' => result = 1
      case '-' => result = 2
      case '*' => result = 3
      case _ => result = 0
    }
    println(result)
    //守卫
    for (ch <- "+-3!"){
      var sign = 0
      var digit = 0
      ch match {
        case '+' => sign = 1
        case '-' => sign = -1
        case _ if ch.toString.equals("3")=>digit=3
        case _ => sign = 0
      }
      println(ch + " " + sign + " " + digit)
    }
    //匹配列表
    for(lst <- Array(List(0),List(0,1),List(0,0,0),List(1,0,0))){
      val result = lst match {
        case 0::Nil => "0"
        case x::y::Nil => x + " " + y
        case 0::tail => "0...."
        case _ => "something else"
      }
      println(result)
    }
    //提取器
    //模式匹配，什么才算模式匹配呢？即，case 中 unapply 方法返回some 集合则为匹配成功。
    //返回none则表示失败了。
    //unapply
    //调用 unapply 传入 number
    //接受返回值，并判断返回值是 None 还是 Some
    //变量声明模式
    //match 中每一个case都可以单独提出出来，意思是一样的，如下。
    val(x,y) = (1,2)
    val(q,r) = BigInt(10)/%3
    val arr = Array(1,7,2,9)
    val Array(first,secound,_*) = arr
    println(first)
    println(secound)
    //for 表达式中的模式
    for((k,v)<- Map(1->2)){
      println(k)
    }
    // 样例类
    // 样例类首先是类，除此之外它是为模式匹配而优化的类，样例类用case关键词进行声明
    //当你声明样例类时，如下几件事情会自动发生
    //构造其中的每一个参数都成为 val 除非它被显示为 var (不建议这样做)
    //在伴生对象中提供apply 方法让你不用 new 关键字就能构造出相应的对象
    //提供 unapply 方法让模式匹配可以工作。
    //将生成 toString equals hashCode copy 等方法。除非显示的给出这些方法的定义
    //除了上面这些 其他基本的类 是一样的。可以添加方法和字段来扩展他们。
    //copy创建一个与现在对象值相同的新对象，并可以通过带名参数来修改某些属性。
    //case语句的中置表达式
    //什么是中置表达式？ 1+2 ，这就是一个中置表达式，如果 unapply 方法产出一个元组，你可以以case语句
    //使用中置表达法，比如可以匹配一个List序列
    List(1,2,3,4,5) match {
      case fist :: second :: rest => println(first+secound+rest.length)
      case _ => 0
    }
    //匹配嵌套结构
    //

  }
}

object Square{
  def unapply(arg: Double): Option[Double] = Some(math.sqrt(arg))
}