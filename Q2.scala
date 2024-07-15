package prac05_22001816
import scala.io.StdIn
import scala.collection.mutable.Set
case class Book(val title:String, val author:String, val isbn:String )
object Q2 {

  var library: Set[Book] = Set(
    Book("Madol duuwa", "Mr. Martin Wickramasinghe", "9780142437226"),
    Book("One Indian Girl", "Chetan Bhagat", "9780061120084"),
    Book("Naked Triangle", "Balwant Gargi", "9780451524935")
  )

  def addBook(book: Book): Unit = {
    library += book
    println(s"Added: ${book.title} by ${book.author}")
  }

  def removeBook(isbn: String): Unit = {
    val removedBook = library.find(_.isbn == isbn)
    removedBook match {
      case Some(book) =>
        library -= book
        println(s"Removed: ${book.title} by ${book.author}")
      case None =>
        println(s"No book found with ISBN: $isbn")
    }
  }

  def containsBook(isbn: String): Boolean = {
    library.exists(_.isbn == isbn)
  }

  def displayLibrary(): Unit = {
    println("Current Library Collection:")
    library.foreach { book =>
      println(s"${book.title} by ${book.author} (ISBN: ${book.isbn})")
    }
  }

  def searchByTitle(title: String): Unit = {
    val foundBook = library.find(_.title.toLowerCase == title.toLowerCase)
    foundBook match {
      case Some(book) =>
        println(s"\nBook Found:\n${book.title} by ${book.author} (ISBN: ${book.isbn})\n")
      case None =>
        println(s"\nNo book found with title: $title")
    }
  }

  def displayBooksByAuthor(author: String): Unit = {
    val booksByAuthor = library.filter(_.author.toLowerCase == author.toLowerCase)
    if (booksByAuthor.nonEmpty) {
      println(s"Books by $author:")
      booksByAuthor.foreach { book =>
        println(s"${book.title} (ISBN: ${book.isbn})")
      }
    } else {
      println(s"No books found by author: $author")
    }
  }

  def main(args: Array[String]): Unit = {

    val newBook = Book("Pride and Prejudice", "Jane Austen", "9780141439518")
    addBook(newBook)


    val isbnToRemove = "9780451524935"
    removeBook(isbnToRemove)


    val isbnToCheck = "9780061120084"
    println(s"Book with ISBN $isbnToCheck exists: ${containsBook(isbnToCheck)}\n")


    displayLibrary()


    val searchTitle = "One Indian Girl"
    searchByTitle(searchTitle)


    val searchAuthor = "Harper Lee"
    displayBooksByAuthor(searchAuthor)
  }
}


