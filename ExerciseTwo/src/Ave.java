public class Ave extends Animal{
    @Override
    public void desplazamiento() {
        System.out.println("vuela");
    }
    public String tipoAtaque(String ataque){ return "para hacer daño el animal "+ ataque;}
}
