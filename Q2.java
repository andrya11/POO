class Motor{
    double potencia;
    String tipo;
}
class Carro{
    String modelo;
    String cor;
    boolean ligado;
    Motor motor;
    double velocidade;
    void liga(){
        if(!ligado){
            ligado=true;
            System.out.println("Carro ligado.");
        }else{
            System.out.println("Carro já está ligado.");
        }
    }
    void acelera(double qtd){
        if(ligado){
            velocidade+=qtd;
            System.out.println("Acelerando! Velocidade atual: "+velocidade);
        }
    }
    int pegaMarcha(){
        if(velocidade==0)
            return 0;
        if(velocidade>0 && velocidade<=20)
            return 1;
        if(velocidade>20 && velocidade<=40)
            return 2;
        if(velocidade>40 && velocidade<=60)
            return 3;
        if(velocidade>60 && velocidade<=80)
            return 4;
        if(velocidade>80)
            return 5;
        return 0;
    }}
public class Main{
    public static void main(String[] args){
    Carro c=new Carro();
    c.cor="Azul";
    c.modelo="Onix";
    c.motor=new Motor();
    c.motor.potencia=0.5;
    c.velocidade=60;
    c.liga();
    c.acelera(30);
    System.out.println("Modelo: "+c.modelo);
    System.out.println("Potencia do motor: "+c.motor.potencia);
    System.out.println("Marcha atual: "+c.pegaMarcha());
    }}

