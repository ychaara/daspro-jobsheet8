import java.util.Scanner;
public class Tugas308 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahToko;
        do {
            System.out.print("Masukkan jumlah toko: ");
            jumlahToko = sc.nextInt();
            if (jumlahToko < 1) {
                System.out.println("Jumlah toko minimal 1.");
            }
        } while (jumlahToko < 1);
        int[] pelangganToko = new int[jumlahToko + 1];
        int[] barangToko = new int[jumlahToko + 1];
        int totalSemuaBarang = 0;
        int tokoTerbanyak = 1;
        int barangTerbanyak = -1;

        for (int t = 1; t <= jumlahToko; t++) {
            int pelanggan;
            do {
                System.out.print("Toko " + t + " - jumlah pelanggan: ");
                pelanggan = sc.nextInt();
                if (pelanggan < 0) {
                    System.out.println("Tidak boleh negatif.");
                }
            } while (pelanggan < 0);
            int totalBarang = 0;
            for (int p = 1; p <= pelanggan; p++) {
                int barang;
                do {
                    System.out.print("  Pelanggan " + p + " - jumlah barang: ");
                    barang = sc.nextInt();
                    if (barang < 0) {
                        System.out.println("  Tidak boleh negatif.");
                    }
                } while (barang < 0);
                totalBarang += barang;
            }
            pelangganToko[t] = pelanggan;
            barangToko[t] = totalBarang;
            totalSemuaBarang += totalBarang;
            if (totalBarang > barangTerbanyak) {
                barangTerbanyak = totalBarang;
                tokoTerbanyak = t;
            }
        }

        System.out.println();
        for (int t = 1; t <= jumlahToko; t++) {
            System.out.println("Toko " + t + " - pelanggan: " + pelangganToko[t]
                    + ", total barang: " + barangToko[t]);
        }
        System.out.println("Total barang seluruh toko: " + totalSemuaBarang);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
        sc.close();
    }
}
