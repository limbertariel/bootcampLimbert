import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        //Primera parte
        int resultado = suma(1,4,5);
        System.out.println(resultado);
        //Segunda Parte
        coche miCoche= new coche();
        miCoche.increPuertas();

        System.out.println(miCoche.numPuertas);
    }
    //Primera parte
    public static int suma (int a, int b, int c){
    return (a+b+c);
    }
    //Segunda parte
     public static class coche {
        public int numPuertas=0;

        public void increPuertas() {
            this.numPuertas++;
        }
    }
}