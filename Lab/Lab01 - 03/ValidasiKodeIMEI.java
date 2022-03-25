import java.util.Scanner;
/*
Name    : Mahmud Asrul
NPM     : 2106655255
Desc    : Program ini tujuannya adalah untuk memvalidasi apakah IMENnya benar atau tidak
*/
public class ValidasiKodeIMEI {
    public static void main(String[] args) {
        System.out.println(getDigit(7));
        System.out.println(jumlahDoublePosisiGanjil(12345678));
        System.out.println(jumlahPosisiGenap(12345678));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n>=0){
            long kode = sc.nextLong();
            System.out.println(isValid(kode) ? "YES":"NO");
        }
        sc.close();
    }
    //Algoritma 1.0
    //Karena bentuknya "long" sehingga tidak bisa mengimplementasi .length() maka dari itu
    //algoritma kali ini menghitung kodenya dengan menaruh temp 1, dan setiap iterasi temp di kali 10
    //yang dimana nanti temp bakal jadi 11 yang artinya digitnya bertambah 1, sehingga secara tidak langsung
    //menghitung digit kode yang ada.
    public static int getPanjangKode(long kode) {
        int panjangKode = 0;
        long temp = 1;
        while (temp <= kode){
            panjangKode++;
            temp *= 10;
        }
        return panjangKode;
    }
    
    //Algoritma 2.0
    //diubah ke string dulu habis itu di cek setiap indexnya sesuai dengan zimbabwenya atau ngga
    //kalo misalnya diluar itu semua maka return false, tapi kalo misalnya iya return true
    public static boolean cekPrefix(long kode){
        String str = Long.toString(kode);
        String zimbabwe = "2";
        String china = "18";
        if (str.substring(0,1).equals(zimbabwe)){
            return true;
        } else if (str.substring(0,2).equals(china)){
            return true;
        } else {
            return false;
        }     
    }
    //Algoritma 3.0 harusnya dibuat simpel aja
    public static long getDigit(long l) {
        if (l<5) {
            return l;}
        else {
            return (l*2)/10 + getDigit((l*2)%10);
        }
    }
    //Algoritma 3.2
    //Untuk memainkan indexing, apapun yang di modulo 100 akan mendapatkan digit yang sebelah kanan
    //untuk dan untuk mendapatkan
    public static long jumlahDoublePosisiGanjil(long kode) {
        if (getPanjangKode(kode)%2==1) {
            if (kode/10==0){
                return (int) kode;
            } else {
                return getDigit(kode%10) + jumlahDoublePosisiGanjil(kode/100);
            }
        } else {
            kode/=10;
            if (kode/10==0){
                return (int) kode;
            } else {
                return getDigit(kode%10) + jumlahDoublePosisiGanjil(kode/100);
            } 
        }
    }
    //Algoritma 3.3
    //Sama seperti di algoritma 3.1 tapi perbedaanny ini mengambil angka genap
    public static long jumlahPosisiGenap (long kode){
        if (getPanjangKode(kode)%2==1) {
            kode = kode/10;
            if (kode/10==0){
                return (int) kode;
            } else {
                return kode%10 + jumlahPosisiGenap(kode/100);
            }
        } else {
            if (kode/10==0){
                return (int) kode;
            } else {
                return kode%10 + jumlahPosisiGenap(kode/100);
            }
    }
    }
    
    public static boolean isValid(long kode){
        return cekPrefix(kode)
            && (getPanjangKode(kode) == 11)
            && ((jumlahDoublePosisiGanjil(kode) + jumlahPosisiGenap(kode)) % 10 == 0);
    }
    }


        

