
    public class Perro extends Mascota {
    
        public Perro(String string, String string2, int i, int j, String string3, String string4) {
           
        }

        public Perro(String string, String string2, int i, String string3, String string32, String string4) {
           
        }

        @Override
       public void hacerSonido(){
        System.out.println("woooaww");
       }

       @Override
       public void alimentar(){
        System.out.println("Croquetas");
       }

       @Override
       public void cuidar(){
        System.out.println("Alimenatar solo 1 vez al dìa, rasquetiar el pelo 1 vez al dìa, limpiar lagrimales");
       }

    public void mostrarInformacion() {
        throw new UnsupportedOperationException("Unimplemented method 'mostrarInformacion'");
    }    
    }


