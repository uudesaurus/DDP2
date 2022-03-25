
/*
/*
Name    : Mahmud Asrul
NPM     : 2106655255
Desc    : Sistaka but NG, dimana semua fitur fitur yang dibuat menggunakan OOP, sehingga
          diharapkan class disini dimanfaatkan dengan sangat baik.

          #Asumsi bahwa apapun yang di input dan pilihan user dijamin valid, sehingga kesalahan apapun itu kembali kepada kesalahan user.
*/

/*
package assignments.assignment2;

import java.util.Scanner;
import java.util.HashMap;

public class Library {
    private Scanner input = new Scanner(System.in);

    static HashMap<Character, Integer> charToValue = new HashMap<>(36);
    static char[] valueToChar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private Member[] members;
    private Book[] books;
    private Category[] categories;
/*
    //finder method biar bisa dipake di berbagai array, BELUM SEELESSAII!!
    public static void arrayFinder(String Class){
        for ()
    }

    //=====BUAT NOMOR 1========
    public static void buildMapCharToValue() {
        for (int count = 0; count < valueToChar.length; count++) {
            charToValue.put(valueToChar[count], count);
        }
    }
    private static int getValueFromChar(char character) {
        return charToValue.get(character);
    }
    private static char getCharFromValue(int value) {
        return valueToChar[value];
    }


    public static String generateId(String programStudi, String angkatan, String tanggalLahir){
        if (!isValidProgramStudi(programStudi)) return "Input tidak valid!";

        String angkatanCode = checkAndGetAngkatanCode(angkatan);
        if (angkatanCode.length() > 2) return angkatanCode; // Input tidak valid!

        String tanggalLahirCode = checkAndGetTanggalLahirCode(tanggalLahir);
        if (tanggalLahirCode.length() > 6) return tanggalLahirCode; // Input tidak valid!

        String nomorKeanggotaanStr = programStudi + angkatanCode + tanggalLahirCode;
        nomorKeanggotaanStr += getChecksum(nomorKeanggotaanStr); // Checksum "C"
        nomorKeanggotaanStr += getChecksum(nomorKeanggotaanStr); // Checksum "K"

        return "ID Anggota: " + nomorKeanggotaanStr;
    }

    private static boolean isValidProgramStudi(String programStudi) {
        if (programStudi.length() != 3) return false;

        if (programStudi.equals("SIK")) return true;
        if (programStudi.equals("SSI")) return true;
        if (programStudi.equals("MIK")) return true;
        if (programStudi.equals("MTI")) return true;
        if (programStudi.equals("DIK")) return true;

        return false;
    }

    private static String checkAndGetAngkatanCode(String angkatan) {
        if (angkatan.length() != 4) return "Input tidak valid!";
        if (Integer.parseInt(angkatan) < 2000 || Integer.parseInt(angkatan) > 2021) return "Input tidak valid!";
        return angkatan.substring(2);
    }

    private static boolean isNumerik(String word) {
        if (word.isEmpty()) return false;

        for (char c : word.toCharArray()) {
            if (!Character.isDigit(c)) return false;
        }

        return true;
    }

    private static String checkAndGetTanggalLahirCode(String tanggalLahir) {
        String[] arrOfTanggalLahir = tanggalLahir.split("/");

        // Cek apakah ada 3 input (untuk dd, mm, dan yyyy)
        if (arrOfTanggalLahir.length != 3) {
            return "Input tidak valid!";
        }

        // Cek apakah semuanya numerik
        for (String s : arrOfTanggalLahir) {
            if (!isNumerik(s)) {
                return "Input tidak valid!";
            }
        }

        // Cek apakah jumlah digitnya memenuhi aturan (2 digit untuk tanggal dan bulan, serta 4 digit untuk year)
        if (arrOfTanggalLahir[0].length() != 2 || arrOfTanggalLahir[1].length() != 2 || arrOfTanggalLahir[2].length() != 4) {
            return "Input tidak valid!";
        }

        // Cek apakah memenuhi aturan tanggal (tanggal antara 1 - 31)
        int tanggal = Integer.parseInt(arrOfTanggalLahir[0]);
        if (tanggal < 1 || tanggal > 31) {
            return "Input tidak valid!";
        }

        // Cek apakah memenuhi aturan bulan (bulan antara 1 - 12)
        int bulan = Integer.parseInt(arrOfTanggalLahir[1]);
        if (bulan < 1 || bulan > 12) {
            return "Input tidak valid!";
        }

        return arrOfTanggalLahir[0] + arrOfTanggalLahir[1] + arrOfTanggalLahir[2].substring(2);
    }

    private static char getChecksum(String data) {
        char[] arrayOfChar = data.toCharArray();

        int count = 0;
        for (int idx = 0; idx < arrayOfChar.length; idx++) {
            // Mendapatkan bobot
            int weight = arrayOfChar.length - idx;

            // Jumlah hasil kali value dan bobot setiap karakter
            count += getValueFromChar(arrayOfChar[idx]) * weight;
        }

        int checksum = count % 36;
        return getCharFromValue(checksum);
    }
    */
        //BUAT NOMOR 1
