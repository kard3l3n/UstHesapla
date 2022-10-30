package uslusayi;
import java.util.Scanner;
import java.math.*;

public class UsluSayi {
    public static void main(String[] args) {
        int sayi,kati,ust=1;
        
        Scanner input=new Scanner(System.in);
        
        System.out.println("sayi giriniz:");
        sayi=input.nextInt();
        
        System.out.println("üs giriniz:");
        kati=input.nextInt();
        
        
        for(int i=1;i<=kati;i++){
            ust*=sayi;
        }
        
        System.out.println("üssü:"+ust);
        
        
        
    }
    
}
