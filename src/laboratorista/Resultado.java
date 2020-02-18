package laboratorista;

import static org.junit.Assert.assertEquals;
import org.junit.Assert.*;
import org.junit.Test;

public class Resultado {

	@Test
	
 	Calculo nivel = new Calculo();	
			
		assertEquals("13.0",nivel.gradoToxicidad("7","10","Alta","Basico","Mtp","Activo"));
		assertEquals("9.0",nivel.gradoToxicidad("7","11","Baja","Alcalino","Homeopatico","Excipiente"));
		assertEquals("7.0",nivel.gradoToxicidad("7","14","Media","Basico","Homeopatico","Activo"));
		assertEquals("6.0",nivel.gradoToxicidad("6","15","Media","Basico","Homeopatico","Activo"));
		assertEquals("33.0",nivel.gradoToxicidad("6","16","Alta","Alcalino","Homeopatico","Activo"));
		assertEquals("6.0",nivel.gradoToxicidad("6","17","Baja","Basico","Mtp","Excipiente"));
		assertEquals("9.0",nivel.gradoToxicidad("7","18","Baja","Basico","Homeopatico","Excipiente"));
		assertEquals("4.0",nivel.gradoToxicidad("6","19","Media","Alcalino","Mtp","Activo"));
		assertEquals("20.0",nivel.gradoToxicidad("7","20","Alta","Basico","Homeopatico","Activo"));
}

	
	
	
}