/*
    private static void printSeparator() { //Buat Nomor 8
		System.out.println("-".repeat(64));
	}

    private static void infoPortofolio() { //Buat Nomor 8
		int jumlahSaham = 0, jumlahObligasi = 0;
		double netWorth = 0;

        

		netWorth += earnings;
		
		for(Aset a : portofolio) {
			if (a instanceof Saham){
				jumlahSaham++;
			} else if (a instanceof Obligasi){
				jumlahObligasi++;
			} 
			double totalValuasiAset = a.getHarga()*a.getJumlah();
			netWorth += totalValuasiAset;
		} 
		
		printSeparator();
		System.out.printf("" +
		"Info Portofolio\n" +
		"Jumlah Jenis Saham: %d\n" +
		"Jumlah Jenis Obligasi: %d\n" +
		"Total Nilai Portofolio: %.2f\n", jumlahSaham, jumlahObligasi, netWorth);
		printSeparator();
      } */ 
      public static void main(String[] args) {
        Library program = new Library();
        program.menu();
    }

    public void menu() {
        int command = 0;
        boolean hasChosenExit = false;
        System.out.println("Selamat Datang di Sistem Perpustakaan SistakaNG!");
        while (!hasChosenExit) {
            System.out.println("================ Menu Utama ================\n");
            System.out.println("1. Tambah Anggota");
            System.out.println("2. Tambah Kategori");
            System.out.println("3. Tambah Buku");
            System.out.println("4. Peminjaman");
            System.out.println("5. Pengembalian");
            System.out.println("6. Pembayaran Denda");
            System.out.println("7. Detail Anggota");
            System.out.println("8. 3 Peringkat Pertama");
            System.out.println("99. Keluar");
            System.out.print("Masukkan pilihan menu: ");
            command = Integer.parseInt(input.nextLine());
            System.out.println();

            /*
            //PROBLEM: 
            //flow, ketika else --> id dari si member masuk ke generate ID, terus tinggal tampilin details dari method Members
            //handle invalidnya ribet, gimana dari generateId bisa masuk ke ID members ?
            if (command == 1) {
                System.out.print("Nama : ");
                String nama = input.nextLine();
                System.out.print("Program Studi : ");
                String prodi = input.nextLine();
                System.out.print("Angkatan : ");
                String angkatan = input.nextLine();
                System.out.println("Tanggal Lahir : ");
                String tanggalLahir = input.nextLine();
                
                //Bikin array baru
                Member[] memberBaru = new Member[members.length+1];
                //copy array a ke array b dari setiap index i
                for (int i=0;i<members.length;i++){
                    memberBaru[i] = members[i];
                }   memberBaru[members.length] = new Member(generateId(prodi,angkatan,tanggalLahir), nama, tanggalLahir, prodi, angkatan, 0, 0);
                    members = memberBaru;
                
                if (){
                }
                ){ //input tidak valid maka (masukin semua kondisi yang bikin tidak valid)
                    System.out.println("Tidak dapat menambahkan anggota silahkan periksa kembali input anda!");
                } else { //ini jika valid
                    members.id = generateId(prodi, angkatan, tanggalLahir);
                    
                    System.out.printf("ID Anggota: %s\n"+
                    "Nama Anggota: %s\n" +
                    "Total Point: %s\n" +
                    "Denda: %s\n", id, nama, members.point, members.fine); //ini masih bingung
                
                }

                //Gimana cara access object attributes, tapi yang kita bikin kan kek dalam bentuk array, apa dipanggil indexnya(?)
                //Bisa ga dalam satu class ada dua jenis constructor, jadi dipanggil berdasarkan kebutuhan aja gt
                //emang object indexing apa gmn cara biar kita tau objectnya
            */


            //Problem:
            //1.A gimana cara bikin method finder, karena ini banyak banget yang sejenis dan enaknya tinggal pake
            //method finder, untuk setiap category. jadi nanti di iterasi dari object si classnya. terus di cek
            //apakah sama dengan input atau tidak.
        // }
            //2.A feeling gua flownya udah yakin cuma gua belum testcase karena dibawah masih error.
            } if (command == 2) {
                //Algorithm 2.0
                //Tempat user mengisi input agar program bisa dijalankan
                System.out.println("---------- Tambah Kategori ----------");
                System.out.println("Nama Kategori: ");
                String kategori = input.nextLine();
                System.out.println("Point: ");
                Integer point = input.nextInt();
                
                //Algorithm 2.1
                //Jika dalam kondisi input user ternyata sudah ada, di dalam array kategori (pakai finder method di library)
                //maka akan mengeluarkan

                //**KAYAKNYA BUTUH METHOD FINDER GITU GA SIH BIAR (Class).Finder() SI CATEGORY TERSEBUT */
                if (kategori.equals(finder()){ //Masukkan kondisi error, (jika attributesnya kategori udah pernah ada)
                    .toLowerCase();
                    System.out.println("Kategori" + kategori + " sudah pernah ditambahkan");
                } else { 

                //Algorithm 2.2
                //Karena Array yang ada di Java tidak sama seperti Python, maka dari itu
                //butuh algorithm yang membuat arraynya bisa expand dengan sendirinya.
                    Category[] categoryBaru = new Category[categories.length+1];
                    for (int i=0;i<categories.length;i++){
                        categoryBaru[i] = categories[i];

                        categoryBaru[categories.length] =  new Category(kategori, point);
                        categories = categoryBaru;
                        System.out.println("Kategori" +kategori+ " dengan "+point+" point berhasil ditambahkan");
                    }
                }
                
                
            /*
            //Problem:
            //sama kayak 1.A
            //gimana cara melakukan proses iterasi di kategori itu, untuk equals dengan input user
            
            //Expected flow:
            //ketika semua sudah valid, 1. kebentuk object baru sesuai detail user.
            //                          2. kirim output ke user kalo misalnya sudah berhasil (done)
            } else if (command == 3) {
                System.out.println("---------- Tambah Buku ----------");
                System.out.println("Judul : ");
                String judul = input.nextLine().toLowerCase();          //karena case sensitive maka
                System.out.println("Penulis : ");                       //toLowerCase agar di generalisir
                String penulis = input.nextLine().toLowerCase();        //Sehingga KuCIng == kUciNg
                System.out.println("Penerbit : ");
                String penerbit = input.nextLine();
                System.out.println("Kategori : ");
                String kategori = input.nextLine();
                System.out.println("Stok : ");
                Integer stok = input.nextInt();

                if(){ //jika ada inputnya sama dengan attributes object Judul && Penulis (case sensitive)
                    System.out.println("Buku "+ judul +" oleh " + penulis + "sudah pernah ditambahkan");
                }else if(){ //Jika kategori tidak ditemukan
                    System.out.println("Kategori"+ kategori + "tidak ditemukan");
                }else if(){ //Jika stok <= 0
                    System.out.println("Stok harus lebih dari 0");
                
                }else{ //jika valid    
                    Book[] bukuBaru = new Book[books.length+1];
                    for (int i=0;i<books.length;i++){
                        bukuBaru[i] = books[i];
                    }   
                    bukuBaru[books.length] = new Book(judul, penulis, penerbit, stok, kategori);
                    books = bukuBaru;
                    System.out.println("Buku "+ judul +" oleh " + penulis + "berhasil ditambahkan ");
                }

            //Problem:
            //
            //
            } else if (command == 4) {
                System.out.println("---------- Peminjaman Buku ----------");
                System.out.println("ID Anggota : ");
                String idAnggota = input.nextLine().toLowerCase();
                System.out.println("Judul Buku : ");
                String judul = input.nextLine().toLowerCase();
                System.out.println("Penulis Buku : ");
                String penulis = input.nextLine(); //ini masih bermasalah
                System.out.println("Tanggal Peminjaman : "); //ini masih bermasalah
                String tanggalPeminjaman = input.nextLine(); //ini masih bermasalah
                
                if(){ //ketika inputnya tidak sesuai dengan attributes dari object class Member
                    System.out.println("Anggota dengan ID "+ idAnggota +" tidak ditemukan");
                }else if(){ //ketika inputnya tidak menemukan buku yang adda
                    System.out.println("Buku "+judul+" oleh "+penulis+" tidak ditemukan");
                }else if(){ //ketika stoknya <= 0
                    System.out.println("Buku "+judul+" oleh "+penulis+" tidak tersedia");
                }else if(){ //Bukunya lebih dari tiga (yang aktif)
                    System.out.println("Jumlah buku yang sedang dipinjam sudah mencapai batas maksimal");
                }else if(){ //Dendanya si class lebi dari 5000
                    System.out.println("Denda lebih dari Rp 5000");
                }else if(){ //Buku yang di input, sedang di aktif di pinjam (BookLoan True (?))
                    System.out.println("Buku "+judul+" oleh "+penulis+" sedang di pinjam");
                } else { //ketika semuanya udah terlewatkan, maka cari ID anggota yang memiliki namanya siapa, dan dia sebagai orang yang minjem
                    System.out.println(object.idnya+ "berhasil meminjam Buku"+judul+"!");
                    }

            //Problem :
            //
            //
            
            //Expected Flow :
            //
            //

            } else if (command == 5) {
                System.out.println("---------- Pengembalian Buku ----------");
                System.out.println("ID Anggota : ");
                String idAnggota = input.nextLine().toLowerCase();
                System.out.println("Judul Buku : ");
                String judul = input.nextLine().toLowerCase();
                System.out.println("Penulis Buku : ");
                String penulis = input.nextLine(); //ini masih bermasalah
                System.out.println("Tanggal Pengembalian : "); //ini masih bermasalah
                String tanggalPengembalian = input.nextLine();
                BookLoan objectBookLoan = new BookLoan(idAnggota, judul, penulis, tanggalPengembalian); //ini masih bermasalah

                if(){ //jika Anggota tidak di temukan maka
                    System.out.println("Anggota dengan ID"+idAnggota+"tidak ditemukan");
                }else if(){ //jika input tidak ditemukan ketika iterasi object
                    System.out.println("Buku"+judul+"oleh"+penulis+"tidak ditemukan");
                }else if(){ //jika sedang tidak di pinjam
                    System.out.println("Buku "+judul+" tidak sedang dipinjam")
                }else{//jika sudah valid
                    System.out.println("Buku "+judul+" berhasil dikembalikan oleh "+IDAnggota.nama+ "dengan denda" "Rp"+ fine +"!");
                }
            
            //Problem:
            //
            //

            //Expected Flow:
            //Member.fine
            //

            } else if (command == 6) {
                System.out.println("---------- Pembayaran Denda ----------");
                System.out.println("ID Anggota : ");
                String idAnggota = input.nextLine().toLowerCase();
                System.out.println("Jumlah : ");
                Integer jumlah = input.nextInt();

                if(){ //jika Anggota tidak di temukan maka
                    System.out.println("Anggota dengan ID"+idAnggota+"tidak ditemukan");
                }else if(){ //jika dendanya == 0
                    System.out.println(members.idAnggota+"tidak memiliki denda");
                }else if(){//ketika lunas/lebih dari kembalian
                    System.out.println(members.idAnggota+"berhasil membayar lunas denda\nJumlah kembalian : "fine);
                }else{//jika valid maka
                    System.out.println(members.idAnggota+" berhasil membayar denda sebesar Rp "+jumlah+" Sisa denda saat ini: Rp "+fine);
                }
            
            //Problem:
            //
            //

            //Expected Flow:
            //
            //

            } else if (command == 7) { //ini juga harus dikuli bgt bgt bgt

                //gimana cara kita manfaatin si detail()nya , dari setiap members yang si id Anggotanya
                System.out.println("---------- Detail Anggota ----------");
                System.out.println("ID Anggota : ");
                String idAnggota = input.nextLine().toLowerCase();  
                if(){
                    System.out.println("Anggota dengan ID "+idAnggota+" tidak ditemukan");
                }else{
                    for(int i = 0; i<members.length; i++){
                        System.out.print("—------------- "+(i+1)+ " —-------------");
                        members[i].detail();
                    }
                    
                }

            //Problem:
            //
            //

            //Expected Flow:
            //
            //

            } else if (command == 8) { //iniharusdikuli bgt

                //Pokok pertanyaan, gimana cara kita akses si points setiap members(?), habis itu kita urutin
                //setelah di urutin, baru deh arraynya ngikut berdasarkan detailnya
                System.out.println("---------- Peringkat Anggota ----------");
                if(members==null){ //jika anggota == 0;
                    System.out.println("Belum ada anggota yang terdaftar pada sistem");
                }else{ //jika berhasil...
                    Member[] membersTemp = new Member[members.length];

                    //ini bermasalah bgt, POKOKNYA HARUS DI URUTIN, INI GUA PAKE SWAP TAPI GUA BINGUNG
                    //kalo misalnya dia bentuknya array, tapi kalo misalnya dia int/somting logisnya gini gasi
            
                    for(int i = 0; i < members.length; i++){
                        for(int j = 0; j < members.length; j++){
                            if(members[i] > members[j]){
                                membersTemp = members[i];
                                members[i] = members[j];
                                members[j] = membersTemp;
                                
                            }
                        }
                    }

                    for(int i = 0; i<membersTemp.length; i++){
                        System.out.print("—------------- "+(i+1)+ " —-------------");
                        members[i].detail();
                    }
                }
            */
        
            // } else if (command == 99) {
            //     System.out.println("Terima kasih telah menggunakan SistakaNG!");
            //     hasChosenExit = true;
            // } else {
            //     System.out.println("Menu tidak dikenal!");
            // }
            // System.out.println();
        }
    }input.close();
}
// }
*/