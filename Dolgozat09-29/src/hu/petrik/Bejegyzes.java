package hu.petrik;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Bejegyzes {
    private String szerzo;
    private String tartalom;
    private Integer likeok;
    private LocalDateTime letrejott;
    private LocalDateTime szerkesztve;

    public Bejegyzes(String szerzo, String tartalom) {
        this.szerzo = szerzo;
        this.tartalom = tartalom;
        this.likeok =  0;
        this.letrejott = LocalDateTime.now();
        this.szerkesztve = LocalDateTime.now();
    }

    public String getSzerzo() {
        return szerzo;
    }
    public String getTartalom() {
        return tartalom;
    }

    public void setTartalom(String tartalom) {
        this.tartalom = tartalom;
        this.szerkesztve = LocalDateTime.now();
    }

    public Integer getLikeok() {
        return likeok;
    }
    public LocalDateTime getLetrejott() {
        return letrejott;
    }
    public LocalDateTime getSzerkesztve() {
        return szerkesztve;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                if (szerkesztve == letrejott) {
                    return szerzo  + " " + likeok + " " + formatter.format(letrejott) +"\n" + tartalom;
                }
                else {
                    return szerzo  + " " + likeok + " " + formatter.format(letrejott) + "\nSzerkesztve: " + formatter.format(szerkesztve)+ "\n" + tartalom;

                }
    }

    public void Like() {
        this.likeok++;
    }
}
