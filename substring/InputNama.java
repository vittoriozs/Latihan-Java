package substring;

import java.util.Scanner;

public class InputNama {
    private String namaLengkap;

    public InputNama() {
        namaLengkap = "";
    }

    public void masukkanNama() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan nama lengkap Anda: ");
            namaLengkap = scanner.nextLine();
        }
    }

    public void tampilkanNamaBelakang() {
        int indeksSpasiTerakhir = namaLengkap.lastIndexOf(" ");
        
        if (indeksSpasiTerakhir != -1) {
            String namaBelakang = namaLengkap.substring(indeksSpasiTerakhir + 1);
            System.out.println("Nama belakang Anda: " + namaBelakang);
        } else {
            System.out.println("Nama lengkap tidak valid");
        }
    }

    public static void main(String[] args) {
        InputNama inputNama = new InputNama();
        inputNama.masukkanNama();
        inputNama.tampilkanNamaBelakang();
    }
}