package test;

import metier.DataMetier;

public class Programme {

    private static DataMetier metier = new DataMetier();
    public static void main(String[] args) {
        while (true) {
            System.out.println(metier.getInfo());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
