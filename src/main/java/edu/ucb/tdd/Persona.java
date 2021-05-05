package edu.ucb.tdd;

import java.util.Scanner;

public class Persona {

   // private static int pisoFinal;
   // private static int pisoActual;
    private static int persona;
    private static int destino;

    private int pisoActual= 1;
    private int pisoFinal;
    private int direccion;

    private static Scanner teclado = new Scanner(System.in);

    public int pisoActual(int pisoUno){
        System.out.print("Piso Actual: "+ pisoActual);
        return pisoActual;
    }



    //Creamos una persona, necesitamos usuario propocione una cantidad
    int piso = (int)(Math.random()*10+1);
    public void nuevaPersona(){
        System.out.print("Crea una sola persona introduciendo la cantidad Uno: ");
        Integer cantidadPersonas = teclado.nextInt();

        if(cantidadPersonas >1 ){
            System.out.print("Solo se puede crear una persona: ");

        }else{
            //int piso = (int)(Math.random()*10+1);
            System.out.println("Una persona fue creada exitosamente: ");
            System.out.println("Y se encuentra en el piso: "+ piso);
             if(piso == 1){
                    System.out.println("elevador ya se encuentra en el piso: "+ piso );
             }else{
                    System.out.println("elevador esta dirigiendose al piso: "+ piso );
             }

        }


    }

    //int pisoActual = piso;
    public void destinoElevador() {
        System.out.print("elija el piso destino: ");
        Integer destino = teclado.nextInt();

        if(destino <=0 ){
            System.out.print("no hay pisos menores que el piso 1: ");
        }else
            if(destino < piso){
                System.out.print("Elevador bajando al piso destino: ");
                for(int pisoActual= piso;  pisoActual >= destino; pisoActual--) {
                    System.out.println(pisoActual);
                }
            }else
                if(destino > piso){
                    System.out.println("Elevador subiendo al piso: "+destino);
                    for(int pisoActual= piso;  pisoActual <= destino; pisoActual++) {
                        System.out.println(pisoActual);
                    }
                }

    }





}
