package singleton;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

public class LogManagerTest {
	
	@Test
	void mesmaReferenciaTest() {
		LogManager instancia1 = LogManager.getInstance();
		assertNotNull(instancia1);
		
		LogManager instancia2 = LogManager.getInstance();
		assertNotNull(instancia2);
		
		assertEquals(instancia1, instancia2);
		
	}

}
