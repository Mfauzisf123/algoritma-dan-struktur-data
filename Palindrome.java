import java.util.Scanner;
public class Palindrome {

public static void main(String[] args) {
         String kata, balik = "";
            Scanner in = new Scanner(System.in); 
            System.out.println("Masukkan kata yang ingin di cek : ");
            kata = in.nextLine();
            int panjang = kata.length();
            for ( int i = panjang - 1; i >= 0; i-- )
            {
                balik = balik + kata.charAt(i);
            }
            if (kata.equals(balik))
            {
                System.out.println("Kata " + kata + " merupakan kata palindrom.");
            }
            else
            {
                System.out.println("Kata " + kata + " bukan kata palindrom.");
                in.close();
            }
}
}