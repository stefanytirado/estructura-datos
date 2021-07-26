package co.edu.utp.misiontic2022.c2;

public class CalcularPagos {
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    private int Tiempo;
    private double Precio;
    private double Interes;
    private double interesSimple;
    private double interesCompuesto;
    private double diferencia;



    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    CalcularPagos(){
        this.Tiempo = 0;
        this.Precio = 0; 
        this.Interes = 0;
    }

    CalcularPagos(int pTiempo, double pPrecio, double pInteres){
        this.Tiempo = pTiempo;
        this.Precio =  pPrecio; 
        this.Interes = pInteres;
    }

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------
    // calcularInteresSimple
    public double calcularInteresSimple(){
        this.interesSimple = Math.round(this.Precio*(this.Interes/100)*this.Tiempo);
        return interesSimple;
    }
    // calcularInteresCompuesto
    public double calcularInteresCompuesto(){
        this.interesCompuesto = Math.round(this.Precio*((Math.pow(1+(this.Interes/100),this.Tiempo))-1));
        return interesCompuesto;
    }
    // calcular diferencia, cuando tengo parametros
    public double compararPagos(int tiempo, double precio, double interes){
        this.Tiempo = tiempo;
        this.Precio =  precio; 
        this.Interes = interes;
        this.interesSimple = Math.round(this.Precio*(this.Interes/100)*this.Tiempo);
        this.interesCompuesto = Math.round(this.Precio*((Math.pow(1+(this.Interes/100),this.Tiempo))-1));
        double diferencia = Math.round(this.interesCompuesto - this.interesSimple);
        return diferencia;
        }
    // calcular diferencia, sin parametros
    public double compararPagos(){
        this.diferencia = Math.round(this.interesCompuesto - this.interesSimple);
        return diferencia;
        }
}
