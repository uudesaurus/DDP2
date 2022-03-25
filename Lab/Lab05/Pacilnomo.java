/*
Name    : Mahmud Asrul
NPM     : 2106655255
Desc    : Program ini memiliki tujuan untuk menjadi kalkulator saham dengan memanfaatkan ilmu OOP dan Inheritance

          #Asumsi bahwa apapun yang di input dan pilihan user dijamin valid, sehingga kesalahan apapun itu kembali kepada kesalahan user.
*/

import java.util.Scanner;

public class Pacilnomo {
	private static Aset[] portofolio;
	private static double earnings;

	private static void printSeparator() {
		System.out.println("=".repeat(64));
	}
	
	private static void daftarAset() {
		printSeparator();
		System.out.printf("Kamu memiliki %d total aset:\n", portofolio.length);
		for(Aset a : portofolio) {
			System.out.println("- " + a);
		}
		printSeparator();
	}
	//Algorithm Pacilnomo 1.0
	//disini akan menambahkan total valuasi Aset dengan menggunakan teknik seperti dibawah
	//total aset didapat berdasarkan perhitungan yang sudah terspesialisasikan berdasarkan object mana
	//yang diambil menggunakan for loop, sehingga mendapatkan hasil yang diharapkan.
	private static void infoPortofolio() {
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
	}

	//Algorithm Pacilnomo 1.1
	//disini akan memanggil nextYear berdasarkan object mana yang diambil
	//etkiak objectnya adalah Obligasi maka yang dipanggil adalah si nextYear yang sudah
	//dioverride dengan obligasi.
	private static void nextYear() {
		for(Aset a : portofolio) {
			a.nextYear();
		}
		
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Silakan masukkan banyak aset yang tersedia: ");
		int banyakAset = Integer.parseInt(in.nextLine());
		
		portofolio = new Aset[banyakAset];
		
		for(int i = 0; i < banyakAset; i++) {
			System.out.printf("Aset %d: ", i + 1);
			String inp[] = in.nextLine().split("\\s+");
			String namaAset = inp[0], jenisAset = inp[1]; 
			int jumlah = Integer.valueOf(inp[2]); 
			double harga = Double.valueOf(inp[3]);
			
			//Algorithm Pacilnomo 1.3
			//Disini akan menspesifikan berdasarkan objectnya dari input yang diatas, ketika sesuai maka akan
			//membentuk object berdasarkan parameter yang udah di siapkan di constructor, lalu memasukkannya kedalam
			//portofolio[i] (i akan di iterasi terus menerus), dengan object yang dimiliki
			if(jenisAset.equals("SAHAM")) {
				Saham objectSaham = new Saham(namaAset, jumlah, harga, Double.valueOf(inp[4]), Double.valueOf(inp[5]));
				portofolio[i]=objectSaham;
			} else if(jenisAset.equals("OBLIGASI")) {
				Obligasi objectObligasi = new Obligasi(namaAset, jumlah, harga, Double.valueOf(inp[4]), Integer.valueOf(inp[5])); //bntr masih bingung
				portofolio[i]=objectObligasi;
			} 
		}

		System.out.print("Selamat datang di...");
		System.out.print("\n" +
		"\n" +
		" /$$$$$$$                     /$$ /$$\n" +
		"| $$__  $$                   |__/| $$\n" +
		"| $$  \\ $$ /$$$$$$   /$$$$$$$ /$$| $$ /$$$$$$$   /$$$$$$  /$$$$$$/$$$$   /$$$$$$\n" +
		"| $$$$$$$/|____  $$ /$$_____/| $$| $$| $$__  $$ /$$__  $$| $$_  $$_  $$ /$$__  $$\n" +
		"| $$____/  /$$$$$$$| $$      | $$| $$| $$  \\ $$| $$  \\ $$| $$ \\ $$ \\ $$| $$  \\ $$\n" +
		"| $$      /$$__  $$| $$      | $$| $$| $$  | $$| $$  | $$| $$ | $$ | $$| $$  | $$\n" +
		"| $$     |  $$$$$$$|  $$$$$$$| $$| $$| $$  | $$|  $$$$$$/| $$ | $$ | $$|  $$$$$$/\n" +
		"|__/      \\_______/ \\_______/|__/|__/|__/  |__/ \\______/ |__/ |__/ |__/ \\______/\n\n");
		
		while(true) {
			System.out.printf("" +
			"Silakan pilih salah satu opsi berikut:\n" +
			"[1] Daftar aset\n" +
			"[2] Info portofolio\n" +
			"[3] Lanjut ke tahun berikutnya\n" +
			"[*] Keluar\n");
			printSeparator();
			System.out.print("Input: ");
			String pilihan = in.nextLine();
			if(pilihan.equals("1")) {
				daftarAset();
			} else if(pilihan.equals("2")) {
				infoPortofolio();
			} else if(pilihan.equals("3")) {
				nextYear();
				System.out.println("Setahun telah berlalu...");
				printSeparator();
			} else {
				System.out.println("Terima kasih telah menggunakan layanan Pacilnomo ~ !");
				break;
			}
		}	
		in.close();
	}
	public static void addToEarnings(double jumlah) {
		earnings += jumlah;
	}
}
