import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double Tareas = 3.0;
        double Quiz = 5.0;
        double Parcial = 4.3;
        Operaciones op = new Operaciones();
        op.setPromC1(op.promedioCorte1(Tareas,Quiz,Parcial));
        op.setPromC2(op.promedioCorte2(Tareas,Quiz,Parcial));
        op.setPromC3(op.promedioCorte3(Tareas,Quiz,Parcial));
        op.promedioT(op.getPromC1(),op.getPromC2(),op.getPromC3());

        double notaDefinitiva = op.getPromT();

        if (notaDefinitiva >= 3.0 && notaDefinitiva <= 5.0){
            System.out.println("El estudiante aprobo con nota:" + notaDefinitiva);
        }
        else if(notaDefinitiva >= 1.9 && notaDefinitiva <3.0){
            System.out.println("El estudiante esta habilitado con nota:" + notaDefinitiva);
        }
        else if(notaDefinitiva >= 0.0 && notaDefinitiva <= 1.9){
            System.out.println("El estudiante reprobo con nota:" + notaDefinitiva);
        }

        else {
            System.out.println("Error en las notas ingresadas");
        }
    }


}