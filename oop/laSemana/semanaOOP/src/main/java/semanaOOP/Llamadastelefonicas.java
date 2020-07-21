package semanaOOP;

import javax.swing.JOptionPane;

public class Llamadastelefonicas {
	/*REALIZAR UN PROGRAMA QUE CALCULE EL COSTO DE LLAMADAS TELEFÓNICAS CELULARES, DEBERÁ CONTENER LAS 
	SIGUIENTES VARIABLES, NUMERO DE CELULAR (INT), CREDITO(INT) Y MEDIANTE UN METODO SE PODRÁ CALCULAR 
	EL COSTO TOTAL DE LLAMADAS  NACIONALES($0.5),INTERNACIONALES($0.6) Y CELULARES ($0.2) Y 
	SE DEBERÁ IR DESCONTANDO DEL CRÉDITO LAS LLAMADAS REALIZADAS, TAMBIÉN EXISTIRÁ UNA OPCIÓN Y 
	MÉTODO PARA PODER INGRESAR Y CONSULTAR EL CREDITO.*/
	
	private double numcel, credito, costototal, opcion;
	
	//Dar valores
	public void setNumcel(double numcel) {
		this.numcel = numcel;
	}
	public void setCredito(double credito) {
		this.credito = credito;
	}
	public void setCostototal(double costototal) {
		this.costototal = costototal;
	}
	public void setOpcion(double opcion) {
		this.opcion = opcion;
	}
	
	//Asignar valores
	public double getNumcel() {
		return numcel;
	}
	public double getCredito() {
		return credito;
	}
	public double getCostototal() {
		return costototal;
	}
	public double getOpcion() {
		return opcion;
	}
	
	//Ingreso y consulta de saldo
	public void ingresaryconsultarCredito() {
		String posible[] ={"Hacer llamada","Ingresar Crédito", "Consultar Crédito"};
		String tipollamada[] ={"llamada nacional", "llamada internacional"};
		
		JOptionPane.showInputDialog(null,"¿Que desea hacer?","Menu",1,null,posible,posible[0]);
	}
}
