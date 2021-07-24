package co.edu.utp.misiontic2022.c2;

/**
 * Aplicaciòn de notas
 *
 */
public class App{
    public static void main( String[] args){
        System.out.println( "Bienvenido al sistema de notas" );
        
        //Probar la clase nota
        //nota nota1 = new nota();
        //nota1.mostrarNota();
        //nota nota2 = new nota(77);
        //nota2.mostrarNota();
        //nota nota3 = new nota(3.8);
        //nota3.mostrarNota();
        
        materia curso = new materia("AAA425","Programacion basica",40,50,39,76,96);
        curso.calcularPromedioAjustado();
        curso.mostrarMateria();

    }
}
