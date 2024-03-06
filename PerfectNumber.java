import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Sayı giriniz: ");
    int sayi = input.nextInt();

    int total =0;
         for (int i = 1;i<sayi;i++){
             if (sayi % i==0){
                 total += i;
             }
         }

         if (total == sayi){
         System.out.println(sayi+ " Mükemmel sayıdır ");
        } else {
            System.out.println(sayi+ " Mükemmel sayı değildir ");
        }

    }
}
