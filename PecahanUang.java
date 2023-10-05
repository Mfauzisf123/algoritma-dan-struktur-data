import java.util.Scanner;
public class PecahanUang {
    public static void main(String[] args)throws Exception {
        int bil1, uang;  
           
          System.out.println("Jumlah uang =" ); 
          Scanner input = new Scanner(System.in);  
          uang = input.nextInt();  
           
             // besar 100000  
             if (uang >= 100000)  
             {  
                 bil1 = uang / 100000;  
                 System.out.println("Pecahan uang 100000 sebanyak "+bil1);  
             }  
        

             // antara 50000-100000  
             uang = uang % 100000;  
             if ((uang >= 50000) && (uang <100000))  
             {  
                 bil1 = uang / 50000;  
                 System.out.println("Pecahan uang 50000 sebanyak "+bil1);  
             }  
          
             // antara 20000-50000  
             uang = uang % 50000;  
             if ((uang >= 20000) && (uang <50000))  
             {  
                 bil1 = uang / 20000;  
                 System.out.println("Pecahan uang 20000 sebanyak "+bil1);  
             }  
        
             // antara 10000-20000  
             uang = uang % 20000;  
             if ((uang >= 10000) && (uang <20000))  
             {  
                 bil1 = uang / 10000;  
                 System.out.println("Pecahan uang 10000 sebanyak "+bil1);  
             }  
        
             // antara 5000-10000  
             uang = uang % 10000;  
             if ((uang >= 5000) && (uang <10000))  
             {  
                 bil1 = uang / 5000;  
                 System.out.println("Pecahan uang  5000 sebanyak "+bil1);  
             }  
        
             // antara 2000-5000  
             uang = uang % 5000;  
             if ((uang >= 2000) && (uang <5000))  
             {  
                 bil1 = uang / 2000;  
                 System.out.println("Pecahan uang  2000 sebanyak "+bil1);  
             }  
        
             // antara 1000-2000  
             uang = uang % 2000;  
             if ((uang >= 1000) && (uang <2000))  
             {  
                 bil1 = uang / 1000;  
                 System.out.println("Pecahan uang  1000 sebanyak "+bil1);  
             }  
        
             // antara 500-1000  
             uang = uang % 1000;  
             if ((uang >= 500) && (uang <1000))  
             {  
                 bil1 = uang / 500;  
                 System.out.println("Pecahan  uang  500 sebanyak "+bil1);  
             }  
        
             // antara 200-500  
             uang = uang % 500;  
             if ((uang >= 200) && (uang <500))  
             {  
                bil1 = uang / 200;  
                System.out.println ("Pecahan  uang  200 sebanyak "+bil1);  
             }  
        
             // antara 100-200  
             uang = uang % 200;  
             if ((uang >= 100) && (uang <200))  
             {  
                bil1 = uang / 100;  
                System.out.println ("Pecahan  uang  100 sebanyak "+bil1);  
             }  
        input.close();
             
            } 
        } 
    


     
        
    
