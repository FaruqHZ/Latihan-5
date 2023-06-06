package Latihan5;

public class n {
    public static void main(String[] args) {

        int[] dataArray = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.println("Menampilkan jumlah angka-angka di dalam dataArray dengan seluruh angka-angka sebelumnya");
        for (var indeks = 0; indeks < dataArray.length - 1; indeks++) {
            var jumlah = (dataArray[indeks+1] + dataArray[indeks]);
            System.out.println(jumlah);
        }

    }
}
