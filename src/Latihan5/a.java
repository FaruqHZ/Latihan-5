package Latihan5;

public class a {
    public static void main(String[] args) {

        int[] dataArray = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.println("Menampilkan semua nilai");

        for (var indeks = 0; indeks < dataArray.length; indeks++) {
            System.out.println("Angka pada indeks ke-" + indeks + " adalah " + dataArray[indeks]);
        }

    }
}