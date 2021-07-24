package co.edu.utp.misiontic2022.c2;

public class nota {

    // A) Atributo -> Variable del paradigma anterior en contexto-> entidad representada
    
        // creaciòn de constantes: EN UML se represnetan en mayusculas
        public static final int APROBADO_ESCALA100 = 60;
        public static final double APROBADO_ESCALA5 = 2.99;

        public String conceptoEvaluado;
        private int escala100; 
        private double escala5;
        private double escala5Redondeada;
        private String cualitativo;
    
    // B) Metodos -> Funciones anteriores, en contexto son el comportamiento del objeto
        // Tipo metodos: 
        // 1) Constructores : especifica los valores base de las variables

            // polimorfismo parametrico: es la declraciòn de una misma clase pero con parametros que ingresan diferentes
            // (aqui el nombre no importa solo el tipo)
            nota(){
                this.conceptoEvaluado = "concepto sin asignar";
                this.escala100 = 0;
                this.escala5 = 0;
                this.cualitativo = "sin calificar";
            }

            nota(int pEscala100){
                this.conceptoEvaluado = "concepto sin asignar";
                this.escala100 = pEscala100;
                this.escala5 = (double)pEscala100/20;
                // informar si reprueba o no 
                if(pEscala100 >= nota.APROBADO_ESCALA100){
                    this.cualitativo = "Aprobado";
                }else{
                    this.cualitativo = "Reprobado";
                }
            }

            nota(double pEscala5){
                this.conceptoEvaluado = "concepto sin asignar";
                this.escala5Redondeada = (int)(pEscala5);
                this.escala100 = (int)(pEscala5*20);
                this.escala5 = pEscala5;
                // informar si reprueba o no 
                if(pEscala5 >= nota.APROBADO_ESCALA5){
                    this.cualitativo = "Aprobado";
                }else{
                    this.cualitativo = "Reprobado";
                }
            }

        // 2) Definen el comportamiento
        public void mostrarNota(){
            System.out.println("---info nota ---");
            System.out.println("concepto Evaluado: "+ this.conceptoEvaluado);
            System.out.println("Escala100: "+ this.escala100);
            System.out.println("Escala5: "+ this.escala5);
            System.out.println("Escala5 Redondeada: "+ this.escala5Redondeada);
            System.out.println("Escala cualitativa: "+ this.cualitativo);
        }
        // 3) Getters y Setters: obtener y modificar
        // se recomienda que se crean para aquellas varibles que estan privadas (es solo una recomendaciòn)
            public int getEscala100() {
                return escala100;
            }

            public void setEscala100(int escala100) {
                this.escala100 = escala100;
            }

            public double getEscala5() {
                return escala5;
            }

            public void setEscala5(double escala5) {
                this.escala5 = escala5;
            }

            public String getCualitativo() {
                return cualitativo;
            }

            public void setCualitativo(String cualitativo) {
                this.cualitativo = cualitativo;
            }
        
}
