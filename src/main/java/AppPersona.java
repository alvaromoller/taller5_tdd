import edu.ucb.tdd.Persona;

import java.util.Scanner;

public class AppPersona {


    public static void main(String [] args) {
        Integer pisoUno=1;
        Persona persona = new Persona();

        persona.pisoActual(pisoUno);
        System.out.println(",");
        persona.nuevaPersona();

        System.out.println(" ");
        persona.destinoElevador();



    }

}
