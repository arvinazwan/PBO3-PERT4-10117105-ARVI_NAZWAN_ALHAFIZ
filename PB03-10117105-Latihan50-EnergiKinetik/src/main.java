import java.text.DecimalFormat;
//NAMA  :Arvi Nazwan Alhafiz 
//NIM   :10117105    
//KELAS :IF-3


/**
 *
 * @author RIA FITRIANI
 */
public class main {
     public static void main(String[] args) {
       
        Energi kinetik = new Energi();
        kinetik.setMassa(0.145);
        kinetik.setKecepatan(25);
        kinetik.setKecepatanAwal(0);
        kinetik.setKecepatanAkhir(25);
        
        DecimalFormat df = new DecimalFormat("#.#");
        
        System.out.println("=====PROGRAM MENCARI ENERGI KINETIK=====");
        System.out.println("Energi Kinetik : " + df.format(
                           kinetik.hitungEnergiKinetik
                          (kinetik.getMassa(), kinetik.getKecepatan())));
        System.out.println("Usaha : " + df.format (kinetik.hitungUsaha
                          (kinetik.getKecepatanAwal(), 
                           kinetik.getKecepatanAkhir())));
    }
    
}
