package TDA;

public class Triangulo {
//Angel de Jesus y Kevin Alan
	private float Base;
	private float Altura;
	
public Triangulo () {}
public Triangulo (float Base,float Altura) {
	
	this.Base=Base;
	this.Altura=Altura;
}

public float getBase() {
	return Base;
}

public void setBase(float base) {
	Base = base;
}

public float getAltura() {
	return Altura;
}

public void setAltura(float altura) {
	Altura = altura;
}

public float Hipotenusa3() {
	double suma;
	
	suma=Math.pow(Base,2)+Math.pow(Altura,2);

	return  (float) Math.sqrt(suma);
}

public String TipoTriangulo () {
	String Tipo=" ";
	
	if ((Base==Altura) && (Altura==Hipotenusa3()) && (Base==Hipotenusa3())) {
		Tipo="Equilatero ";
		}
	else if ((Base==Altura) && (Altura!=Hipotenusa3())||(Base==Hipotenusa3()) && (Altura!=Hipotenusa3())) {
Tipo="Isoceles";
}
	else if ((Base!=Altura) && (Altura!=Hipotenusa3()) && (Base!=Hipotenusa3())) {
	Tipo="Escaleno";
}
	return Tipo;
}

public float Perimetro() {
	
	return Base+Altura+Hipotenusa3();
}

public float Area() {
	
	return (Base*Altura)/2;
}
}

