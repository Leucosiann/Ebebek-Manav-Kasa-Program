import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armutf=2.14, elmaf=3.67, domatesf=1.11, muzf=0.95, patlicanf=5.00;
        double arKg, elKg, domKg, muzKg, patKg;
        Scanner scan = new Scanner(System.in);

        System.out.println("Kaç Kg Armut istediğinizi Yazınız: ");
        arKg= scan.nextDouble();
        System.out.println("Kaç Kg Elma İstediğinizi Yazınız");
        elKg = scan.nextDouble();
        System.out.println("Kaç Kg Domates İstediğinizi Yazınız");
        domKg = scan.nextDouble();
        System.out.println("Kaç Kg Muz İstediğinizi Yazınız");
        muzKg = scan.nextDouble();
        System.out.println("Kaç Kg Patlıcan İstediğinizi Yazınız");
        patKg = scan.nextDouble();

        double arFiyat= arKg*armutf;
        double elFiyat= elKg*elmaf;
        double domFiyat= domKg*domatesf;
        double muzFiyat= muzKg*muzf;
        double patFiyat= patKg*patlicanf;

        double toplam= arFiyat+elFiyat+domFiyat+muzFiyat+patFiyat;

        System.out.println("Armut: "+arFiyat+"TL"+"\nElma: "+elFiyat+"TL"+"\nDomates: "+domFiyat+"TL"+"\nMuz: "
                +muzFiyat+"TL"+"\nPatlıcan: "+patFiyat+"TL"+"\nToplam: "+toplam+"TL");


    }
}