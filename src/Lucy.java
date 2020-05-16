public class Lucy extends DragonASH1{
    
    private String dinazor;
    
    public Lucy(String oyuncu, int Hiz, int Guc, String dinazor,String Irk,String Silah_turu) {
        super(oyuncu, Hiz,Guc,Irk,Silah_turu);
        this.dinazor = dinazor;
    }
    @Override
    public void Özellikler(){
        super.Özellikler();
        System.out.println("Oyuncunun Kod Adı : "+dinazor);
    }
  
}
