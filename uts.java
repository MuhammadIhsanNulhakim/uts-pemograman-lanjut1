
import java.util.*;

public class uts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan daftar angka: ");
        String[] input = scanner.nextLine().split(" ");

        // Buat sebuah Set kosong untuk menyimpan angka yang unik
        Set<Integer> uniqueNumbers = new HashSet<>();

        // Loop melalui input dan tambahkan setiap angka ke Set
        for (String str : input) {
            Integer number = Integer.parseInt(str);
            uniqueNumbers.add(number);
        }


        // Jika jumlah angka dalam Set sama dengan jumlah angka dalam input,
        // artinya tidak ada angka yang sama
        if (uniqueNumbers.size() == input.length) {
            System.out.println("False");
        } else { // Jika tidak, artinya ada angka yang sama
            System.out.println("True");
            Map<Integer, Integer> countMap = new HashMap<>();
            // Lakukan iterasi lagi melalui input dan hitung jumlah setiap angka
            for (String str : input) {
                Integer number = Integer.parseInt(str);
                if (countMap.containsKey(number)) {
                    countMap.put(number, countMap.get(number) + 1);
                } else {
                    countMap.put(number, 1);
                }
            }
            // Tampilkan daftar angka yang sama beserta jumlahnya
            for (Integer number : countMap.keySet()) {
                if (countMap.get(number) > 1) {
                    System.out.println(number + " ada " + countMap.get(number));
                }
            }
        }
    }
}
