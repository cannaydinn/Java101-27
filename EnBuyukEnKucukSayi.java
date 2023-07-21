import java.util.Scanner;

public class EnBuyukEnKucukSayi{
    public static void main(String[] args) {
        //Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.
        Scanner sc = new Scanner(System.in);
        int deger,max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;

        System.out.println("kaç tane sayı gireceksiniz: ");
        deger = sc.nextInt();

        for(int i=1; i<=deger; i++){
            System.out.println(i+". Sayıyı giriniz: ");
            int sayi = sc.nextInt();

            if(sayi>max){
                max = sayi;
            }
                
            if(sayi<min){
                min = sayi;
            }

        }
        System.out.println("en büyük sayı: "+max);
        System.out.println("en küçük sayı: "+min);
    }
}