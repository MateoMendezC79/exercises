public class Pepita extends Persona {
    public String tocarFlauta(String cancion){
        return "Pepita toca en flauta la cancion" + cancion;
    }
    @Override
    public void caminar() {
        System.out.println("caminado lento");
    }
}