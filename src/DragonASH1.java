public class DragonASH1 {//SuperClass
// diğer karakterlerimizde ortak olacak özellikleri tanımladık    
    private String oyuncu;
    private int Hiz;
    private int Guc;
    private String Irk;
    private String Silah_turu;
// Constructor yapıcı metodumuz   
    public DragonASH1(String oyuncu, int Hiz, int Guc ,String Irk, String Silah_turu){
        this.oyuncu = oyuncu;
        this.Hiz = Hiz;
        this.Guc = Guc;
        this.Irk=Irk;
        this.Silah_turu=Silah_turu;
    }
// getter setter metodları    
    public void setOyuncu(String oyuncu){
        this.oyuncu = oyuncu;
    }
    public String getOyuncu(){
        return this.oyuncu;
    }
    public void setHizi(int Hiz){
        this.Hiz = Hiz;
    }
    public int getHiz(){
        return this.Hiz;
    }
    public void setGuc(int Guc){
        this.Guc = Guc;
    }
    public int getGuc(){
        return this.Guc;
    }
     public void setIrk(String oyuncu){
        this.Irk = Irk;
    }
    public String getIrkı(){
        return this.Irk;
    }
     public void setSilah_turu(String Silah_turu){
        this.Silah_turu= Silah_turu;
    }
    public String getSilah_turu(){
        return this.Silah_turu;
    }
// karakterlerimizdeki özellikleri gösteren fonksiyonarımız
    public void saldir(){
        System.out.println(oyuncu+" : "+ Guc+" güç ve "+Hiz+" hız ile "+Irk+" Irkından"+ Silah_turu+ "ile saldırıyor...");
    }
    
    public void Özellikler(){
        System.out.println("Oyuncunun İsmi : "+oyuncu);
        System.out.println("Oyuncunun Saldırı Gücü : "+Guc);
        System.out.println("Oyuncunun Dönüş Hızı : "+Hiz);
        System.out.println("Oyuncunun Irkı : "+Irk);
        System.out.println("Oyuncunun Silahı : "+Silah_turu);
    }   
}
