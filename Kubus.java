
package bangunRuang;
public class Kubus {
    public int Sisi;
    public int volume;
   // constructor 
    public Kubus(){
        this.Sisi = 1;
    }
    public Kubus(int Sisi){
        this.Sisi=Sisi;
    }
    
    
    public  void SetSisi (int Sisi ){
        this.Sisi=Sisi;
    }
    
    public void ComputeAndSetVolume(){
        this.volume = this.Sisi* this.Sisi * this.Sisi;
    }
    public int getVolume(){
        return this.volume;
    }
    
}
