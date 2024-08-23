import java.util.Scanner;

public class VolumeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan diameter: ");
        double diameter = scanner.nextDouble();
        double radius = diameter / 2.0;

        double volumeTabung = hitungVolumeTabung(radius);
        double volumeKerucut = hitungVolumeKerucut(radius);
        double volumeBola = hitungVolumeBola(radius);

        System.out.println("Volume Tabung: " + volumeTabung);
        System.out.println("Volume Kerucut: " + volumeKerucut);
        System.out.println("Volume Bola: " + volumeBola);
        
        scanner.close();
    }

    public static double hitungVolumeTabung(double radius) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan tinggi tabung: ");
        double tinggi = scanner.nextDouble();
        return Math.PI * radius * radius * tinggi;
    }

    public static double hitungVolumeKerucut(double radius) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan tinggi kerucut: ");
        double tinggi = scanner.nextDouble();
        return (1.0/3) * Math.PI * radius * radius * tinggi;
    }

    public static double hitungVolumeBola(double radius) {
        return (4.0/3) * Math.PI * Math.pow(radius, 3);
    }
}
