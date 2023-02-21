public class Animal {
    public ModeloAnimal varGlobalAnimal;

    public void informacionAnimal(ModeloAnimal varLocalAnimal) {
        varGlobalAnimal = varLocalAnimal;
    }

    public void audicion() {
        System.out.println("escucha mucho");
    }

    public void desplazamiento() {
        System.out.println("se desplaza por el agua");
    }

    public void reproduccion() {
        System.out.println("se reproduce en el dia");
    }
}

