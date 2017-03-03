/**
  * Created by amrpandey on 2/16/17.
  */

object ListReplication extends App{

  def f(num: Int, arr: List[Int]) : List[Int] = arr.flatMap(List.fill(num)(_))

  println(f(3, List.range(1, 5)))
}

