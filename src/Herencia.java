public class Herencia {

    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setSonido("Brrr");
        System.out.println(carro.getSonido());
    }
}

class Transporte {
    int velocidadMaxima;
    String placa;
    String sonido;

    //Constructor, decide serie propiedades
    public Transporte (){
        System.out.println("Estoy en el constructor de transporte");
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }
}

// Se hace clase con herencia
class Carro extends Transporte {

}

class Moto extends Transporte {

}

// cuando se establece final antes de la clase, indica que no se puede heredar nada de esta clase
final class CarroElectrico extends Carro {

}