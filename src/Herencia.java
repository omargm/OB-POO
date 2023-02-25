public class Herencia {

    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setSonido("Brrr");
        System.out.println(carro.getSonido());
    }
}

abstract class Transporte {
    int velocidadMaxima;
    String placa;
    String sonido;

    //Constructor, decide serie propiedades
    public Transporte (){
        System.out.println("Estoy en el constructor de transporte");
    }

    abstract public String getSonido();

    abstract public void setSonido(String sonido);
}

// Se hace clase con herencia
class Carro extends Transporte {
    public String getSonido() {
        return "Sonido Carro " + this.sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }
}

class Moto extends Transporte {

    public String getSonido() {
        return "Sonido moto " + this.sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }
}

// cuando se establece final antes de la clase, indica que no se puede heredar nada de esta clase
final class CarroElectrico extends Carro {

}