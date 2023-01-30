public class Main {
    public static void main(String[] args) {
        Pedro pedro = new Pedro();
        ModeloPersona modeloPedro = new ModeloPersona();
        modeloPedro.setNombre("Simon");
        modeloPedro.setEdad(21);
        modeloPedro.setColorPelo("Amarillo");
        pedro.llenarInformacion(modeloPedro);
        pedro.tocarPiano("Dulce");
        pedro.caminar();
        System.out.println("Pedro tiene el pelo de color " + pedro.global.getColorPelo() + " de nombre " + pedro.global.getNombre() + " y edad " + pedro.global.getEdad());

        Pepita pepita = new Pepita();
        ModeloPersona modeloPepita = new ModeloPersona();
        modeloPepita.setNombre("Samantha");
        modeloPepita.setEdad(24);
        modeloPepita.setColorPelo("Azul");
        pepita.llenarInformacion(modeloPepita);
        pepita.caminar();
        System.out.println(pepita.tocarFlauta("La cucaracha"));
    }
}