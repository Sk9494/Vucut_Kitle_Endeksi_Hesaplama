import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double boy,kilo;

        Scanner inp= new Scanner(System.in);

        System.out.print("Lütfen boyunuzu metre cinsinden giriniz: ");
        boy = inp.nextDouble();
        System.out.print("lütfen kilonuzunu giriniz: ");
        kilo =inp.nextDouble();
        Double indeks = kilo/(boy * boy);

        System.out.println("Vucut kitle indeksi:" + indeks);

    }
}