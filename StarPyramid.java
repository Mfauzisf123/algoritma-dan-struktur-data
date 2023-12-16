public class StarPyramid {
        public static void main(String[] args) {
            int n = 10; // Jumlah baris piramida
            printStarPyramid(n);
        }
    
        // Fungsi rekursif untuk mencetak piramida bintang
        static void printStarPyramid(int n) {
            printStarPyramid(n, 0);
        }
    
        static void printStarPyramid(int n, int currentRow) {
            // Base case
            if (currentRow == n) {
                return;
            }
    
            // Cetak spasi sebelum bintang
            printSpaces(n, currentRow);
    
            // Cetak bintang pada setiap baris
            printStars(currentRow);
    
            // Pindah ke baris berikutnya
            System.out.println();
    
            // Panggil fungsi rekursif untuk baris berikutnya
            printStarPyramid(n, currentRow + 1);
        }
    
        static void printSpaces(int n, int currentRow) {
            // Cetak spasi sebelum bintang
            for (int i = 0; i < n - currentRow - 1; i++) {
                System.out.print(" ");
            }
        }
    
        static void printStars(int currentRow) {
            // Cetak bintang pada setiap baris
            for (int i = 0; i < 2 * currentRow + 1; i++) {
                System.out.print("*");
            }
        }
    }
    
