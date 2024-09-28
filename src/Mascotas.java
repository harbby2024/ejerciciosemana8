abstract class Mascotas {
    private String nombre;
    private String especie;
    private int edad;
    private int tamaño;
    private String color;
    private String estadoDeSalud; 
    
    public Mascotas (String nombre, String especie,
    int edad, int tamaño, String color, String estadoDeSalud) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.tamaño = tamaño;
        this.color = color;
        this.estadoDeSalud = estadoDeSalud;
    }

    public String getNombre(){
        return nombre;
    }

    public String getEspecie(){
        return especie;
    }

    public int getEdad(){
        return edad;
    }

    public int getTamano(){
        return tamaño;
    }

    public String getColor(){
        return color;
    }

    public String getEstadoDeSalud(){
        return estadoDeSalud;
    }

    public abstract void  hacerSonido();

    public abstract void alimentar();

    public abstract void cuidar();

    public void mostrarInformacion() {
        System.out.println("Nombre de la mascota: " + nombre);
        System.out.println("Especie de la mascota: " + especie);
        System.out.println("Raza Mascota: " + especie);
        System.out.println("Edad de la Mascota: " + edad);
    }

}
 



