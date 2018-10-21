import java.util.Scanner;
//NAMA  :Arvi Nazwan Alhafiz 
//NIM   :10117105    
//KELAS :IF-3

/**
 *
 * @author RIA FITRIANI
 */
public class main {
     private static double quiz,uts,uas,NA;
    private static String index;
    private static String keterangan;
    
    
    public static void main(String[] args) {
        
       Scanner baca = new Scanner(System.in);
       Mahasiswa objMahasiswa = new Mahasiswa();
       
       System.out.print("QUIZ : ");
       quiz = baca.nextDouble();
       System.out.print("UTS  : ");
       uts = baca.nextDouble();
       System.out.print("UAS  : ");
       uas = baca.nextDouble();
       System.out.println("");
       System.out.print("Nilai Akhir : " + objMahasiswa.NA(quiz, uts, uas));
       System.out.println("");
       System.out.println("");
       System.out.println("Index : " + objMahasiswa.aturanIndex(index));
       objMahasiswa.aturanKeterangan(keterangan);
       
      }
    
    
}
