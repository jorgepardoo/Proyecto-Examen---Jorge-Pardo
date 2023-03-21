package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Main.CuentaBancaria;

@SuppressWarnings("unused")
class Pruebas {

	CuentaBancaria cb = new CuentaBancaria();

	@Test
	void Agregarsaldo1(){
		cb.agregarSaldo(5000);
		cb.obtenerSaldo();
	}
	
	@Test
	void Agregarsaldo2() throws Exception{
		cb.agregarSaldo(3000);
		cb.solicitarPrestamo(5000);
		cb.obtenerSaldo();
	}
	
	@Test
	void Agregarsaldo3() throws Exception{
		cb.agregarSaldo(2000);
		cb.solicitarPrestamo(1000);
		cb.agregarSaldo(300);
		cb.obtenerSaldo();
	}
	

}
