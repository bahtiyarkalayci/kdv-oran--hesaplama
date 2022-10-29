import java.util.Scanner;

public class Kdv {


    public static void main(String[] args) {



            Scanner input = new Scanner(System.in);
            double fiyat;
            System.out.print("Fiyat girin: ");
            fiyat = input.nextDouble();
            System.out.println("KDV'siz fiyat: " + fiyat);
            boolean oran = fiyat > 1000;
            System.out.println(oran ? "KDV oran : " + 0.08 : "KDV oran : " + 0.18);
            boolean tutar = fiyat > 1000;
            System.out.println(tutar ? "KDV tutarı : " + fiyat * 0.08 : "KDV tutarı : " + fiyat * 0.18);
            boolean karar = fiyat > 1000;
            System.out.println(karar ? "KDV'li fiyat : " + (fiyat + fiyat * 0.08) : "KDV'li fiyat : " + (fiyat + fiyat * 0.18));






        }
}
