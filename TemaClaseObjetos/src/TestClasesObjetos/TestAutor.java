package TestClasesObjetos;

import EntradasSalidas.Tools;
import TDA.Autor;
import TDA.Books;

public class TestAutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CapturaDatos();
	}
	
	public static void CapturaDatos (){
	
		String Listado=" ";
		short Menor=10000;
		int res=0;
		
		Books LibroM=new Books ();
		
		do {
		Books obj=new Books(); 
		
		obj.setAutor(new Autor(Tools.leerString("Escriba el Nombre del Autor"),
			Tools.leerString("Escriba su apellido")));
		obj.setTitulo(Tools.leerString("Titulo:"));
		obj.setISBN(Tools.LeerInt("ISBN"));
		obj.setNumPag(Tools.leershort("Paginas"));
		
		
			Listado+=obj.toString()+"\n";
			
			
			if (obj.getNumPag()<Menor) {
				Menor=obj.getNumPag();
				LibroM=obj;
			}
			
			
		res=Tools.seguirSino();	
		
		}while (res!=1);

		Tools.Salida("El libro es:"+Listado+"\n"+LibroM.toString());

		}
	
	public static short LhojasMenor (Books B1) {
		short Menor=0;		
		if (B1.getNumPag()<Menor) {
			Menor=B1.getNumPag();
		} 			
			return Menor;
		}
	
	}

