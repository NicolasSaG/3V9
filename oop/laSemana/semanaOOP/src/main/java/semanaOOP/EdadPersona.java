package semanaOOP;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class EdadPersona {
	private String año, mes, dia;
	int tufecha[] = new int[3];
	
	String años[] = {"1915", "1916", "1917", "1918", "1919", "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927", 
			"1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", 
			"1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", 
			"1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", 
			"1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", 
			"1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", 
			"1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", 
			"2012", "2013", "2014", "2015"};
	String meses[] = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};
	String dias[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", 
			"20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
	String febrero[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", 
			"20", "21", "22", "23", "24", "25", "26", "27", "28"};
	//Darle valor a las variables a?o, mes y d?a
	public void setAño(String año) {
		this.año = año;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	
	//Llamar los valores de a?o, mes y d?a
	public String getAño() {
		return año;
	}
	public String getMes() {
		return mes;
	}
	public String getDia() {
		return dia;
	}
	
	//Pedir datos al usuario
	public void pedirDatos(){
		//Pedir a?o de nacimiento
		setAño((String) JOptionPane.showInputDialog(null,"?En que año naciste?", "AñO", 1, null, años, años[100]));
		
		//Pedir mes de nacimiento
		setMes((String) JOptionPane.showInputDialog(null,"?En que mes naciste?", "MES", 1, null, meses, meses[0]));
		
		//Pedir dia de nacimiento
		if (getMes().equals("02")) {
			setDia((String) JOptionPane.showInputDialog(null,"?En que dia naciste?", "DIA", 1, null, febrero, febrero[0]));
		}
		else {
			setDia((String) JOptionPane.showInputDialog(null,"?En que dia naciste?", "DIA", 1, null, dias, dias[0]));
		} 
	}
	
	
	//Calcular edad c:
	public void calcularEdad(){
		
		//A?os de la persona
		tufecha[0] = Integer.parseInt(getFechaActual().substring(6,10)) - Integer.parseInt(getAño());
		System.out.println(tufecha[0]);
		
		//Meses que tiene
		if ((Integer.parseInt(getFechaActual().substring(3, 5)) - Integer.parseInt(getMes())) < 0 && tufecha[0] == 0) {
			JOptionPane.showMessageDialog(null, "Todav?a no has nacido, ingresa una edad valida");
		}
		else if (Integer.parseInt(getFechaActual().substring(3, 5)) < Integer.parseInt(getMes())) {
			tufecha[1] = 12 + (Integer.parseInt(getFechaActual().substring(3, 5)) - Integer.parseInt(getMes()));
		}
		else {
			tufecha[1] = Integer.parseInt(getFechaActual().substring(3, 5)) - Integer.parseInt(getMes());
		}
		
		
		//Dias
		if ((Integer.parseInt(getFechaActual().substring(0, 2)) - Integer.parseInt(getMes())) < 0 && tufecha[0] == 0) {
			JOptionPane.showMessageDialog(null, "Todav?a no has nacido, ingresa una edad valida");
		}
		else if ((Integer.parseInt(getFechaActual().substring(0, 2)) - Integer.parseInt(getDia())) < 0) {
			tufecha[1] -= 1;
			tufecha[2] = 31 + (Integer.parseInt(getFechaActual().substring(0, 2)) - Integer.parseInt(getDia()));
		}
		else {
			tufecha[2] = Integer.parseInt(getFechaActual().substring(0, 2)) - Integer.parseInt(getDia());
		}
		//System.out.println(getFechaActual().substring(0, 2));
		
		
		//Imprimir tu edad
		JOptionPane.showMessageDialog(null, "Tienes " + tufecha[0] + " a?os, con " + tufecha[1] + " meses y " + tufecha[2] + " dias");
	}
	
	//Sacar la fecha actual
	public String getFechaActual() {
	    Date ahora = new Date();
	    SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy");
	    return formateador.format(ahora);
	}
}
