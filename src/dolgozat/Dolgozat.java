package dolgozat;

import java.util.Random;

public class Dolgozat {
    
    
    public static void main(String[] args) {
        int[] hasznaltTomb = tombLetrehoz();
        kiir(hasznaltTomb);
        rendezés(hasznaltTomb);
        kiir(hasznaltTomb);
    }
    
    public static int[] tombLetrehoz(){
        Random rnd = new Random();
        int[] tomb = new int[10];
        for (int i = 0; i < tomb.length; i++) {
            tomb[i] = rnd.nextInt(100)+1;
        }
        return tomb;
    }
    
    public static void kiir(int[] tomb){
        for (int i = 0; i < tomb.length; i++) {
            System.out.printf("%d ",tomb[i]);
        }
        System.out.println("");
    }
    
    public static int[] rendezés(int[] tomb){
        int interval = tomb.length / 2;
        while (interval > 0){
            for (int i = interval; i < tomb.length; i++) {
                int temp = tomb[i];
                int j = i;
                while (j >= interval && tomb[j - interval] > temp){
                    tomb[j] = tomb[j - interval];
                    j = j - interval;
                }
                tomb[j] = temp;
            }
            interval = interval / 2;   
        }
        
        return tomb;
    }
}
