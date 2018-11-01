package unit4

/**
  * author: Mr.Li 
  * create: 2018-10-27 21:23 
  * description: 匹配嵌套结构
  **/
object Demo2 {
  //匹配嵌套结构
  val sale = Bundle("双11大甩卖系列",10,
    Atricle("《scala从入门到放弃》",20),Bundle("新人大礼包",20,Atricle("《java从入门到放弃》",30)
      ,Atricle("《linux从入门到放弃》",30)))

  val result1 = sale match {
    case Bundle(_, _, Atricle(descr, _), _*) => descr
  }
  //通过 @ 表示法将嵌套的值绑定到变量。_* 绑定剩余 item 到 rest
  val result2 = sale match {
    case Bundle(_, _, art @ Atricle(_, _), rest @ _*) => (art, rest)
  }
  println(result2)
  //偏函数，它只对会作用于指定类型的参数或指定范围值的参数实施计算



}
abstract class Item
case class Atricle (d:String,price :Double) extends Item
case class Bundle(d:String,price :Double,item :Item*) extends Item


