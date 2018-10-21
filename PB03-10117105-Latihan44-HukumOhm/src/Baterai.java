//NAMA  :Arvi Nazwan Alhafiz 
//NIM   :10117105    
//KELAS :IF-3

/**
 *
 * @author RIA FITRIANI
 */
public class Baterai {
      private double kuatArus = 3.0, hambatan = 12.0;
    
    
    public Baterai(){
        
    }
    public double getKuatArus() {
        System.out.println("kuat Arus : "+kuatArus+" Ampere ");
        return kuatArus;
    }

    public double getHambatan() {
        System.out.println("Hambatan : "+hambatan+" ohm ");
        return hambatan;
    }
    
    public double hitungTegangan(){
        return kuatArus*hambatan;
    }
    
}
