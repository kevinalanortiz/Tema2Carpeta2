package TestClasesObjetos;

import javax.swing.JOptionPane;

import EntradasSalidas.Tools;
import TDA.Circulo;
import TDA.Cuadrado;
import TDA.Rectangulo;
import TDA.Triangulo;

public class TestFigurasGeometricas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestFigurasGeometricas.Menu("Triangulo,Cuadrado,Circulo,Rectangulo,Salir");
	}
String menu="Triangulo,Cuadrado,Circulo,Rectangulo,Salir";
		public static void Menu(String menu) {
			String sel;
			Triangulo obj=new Triangulo();
			Cuadrado Lad=new Cuadrado();
			Circulo Rad=new Circulo();
			Rectangulo Cara=new Rectangulo();
			
			
			do {
				sel= despegable(menu);
				switch(sel) {
				case "Triangulo":obj.setAltura(Tools.leerFloat("Ingrese la altura del triangulo"));
				obj.setBase(Tools.leerFloat("Ingrese la base del Triangulo"));	
				Tools.Salida("El triangulo es de tipo "+obj.TipoTriangulo()+"\n"+"Su hipotenusa es de: "+
				obj.Hipotenusa3()+" M^3"+"\n"+"Su Perimetro es de: "+obj.Perimetro()+" M^3"+
				"\n"+"Su Area de "+obj.Area()+" M^3");
				break;
				case "Cuadrado": Lad.setLado(Tools.leerFloat("Ingrese el valor del Lado"));
				Tools.Salida("El cuadrado tiene como perimetro: "+Lad.Perimetro()+"\n"+"Su area es: "+Lad.Area());
				break;
				case "Rectangulo": Cara.setAltura(Tools.leerFloat("Ingrese la Altura"));
				Cara.setBase(Tools.leerFloat("Ingrese la Base"));
				Tools.Salida("El Perimetro del Rectangulo es: "+Cara.Perimetro()+"\n"+"La Area del Rectangulo es: "+Cara.Area());
					break;
				case "Circulo": 
					Rad.setRadio(Tools.leerFloat("Ingrese el Radio del circulo"));
					Tools.Salida("El perimetro del circulo es de: "+Rad.Perimetro()+"\n"+"El Area del circulo es de: "+Rad.Area());
					break;
				case "Salir": break;
				}
				
			}while(!sel.equalsIgnoreCase("Salir"));
		}

		public static String despegable(String menu) {
			String valores[]=menu.split(",");
			String res= (String)JOptionPane.showInputDialog(null,"Figuras Geometricas","Seleccione la Figura:",JOptionPane.QUESTION_MESSAGE,null,valores,valores[0]);
			
			return (res);
		
	}
}
