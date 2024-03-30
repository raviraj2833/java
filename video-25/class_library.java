  class library{
    String [] books;
    int no_of_books;
    library(){
        this.books=new String[100];
        this.no_of_books=0;
    }
    void addBooks(String book)
{
    this.books[no_of_books]=book;
    no_of_books++;
    System.out.println(book + " has been added!");
}
void ShowAvailabelBooks(){
    System.out.println("Available book are: ");
    for(String book:this.books){
        if(book==null){
            continue;
        }
    System.out.println("*" +books);
}
}
void issueBooks(String book){
    for(int i=0;i< this.books.length;i++){
        if(this.books[i].equals(books)){
            System.out.println("The books has been issue");
            this.books[i]=null;
            return;
        }
    }
    System.out.println("This book does not exist");
}
void returnBooks(String book){ 
    addBooks(book);
}

  }
public class class_library {
public static void main(String[] args){
    // you have to implemented library using java class library
    // method: addBooks,issueBooks,ShowAvailabelBooks,returnBooks.
    //Properties: Array to store the availabel books;
    //Array to store issue book
     library l=new library();
    l.addBooks("Think and grow rich");
    l.addBooks("C++");
    l.addBooks("Algorithm");
    l.addBooks("DSA");
    l.ShowAvailabelBooks();
    l.issueBooks("C++");
    l.ShowAvailabelBooks();
}
}