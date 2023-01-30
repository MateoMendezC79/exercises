public class Persona implements AccionPersona {

    ModeloPersona global;
    public void llenarInformacion(ModeloPersona modeloLocal){
        global = modeloLocal;
    }
    @Override
    public void caminar() {
        System.out.println("caminado lento");
    }

    @Override
    public void saltar() {
        System.out.println("salto alto");
    }

    @Override
    public void gritar() {
        System.out.println("grito ruidoso");
    }
}