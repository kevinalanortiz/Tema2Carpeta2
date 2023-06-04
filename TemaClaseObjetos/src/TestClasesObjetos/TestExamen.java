package TestClasesObjetos;

import EntradasSalidas.Tools;
import TDA.Persona2;

public class TestExamen {
//Angel de Jesus Contreras Herrera
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CapturaPersona();
	}

	public static void CapturaPersona() {
		
		String prin=" ",Sec=" ";
		byte res=0;
		String PI=" ",Mayedad=" ";
		
		do {
			
		Persona2 obj=new Persona2();
		
		obj.setNombre(Tools.leerString("Ingrese su nombre"));
		obj.setEdad(Tools.LeerByte("Ingrese su Edad"));
		obj.setSexo(Tools.leerChar("Ingrese su sexo \n[H]ombre o [M]ujer"));
		obj.setPeso(Tools.leerFloat("Ingrese su peso"));
		obj.setAltura(Tools.leerFloat("Ingrese su altura"));
		
		if (obj.calcularMC()==-1) {
			PI="Está usted por debajo de su peso ideal";
			
		} 
		else if (obj.calcularMC()==0) {
			PI="Está usted en su peso ideal";
		}
		else 
			PI="Usted tiene Sobrepeso";
			
		if (obj.esMayorDeEdad()==true)
			Mayedad="Usted es mayor de Edad";
		else 
			Mayedad="Usted no es mayor de Edad";
		
		prin="\nDatos:\n "+obj.toString()+"\n"+PI+"\n"+Mayedad+"\n";
		
		Persona2 oct=new Persona2();
		
		oct.setNombre(obj.getNombre());
		oct.setEdad(obj.getEdad());
		oct.setSexo(obj.getSexo());
				

		Sec+=prin+"\nDatos:\n"+oct.ToString();

		res= (byte) Tools.seguirSino();
		}
		while (res!=1);
		
		Tools.Salida("Informacion:"+Sec);
	}
}
