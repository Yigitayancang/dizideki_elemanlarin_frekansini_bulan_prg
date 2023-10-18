public class ödev {
    public static void main(String[] args) {
        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] frekanslar = new int[dizi.length]; 
        for (int i = 0; i < dizi.length; i++) {
            int eleman = dizi[i];
            if (frekanslar[i] == -1) {
                continue; 
            }
            int frekans = 1;
            for (int j = i + 1; j < dizi.length; j++) {
                if (eleman == dizi[j]) {
                    frekans++;
                    frekanslar[j] = -1; 
                }
            }
            System.out.println("Eleman " + eleman + " " + frekans + " kez tekrar ediyor.");
        }
    }
}
