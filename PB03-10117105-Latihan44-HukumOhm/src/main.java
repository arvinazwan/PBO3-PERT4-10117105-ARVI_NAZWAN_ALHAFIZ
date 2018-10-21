//NAMA  :Arvi Nazwan Alhafiz 
//NIM   :10117105    
//KELAS :IF-3

/**
 *
 * @author RIA FITRIANI
 */
public class main {
    public static void main(String[] args) {
        Baterai objB = new Baterai();
        System.out.println("=====Hukum Ohm=====");
        System.out.println("Kuat arus yang mengalir pada suatu kawat penghantar"
                + "akan berbanding lurus dengan beda potensial pada ujung ujung"
                + "kawat penghantar tersebut asalkan suhu kawat dijaga konstan.");
        
        objB.getKuatArus();
        objB.getHambatan();
        System.out.println("Hasil Tegangan : "+objB.hitungTegangan()+" volt ");

    }
}
