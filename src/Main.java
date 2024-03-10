import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Doğum Yılınızı Giriniz: ");
        int dogumYili = scanner.nextInt();

        String cinZodyagi = hesaplaCinZodyagi(dogumYili);

        System.out.println("Çin Zodyağı Burcunuz: " + cinZodyagi);

        scanner.close();
    }

    public static String hesaplaCinZodyagi(int dogumYili) {
        String[] cinZodyagiListesi = {"Maymun", "Horoz", "Köpek", "Domuz", "Fare", "Öküz", "Tavşan", "Ejderha", "Yılan", "At", "Koyun"};

        int kalan = dogumYili / 12;
        return cinZodyagiListesi[kalan];
    }
}