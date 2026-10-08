import java.util.Scanner;
public class StudiKasus104 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;
        System.out.print("Masukkan jumlah cup yang ingin dibeli: ");
        jumlahCup = scanner.nextInt();
        System.out.print("Masukkan jumlah uang yang dibayarkan: ");
        uangBayar = scanner.nextInt();
        System.out.print("Masukkan jumlah cup yang ingin dibeli: ");
        jumlahCup = scanner.nextInt();
        System.out.print("Masukkan jumlah uang yang dibayarkan: ");
        uangBayar = scanner.nextInt();

        totalHarga = hargaPerCup * jumlahCup;
        diskon = 0;
        
        if (totalHarga >= 100000) {
        }
        totalBayar = totalHarga - diskon;
        System.out.println("Total harga:Rp " + totalHarga);
        System.out.println("Diskon:Rp " + diskon);
        System.out.println("Total bayar:Rp " + totalBayar);
        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian:Rp " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang yang dibayarkan kurang sebesar:Rp " + kurang);
        }
        scanner.close();
    }
}
