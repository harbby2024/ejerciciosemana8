public class Maid {
    public static void main(String[] args){
        
        Perro perro1 = new Perro("Chiqui", "Tasita de te ",  16,  "pequeño", "Beigs", "Sufre de insuficiencia en los riñones");
        Gato gato1= new Gato("Cuqui", "gato", "Siames", 4, "grande ", "gris ", "Tiene un buen estado de salud");
        Pajaro pajaro1 = new Pajaro("piolin", "pajaro", "Cacatua", 4, "pequeño", "negro y amarillo", "Esta en perfectas condicinones");
        Tortuga tortuga1 = new Tortuga("Tony", "Caguama", 2, "medianos", "cafe", "Erida en pata izquierda");


        perro1.hacerSonido();
        perro1.alimentar();
        perro1.cuidar();
        perro1.mostrarInformacion();

        gato1.alimentar();
        gato1.hacerSonido();
        gato1.cuidar();
        gato1.mostrarInformacion();

        pajaro1.alimentar();
        pajaro1.cuidar();
        pajaro1.hacerSonido();
        pajaro1.mostrarInformacion();

        tortuga1.alimentar();
        tortuga1.cuidar();
        tortuga1.hacerSonido();
        tortuga1.mostrarInformacion();
        
        }
}
    

