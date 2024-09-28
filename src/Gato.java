public class Gato extends Mascota {
    public Gato(String string, String string2, String string3, int i, String string4, String string5, String string6) {
        
    }
    @Override
    public void hacerSonido(){
     System.out.println("Miaawww");
    }
    @Override
    public void alimentar(){
     System.out.println("Croquetas");
    }
    @Override
    public void cuidar(){
     System.out.println("Dar 3 alimentos al dìa bañar cada 15 dìas, pasear 2 veces al dìa");
    }
    @Override
    public void mostrarInformacion() {
        throw new UnsupportedOperationException("Unimplemented method 'mostrarInformacion'");
    }    
 }
