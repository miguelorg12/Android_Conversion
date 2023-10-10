package Models;

import java.text.DecimalFormat;

public class Celsius extends Grado{
    public Celsius(double valor){
        this.setValor(valor);
        this.setUnidad("Celsius");
    }
    public Celsius parse(Fahrenheit fahrenheit){
        return new Celsius((fahrenheit.getValor() + 1.8) + 32);
    }
    public Celsius parse(Kelvin kelvin){
        return new Celsius(kelvin.getValor() + 273.15);

    }
}
