import java.util.Scanner;

public class parkir {
    public static void main(String[] args) throws Exception {

        int JamMasuk,JamKeluar,BiayaPerjam = 2000,cal;
        Scanner input = new Scanner(System.in);

        //Input
        System.out.print("Jam Masuk : ");
        JamMasuk = input.nextInt();
        System.out.print("Jam Keluar : ");
        JamKeluar = input.nextInt();

        //Eksekusi programman
        cal = (JamKeluar - JamMasuk) * BiayaPerjam;
        System.out.println("Total biaya parkir : " + cal);
        input.close();
    } 
}