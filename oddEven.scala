//Question 4


object oddEven extends App {
  def isEven(n:Int):Boolean=n match{
    case 0=>true
    case _ => isOdd(n-1)
  }
  def isOdd(n:Int):Boolean= !(isEven(n))
  
  println(isEven(4),isOdd(6))
  
}