package prac05_22001816
object Q3 {

  def FibonacciNum(n: Int): Int = {
    if (n <= 1) {
      n
    }
    else {
      FibonacciNum(n - 1) + FibonacciNum(n - 2)
    }
  }

  def printfibonacci(numbers: Int): Unit = {
      for (i <- 0 until numbers) {
        println(FibonacciNum(i))
      }
  }

  def main(args: Array[String]): Unit = {
      val num = 10
      println(s"fibonacci sequence for first $num numbers :")
      printfibonacci(num)
  }

}




