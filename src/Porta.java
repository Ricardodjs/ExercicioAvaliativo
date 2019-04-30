
public class Porta {
    boolean aberta;
    String cor;
    String dimensaoX;
    String dimensaoY;
    String dimensaoZ
            
    void abre(){
        aberta = true;
        
    }
    void fecha(){
        aberta = false;
        
    }
    void pinta(String ncor){
        cor = ncor;
        Systen.out.println(cor);
    }
    boolean estaAberta(){
        if(Aberta==true){
            System.out.println("A porta esta aberta");
        }
        return false;
        
    }
}

