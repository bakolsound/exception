import javax.swing.JOptionPane;

public class Arraymulti {
    public static void main(String[] args) {
        int data[][] = {
            {4, 6, 4, 2, 8, 4, 2, 10}, 
            {4, 6, 4, 2, 8, 4, 2, 10}
        };

        // Cetak array asli
        printArray(data);

        // a. Menghitung rata-rata dari array
        double rataRata = hitungRataRata(data);
        JOptionPane.showMessageDialog(null, "Rata-rata dari semua elemen: " + rataRata);

        // b. Mencari posisi index dari elemen array yang diinputkan dan menukarnya dengan angka baru
        int cariNilai = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai yang ingin dicari:"));
        int nilaiBaru = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai baru untuk mengganti nilai yang ditemukan:"));

        tukarNilai(data, cariNilai, nilaiBaru);
        
        // Cetak array setelah penggantian
        JOptionPane.showMessageDialog(null, "Array setelah penggantian nilai:");
        printArray(data);

        // c. Menjumlahkan semua elemen dengan indeks kolom ganjil
        int jumlahGanjil = jumlahIndeksGanjil(data);
        JOptionPane.showMessageDialog(null, "Jumlah elemen pada indeks kolom ganjil: " + jumlahGanjil);
    }
    
    // Fungsi untuk mencetak array
    public static void printArray(int[][] array) {
        StringBuilder sb = new StringBuilder();
        for (int[] array1 : array) {
            for (int j = 0; j < array1.length; j++) {
                sb.append(array1[j]).append(" ");
            }
            sb.append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }
    
    // a. Fungsi untuk menghitung rata-rata dari array
    public static double hitungRataRata(int[][] array) {
        int total = 0;
        int jumlahElemen = 0;
        for (int[] array1 : array) {
            for (int j = 0; j < array1.length; j++) {
                total += array1[j];
                jumlahElemen++;
            }
        }
        return (double) total / jumlahElemen;
    }

    // b. Fungsi untuk mencari dan menukar nilai dalam array
    public static void tukarNilai(int[][] array, int cariNilai, int nilaiBaru) {
        for (int[] array1 : array) {
            for (int j = 0; j < array1.length; j++) {
                if (array1[j] == cariNilai) {
                    array1[j] = nilaiBaru;
                }
            }
        }
    }

    // c. Fungsi untuk menjumlahkan elemen pada indeks kolom ganjil
    public static int jumlahIndeksGanjil(int[][] array) {
        int jumlah = 0;
        for (int[] array1 : array) {
            for (int j = 1; j < array1.length; j += 2) {
                // Mulai dari indeks 1 (kolom ganjil)
                jumlah += array1[j];
            }
        }
        return jumlah;
    }
}
