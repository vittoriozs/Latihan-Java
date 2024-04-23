package mtk;

import java.util.Scanner;

public class LuasSegitiga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nilai alas: ");
        double alas = scanner.nextDouble();
        
        System.out.print("Masukkan nilai tinggi: ");
        double tinggi = scanner.nextDouble();
        
        double luas = hitungLuasSegitiga(alas, tinggi);
        
        System.out.println("Luas segitiga dengan alas " + alas + " dan tinggi " + tinggi + " adalah: " + luas);
        
        scanner.close();
    }
    
    public static double hitungLuasSegitiga(double alas, double tinggi) {
        return 0.5 * alas * tinggi;
    }
}
