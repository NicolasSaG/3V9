import java.util.Scanner;
public class Operaciones { 



	public static double perimetroTriangulo(double l1, double l2, double l3){
		return l1 + l2 + l3;
	}

	public static double areaTriangulo(double l1, double l2, double l3){
		double area, perimetro;
		perimetro = perimetroTriangulo(l1, l2, l3);
		area = (Math.sqrt((perimetro/2) * ((perimetro/2) - l1) * ((perimetro/2) - l2) * ((perimetro/2) - l3)));
		return area;
	}

	public static double perimetroCuadrado(double l){
		return l*4;
	}

	public static double areaCuadrado(double l){
		return l*l;
	}

	public static double volumenEsfera(double r){
		double vol;
		vol = (4* Math.PI * Math.pow(r, 3)) / 3;
		return vol;
	}

	public static double volumenCilindro(double r, double h){
		double vol;
		vol = Math.PI * Math.pow(r, 2) * h;
		return vol;
	}

}