package builder.carro;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

public class CarroBuilderTest {
	
	@Test
	void carroBuilderTest(){
		
		Motor motorVTEC = new Motor();
		Porta portaMotorista = new Porta();
		Porta portaPassageiro = new Porta();
		Porta[] portas = {portaPassageiro, portaMotorista};
		ComputadorBordo computadorBordo = new ComputadorBordo();
		FreioABS freiobosch = new FreioABS();
		
		CarroBuilder builder = new CarroBuilder();
		builder.buildMotor(motorVTEC);
		builder.buildPortas(portas);
		builder.buildComputadorBordo(computadorBordo);
		builder.buildFreioABS(freiobosch);
		
		Carro carroPronto = builder.getCarro();
		
		//Testando
		assertNotNull(carroPronto);
		assertNotNull(carroPronto.getMotor());
		assertNotNull(carroPronto.getPorta());
		assertTrue(carroPronto.getPorta().length == 2);
		assertNotNull(carroPronto.getComputadorBordo());
		assertNotNull(carroPronto.getFreioABS());
	}
	
	@Test
	void carroSemMotor() {
		Porta portaMotorista = new Porta();
		Porta portaPassageiro = new Porta();
		Porta[] portas = {portaPassageiro, portaMotorista};
		ComputadorBordo computadorBordo = new ComputadorBordo();
		FreioABS freiobosch = new FreioABS();
		
		CarroBuilder builder = new CarroBuilder();
		builder.buildPortas(portas);
		builder.buildComputadorBordo(computadorBordo);
		builder.buildFreioABS(freiobosch);
		
		Carro carroPronto = builder.getCarro();
	}
	
	@Test 
	void carroSemPortas(){
		Motor motorVTEC = new Motor();
		ComputadorBordo computadorBordo = new ComputadorBordo();
		FreioABS freiobosch = new FreioABS();
		
		CarroBuilder builder = new CarroBuilder();
		builder.buildMotor(motorVTEC);
		builder.buildComputadorBordo(computadorBordo);
		builder.buildFreioABS(freiobosch);
		
		Carro carroPronto = builder.getCarro();
	}
	
	@Test
	void carroBuilderFluenteTest(){
		
		Motor motorVTEC = new Motor();
		Porta portaMotorista = new Porta();
		Porta portaPassageiro = new Porta();
		Porta[] portas = {portaPassageiro, portaMotorista};
		ComputadorBordo computadorBordo = new ComputadorBordo();
		FreioABS freiobosch = new FreioABS();
		
		Carro carroPronto = new CarroBuilderFluente()
				.buildPortas(portas)
				.buildMotor(motorVTEC)
				.buildComputadorBordo(computadorBordo)
				.buildFreioABS(freiobosch)
				.getCarro();
		
		
		//Testando
		assertNotNull(carroPronto);
		assertNotNull(carroPronto.getMotor());
		assertNotNull(carroPronto.getPorta());
		assertTrue(carroPronto.getPorta().length == 2);
		assertNotNull(carroPronto.getComputadorBordo());
		assertNotNull(carroPronto.getFreioABS());
	}

}
