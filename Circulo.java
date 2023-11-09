import java.util.ArrayList;
import java.util.List;

public class Circulo {
    private double raio;
    

    public Circulo(double raio) {
        this.raio = raio;
    }


    public double area(){
        double area = 3.14 * raio * raio;
        return area;
    }

    public static void main(String[] args) {
        List<Circulo> circulo = new ArrayList<>();

        Circulo c1 = new Circulo(3);
        circulo.add(c1);
        Circulo c2 = new Circulo(2);
        circulo.add(c2);
        Circulo c3 = new Circulo(5);
        circulo.add(c3);
        Circulo c4 = new Circulo(1);
        circulo.add(c4);
        Circulo c5 = new Circulo(6);
        circulo.add(c5);

        for (Circulo c : circulo) {
            double areaCirc = c.area();
            System.out.println("Área do círculo: " + areaCirc);
        }
    
    }
}

