
public class kuis {
    // method utama
    public static void main(String[] args) {
      int[][] matrix = {{1, 2, 4, 6, 6, 7},
                        {3, 4, 9, 9, 1, 1},
                        {4, 3, 10}};
  
      System.out.println(numGenap(matrix)); // 7
    }
  
    // method ini menghitung ada berapa banyak
    // elemen genap yang ada di matrix
    public static int numGenap(int[][] matrix) {
      int countGenap = 0;
        
    for (int baris = 0; baris < matrix.length; baris++){
        for (int kolom = 0; baris <matrix[baris].length; kolom++){
            if (matrix[baris][kolom]%2==0){
                countGenap += 1;
            } else {
                countGenap += 0;
            }
        }
      // lengkapi ...
    }
      return countGenap;
    }
  
  }
  