import java.util.ArrayList;
import java.util.List;
public class Perpustakaan {
    
    String judul;
    String pengarang;
    String penerbit;
    int tahun;
    int kategori;

    Perpustakaan(String judul, String pengarang, String penerbit, int tahun, int kategori) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tahun = tahun;
        this.kategori = kategori;
    }

    public static void main(String[] args) {
        System.out.println("======================================================================================");
        System.out.println("Daftar Buku Java yang Tersedia");
        System.out.println("======================================================================================");
        System.out.println("Judul                 Pengarang       Penerbit       Tahun   Kategori");
        System.out.println("======================================================================================");

        List<Perpustakaan> daftarBuku = new ArrayList<>();
        daftarBuku.add(new Perpustakaan("PBO dengan Java ", "Abdul Kadir", "Erlangga", 2008, 1));
        daftarBuku.add(new Perpustakaan("Mariposa ", "Luluk HF", "Coconut", 2020, 3));
        daftarBuku.add(new Perpustakaan("Milea ", "Pidi Baiq", "Pastel Books", 2018, 3));
        
        int no = 1;
        int bukuTeknik = 0;
        int bukuManajemen = 0;
        int bukuFiksi = 0;
        int bukuLainnya = 0;
        int bukuLawas = 0;
        int bukuBaru = 0;

        for (Perpustakaan buku : daftarBuku) {
            System.out.printf("%-4d %-20s %-15s %-15s %d", no, buku.judul, buku.pengarang, buku.penerbit, buku.tahun);

       
            switch (buku.kategori) {
                case 1:
                    System.out.println("Teknik");
                    bukuTeknik++;
                    break;
                case 2:
                    System.out.println("Manajemen");
                    bukuManajemen++;
                    break;
                case 3:
                    System.out.println("Fiksi");
                    bukuFiksi++;
                    break;
                default:
                    System.out.println("Lainnya");
                    bukuLainnya++;
                    if (buku.tahun < 2000) {
                        bukuLawas++;
                    } else {
                        bukuBaru++;
                    }
                    no++;
                
                }
        
                System.out.println("Jumlah buku yang tersedia: " + daftarBuku.size());
                System.out.println("Buku Teknik: " + bukuTeknik);
                System.out.println("Buku Manajemen: " + bukuManajemen);
                System.out.println("Buku Fiksi: " + bukuFiksi);
                System.out.println("Buku Lainnya: " + bukuLainnya);
                System.out.println("Buku Lawas: " + bukuLawas);
                System.out.println("Buku Baru: " + bukuBaru);
            }
    }
}

