class Circulo{
    int x;
    int y;
    int raio;

    public void mostrarArea(int raio){
        double area=(raio*raio)*3.14;
        System.out.println("Area do circulo: "+area);
    }}
public class Main{
    public static void main(String[] args){
        Circulo c=new Circulo();
        c.x=5;
        c.y=5;
        c.raio=7;
        c.mostrarArea(c.raio);
        System.out.println("Identidade: "+c);
    }
}
