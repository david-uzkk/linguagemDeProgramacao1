package ex1_calculadora;

public class calculadoraCientifica extends calculadora{
    public double raizQuadrada(double x){
        return Math.sqrt(x);
    }

    public double potencia(double x, double y){
        return Math.pow(x, y);
    }
}
