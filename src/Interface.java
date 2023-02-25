public class Interface {

    public static void main(String[] args) {

    }
}

//Interface:, las utilizamos cuando queremos crear clases y esas clases tengan funciones prev definidas
interface Volador{
    void Despegar(int cuantaVelocidad);
    void Aterrizar(int cuantaVelocidad);
}

class Avion implements Volador {

    @Override
    public void Despegar(int cuantaVelocidad) {

    }

    @Override
    public void Aterrizar(int cuantaVelocidad) {

    }
}