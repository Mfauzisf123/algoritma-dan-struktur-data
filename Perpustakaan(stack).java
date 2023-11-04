import java.util.Stack;

class Buku {
    String judul;
    String pengarang;
    String penerbit;
    int tahun;
    int kategori;

    public Buku(String judul, String pengarang, String penerbit, int tahun, int kategori) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tahun = tahun;
        this.kategori = kategori;
    }
}

public class Perpustakaan {
    public static void main(String[] args) {
        Stack<Buku> daftarBuku = new Stack<>();

        // Tambahkan buku ke stack
        daftarBuku.push(new Buku("PBO with Java", "  Indrajani", "Elexmedia", 2007, 1));
        daftarBuku.push(new Buku("Pemrograman Web", "  Priyanto", "Informatika", 2017, 1));
        daftarBuku.push(new Buku("Milea", "          Pidi Baiq", "Pastel Books", 2016, 3));
        daftarBuku.push(new Buku("Mariposa", "  Hidayatul", "Coconut Books", 2018, 3));


        System.out.println("======================================================================================");
        System.out.println("Daftar Buku yang Tersedia");
        System.out.println("======================================================================================");
        System.out.println("Judul\t          Pengarang\tPenerbit\tTahun\tKategori");
        System.out.println("======================================================================================");

        int bukuTeknik = 0;
        int bukuManajemen = 0;
        int bukuFiksi = 0;
        int bukuLainnya = 0;
        int bukuLawas = 0;
        int bukuBaru = 0;

        while (!daftarBuku.isEmpty()) {
            Buku buku = daftarBuku.pop();
            System.out.println(buku.judul + "\t" + buku.pengarang + "  \t" + buku.penerbit + "\t" + buku.tahun + "\t" + kategoriToString(buku.kategori));
            if (buku.kategori == 1) {
                bukuTeknik++;
            } else if (buku.kategori == 2) {
                bukuManajemen++;
            } else if (buku.kategori == 3) {
                bukuFiksi++;
            } else {
                bukuLainnya++;
            }

            if (buku.tahun < 2004) {
                bukuLawas++;
            } else {
                bukuBaru++;
            }
        }

        System.out.println("=======================================================================");
        System.out.println("Jumlah buku yang tersedia: " + (bukuTeknik + bukuManajemen + bukuFiksi + bukuLainnya));
        System.out.println("Buku Teknik: " + bukuTeknik);
        System.out.println("Buku Manajemen: " + bukuManajemen);
        System.out.println("Buku Fiksi: " + bukuFiksi);
        System.out.println("Buku Lainnya: " + bukuLainnya);
        System.out.println("Buku Lawas: " + bukuLawas);
        System.out.println("Buku Baru: " + bukuBaru);
    }

    public static String kategoriToString(int kategori) {
        switch (kategori) {
            case 1:
                return "Teknik";
            case 2:
                return "Manajemen";
            case 3:
                return "Fiksi";
            default:
                return "Lainnya";
        }
    }
}
