package hu.petrik;

import javafx.scene.control.skin.SliderSkin;

import javax.swing.*;
import java.util.*;
import java.util.Scanner;

public class Main {

    static List<Bejegyzes> Bejegyzesek = new ArrayList();
    //static Scanner src = new Scanner(System.IO());
    public static void main(String[] args) {
        Bejegyzes a1 = new Bejegyzes("Tanárok", "Github commitolni kell srácok");
        Bejegyzes a2 = new Bejegyzes("Pénztáros", "Négyszáz és húsz forintot szeretnék elkérni");
        Bejegyzesek.add(a1);
        Bejegyzesek.add(a2);
        System.out.println(a1);
        System.out.println(a2);
    }
}
