public class OyuncuFabrikası {//SubClass
   
    public DragonASH1 DragonASH1Uret(String oyuncu_turu){
        
        if(oyuncu_turu.equals("Layne")){
            return new Layne("Layne", 600, 1400, "Ölüm Ateşi", "Asia"," 'Kalaşnikof' ");
        }
        else if(oyuncu_turu.equals("Leon")){
            return new Leon("Leon", 800, 800, "Mükemmel Kılıç" ,"Europa "," 'Kılıç' ");
        }
        else if(oyuncu_turu.equals("Liz")){
            return new Liz("Liz", 1200, 450,"Rüzgarsız Mızrak", "Chına "," 'Mızrak' ");
        }
        else if(oyuncu_turu.equals("Lucy")){
            return new Lucy("Lucy", 560, 100,"Güçlü Sarı Ok","Asya" ," 'Yay' ");
        }
        else {
        return null;
        }
    }
}