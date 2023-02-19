public class Propiedades {

    public static void main(String[] args) {

        Vehiculo tiida = new Vehiculo();
        tiida.setTipo("Sedan");
        tiida.setCilindros(4);
        tiida.setEcologico(false);

        Vehiculo creta = new Vehiculo();
        creta.setTipo("Camioneta");
        creta.setCilindros(6);
        creta.setEcologico(true);

        System.out.println(tiida.getTipo() + " " + tiida.getCilindros() + " cilindros" + " " + tiida.isEcologico());
        System.out.println(creta.getTipo() + " " + creta.getCilindros() + " cilindros" + " " + creta.isEcologico());

    }
}

class Vehiculo{
    private String tipo;

    //Encapsular para usa propiedad fuera de la clase

    //Set
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    //Get - nunca tiene parametros
    public String getTipo(){
        return this.tipo;
    }

    private int cilindros;

    public void setCilindros (int cilindros){
        this.cilindros = cilindros;
    }

    public int getCilindros(){
        return this.cilindros;
    }

    public boolean ecologico;

    public void setEcologico (boolean ecologico){
        this.ecologico = ecologico;
    }

    public boolean isEcologico (){
        return this.ecologico;
    }
}