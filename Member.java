package assignments.assignment2;

import java.util.jar.Attributes.Name;

// TODO
public class Member {
    private String id;
    private String name;
    private String dateOfBirth;
    private String studyProgram;
    private String angkatan;
    private long fine;
    private int point;
    private BookLoan[] bookLoans;

    public Member(String id, String name, String dateOfBirth, String studyProgram, String angkatan, long fine, int point){
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.studyProgram = studyProgram;
        this.angkatan = angkatan;
        this.fine = fine;
        this.point = point;
    }
    
    public void pinjam(Book book, String loanDate) {
        bookloans[] += book; //ini cara add book, sumpah kalo arraylist tinggal add
        // TODO: method untuk melakukan peminjaman oleh member
    }

    public void kembali(Book book, String returnDate) {
        bookLoans[] -= book;
        // TODO: method untuk melakukan pengembalian oleh member
    }

    public void detail() {
        System.out.printf("ID Anggota: %s\n"+
                    "Nama Anggota: %s\n" +
                    "Total Point: %s\n" +
                    "Denda: %s\n", id, studyProgram, angkatan, dateOfBirth); //ini masih bingung
                    }
        // TODO: method untuk menampilkan detail anggota
    }
    public void bayarDenda(long amount) {
        // TODO: method untuk melakukan pembayaran denda
    }

    @Override
    public String toString();
        return ""
    }
}
