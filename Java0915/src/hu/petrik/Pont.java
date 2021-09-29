package hu.petrik;

public class Pont {
    private int x;
    private int y;

    public Pont() {
        x = 0;
        y = 0;
    }

    public Pont(int x, int y) {
        this.x = x;
        this.y = y;

    }



    public Pont(int tartomany) {
        this.x = (int)(Math.random()*tartomany);
        this.y = (int)(Math.random()*tartomany);
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int xKoordinataErteke(){
        return this.x;
    }

    public double origotolVettTavolsag() {
        return Math.sqrt(Math.pow(this.x ,2) + Math.pow(this.y, 2));
    }

    public double getTavolsag(Pont masikPont) {
        return Math.sqrt(Math.pow(this.x - masikPont.getX(),2) + Math.pow(this.y - masikPont.getY(),2));
    }

    @Override
    public String toString() {
        return "Pont{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
