package assignments.assignment2;

public class BookLoan {
    private static long DENDA_PER_HARI;
    private Member member;
    private Book book;
    private String loanDate;
    private String returnDate;
    private long fine;
    private boolean status;

    BookLoan(Member member, Book book, Book author, String loanDate){
        this.member = member;
        this.book = book;
    }
    
}

