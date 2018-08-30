package fatec.poo.model;
public class Retangulo {
    private double Altura, Base;
    
    public void setAltura (double a){
        Altura = a;
    }
    public void setBase (double b){
        Base = b;
    }
    public double calcArea (){
        return (Altura*Base);
    }
    public double calcPerimetro (){
        return (2*(Altura+Base));
    }
}

