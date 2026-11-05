import java.util.Scanner;

public class NilaiKelompok08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah kelompok: ");
        int kelompok = sc.nextInt();
        System.out.print("Masukkan jumlah penilai: ");
        int penilai = sc.nextInt();

        if (kelompok <= 0 || penilai <= 0) {
            System.out.println("Jumlah kelompok dan penilai harus > 0.");
        } else {
            int nomorKelompok = 1;
            double rataTertinggi = -1;
            int kelompokTerbaik = 0;

            while (nomorKelompok <= kelompok) {
                double totalNilai = 0;
                System.out.println("Kelompok " + nomorKelompok);
                for (int j = 1; j <= penilai; j++) {
                    int nilai;
                    do {
                        System.out.print("Nilai dari penilai " + j + ": ");
                        nilai = sc.nextInt();
                        if (nilai < 0 || nilai > 100) {
                            System.out.println("Nilai harus antara 0-100. Ulangi input!");
                        }
                    } while (nilai < 0 || nilai > 100);
                    totalNilai += nilai;
                }
                double rataRata = totalNilai / penilai;
                System.out.println("Kelompok " + nomorKelompok + ": Nilai rata-rata " + rataRata);
                if (rataRata > rataTertinggi) {
                    rataTertinggi = rataRata;
                    kelompokTerbaik = nomorKelompok;
                }
                nomorKelompok++;
            }
            System.out.println("=================================");
            System.out.println("Kelompok terbaik    :" + kelompokTerbaik);
            System.out.println("Rata-rata tertinggi :" + rataTertinggi);
        }
        sc.close();
    }
}
