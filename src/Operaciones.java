public class Operaciones {
    public Operaciones() {
    }

    public void setPromC1(double promC1) {
        this.promC1 = promC1;
    }

    public double getPromC1() {
        return promC1;
    }

    private double promC1;

    public void setPromC2(double promC2) {
        this.promC2 = promC2;
    }

    public double getPromC2() {
        return promC2;
    }

    private double promC2;

    public void setPromC3(double promC3) {
        this.promC3 = promC3;
    }

    public double getPromC3() {
        return promC3;
    }

    private double promC3;

    public double getPromT() {
        return promT;
    }

    public void setPromT(double promT) {
        this.promT = promT;
    }

    private double promT;

    public double promedioCorte1(double Tareas, double Quiz, double Parcial) {
        double promC1 = (Tareas * 0.10) + (Quiz * 0.10) + (Parcial * 0.15);
        return promC1;
    }
    public double promedioCorte2(double Tareas, double Quiz, double Parcial) {
        double promC2 = (Tareas * 0.10) + (Quiz * 0.10) + (Parcial * 0.15);
        return promC2;
    }
    public double promedioCorte3(double Tareas, double Quiz, double Parcial) {
        double promC3 = (Tareas * 0.10) + (Quiz * 0.10) + (Parcial * 0.10);
        return promC3;
    }
    public double promedioT(double promC1, double promC2, double promC3) {
        promT = promC1 + promC2 + promC3;
        return promT;
    }





}
