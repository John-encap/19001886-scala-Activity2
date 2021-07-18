//Question 2


object primeSeq extends App {
  def prime(p:Int,n:Int=2):Boolean={
    if (p==n)
      return true
    if(p%n==0)
      return false
    else
      prime(p,n+1)  
  }
  def printSeq(n:Int,i:Int=2){
    if(i<=n){     
      if(prime(i))
        print(i+" ")
      printSeq(n,i+1)
    }
  }
  
  printSeq(10)
}