class Library{
    int libraryId;
    int bookId;
    int memberId;
    int issueId;
    String libraryName;
    String bookName;
    void display(){
        System.out.println("Welcome to the library management system");
    }
    void displayLibraryDetails(){
        this.libraryId=101;
        this.libraryName="City Library";
        System.out.println("Library Id: "+libraryId);
        System.out.println("Library Name: "+libraryName);
    }
}
class Book extends Library{
    void bookDetails(){
        System.out.println("This is a book management system");
    }
    void displayBookDetails(){
        super.displayLibraryDetails();
        this.bookId=201;
        this.bookName="Java Programming";
        System.out.println("Book Id: "+bookId);
        System.out.println("Book Name: "+bookName);
    }
}
class Member extends Library{
    void memberDetails(){
        System.out.println("This is a member management system");
    }
    void displayMemberDetails(){
        super.displayLibraryDetails();
        this.memberId=301;
        System.out.println("Member Id: "+memberId);
    }
}
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book b=new Book();
        b.display();
        b.bookDetails();
        b.displayBookDetails();
        Member m=new Member();
        m.display();
        m.memberDetails();
        m.displayMemberDetails();

    }
}