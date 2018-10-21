import java.util.Scanner;
//NAMA  :Arvi Nazwan Alhafiz 
//NIM   :10117105    
//KELAS :IF-3


/**
 *
 * @author RIA FITRIANI
 */
public class main {
     public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        
        Printer objP = new Printer();
        
        System.out.println("=====Aplikasi Pencetak Nama=====");
        System.out.print("Masukan Nama Anda : ");
        objP.setNama(scan1.nextLine());
        System.out.print("Mau Cetak Berapa Kali? : ");
        objP.setJmlCetak(scan2.nextInt());
        objP.cetak(objP.getNama());
        System.out.println("Hasil Cetak : ");
        objP.cetak(objP.getJmlCetak(), objP.getNama());
        

 }
    
}
