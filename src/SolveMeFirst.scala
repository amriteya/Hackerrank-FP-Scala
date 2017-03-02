/**
  * Created by amrpandey on 3/2/17.
  */
object SolveMeFirst extends App{

    println(io.Source.fromFile("input.txt").getLines() take(2) map(_.toInt) sum)
}
