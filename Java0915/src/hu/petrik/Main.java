package hu.petrik;

import javax.swing.text.html.parser.Parser;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.LongSummaryStatistics;

public class Main {

    public static void main(String[] args) {
        Pont p1 = new Pont();
        System.out.printf("P1 pont");
        System.out.println(p1);
        Pont p2 = new Pont(10);
        System.out.printf("P2 pont");
        System.out.println(p2);
        System.out.println("Két pont távolsága " + p1.getTavolsag(p2));


        Pont[] pontTomb = new Pont[12];
        for (int i = 0; i < pontTomb.length; i++) {
            pontTomb[i] = new Pont(i, i);
        }
        for (Pont pont : pontTomb) {
            System.out.println(pont + " origótol vett távolsága: " + pont.origotolVettTavolsag());
        }

        List<Pont> pontLista = fajlOlvasas("pontok.txt");
        for (Pont pont: pontLista) {
            System.out.println(pont);

        }
    }

    private static List<Pont> fajlOlvasas (String fajlNev) {
        List<Pont> pontLista = new ArrayList<>();

        try {
            FileReader fr = new FileReader(fajlNev);
            BufferedReader br = new BufferedReader(fr);
            String sor = br.readLine();
            while (sor != null){
                String[] adatok = sor.split(";");
                int x = Integer.parseInt(adatok[0]);
                int y = Integer.parseInt(adatok[1]);
                Pont p = new Pont(x, y);
                pontLista.add(p);
                sor = br.readLine();
            }
            br.close();
            fr.close();
        } catch (IOException ex) {
            System.out.printf(ex.getMessage());
        }
        return pontLista;
    }
}

