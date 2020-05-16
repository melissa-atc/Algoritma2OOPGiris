import java.util.Scanner;
public class DragonASH2 {
    public static void main(String[] args) {
// POLYMORPHİSM - INHERİTANCE Kullanarak programımızı yazıyoruz.....
        
        System.out.println("Oyunumuza Hoşgeldiniz...");
        System.out.println("Oyunumuzdan çıkmak mı istiyorsun o halde 'STOP' yaz :( ");
        Scanner sc = new Scanner(System.in);
        
        while(true){
            System.out.println("Sizin Oyuncunuz hangisi ? :) ");
            System.out.println("************************************************");
            System.out.println("A) Lucy ");
            System.out.println("B) Leon ");
            System.out.println("C) Layne ");
            System.out.println("D) Liz ");
            System.out.println("************************************************");
            String islem = sc.nextLine();
            if(islem.endsWith("STOP")){
                System.out.println("Oyun sonlandırılıyor :( ");
                break;
            }
            else{
                OyuncuFabrikası fabrika = new OyuncuFabrikası();
                DragonASH1 dragon = fabrika.DragonASH1Uret(islem);
                
                if(dragon == null){
                    System.out.println("Lütfen Geçerli Bir Karakter İsmi  Giriniz!");
                }
                else{
                    dragon.Özellikler();
                    dragon.saldir();
                }
            }   
        }  
    }
}