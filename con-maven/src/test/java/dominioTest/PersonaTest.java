package dominioTest;

import argentinaprograma.dominio.Persona.Persona;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonaTest {

    @Test
public void juanPerzSePresentaDeFormaCorrecta(){
        Persona nuevaPersona = new Persona("Juan","Perez");


        Assertions.assertEquals("Mi nombre es Juan Perez", nuevaPersona.Presentate());

}
}
