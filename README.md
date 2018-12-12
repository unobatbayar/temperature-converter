# temperature-converter
Java program which lets you convert between Fahrenheit, Celcius, Kelvin and Rankine

Logic

    public interface Temperature {
        public double toFarenheit(double celcius);
        public double toCelcius(double rankine);
        public double toKelvin(double farenheit);
        public double toRankine(double kelvin);
    }
    
    Using a single user's input with their chosen unit of temperature, we can get others.
    
    °C [ ] -> °F > K > °R
    °F [ ] ->  K > °R > °C
     K [ ] -> °R > °C > °F
    °R [ ] -> °C > °F > K
    
    
