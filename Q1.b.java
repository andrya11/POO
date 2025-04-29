class Potencia{
    int inicial;
    int qtd;
    Grafico saida;
    Potencia(int inicial,int qtd){
        this.inicial=inicial;
        this.qtd=qtd;
    }
    public void conecta(Grafico saida){
        this.saida=saida;
    }
    public void apresenta(){
        if(saida!=null){
            int valor=inicial;
            for(int i=0;i<qtd;i++){
                saida.plota(valor);
                valor*=2;
            }
        }}}
class Grafico{
    boolean preenchido;
    char caractere;
    Grafico(boolean preenchido,char caractere){
        this.preenchido=preenchido;
        this.caractere=caractere;
    }
    public void plota(int valor){
        if(preenchido){
            System.out.println(caractere);
        }else{
            System.out.println("  "+caractere);
        }
    }}
public class Main{
    public static void main(String[] args){
        Grafico g1=new Grafico(true,'#');
        Grafico g2=new Grafico(false,  '*');
        Potencia p=new Potencia(1,5);

        p.conecta(g1);
        p.apresenta();

        p.conecta(g2);
        p.apresenta();
    }
}

