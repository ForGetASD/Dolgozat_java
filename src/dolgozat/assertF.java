package dolgozat;

public class assertF {
    public static void main(String[] args) {
        int[] tomb = Dolgozat.rendezés(Dolgozat.tombLetrehoz());
        boolean joe;
        for (int i = 1; i < tomb.length; i++) {
            System.out.printf("%d - %d", tomb[i-1], tomb[i]);
            if (tomb[i - 1] <= tomb[i]) {
                joe = true;
            }else{
                joe = false;
            }
            assert joe == true : "Nem jóóó a rendezés";
        }
    }
}
