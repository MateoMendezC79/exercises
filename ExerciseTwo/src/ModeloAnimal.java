public class ModeloAnimal {
    private String nombre;
    private int edad;
    private String tipoAnimal;
    public ModeloAnimal (String nombre,int edad,String tipoAnimal){
        this.nombre = nombre;
        this.edad = edad;
        this.tipoAnimal = tipoAnimal;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getTipoAnimal() {
        return tipoAnimal;
    }
    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }
}
