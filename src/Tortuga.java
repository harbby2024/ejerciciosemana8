public class Tortuga extends Mascota {
    public Tortuga(String string, String string2, String string3, int i, String string4, String string5,
            String string6) {
       
    }

    public Tortuga(String string, String string2, int i, String string3, String string4, String string5) {
        
    }
    @Override
    public void hacerSonido(){
     System.out.println("haaaaaaaaaa");
    }
    @Override
    public void alimentar(){
     System.out.println("Lechuga");
    }
    @Override
    public void cuidar(){
     System.out.println("Alimentar 2 veces al dìa, limpiar el cparazon cada noche, cambiarle el agua todos los dìas");
    }
    @Override
    public void mostrarInformacion() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarInformacion'");
    }    
 }