public class Pajaro extends Mascota {
    public Pajaro(String string, String string2, String string3, int i, String string4, String string5,
            String string6) {
        
    }
    @Overridev
    public void hacerSonido(){
     System.out.println("whuuu");
    }
    @Override
    public void alimentar(){
     System.out.println("Alpiste");
    }
    @Override
    public void cuidar(){
     System.out.println("Cambiar el agua 2 veces al dìa, alimentar 1 vez al dìa, cubrir la jaula en la noche ");
    }
    @Override
    public void mostrarInformacion() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarInformacion'");
    }    
 }
