
import java.util.LinkedList;
import java.util.Arrays;

public class tugas1StrukturData {
    public static void main(String[] args) {
        
        int StrukturBaris;
        StrukturBaris = 123;
        System.out.println(StrukturBaris);

        //soal no.2

        String KataBaru = "Deklarasi tipe data String";
        System.out.println(KataBaru);

        //soal no.3

        int[] empatAngka = {7, 10, 20, 23};
        for (int i = 0; i < empatAngka.length; i++){
            System.out.print(empatAngka[i] + (i < empatAngka.length - 1 ? ", " : ""));
        }
        System.out.println();


        // soal no. 4
        String[][] Angka = {
            {"1", "3", "5"},
            {"14", "19", "20"},
            {"22", "27", "29"}
        };
     for (int i = 0; i < Angka.length; i++){
        for (int y = 0; y < Angka[i].length; y++){
            System.out.print(Angka[i][y] + "\t");
        }
         System.out.println(); 
     }   

        //soal no.5

        LinkedList<Integer> listAngka = new LinkedList<>(Arrays.asList(22, 19, 44, 60, 72));
        System.out.println(listAngka);
    }
    
}
