package prac05_22001816
import scala.io.StdIn

object Q1 {

  def getProductList() : List[String] = {
    var products = List[String]()
    var gets = " "
    while (gets != "done") {
      println("Enter products name (for finish type 'done')")
      gets = StdIn.readLine()
      if (gets != "done") {
        products = products :+ gets
      }
    }
    products
  }

def printProductList(products:List[String]) : Unit = {
  var i=0
  for(i<-products.indices)
    println(i+1 +"."+products(i))
}

def getTotalProducts(products:List[String]) : Int = {
  var num = 0
  for (_ <- products.indices)
    num = num + 1
  num
}

def main(args: Array[String]): Unit = {
  val productList = getProductList()
  println("\nProduct List : ")
  printProductList(productList)
  val totalproducts = getTotalProducts(productList)
  println("\nNumber of products in the list : " + totalproducts )

}
}





































