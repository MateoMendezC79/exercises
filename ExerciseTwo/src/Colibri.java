public class Colibri extends Ave implements Muerte{
    @Override
    public void audicion() {
        System.out.println("escucha muy poco");;
    }
    public void alimento(){
        System.out.println("come frutas");
    }
    @Override
    public String morir(int fechaNacimiento, int fechaFallecimiento, String causaMuerte) {
        int edad = fechaFallecimiento - fechaNacimiento;
        return "La fecha de su muerte es: "+ fechaFallecimiento + ", vivio " + edad + " años y la causa de la muerte es "+ causaMuerte;
    }
    @Override
    public String reencarnar(String informacionReencarnar) {
        return informacionReencarnar;
    }
    public Colibri(){
        ModeloAnimal modeloColibri = new ModeloAnimal();
        modeloColibri.setNombre("camilo");
        modeloColibri.setTipoAnimal("ave");
        modeloColibri.setAltura(16);
        modeloColibri.setEdad(4);
        modeloColibri.setColor("azul");
        informacionAnimal(modeloColibri);
    }
    public Colibri(ModeloAnimal modeloColibri){
        informacionAnimal(modeloColibri);
    }
}
