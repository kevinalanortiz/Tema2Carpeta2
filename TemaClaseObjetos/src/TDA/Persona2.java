package TDA;

public class Persona2 {

	private String Nombre;
	private byte Edad;
	private char Sexo;
	private float Peso;
	private float Altura;
	
public Persona2() {}
public Persona2(String Nombre,byte Edad,char Sexo,float Peso,float Altura) {
			
			this.Altura=Altura;
			this.Peso=Peso;
			this.Nombre=Nombre;
			this.Edad=Edad;
			this.Sexo=Sexo;
		}
			
public Persona2(String Nombre,byte Edad,char Sexo) {
			
	this.Edad=Edad;
	this.Nombre=Nombre;
	this.Sexo=Sexo;
		}
		public String getNombre() {
			return Nombre;
		}
		public void setNombre(String nombre) {
			Nombre = nombre;
		}
		public byte getEdad() {
			return Edad;
		}
		public void setEdad(byte edad) {
			Edad = edad;
		}
		public char getSexo() {
			return Sexo;
		}
		public void setSexo(char sexo) {
			Sexo = sexo;
		}
		public float getPeso() {
			return Peso;
		}
		public void setPeso(float peso) {
			Peso = peso;
		}
		public float getAltura() {
			return Altura;
		}
		public void setAltura(float altura) {
			Altura = altura;
		}
	
		
	public byte calcularMC() {
		byte n=0;
		float pi=  (float) (Peso/(Math.pow(Altura, 2)));
		
		switch ((pi<20)?1:(pi>=20 && pi<=25)?2:(pi>25)?3:4) {

		case 1:n=-1;
		break;
		case 2:n=0;
		break;
		case 3:n=1;
		break;
		
		}
		
		return n;
	}

	public boolean esMayorDeEdad() {
		
		if (Edad>18) {
			return true; 
		}
		else return false ;
		
	}
	
	public String toString() {
		
		return "Su nombre es: "+Nombre+"\n"+"Tiene: "+Edad+" años"+"\n"+"Usted es "+Sexo
				+"\n"+"Usted pesa "+Peso+"KG"+"\n"+"Usted Mide "+Altura+"m";
	}
	
	public String ToString() {
		
		return "Su nombre es: "+Nombre+"\n"+"Tiene: "+Edad+" años"+"\n"+"Usted es "+Sexo+"\n";
	}
}
