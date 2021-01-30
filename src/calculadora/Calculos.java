
package calculadora;


public class Calculos {
    private double n1;
    private double n2;
    private double res;
    
    public Calculos(){
        n1 = 0;
        n2 = 0;
        
    }
    
    public Calculos(double n1, double n2){
        this.n1 = n1;
        this.n2 = n2;
    }
    
    public void setNumero1(double n1){
        this.n1 = n1;
    }
    
    public void setNumero2(double n2){
        this.n2 = n2;
    }
    
    public double suma(){
        res = n1+n2;
        return res;
    }
    
    public double resta(){
        res = n1 - n2;
        return res;
    }
    
    public double mul(){
        res = n1 * n2;
        return res;
    }
    
    public double div(){
        if(n2 == 0){
            System.out.println("Error");
        }else{
            res = n1 / n2;
        } 
        return res;
    }
    
    public String toString(){
        return ""+res;
    }
}
