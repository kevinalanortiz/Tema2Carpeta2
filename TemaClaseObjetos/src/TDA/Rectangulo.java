package TDA;

public class Rectangulo {

	private float Altura;
	private float Base;
	
public Rectangulo() {}

public Rectangulo(float Altura,float Base) {
	
	this.Altura=Altura;
	this.Base=Base;
}

public float getAltura() {
	return Altura;
}

public void setAltura(float altura) {
	Altura = altura;
}

public float getBase() {
	return Base;
}

public void setBase(float base) {
	Base = base;
}

public float Perimetro () {
	
	return 2*(Altura+Base);
}

public float Area() {
	
	return Altura*Base;
	
	
}
}