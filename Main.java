package Ejercicio12_piezaIndustrial;

public class Main {
    public static void main(String[] args) {
        PiezaIndustrial pieza1 = new PiezaIndustrial("PZ-001", 100.3, 100.0);
        PiezaIndustrial pieza2 = new PiezaIndustrial("PZ-002", 101.2, 100.0);

        PiezaIndustrial[] piezas = {pieza1, pieza2};
        for (PiezaIndustrial pieza : piezas) {
            String dictamen = pieza.esAceptable() ? "ACEPTADA" : "RECHAZADA";
            System.out.println("Pieza " + pieza.getCodigoPieza() + " (" + pieza.getLongitudMilimetros() + " mm): " + dictamen);
        }
    }
}
