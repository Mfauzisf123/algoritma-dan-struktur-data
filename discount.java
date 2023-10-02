import java.util.Scanner;
public class discount {
    public static void main(String[] args) throws Exception {
        Double totalBelanja, discount;

        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukan total belanja: ");
        totalBelanja = inputan.nextDouble();

        if (totalBelanja >= 1000000); {
            discount = totalBelanja * 5/100;
            totalBelanja = totalBelanja - discount;

        }

        System.out.println("total yang harus dibayar: "+ totalBelanja);
        inputan.close();

    }
}
