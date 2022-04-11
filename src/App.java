import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        double pi = 3.14,r,a;

        Scanner inp = new Scanner(System.in);

        System.out.println("Dairenin yarı çapını giriniz: ");
        r = inp.nextDouble();
        System.out.println("Merkez açısının ölçüsünü giriniz: ");
        a = inp.nextDouble();
        inp.close();

        double sonuc = (pi * (r*r)*a)/360;
        System.out.println("Daire diliminin alanı: "+sonuc);
    }
}
