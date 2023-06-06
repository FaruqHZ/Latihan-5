package Latihan5;

public class l {
    public static void main(String[] args) {

        int[] dataArray = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.println("Menampilkan jumlah angka dengan angka setelahnya yang hasil penjumlahannya bernilai genap");
        for (var indeks = 0; indeks < dataArray.length - 1; indeks++) {
            var jumlah = (dataArray[indeks] + dataArray[indeks + 1]);

            if (jumlah % 2 == 0) {
                System.out.println(jumlah);
            }
        }

    }
}
