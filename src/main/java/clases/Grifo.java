package clases;

public class Grifo {

    // atributos
    private double galon; // cantidad de galones
    private int tipo;// 1 = 85 , 2 = 90

    // metodos
    public double importe() {

        double v[] = {0, 10.5, 13.9, 15.5, 17.9};
        return galon * v[tipo];

    }

    public double descuento() {

        double des = 0;

        if (galon <= 3) {
            des = 0;
        } else if (galon <= 7) {
            des = 0.08 * importe();
        } else {
            des = 0.12 * importe();
        }

        return des;
    }

    public double total() {

        return importe() - descuento();
    }

    public String obsequio() {

        String obs = "";

        if (importe() <= 60) {

            obs = "Sin obsequio";

        } else if (importe() <= 90) {

            obs = galon + "lapiceros";

        } else {

            obs = "Una gorra";
        }

        return obs;
    }

    public double getGalon() {
        return galon;
    }

    public void setGalon(double galon) {
        this.galon = galon;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

}
