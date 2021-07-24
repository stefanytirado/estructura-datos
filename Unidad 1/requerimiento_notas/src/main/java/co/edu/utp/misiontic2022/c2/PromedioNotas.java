package co.edu.utp.misiontic2022.c2;
//traer la libreria del scanner 
import java.util.Scanner; 
public class PromedioNotas {
    // pasos logicos del ejercicio
    // 1. recoger la informaciòn : codigo del estudiante y las 5 notas 
    // 2. Identificar cual es la peor nota 
    // 3. hallar el promedio ajustado (descartar la peor de las notas)
    // 4. realizar la conversion de escala de 100 a 5 
    // 5. reportar el promedio ajustado con el formato indicado 

    // Funciones que resuelven el problema -> modularizado
    // alcance tipo_de_retorno nombreFuncion(argumentos){}
    // public static (alcance) int (tipo retorno) obtenerPeorNota (nombre) int n1 (tipo y argumento)

    // 2. Identificar cual es la peor nota 
    public static int obtenerPeorNota(int n1,int n2, int n3, int n4,int n5){
        
        // Declarar
        int peorNota;
        // Inicializar 
        peorNota = n1; 
        // comparar notas 
        if(peorNota > n2){
            peorNota = n2;
        }
        if(peorNota > n3){
            peorNota = n3;
        }
        if(peorNota > n4){
            peorNota = n4;
        }
        if(peorNota > n5){
            peorNota = n5;
        }
        return peorNota;
    }

    // 3. hallar el promedio ajustado (descartar la peor de las notas)  
    public static double calcularPromedioAjustado(int n1,int n2, int n3, int n4,int n5){
        // llamar a la funciòn ObtenerpeorNota y Declarar
        int peorNota = obtenerPeorNota(n1,n2,n3,n4,n5);
        // Inicializar 
        int sumatoria = 0; 
        double promedioAjustado = 0; 
        // calculamos promedio
        sumatoria = (n1+n2+n3+n4)-peorNota;
        promedioAjustado = (double)sumatoria/4;
        
        return promedioAjustado;
    }

    // 4. realizar la conversion de escala de 100 a 5 
    public static double convertirEscala5(double calificacion100){
        return calificacion100/20;
    }

    // 5. reportar el promedio ajustado con el formato indicado
    public static void reportarPromedioAjustado(String codigo, double promedioAjustado){
        System.out.println("El promedio ajustado del estudiante"+ codigo + " es: " + promedioAjustado);
    }


    // 1. recoger la informaciòn : codigo del estudiante y las 5 notas
    public static void main( String[] args )
    {
        Scanner  input  = new Scanner(System.in);
        System.out.println("Ingrese el codigo del estudiante :");
        String codigo = input.nextLine();
        System.out.println("Ingrese la nota 1:");
        int n1 = input.nextInt();
        System.out.println("Ingrese la nota 2:");
        int n2 = input.nextInt();
        System.out.println("Ingrese la nota 3:");
        int n3 = input.nextInt();
        System.out.println("Ingrese la nota 4:");
        int n4 = input.nextInt();
        System.out.println("Ingrese la nota 5:");
        int n5 = input.nextInt();
        input.close();

        // llamar a las funcioones para calcular y mostrar el promedio
        // Ejecutar las funciones 
        double promedioAjustado = calcularPromedioAjustado(n1,n2,n3,n4,n5);
        //Reportar el resultado 
        reportarPromedioAjustado(codigo,convertirEscala5(promedioAjustado));
        
    }
}
