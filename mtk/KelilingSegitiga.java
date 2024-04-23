package mtk;

import java.util.Scanner;

public class KelilingSegitiga {
    public static void main(String[] args) {    
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nilai sisi: ");
        double sisi = scanner.nextDouble();
              
        double keliling = hitungKelilingSegitiga(sisi);
        
        System.out.println("Luas segitiga dengan sisi " + sisi +  " adalah: " + keliling);
        
        scanner.close();
    }
    
    public static double hitungKelilingSegitiga(double sisi) {
        return 3 * sisi;
    }
}

