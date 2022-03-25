final public class Saham extends Aset{
	// TODO lengkapi visibility modifier atribut dan methods berikut
	private double dividen;
	private double pertumbuhan;
	
	Saham(String nama, int jumlah, double harga, double pertumbuhan, double dividen) {
	super(nama, jumlah, harga);
	this.pertumbuhan = pertumbuhan;
	this.dividen = dividen;
	}

	public double getDividen(){
		return dividen;
	}
	@Override
	void nextYear() {
		//Pemanfaatan set
		super.nextYear();
		grow();
		double hargaBaru = super.getHarga()*(1+pertumbuhan);
		super.setHarga(hargaBaru); 
		Pacilnomo.addToEarnings(dividen);
	}

	// Linear congruential generator for subsequent growth
	void grow() {
		int a = 0x4b;
		int c = 0x4a;
		int m = 2;
		pertumbuhan = ((a * pertumbuhan + c) % m) - 1;
		pertumbuhan = pertumbuhan < 0 ? pertumbuhan % -m : pertumbuhan;
	}

	// TODO lengkapi method toString ini
	@Override
	public String toString() {
		String theString = super.getNama()+"\nTipe: Saham"+"\nHarga: "+getHarga()+"\nJumlah: "+getJumlah()+"\nDividen: "+dividen+"\nPertumbuhan: "+pertumbuhan;
		return theString;
	}

	// TODO buat getter dan setter untuk fields pada class ini
}
