import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroIf;
        System.out.println("---------------------------------------------");
        System.out.println("ESTRUCTURA IF");
        System.out.println("---------------------------------------------");
        System.out.println("Ingrese el valor de la variable numeroIf: ");
        numeroIf = entrada.nextInt();
        if(numeroIf<0)
            System.out.println("El númeroIf es negativo :"+numeroIf);
        else if(numeroIf>0)
            System.out.println("El númeroIf es positivo :"+numeroIf);
        else
            System.out.println("El númeroIf es cero :"+numeroIf);


        System.out.println();
        System.out.println("---------------------------------------------");
        System.out.println("ESTRUCTURA WHILE");
        System.out.println("---------------------------------------------");
        int numeroWhile=0;
        while(numeroWhile<3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }


        System.out.println();
        System.out.println("---------------------------------------------");
        System.out.println("ESTRUCTURA DO WHILE");
        System.out.println("---------------------------------------------");
        int numeroDoWhile=0;
        do{
            numeroDoWhile++;
            System.out.println(numeroDoWhile);
            break;
        }while(numeroDoWhile<3);

        System.out.println();
        System.out.println("---------------------------------------------");
        System.out.println("ESTRUCTURA FOR");
        System.out.println("---------------------------------------------");

        for(int numeroFor=0;numeroFor<=3;numeroFor++){
            System.out.println(numeroFor);
        }

        System.out.println();
        System.out.println("---------------------------------------------");
        System.out.println("ESTRUCTURA SWITCH");
        System.out.println("---------------------------------------------");

        String Estacion;
        System.out.println("Ingrese una estación");
        Estacion = entrada.next();
        switch(Estacion) {
            case"Verano":
                System.out.println("Estamos en la estación: "+Estacion);
                break;
            case"Invierno":
                System.out.println("Estamos en la estación: "+Estacion);
                break;
            case"Otoño":
                System.out.println("Estamos en la estación: "+Estacion);
                break;
            case"Primavera":
                System.out.println("Estamos en la estación: "+Estacion);
                break;
             default:
                 System.out.println("El valor de la variable no es una estación");

        }
        }
    }