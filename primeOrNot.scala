//Question 1


object primeOrNot extends App {
  def prime(p:Int,n:Int=2):Boolean={
    if (p==n)
      return true
    if(p%n==0)
      return false
    else
      prime(p,n+1)  
  }
  println(prime(8))
}