//Question 6

object fiboncci extends App {
  def fib(n:Int):Int= n match{
    case 0=> 0
    case 1=> 1
    case _ => fib(n-1) + fib(n-2)
  }
   def displayseq(n:Int):Unit= {
    if (n > 0) displayseq(n-1)
    print(fib(n)+" ")
}

  displayseq(10)
}