package poo;

public class Numeros {
    private double X;

    private double getX() {
        return X;
    }

    private void setX(double x) {
        X = x;
    }

    public double soma(double x, double y){
        setX(y+x);
        return getX();
    }

    public double subtracao(double x, double y){
        setX(y-x);
        return getX();

    }
    public double divisao(double x, double y){
        setX(y/x);
        return getX();
    }

    public double multiplicacao(double x, double y){
        setX(y*x);
        return getX();
    }

}
