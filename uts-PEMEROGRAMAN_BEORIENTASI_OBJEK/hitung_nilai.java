import java.util.Scanner;

public class hitung_nilai {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nilai: ");
        int nilai = input.nextInt();

        if (nilai >= 91 && nilai <= 100) {
            System.out.println("Grade = A");
        } else if (nilai >= 81 && nilai <= 90) {
            System.out.println("Grade = B");
        } else if (nilai >= 71 && nilai <= 80) {
            System.out.println("Grade = C");
        } else if (nilai >= 61 && nilai <= 70) {
            System.out.println("Grade = D");
        } else if (nilai >= 0 && nilai < 60) {
            System.out.println("Grade = E");
        } else {
            System.out.println("Nilai tidak valid");
        }

        input.close();
    }
}