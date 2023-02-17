public class Animal {
    public ModeloAnimal varGlobalAnimal;
    public void informacionAnimal(ModeloAnimal varLocalAnimal){
        varGlobalAnimal=varLocalAnimal;
    }
    public void audicion(){
        System.out.println("escucha mucho");
    }
    public void desplazamiento(){
        System.out.println("se desplaza por el agua");
    }
    public void reproduccion(){
        System.out.println("se reproduce en el dia");
    }
    public void dentadura(){
        System.out.println("dientes muy pequeños");
    }
    public void color(){
        System.out.println("De color verde oscuro");
    }
    public void peso(){
        System.out.println("peso muy bajo");
    }
    public void edad(){
        System.out.println("muy viejo");
    }
    public void altura(){
        System.out.println("muy bajita");
    }

}
