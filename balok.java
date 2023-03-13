
package bangunRuang;
public class balok {
    public int panjang;
    public int lebar;
    public int tinggi;
    public int volume;
    
    // constructor 
    public balok(){
        this.panjang = 8;
        this.lebar = 4;
        this.tinggi = 5;
    } 
    public balok(int panjang){
        this.panjang = panjang;
        this.lebar = 4;
        this.tinggi=5;
    }
    public balok(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi=5;
    }
    public balok(int panjang, int lebar, int tinggi){
        this.panjang=panjang;
        this.lebar=lebar;
        this.tinggi=tinggi;
    }
    
    
    
    public  void SetPanjang (int panjang ){
        this.panjang=panjang;
    }
    public  void SetLebar (int lebar ){
        this.lebar=lebar;
    }
    public  void SetTinggi (int tinggi ){
        this.tinggi=tinggi;
    }
    public void ComputeAndSetVolume(){
        this.volume = this.panjang* this.lebar * this.tinggi;
    }
    public int getVolume(){
        return this.volume;
    }
    
    
}