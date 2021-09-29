package hu.petrik;

import javax.crypto.interfaces.PBEKey;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Szia Uram!");
        System.out.println("\b1. feladat:");
        Scanner src  = new Scanner(System.in);
        /* System.out.print("Kérem a terület szélességét méterben: ");
        int szelesseg = 100 * src.nextInt();
        System.out.print("Kérem a terület magasságát méterben: ");
        int magassag = 100 * src.nextInt();
        int terulet = magassag * szelesseg;
        double csempeDarabszam = (terulet / 400) * 1.1;
        System.out.println("A szükséges csempék száma: " + Math.round(csempeDarabszam)); */

        System.out.println("\n\b2. feladat");
        /*System.out.print("Adjon meg egy valos számot: ");
        double valosSzam = src.nextDouble();
        System.out.printf("A megadott szám a %d és a %d egész számok között van, és ezek közül a  %d számhoz van közelebb.\n" +
                "A szám egész része: %d\n" +
                "A szám törtrésze: %f",
                (int)Math.floor(valosSzam), (int)Math.ceil(valosSzam), Math.round(valosSzam), (int)Math.floor(valosSzam), valosSzam - (int)valosSzam);*/

        System.out.println("\n\b3.feladat");
        System.out.println("Adja meg a háromszög a oldalát: ");
        int a = src.nextInt();
        System.out.println("Adja meg a háromszög b oldalát: ");
        int b = src.nextInt();
        System.out.println("Adja meg a háromszög c oldalát: ");
        int c = src.nextInt();
        boolean aOldal = b + c > a;
        boolean bOldal = a + c > b;
        boolean cOldal = a + b > c;
        if (aOldal && bOldal && cOldal) {
            System.out.printf("A háromszög kerülete: %d ",(a + b + c));
        }
        else   {
            System.out.println("Hibás adatok!");
        }


    }

}
