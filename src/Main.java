import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] sayiDizisi = new int[10];
        int cep;

        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ".nci sayiyi giriniz : ");
            int sayi = inp.nextInt();
            sayiDizisi[i] = sayi;
        }

        for (int j = 0; j < 9; j++) {
            for (int k = j + 1; k < 10; k++) {
                if (sayiDizisi[k] < sayiDizisi[j]) {
                    cep = sayiDizisi[j];
                    sayiDizisi[j] = sayiDizisi[k];
                    sayiDizisi[k] = cep;
                }
            }
        }
        for (int i=0;i<10;i++){
            System.out.println((i+1)+". sayi: "+sayiDizisi[i]);
        }
    }
}