import java.util.Scanner;
public class Code {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Basamak Sayisini Giriniz : ");
        int n=input.nextInt();
        //ÜÇGEN YAPIMI İÇİN GEREKLİ KOD BLOĞU
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(" ");
            }
            for(int k=n+2*i;k>=n+2;k--)
            System.out.print("*");
            System.out.println();
        }
        /*//DIAMOND İÇİN AÇILMASI GEREKEN KOD BLOĞU
        for(int i=2;i<=n;i++){
            for(int j=n-i+1;j<=n;j++){
                System.out.print(" ");
            }
            for(int k=i;k<=2*n-i;k++)
            System.out.print("*");
            System.out.println();
        }*/
    }
    
}
