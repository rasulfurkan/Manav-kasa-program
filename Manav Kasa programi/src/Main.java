import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int armu, elm, dom, mu, patlıca;
        double armut=2.14, elma= 3.67, domates= 1.11, muz= 0.95, patlıcan= 5.00;

        Scanner input = new Scanner(System.in);
        System.out.println("Armut kaç kilo ? = ");
        armu = input.nextInt();
        double armuut = armu * armut;

        System.out.println("elma kaç kilo ? = ");
        elm = input.nextInt();
        double elmaa = elm * elma;

        System.out.println("domates kaç kilo ? = ");
        dom = input.nextInt();
        double domatees = dom * domates;

        System.out.println("muz kaç kilo ? = ");
        mu = input.nextInt();
        double muuz = mu * muz;

        System.out.println("patlıcan kaç kilo ? = ");
        patlıca = input.nextInt();
        double pat = patlıcan * patlıca;

        double toplam = pat + muuz + domatees + elmaa + armuut ;


        System.out.println("Toplam fiyatı = "+ toplam );













    }
}