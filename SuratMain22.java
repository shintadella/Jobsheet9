import java.util.Scanner;

public class SuratMain22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StackSurat22 stack = new StackSurat22(10);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat Izin");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat       : ");
                    String id = input.nextLine();
                    System.out.print("Nama Mahasiswa : ");
                    String nama = input.nextLine();
                    System.out.print("Kelas          : ");
                    String kelas = input.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = input.next().toUpperCase().charAt(0);
                    System.out.print("Durasi Izin (hari): ");
                    int durasi = input.nextInt();
                    input.nextLine();

                    Surat22 surat = new Surat22(id, nama, kelas, jenis, durasi);
                    stack.push(surat);
                    break;

                case 2:
                    Surat22 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Surat diproses:");
                        diproses.tampil();
                    }
                    break;

                case 3:
                    Surat22 atas = stack.peek();
                    if (atas != null) {
                        System.out.println("Surat terakhir:");
                        atas.tampil();
                    } else {
                        System.out.println("Belum ada surat.");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String cari = input.nextLine();
                    stack.cariSurat(cari);
                    break;

                case 5:
                    System.out.println("Terima kasih.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilih != 5);
    }
}