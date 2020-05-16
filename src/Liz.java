// extends anahtar kelimesiyle SuperClass'dan özelliklerimizi çekiyoruz
public class Liz extends DragonASH1{
    
    private String dinazor;
    //Burası Constructor yapıcı metodu
    public Liz(String oyuncu, int Hiz, int Guc, String dinazor,String Irk,String Silah_turu){
        super(oyuncu, Hiz, Guc,Irk,Silah_turu);
        this.dinazor = dinazor;                                                                                                  
    }
// SuperClassımızdaki özellikler metodumuzu override ettik
    @Override
    public void Özellikler(){
        super.Özellikler();
        
        System.out.println("Oyuncunun Kod Adı : "+dinazor);
    }
    
}