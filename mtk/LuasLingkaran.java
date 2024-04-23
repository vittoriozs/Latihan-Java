package mtk;

import java.text.DecimalFormat;

public class LuasLingkaran {
    private double r;

    public LuasLingkaran(double r) {
        this.r = r;
    }

    public double hitungLuas() {
        return Math.PI * r * r;
    }

    public class LingkaranBeraksi {
        public static void main(String[] args) {
            double r = 11.78;
            LuasLingkaran lingkaran = new LuasLingkaran(r);
    
            double luas = lingkaran.hitungLuas();
    
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            String luasPecahan = decimalFormat.format(luas);
            System.out.println("Luas lingkaran (bilangan pecahan): " + luasPecahan);
    
            int luasBulat = (int) luas;
            System.out.println("Luas lingkaran (bilangan bulat): " + luasBulat);
    
            long luasPembulatan = Math.round(luas);
            System.out.println("Luas lingkaran (pembulatan): " + luasPembulatan);
        }
    }
}