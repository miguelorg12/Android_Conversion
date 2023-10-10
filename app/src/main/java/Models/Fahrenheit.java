package Models;

public class Fahrenheit extends Grado{
    public Fahrenheit(double valor){
        this.setValor(valor);
        this.setUnidad("Fahrenheit");
    }
    public Fahrenheit parse(Celsius celsius){
        return new Fahrenheit(celsius.getValor() * 1.8 + 32);
    }
    public Fahrenheit parse(Kelvin kelvin){
        return new Fahrenheit(kelvin.getValor() * 1.8 - 459.67);
    }
}
