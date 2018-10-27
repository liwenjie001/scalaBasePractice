package unit3

import scala.collection.mutable
import scala.collection.mutable.Queue
import scala.collection.mutable.ArrayBuffer

/**
  * author: Mr.Li 
  * create: 2018-10-21 15:05 
  * description: 这个是学习一些 有关scala中的数据结构的
  * 在scala中 分为主要的有两种 一种是可变的，另一种是不可变的。
  * 不可变集合：scala.collection.immutable
  * 可变集合：  scala.collection.mutable
  * scala 优先使用不可变的。
  **/
object Demo2 {
  def main(args: Array[String]): Unit = {
    //1.定长数组
    val arr1 = new Array[Int](3)
    //赋值
    arr1(1) = 3
    //打印
    println(arr1.mkString(" "))
    val arr2 = Array[Int](4,4,5)
    println(arr2.mkString(" "))
    //变长数组 ,所谓边长数组，当然就不需要自己初始化这个数组了
    val arr3 = new ArrayBuffer[Int]()
//    arr3(3) = 5
    arr3.append(44)
    println(arr3.mkString(" "))
    arr3(0) = 8
    println(arr3.mkString(" "))
    // 定长数组喝边长数组的转换
    arr1.toBuffer
    arr3.toArray
    //数组的遍历
    for( i <- arr1) {
      println(i)
    }
    // 元组 ：元组也可以理解为容器，可以存放相同或者不同的数据
    val tuple1 = (1,2,3,4,"hello")
    println(tuple1)
    //元组数据的访问
    println(tuple1._1)
    //元组的遍历
    for(i<- tuple1.productIterator){
      println(i)
    }
    //方式二
    tuple1.productIterator.foreach(println(_))
    //列表 如果列表为空 则使用Nil来 表示。
    val list1 = List(1,2)
    println(list1)
    //取值
    println(list1(1))
    //进行追加并且把生成新的list
    //一个是在之前追加，一个是在之后追加
    val list2 = list1 :+ 30
    println(list2)
    val list3 = 90 +: list1
    println(list3)
    // list的创建于追加 这些追加为什么要添加一个Nil(空的list集合呢 ?) 因为list :: 它是从右到左的追加方式追加的。
    val list4 = 210::387::"dfhujsd"::Nil
    println(list4) //List(210, 387, dfhujsd)
    // 队列 Queue ，队列是先进先出序列

    val queue = new Queue[Int]()
    println(queue)
    //给其赋值 ，并且这个是可变长的队列
    queue += 1
    println(queue )
    //向队列中追加list集合
    queue ++= list1
    println(queue)
    //按照进入队列的顺序删除元素
    queue.dequeue()
    println(queue)
    //塞入数据
    queue.enqueue(7,8,9)
    println(queue)
    //获取队列的第一个元素
    println(queue.head)
    //获取队列的追后一个元素
    println(queue.last)
    //获取除了第一个元素之外的所有元素
    println(queue.tail)
    //map 这个地方的学习就类比java的map即可
    val map1 = Map(1 -> 34,45-> "dhfukh")
    println(map1)
    //构造可变映射
    val map2 = scala.collection.mutable.Map("Alice" -> 10, "Bob" -> 20, "Kotlin" -> 30)
    println(map2)
    //空的映射
    val map3 = new  mutable.HashMap[Int,String]()
    // 对偶元组
    val map4 = Map(("Alice", 10), ("Bob", 20), ("Kotlin", 30))
    println(map4)
    //取值
    //如果映射中没有值，则会抛出异常，使用contains方法检查是否存在key，如果通过映射.get(建)这样调用一个Option对象，要么是Some要么是None
    val value  = map4("Alice") // 建议是用get方法来获取 值。
    println(value)
    //更新值
    // 这个更新只能是可变映射
    map2("Alice") = 100
    println(map2)
    //这个是添加一个新的 映射
    map2 += ("ll"->1)
    //这个是删除一个映射
    map2 -= ("Bob")
    println(map2)
    //或者直接加上
    val map5 = map2 + ("liuliu"->21,"zhang"->20)
    println(map5)

    //遍历
    for((k,v)<-map5){
      println(k+"========="+v)
    }
    for(i<-map5.keys){
      println(i)
    }
    for (i<-map5.values){
      println(i)
    }
    for(i<-map5){
      println(i)
    }
    //集合 set 是不同元素的集合，并且没有顺序。如果想要排序的话可以使用sortedSet,以排好序的数据集是以红黑数进行的。
    //默认情况下 scala使用的是不可变集合
    val set = Set("dfhksjd",1,4,5,1)
    println(set)
    val set2 = mutable.Set(1,34,45,2,5)
    println(set2)
    //可变集合的元素添加
    set2.add(44)
    println(set2)
    set2 +=6
    println(set2)
    // 注意该方法返回一个新的集合并不是在之前的集合上添加
    set2.+(30)
    println(set2)
    //可变集合元素的删除
    set2 -= 1
    println(set2)
    set2.remove(2)
    println(set2)
    //遍历
    for(i<-set2){
      println(i)
    }
    //集合常用操作
    if(set2.contains(44)){
      println("包含")
    }
    val set3  = Set(1,2,3,4,5,6,9,6)
    //返回两个集合的交集
    val set4 = set3 & set2
    println(set4)
    //返回两个集合的差集
    println(set3 &~ set2)
    //合并两个集合
    println(set2 ++ set3)
    //返回丢弃前n个 元素的新集合 集合是没有顺序的 ，所以这个丢弃是随机的。
    val set5 = Set(1,2,3,4,5)
//    println(set5.drop(2))
    //返回丢弃最后n个元素的新集合
//    println(set5.dropRight(4))
    // 从左往右丢弃元素，知道条件p不成立
//    println(set5.dropWhile(i => set5.contains(5)))
    // 查找最大元素
    println(set5 max)
    // 获取最小集合
    println(set5 min)
    //返回前n个元素
    println(set5.take(3))
    //集合元素与函数的映射
    /**
      * 这个是很重要的一个函数
      * map ： 讲集合中的每一个函数映射到某一个函数
      * flatmap : flat 记 压扁 扁平化 效果就是j将集合中的每个元素的子元素映射到某个函数并返回新的集合
      */
    val names =  List("Alice", "Bob", "Nick")
    // map 将 list集合中
    println(names.map(_.toLowerCase))
    println(names.flatMap(_.toLowerCase))
    // 化简 折叠 扫描
    // 折叠 化简 将二元函数 引用于集合中的函数
    /**
      * 说明一下： reduceLeft 是 从左往右 去运算
      *           reduceRight 是 从右 往左去运算
      *           具体是 左面的 减去 右面的 但是总体是从右面开始的
      *           以 1，2，3，4，5，6 为例子 reduceRight
      *           是 5-6 = -1 然后是 4 - -1 = 5 然后 3 - 5 =-2  然后 2 - -2  = 4 然后 1 -4 = -3
      *           所以最后结果为 -3
      *           而 reduceleft 则不是这样的情况 是 从左往右依此的去运算。
      */
    val list = List(1,2,3,4,5,6)
    val i1 = list.reduceLeft(_ + _)
    val i2 = list.reduceLeft(_ - _)
    val i3 = list.reduceRight(_ - _)
    println(i3)
    println(i2)
    println(i1)
    /**
      * fold : 折叠化简
      * fold 函数是将上一步的返回值作为函数的第一个参数继续传递参与运算
      * 直到list中的所有元素被遍历。可以把reducLeft看做简化版的foldLeft.
      * 相关函数：flod foldLeft foldRight ,可以参考reduce的相关方法理解。
      */

    val list6 = List(1,9,2,8)
    println(list6.fold(5)((sum,y)=>sum + y ))
    println(list6.fold(0)((sum,y)=>sum - y))
    //尖叫提示：foldLeft和foldRight有一种缩写方法对应分别是：/:和:\
    // foldLeft foldRight 有一种缩写方法对应分别 ：/：和 :\
    // 统计一句话中，各个文字出现的次数
    val sentence = "一首现代诗《笑里藏刀》:哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈刀哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈"
    //m +  (“一” -> 1, “首” -> 1, “哈” -> 1)
    val i7 = (Map[Char, Int]() /: sentence)((m, c) => m + (c -> (m.getOrElse(c, 0) + 1)))
    println(i7)
    /** =============== 这个还没有看会 要看会很重要================*/

    //折叠，化简，扫描
    //扫描即是对集合中的所有元素做flod操作，但是会把产生的中间结果放置在一个集合中保存。
    val i8 = (1 to 10 ).scanLeft(0)(_+_)
    println(i8)

    // 拉链

    val l1 = List("15837312345", "13737312345", "13811332299")
    val l2 = List(17, 87)
    println(l1 zip l2)

    //你可以通过iterator方法从集合获得一个迭代器，通过while循环和for表达式对集合进行遍历。
    val iterator = List(1,2,3,4,5,6).iterator
    /*while (iterator.hasNext){
      println(iterator.next())

    }*/
    for (i<-iterator){
      println(i)
    }
    //流 Stream
    //stream 是一个集合 ，这个集合可以用于存放无穷多个元素，但是这个无穷多个元素并不会一次性产生出来，而是需要用到多大区间，就会动态的产生出来，
    //末尾元素遵循lazy规则
    //使用#::得到一个steam
    def numsFrom(n:BigInt) :Stream[BigInt] = {
      n #:: numsFrom(n+1)
    }
    //传递一个值 并打印stream
    val n  = numsFrom(10)
    println(n)
    //tail 的每一次使用 ，都会动态的向steam集合按照|规则生成新的元素。
    println(n.tail)
    println(n)
    //使用map映射 steam 的元素并进行一些计算
    println(numsFrom(5).map(x => x*x))
    //视图 View
    //Stream 的懒执行行为，你可以对其他集合应用view方法来实现类似的效果，该方法产生一个其方法
    //总是被懒执行的集合，但是 view 不会缓存数据，每次都要从新计算。
    // 例如我们找到10万以内，所有数字倒叙排序还是它本身的。
    val v = (1 to 100000).view.map(
      x => {
//        println(x)
        x.toLong * x.toLong

      }
    ).filter(
      x => {
        x.toString == x.toString.reverse
      }
    )
    // 这个是代表输出3位数的。
    println(v(3))
//    for (i <- v){
//      println(i+",")
//    }
    // 线程安全集合
    //所有线程安全的集合都是以 synchronized 开头的集合，例如 不过不知道最新版本应该不是
    // 并行集合
    //scala为了充分使用多核cpu，提供了并行集合（有别于前面的串行集合），用于多核环境的并行计算。
    //主要用的算法是 分治算法，scala通过 splitters ,combiners 等抽象来实现，主要原理是将工作分解
    //很多任务，分发给一些处理器去运行去完成，并将处理结果返回。
    //任务调动负载均衡，通俗点完成自己的所有任务之后，发现其他人还有活没有干完，主动或者被安排被一起干，这样尽可能达到早完成的地步。
    //打印1 to 5
    (1 to 5 ).foreach(println(_))
    println()
    // 多核运行。
    (1 to 5 ).par.foreach(println(_))
    

















  }



}
