package co.edu.utp.misiontic2022.c2;
import java.util.ArrayList;

public class materia {

    // Atributos 
    public String nombre;
    private double promedioAjustado;
    private ArrayList<nota> notasQuizes = new ArrayList<nota>(); //creamos el array bacio
    public nota peorNota;
    String codigoEstudianteCursando;

    // Constructores 
    materia(String pCodigoEstudiante, String pNombre, int n1, int n2, int n3, int n4, int n5){
        this.nombre = pNombre;
        this.codigoEstudianteCursando = pCodigoEstudiante;
        this.notasQuizes.add(new nota(n1));
        this.notasQuizes.add(new nota(n2));
        this.notasQuizes.add(new nota(n3));
        this.notasQuizes.add(new nota(n4));
        this.notasQuizes.add(new nota(n5));
        this.peorNota = new nota(100);
        this.promedioAjustado = 0;
    }

    //metodo: los metodos comienzan siempre por un verbo
    //1. obtener la peor nota
    public void obtenerPeorNota(){
        for (nota califi: notasQuizes){
            if(califi.getEscala100() < this.peorNota.getEscala100()){
                this.peorNota = califi;
            }
        }
    }

    //2. calcular el pormedio ajustado
    public void calcularPromedioAjustado(){

        //2. 1 obtener peor nota
        this.obtenerPeorNota();

        //2. 2 Recorrar las notas para obtener la sumatoria 
        int sumatoria = 0; 
        for (nota califi: notasQuizes){
            sumatoria += califi.getEscala5();
        }
        this.promedioAjustado = (sumatoria - this.peorNota.getEscala5())/(this.notasQuizes.size()-1);
    }

        //2. 3 mostrar materia
    public void mostrarMateria(){
            System.out.println("---info materia ---");
            System.out.println("*****Materia : "+ this.nombre + "*****");
            for (nota califi: notasQuizes){
                califi.mostrarNota();
            }
            System.out.println("Promedio ajustado : "+ this.promedioAjustado);
            System.out.println("peor nota:");
            this.peorNota.mostrarNota();
        }

}
