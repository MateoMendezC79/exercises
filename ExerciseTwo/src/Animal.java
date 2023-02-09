public class Animal {
    public ModeloAnimal varGlobalAnimal;
    public void informacionAnimal(ModeloAnimal varLocalAnimal){
        varGlobalAnimal=varLocalAnimal;
    }
    public void audicion(){
        System.out.println("Orejas Largas con buen rango auditivo");
    }
    public void desplazamiento(){
        System.out.println("Usa sus aletas para moverse en agua");
    }
    public void dentadura(){
        System.out.println("dientes muy pequeños");
    }
    public void color(){
        System.out.println("De color verde oscuro");
    }
    public void alimentoCrias(){}
}
