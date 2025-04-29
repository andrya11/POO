class Arma{
    double dano;
    String tipo;
}
class Personagem{
    String nome;
    String classe;
    Arma arma;
    boolean vivo;
    double energia;
    void entrarEmBatalha(){
        if(vivo && energia>=3){
            System.out.println(nome+" entrou em batalha");
    }}
    void atacar(double intensidade){
        if(energia>0){
            energia-=intensidade;
            System.out.println(nome+" atacou em batalha com "+arma.tipo+" e dano causado foi de "+arma.dano);
        }
    }
    int niveldeEnergia(){
        if(energia==0)
            return 0;
        if(energia>0 && energia<=20)
            return 1;
        if(energia>20 && energia<=40)
            return 2;
        if(energia>40 && energia<=60)
           return 3;
        if(energia>60 && energia<=80)
            return 4;
        if(energia>80)
            return 5;
        return 0;
    }
}
public class Main{
    public static void main(String[] args){
    Personagem p=new Personagem();
    p.nome="Gabriel";
    p.classe="guerreiro";
    p.arma=new Arma();
    p.arma.dano=60;
    p.arma.tipo="Arpao";
    p.vivo=true;
    p.energia=89;
    p.entrarEmBatalha();
    p.atacar(9);
    p.niveldeEnergia();
    System.out.println("Energia restante: "+p.energia);
    System.out.println("Nivel de energia: "+p.niveldeEnergia());
    }
}
