final public class Obligasi extends Aset{
	
	//Algorithm Obligasi 1.0
	//semua visibility modifier di ubah menjadi private agar meningkatkan
	//security dari class lain, sehingga tidak bisa di ubah ubah
	private double bunga;
	private int maturitas;
	private boolean jatuhTempo = false;
	
	Obligasi(String nama, int jumlah, double harga, double bunga, int maturitas) {
	super(nama, jumlah, harga);
	this.bunga = bunga;
	this.maturitas = maturitas;
	}

	//Algorithm Obligasi 1.1
	//Setiap di nextYear maka akan nextYear akan tetap bertambah dari superclass
	//tetapi untuk di konteks obligasi, maka sesuai algorithm dibawah ketika jatuhTempo
	//sudah sesuai dengan maturitas maka tidak akan menambah earnings disaat bersamaan tahun tetap
	//bertambah.
	@Override
	void nextYear() {
		super.nextYear();
		if (getTahun() > maturitas){
			jatuhTempo = true;
		} else {	
			Pacilnomo.addToEarnings(super.getJumlah()*super.getHarga()*bunga);
		}
	}
	//Algorithm Obligasi 1.2
	//Setiap dipanggil maka akan memanggil override toStringnya, sehingga spesial khusus
	//untuk si toString yang ini, akan terspesialisasikan.
	@Override
	public String toString() {
		String theString = super.getNama()+"\nTipe: Obligasi"+"\nHarga: "+getHarga()+"Jumlah: "+super.getJumlah()+"\nBunga: "+bunga+"\nJatuh tempo: "+jatuhTempo;
		return theString;
	}	
	// TODO buat getter dan setter untuk fields pada class ini
}

