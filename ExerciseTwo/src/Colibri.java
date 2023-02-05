public class Colibri extends Ave implements Muerte{
    @Override
    public void audicion() {
        System.out.println("no tienen orejas pero escuchan tonos de alto rango");;
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
}

