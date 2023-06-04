package TDA;

public class Cuadrado {

private float Lado;
	
public Cuadrado() {}
public Cuadrado(float Lado) {
	
	this.Lado=Lado;
}

public float getLado() {
	return Lado;
}

public void setLado(float lado) {
	Lado = lado;
}


public float Area () {
	
	return (float) Math.pow(Lado,2);
	
}

public float Perimetro () {
	
	return Lado*4;	
}
}
