package ManejoDePilas1;
    public class Edades1 {
        private String universidad;
        private String paralelo;
        private int [] edades;

        public String getUniversidad() {
            return universidad;
        }

        public String getParalelo() {
            return paralelo;
        }

        public int[] getEdades() {
            return edades;
        }

        public void setUniversidad1(String universidad) {
            this.universidad = universidad;
        }

        public void setParalelo1(String paralelo) {
            this.paralelo = paralelo;
        }

        public void setEdades1(int[] edades) {
            this.edades = edades;
        }

        public void mostrar()
        {
//            System.out.println("Mostrando Clase EDADES 1:");
//            System.out.println("Universidad: "+this.getUniversidad());
//            System.out.println("Paralelo: "+this.getParalelo());
            for(int i=0;i<this.getEdades().length;i++)
            {
                System.out.print(this.edades[i]+", ");

            }
            System.out.println();
        }
        public Edades1(String universidad,String paralelo,int[] edades)
        {
            this.universidad=universidad;
            this.paralelo=paralelo;
            this.edades=edades;
        }


    }


