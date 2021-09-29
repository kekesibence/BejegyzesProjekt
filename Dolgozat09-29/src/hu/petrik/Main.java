package hu.petrik;

import javafx.scene.control.skin.SliderSkin;

import javax.swing.*;
import java.util.*;
import java.util.Scanner;

public class Main {

    static List<Bejegyzes> Bejegyzesek = new ArrayList();
    static Scanner src = new Scanner(System.in);
    public static void main(String[] args) {
        Bejegyzes a1 = new Bejegyzes("Tanárok", "Github commitolni kell srácok");
        Bejegyzes a2 = new Bejegyzes("Pénztáros", "Négyszáz és húsz forintot szeretnék elkérni");
        Bejegyzesek.add(a1);
        Bejegyzesek.add(a2);
        System.out.println(a1);
        System.out.println(a2);

        BekerosFeladat();
        Ellenőrzés();

    }

    public static void BekerosFeladat() {
        System.out.print("Írja be hány bejegyzést szeretne hozzáadni: ");
        int hanyatSzeretne = Integer.parseInt(src.nextLine());
        for (int i = 0; i < hanyatSzeretne; i++) {
            System.out.println("Írja be a szerzőt: ");
            String segedSzerzo = src.nextLine();
            System.out.println("Írja be a tartalmat: ");
            String segedTartalom = src.nextLine();
            Bejegyzes e = new Bejegyzes(segedSzerzo, segedTartalom);
            Bejegyzesek.add(e);
        }
    }

    public static void Ellenőrzés() {
        for (int i = 0; i < Bejegyzesek.size(); i++){
            System.out.println(Bejegyzesek.get(i));
        }
    }

}
