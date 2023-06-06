package Latihan5;

public class i {
    public static void main(String[] args) {

        int[] dataArray = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.println("Menampilkan selisih angka-angka dengan angka setelahnya");
        for (var indeks = 0; indeks < dataArray.length - 1; indeks++) {

            int selisih;
            if (dataArray[indeks] > dataArray[indeks + 1]) {
                selisih = dataArray[indeks] - dataArray[indeks + 1];
            } else {
                selisih = dataArray[indeks + 1] - dataArray[indeks];
            }
            System.out.println("Selisih angka " + dataArray[indeks] + " pada indeks ke-" + indeks + " dengan angka " + dataArray[indeks + 1] + " pada indeks ke-" + (indeks + 1) + " adalah " + selisih);

        }

    }
}