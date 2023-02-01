public class Persona implements AccionPersona {

    ModeloPersona modeloPersonaglobal;
    public void llenarInformacion(ModeloPersona modeloLocal){
        modeloPersonaglobal = modeloLocal;
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
