import javax.swing.JOptionPane;

public class Bantubudi {

    public static void main(String[] args) {
        String[] options = {"Persegi", "Persegi Panjang", "Lingkaran", "Segitiga"};
        String pilihan = (String) JOptionPane.showInputDialog(
                null,
                "Pilih bangun yang ingin dihitung luasnya:",
                "Pilih Bangun",
                JOptionPane.PLAIN_MESSAGE,
                null,
                options,
                options[0]);
        switch (pilihan) {
            case "Persegi" -> hitungLuasPersegi();
            case "Persegi Panjang" -> hitungLuasPersegiPanjang();
            case "Lingkaran" -> hitungLuasLingkaran();
            case "Segitiga" -> hitungLuasSegitiga();
            default -> JOptionPane.showMessageDialog(null, "Pilihan tidak valid!");
        }
    }
    public static void hitungLuasPersegi() {
        double sisi = Double.parseDouble(JOptionPane.showInputDialog("Masukkan panjang sisi persegi:"));
        double luas = sisi * sisi;
        JOptionPane.showMessageDialog(null, "Luas Persegi: " + luas);
    }
    public static void hitungLuasPersegiPanjang() {
        double panjang = Double.parseDouble(JOptionPane.showInputDialog("Masukkan panjang persegi panjang:"));
        double lebar = Double.parseDouble(JOptionPane.showInputDialog("Masukkan lebar persegi panjang:"));
        double luas = panjang * lebar;
        JOptionPane.showMessageDialog(null, "Luas Persegi Panjang: " + luas);
    }
    public static void hitungLuasLingkaran() {
        double jariJari = Double.parseDouble(JOptionPane.showInputDialog("Masukkan jari-jari lingkaran:"));
        double luas = Math.PI * jariJari * jariJari;
        JOptionPane.showMessageDialog(null, "Luas Lingkaran: " + luas);
    }
    public static void hitungLuasSegitiga() {
        double alas = Double.parseDouble(JOptionPane.showInputDialog("Masukkan panjang alas segitiga:"));
        double tinggi = Double.parseDouble(JOptionPane.showInputDialog("Masukkan tinggi segitiga:"));
        double luas = 0.5 * alas * tinggi;
        JOptionPane.showMessageDialog(null, "Luas Segitiga: " + luas);
    }
}
