package bangunRuang;

public class LimasSegiEmpat {
    public int sisi;
    public int tinggi;
    public double volume;
    
    // constructor 
    public LimasSegiEmpat(){
        this.sisi = 4;
        this.tinggi = 6;
    } 
    public LimasSegiEmpat(int tinggi){
        this.sisi = 8; 
        this.tinggi= tinggi;
    }
    public LimasSegiEmpat(int sisi, int tinggi){
        this.sisi=sisi;
        this.tinggi=tinggi;
    }
    
    
    public  void SetSisi(int sisi ){
        this.sisi=sisi;
    }
    public  void SetTinggi (int tinggi ){
        this.tinggi=tinggi;
    }
    public void ComputeAndSetVolume(){
        this.volume = this.sisi* this.sisi*this.tinggi / 3;
    }
    public double getVolume(){
        return this.volume;
    }
}
