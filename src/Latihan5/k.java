package Latihan5;

public class k {
    public static void main(String[] args) {

        int[] dataArray = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.println("Menampilkan angka-angka yang setelahnya bernilai lebih besar");
        for (var indeks = 0; indeks < dataArray.length - 1; indeks++) {
            if (dataArray[indeks] < dataArray[indeks + 1]) {
                System.out.println(dataArray[indeks]);
            }
        }

    }
}