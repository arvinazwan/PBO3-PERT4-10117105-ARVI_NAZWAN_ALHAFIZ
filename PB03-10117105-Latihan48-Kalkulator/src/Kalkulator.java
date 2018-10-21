//NAMA  :Arvi Nazwan Alhafiz 
//NIM   :10117105    
//KELAS :IF-3

/**
 *
 * @author RIA FITRIANI
 */
public class Kalkulator {
    private double value1,value2;

    public double getValue1() {
        return value1;
    }

    public void setValue1(double value1) {
        this.value1 = value1;
    }

    public double getValue2() {
        return value2;
    }

    public void setValue2(double value2) {
        this.value2 = value2;
    }
    
    public void setNameProject(){
        System.out.println("Project Calculator");
        
    }
    
    public void setNoteProject(String note){
        System.out.println("This project shown you how to manage method in java");
    }
    
    public double add(){
        return value1+value2;
        
    }
    
    public double minus(){
        return value1-value2;
        
    }
    
    public double multiplication(){
        return value1*value2;
        
    }
    
    public double division(){
        return value1/value2;
        
    }
    
}
