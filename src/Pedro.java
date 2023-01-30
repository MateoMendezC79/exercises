public class Pedro extends Persona {
    public String tocarPiano(String cancion){
        return "pedro toca en piano la cancion" + cancion;
    }
    @Override
    public void caminar() {
        System.out.println("caminado rapido");
    }
}