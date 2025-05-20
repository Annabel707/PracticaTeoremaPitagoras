package clases;

public class TrianguloRectangulo {
double a;
double b;
double c;

/**
 * Crea un triangulo rectangulo con el cateto a, cateto b y cateto c
 * @param a
 * @param b
 * @param c
 */
public TrianguloRectangulo(double a, double b) {
    if (a <= 0 || b <= 0) {
        throw new IllegalArgumentException("Los catetos deben ser mayores que 0.");
    }
    this.a = a;
    this.b = b;
    this.c=calcularHipotenusa();
}

/**
 * Crea un triangulo rectangulo con el cateto a que vale 1, cateto b que vale 1 y cateto c obtenido por metodo
 * @param a
 * @param b
 * @param c
 */
public TrianguloRectangulo() {
		this.a=1;
		this.b=1;
		this.c=calcularHipotenusa();
}


		
/**
 * Calcula el area de un triangulo rectangulo
 * @return el area de un triangulo rectangulo en metros
 */
public double calcularArea() {
	double area=(a*b)/2;
	return area;
}

/**
 * Calcula la hipotenusa de un triangulo rectangulo
 * @return la hipotenusa de un triangulo rectangulo en metros
 */
public double calcularHipotenusa() {
	return c= Math.sqrt((a * a) + (b * b));
}

/**
 * Calcula el perimetro de un triangulo rectangulo
 * @return el perimetro de un triangulo rectangulo en metros
 */
public double calcularPerimetro() {
	double perimetro=a+b+c;
	return perimetro;
}

public double getCateto1() {
	return this.a;
}
public double getCateto2() {
	return this.b;
}
public double getHipotenusa() {
	return this.c;
}
}
