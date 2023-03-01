public class Interface {

    public static void main(String[] args) {
        Avion avion = new Avion();
        Avioneta avioneta = new Avioneta();

        EjecutaDespegar(avioneta);
        EjecutaAterrizar(avion);
    }

    public static void EjecutaDespegar(Volador volador) {
        volador.Despegar(50);
    }

    public static void EjecutaAterrizar(Volador volador) {
        volador.Aterrizar(20);
    }
}

//Interface:, las utilizamos cuando queremos crear clases y esas clases tengan funciones/métodos prev definidas
interface Volador{
    void Despegar(int cuantaVelocidad);
    void Aterrizar(int cuantaVelocidad);
}

class Avion implements Volador {

    @Override
    public void Despegar(int cuantaVelocidad) {
        System.out.println("Avion() -> Acelerar()");
    }

    @Override
    public void Aterrizar(int cuantaVelocidad) {
        System.out.println("Avion() -> Frenar()");
    }
}

class Avioneta implements Volador {

    @Override
    public void Despegar(int cuantaVelocidad) {
        System.out.println("Avioneta() -> Acelerar()");
    }

    @Override
    public void Aterrizar(int cuantaVelocidad) {
        System.out.println("Avioneta() -> Frenar()");
    }
}