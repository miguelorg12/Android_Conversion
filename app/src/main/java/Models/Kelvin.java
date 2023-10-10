package Models;

public class Kelvin extends Grado{
    public Kelvin(double valor){
        this.setValor(valor);
        this.setUnidad("Kelvin");
    }
    public Kelvin parse(Celsius celsius){
        return new Kelvin(celsius.getValor() + 273.15);
    }
    public Kelvin parse(Fahrenheit fahrenheit){
        return new Kelvin((fahrenheit.getValor() + 459.67) / 1.8);
    }
}
