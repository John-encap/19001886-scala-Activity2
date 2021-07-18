//Question 5

object sumOfEven extends App {
  def sum(n:Int):Int={
    if (n==0)
      return 0
    if(n%2==0){
      return n+sum(n-2)
    }
    else
      return sum(n-1)
  
  }
  println(sum(5))
}