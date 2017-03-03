/**
  * Created by amrpandey on 2/16/17.
  */
object FilterArray{
  def main(args: Array[String]): Unit ={
    println(f(3, List.range(0, 10)))
  }

  def f(delim:Int,arr:List[Int]):List[Int] = arr.filter(_ < delim)
}
