package Manav;
import java.util.Scanner;
//Armut : 2,14 TL
//        Elma : 3,67 TL
//        Domates : 1,11 TL
//        Muz: 0,95 TL
//        Patlıcan : 5,00 TL

public class manav {
    public static void main(String[] args) {

        double perArmut=2.14 , perElma= 3.67 ,perDomates=1.11,perMuz=0.95, perPatlican=5.00,Toplam, a, e,p,m,d;

        Scanner input =new Scanner(System.in);
        System.out.print("Armut kilo :");
        a= input.nextDouble();
        System.out.print("Elma kilo :");
        e= input.nextDouble();
        System.out.print("Patlıcan kilo :");
        p= input.nextDouble();
        System.out.print("Muz kilo :");
        m= input.nextDouble();
        System.out.print("Domates kilo :");
        d= input.nextDouble();

        Toplam = (perArmut*a)+(perElma*e)+(perMuz*m)+(perDomates*d)+(perPatlican*p);
        System.out.print("Toplam Tutar : "+Toplam);

    }
}
