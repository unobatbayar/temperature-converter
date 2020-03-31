import java.util.*;
//@author unobatbayar

public class Converter implements Temperature
{
    @Override
    public double toFarenheit(double celsius) {
        return ((celsius*9/5) + 32);
    }

    @Override
    public double toCelcius(double rankine) {
        return ((rankine-491.67)*5/9);
    }

    @Override
    public double toKelvin(double farenheit) {
        return ((farenheit-32)*5/9+273.15);
    }

    @Override
    public double toRankine(double kelvin) {
        return (kelvin*1.8);
    }
}