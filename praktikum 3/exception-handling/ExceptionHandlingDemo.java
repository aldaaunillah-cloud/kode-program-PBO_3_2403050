import java.io.*;  // untuk contoh throws IOException

public class ExceptionHandlingDemo {

    // Contoh method dengan 'throws'
    public static void bacaFile() throws IOException {
        // FileReader ini bisa melempar IOException
        BufferedReader br = new BufferedReader(new FileReader("data.txt"));
        String isi = br.readLine();
        System.out.println("Isi file: " + isi);
        br.close();
    }

    // Contoh method dengan 'throw'
    public static void cekUmur(int umur) {
        if (umur < 18) {
            throw new ArithmeticException("Umur tidak valid! Minimal 18 tahun.");
        } else {
            System.out.println("Umur valid: " + umur);
        }
    }

    public static void main(String[] args) {
        // ===== TRY - CATCH =====
        try {
            int hasil = 10 / 0; // akan memicu ArithmeticException
            System.out.println("Hasil: " + hasil);
        } catch (ArithmeticException e) {
            System.out.println("Terjadi kesalahan aritmatika: " + e.getMessage());
        }

        // ===== TRY - CATCH - FINALLY =====
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); // salah indeks
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error array: " + e);
        } finally {
            System.out.println("Blok finally: selalu dijalankan walau error!");
        }

        // ===== THROW =====
        try {
            cekUmur(15); // akan lempar exception
        } catch (ArithmeticException e) {
            System.out.println("Exception dari method cekUmur: " + e.getMessage());
        }

        // ===== THROWS =====
        try {
            bacaFile(); // method ini deklarasi throws IOException
        } catch (IOException e) {
            System.out.println("Error saat baca file: " + e.getMessage());
        }

        System.out.println("Program selesai dengan aman!");
    }
}
