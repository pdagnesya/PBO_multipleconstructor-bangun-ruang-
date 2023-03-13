package bangunRuang;

public class Tabung {
    public int radius;
    public int tinggi;
    public double volume;

    // constructor 
    public Tabung(){
        this.radius= 10;
        this.tinggi = 7;
    }
    public Tabung(int radius){
        this.radius = radius;
        this.tinggi = radius;
    }
    public Tabung(int radius, int tinggi){
        this.radius = radius;
        this.tinggi = tinggi;
    }

    
    
    public  void setRadius(int radius){
        this.radius = radius;
    }
    public  void setTinggi(int tinggi){
        this.tinggi = tinggi;
    }
    public void ComputeAndSetVolume(){
        this.volume = this.radius * this.radius * this.tinggi * 3.14;
    }
    public double getVolume(){
        return this.volume;
    }
}
