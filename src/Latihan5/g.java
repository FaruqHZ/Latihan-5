package Latihan5;

public class g {
    public static void main(String[] args) {

        int[] dataArray = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.println("Menampilkan angka-angka kelipatan 5 yang sebelumnya juga angka kelipatan 5");
        for (var indeks = 1; indeks < dataArray.length; indeks++) {

            if ((dataArray[indeks] % 5 == 0) && (dataArray[indeks - 1] % 5 == 0)) {
                System.out.println("Angka kelipatan 5, yaitu " + dataArray[indeks] + " terletak pada indeks ke-" + indeks);
            }
        }

    }
}
