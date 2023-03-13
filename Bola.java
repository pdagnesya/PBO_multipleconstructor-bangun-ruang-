package bangunRuang;

public class Bola {
    public double radius;
    public double volume;
   // constructor 
    public Bola(){
        this.radius = 10;
    }
    public Bola(double radius){
        this.radius=radius;
    }
    
    
    public  void SetRadius (double radius ){
        this.radius=radius;
    }
    
    public void ComputeAndSetVolume(){
        this.volume = 4 / 3 * 3.14 * this.radius* this.radius;
    }
    public double getVolume(){
        return this.volume;
    }
}
