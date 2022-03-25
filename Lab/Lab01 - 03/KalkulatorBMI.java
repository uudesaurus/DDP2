import java.util.Scanner;
/*
Name    : Mahmud Asrul
NPM     : 2106655255
Desc    : Program ini memiliki tujuan untuk melihat keadaan kondisi tubuh mahasiswa yang di input oleh user
          dengan melalui standar BMI.

          #Asumsi bahwa apapun yang di input dan pilihan user dijamin valid, sehingga kesalahan apapun itu kembali kepada kesalahan user.
*/
public class KalkulatorBMI {
    public static void main(String[] args) {

        //Algoritma 1.0 di method main kali ini diberikan kesempatan kepada user untuk memberikan input agar nanti
        //program melakukan proses kalkulasi, tapi di algoritma ini di minta untuk jumlah mahasiswanya.
        Scanner input = new Scanner(System.in);
        double kondisiMahasiswa = 0.0;
        int obesitas = 0;
        int diatasIdeal = 0;
        int ideal = 0;
        int dibawahIdeal = 0;

        System.out.println("Selamat datang di program kalkulator BMI!");
        System.out.println("--------------------------------------------------------");
        System.out.print("Masukkan jumlah mahasiswa yang akan di hitung datanya: ");
        int jumlahMahasiswa = input.nextInt();

        //Algoritma 1.1 membuat looping system agar pertanyaan yang keluar sesuai dengan jumlah data mahasiswa
        //yang ingin di konversi atau di cek kondisi kesehatan tubuhnya
        int i = 0;
        while (i != jumlahMahasiswa){
        System.out.println(("--------------------")+"DATA MAHASISWA "+(i+1)+("--------------------"));
        System.out.print("Standar pengukuran apakah yang digunakan? ");
        String standard = input.next();

        //Algoritma 1.2 membuat conditional program agar program mengetahui sistem konversi mana yang perlu di terapkan
        //agar dapat menjadi satu standar BMI, apakah standar Metrik atau Imperial, jika tidak keduanya maka akan di ulangi
        if (standard.toUpperCase().equals("METRIK")){
            System.out.print("Masukkan massa tubuh mahasiswa (kilogram) ");
            double kilogram = input.nextDouble();
            System.out.print("Masukkan tinggi tubuh mahasiswa (centimeters) ");
            double centimeters = input.nextDouble();
            kondisiMahasiswa = metrik(centimeters,kilogram);

        }
        else if (standard.toUpperCase().equals("IMPERIAL")){
            System.out.print("Masukkan massa tubuh mahasiswa (pon) ");
            double pon = input.nextDouble();
            System.out.print("Masukkan tinggi tubuh mahasiswa (inci) ");
            double inci = input.nextDouble();
            kondisiMahasiswa = imperial(inci,pon);
        }
    
        //Algortima 1.3 membuat konversi hasil kalkulasi diubah kebahasa user agar mudah di pahami, misal seandainya hasilnya adalah
        //30.0 keatas maka akan terhitung obesitas dan seterusnya, ini mengikuti standar BMI.
        if (kondisiMahasiswa>=30.0){
            obesitas++;
        } else if (kondisiMahasiswa>=25.0){
            diatasIdeal++;
        } else if (kondisiMahasiswa>=18.5){
            ideal++;   
        } else{
            dibawahIdeal++;}
        i++;
    }
        input.close();
    
    //Algoritma 2.0 disini program akan menunjukkan hasil kalkulasi program kepada user
    //sehingga user dapat mengerti dan memahami kondisi dari data yang telah di input untuk mahasiswanya.
    System.out.println("--------------------------------------------------------");
    System.out.println("Berikut merupakan ringkasan hasil pengukuran BMI dari "+jumlahMahasiswa+" mahasiswa");
    System.out.println("Jumlah mahasiswa dengan berat badan di bawah normal: "+dibawahIdeal);
    System.out.println("Jumlah mahasiswa dengan berat badan normal: "+ideal);
    System.out.println("Jumlah mahasiswa dengan berat badan di atas normal "+diatasIdeal);
    System.out.println("Jumlah mahasiswa obesitas: "+obesitas);
    System.out.println("--------------------------------------------------------");
    System.out.println("Terima kasih telah menggunakan program kalkulator BMI!");
    }
    

    //Algoritma 3.0 menggunakan cara method. karena standar yang digunakan adalah standar metrik & imperial maka perlu dilakukan
    //proses konversi kedalam satu standar yaitu BMI sesuai dengan kalkulasi yang ada di lab01
    public static double metrik(double meter, double kilogram) {         
        double resultMetrik;

        resultMetrik = kilogram/((meter/100)*(meter/100));
        return resultMetrik;
    }
    public static double imperial(double inci, double pon) {
        double resultImperial;

        resultImperial = 703 * (pon/(inci*inci));
        return resultImperial;
    }
}