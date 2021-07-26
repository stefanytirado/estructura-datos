package co.edu.utp.misiontic2022.c2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //CalcularPagos resultadoInversion = new CalcularPagos(18,7000000,2.8);
        //System.out.println(resultadoInversion.calcularInteresSimple());
        //System.out.println(resultadoInversion.calcularInteresCompuesto());
        //System.out.println(resultadoInversion.compararPagos(18,7000000,2.8));
        //System.out.println(resultadoInversion.compararPagos());

        CalcularPagos resultadoInversion = new CalcularPagos();
        System.out.println(resultadoInversion.calcularInteresSimple());
        System.out.println(resultadoInversion.calcularInteresCompuesto());
        System.out.println(resultadoInversion.compararPagos(18,7000000,2.8));
    }
}
