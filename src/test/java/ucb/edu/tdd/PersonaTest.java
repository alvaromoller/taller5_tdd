package ucb.edu.tdd;

import edu.ucb.tdd.Persona;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

public class PersonaTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    private Persona persona;


   //private int pisoFinal;
   //private int pisoActual;
   // private int cantidad;

    @Before
    public void before(){
        persona = new Persona();
    }

    //Primer Requerimiento
    @Test
    public void puertaCerradaPrimerPiso(){
        exception.expect(RuntimeException.class);
        persona.pisoActual(2);
    }

    //Segundo Requerimiento
    @Test
    public void primeroSube(){
        exception.expect(RuntimeException.class);
        persona.destinoElevador();
    }

    //Tercer Requerimiento
    int cantidadPersonas=1;
    @Test
    public void nuevaPersona()throws Exception{
        if (cantidadPersonas >1) {
            throw new Exception("Capacidad maxijma de 1 persona ");
        }
    }



    /**Primer Requerimiento
    @Test
    public ubicacionAscensor(int pisoFinal)throws Exception {
        this.pisoFinal = pisoFinal;
        pisoActual = 1; //Ascensor comienza en planta baja
    }
*/
    /**
    @Test
    public void ascensor() throws Exception{
        //Preparacion
        Persona nuevaPersona = new Persona();

        //Logica de la Prueba
       //int resultado = nuevaPersona.cantidadPersonas(cantidad);

        //Verificacion o Assert
       // assertEquals("0", resultado);
    }
*/


/**
    public void desplazar(int cantidadPersonas, int pisoDestino) throws Exception {

        if (cantidadPersonas >1)
            throw new Exception("Cantidad de personas máximo superado");
        if (pisoDestino < 1)
            throw new Exception("No existen plantas por debajo del piso 1");
        if (pisoDestino > pisoFinal)
            throw new Exception("No existen plantas por encima del piso " + pisoFinal);
        if (pisoActual == pisoDestino)
            throw new Exception("Ascensor ya se encuentra en el piso " + pisoDestino);
        //Si no ha saltado ninguna excepción, podemos desplazar el Ascensor
        pisoActual = pisoDestino;
    }

    public int getPisoActual() {
        return pisoActual;
    }

 */
}
