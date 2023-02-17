public class Vaca extends Mamifero implements Muerte {
    @Override
    public void peso() {
        System.out.println("Peso muy alto");
    }

    @Override
    public String morir(int fechaNacimiento, int fechaFallecimiento, String causaMuerte) {
        int edad = (fechaFallecimiento - fechaNacimiento) * 2;
        String tipoNumero;
        if (edad % 2 == 0){
            tipoNumero = "par";
        } else {
            tipoNumero = "impar";
        }
        return "La fecha de su muerte " +fechaFallecimiento+ ", el numero es "+tipoNumero + ", vivio "+edad+ " años y murio por " +causaMuerte;
    }

    @Override
    public String reencarnar(String informacionReencarnar) {
        return informacionReencarnar + "tu puedes hacerlo";
    }
    public Vaca(){
        ModeloAnimal modeloVaca = new ModeloAnimal("carolina",5,"mamifero");
        informacionAnimal(modeloVaca);
    }
}
