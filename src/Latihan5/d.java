package Latihan5;

public class d {
    public static void main(String[] args) {

        int[] dataArray = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.println("Menampilkan angka kelipatan 3");
        for (var indeks = 0; indeks < dataArray.length; indeks++) {
            if (dataArray[indeks] % 3 == 0)
                System.out.println("Angka kelipatan 3 yaitu, " + dataArray[indeks] + " terletak pada indeks ke-" + indeks);
        }

    }
}