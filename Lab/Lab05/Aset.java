public class Aset {
	//Visibility Modifiernya di ubah menjadi private, dan memanfaatkan setter dan getter
	//untuk mengakses datanya, karena ketika private ga bisa di ambil keluar. Sehingga
	//data yang ada di sini aman untuk bisa di akses tergantung mau Read/Write (Get/Set)
	private String nama;
	private int jumlah;
	private double harga;
	private int tahun = 0;
	
	//Constructor
	public Aset(String nama, int jumlah, double harga) {
		this.nama = nama;
		this.jumlah = jumlah;
		this.harga = harga;
	}
	public void setHarga(double harga){
		this.harga = harga;
	}
	public String getNama() {
		return nama;
	}
	public int getJumlah() {
		return jumlah;
	}
	public double getHarga(){
		return harga;
	}
	protected void tahun(int tahun){
		this.tahun = tahun;
	}
	public int getTahun(){
		return tahun;
	}
	//Algorithm Aset.2
	//ketika di panggil maka akan melakukan proses increment tahun
	void nextYear() {
		tahun++;
	}
	public String toString(){
		String theString = getNama()+"\nTipe: Obligasi"+"\nHarga: "+getHarga()+"Jumlah: "+getJumlah();
		return theString;
	}
}
