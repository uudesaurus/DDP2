public class Barang {
  
    //TODO: Tambahkan modifier
    String nama;
    int harga;
    int beratBarang;
    int stock;

    //TODO: Buat Constructor
    public Barang(String nama, int harga, int beratBarang, int stock){
    
    }
    /*    
    }
    private void setNama(String nama){
        this.nama = nama;
    }
    private void setHarga(int harga){
        this.harga = harga;
    }
    private void setBeratBarang(int beratBarang){
        this.beratBarang = beratBarang;
    }
     */ 

    //TODO: Silakan cek stock
    boolean cekStock(int stock){
        if (stock>0){
            return false;    
        } else
            return true;

    }
    
    String getNama() {
        return nama;
    }
    
    int getStock(){
        return stock;
    }
  
    void setStock(int kuantitas){
        this.stock = kuantitas;
    }
    
    int getBeratBarang(){
        return beratBarang;
    }

    int getHarga(){
        return harga;
    }

    public static void cekStock() {
    }
    
}
