    public class Opcionais implements Cloneable {
        private String roda;
        private String tetoSolar;
        private String pneu;
        private String arCondicionado;


        public Opcionais(String roda, String tetoSolar, String pneu, String arCondicionado) {
            super();
            this.roda = roda;
            this.tetoSolar = tetoSolar;
            this.pneu = pneu;
            this.arCondicionado = arCondicionado;
        }

        public String getRoda() {
            return roda;
        }

        public Opcionais setRoda(String roda) {
            this.roda = roda;
            return this;
        }

        public String getTetoSolar() {
            return tetoSolar;
        }

        public Opcionais setTetoSolar(String tetoSolar) {
            this.tetoSolar = tetoSolar;
            return this;
        }

        public String getPneu() {
            return pneu;
        }

        public Opcionais setPneu(String pneu) {
            this.pneu = pneu;
            return this;
        }

        public String getArCondicionado() {
            return arCondicionado;
        }

        public Opcionais setArCondicionado(String arCondicionado) {
            this.arCondicionado = arCondicionado;
            return this;
        }


        @Override
        public Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        @Override
        public String toString() {
            return "Opcionais{" +
                    "roda='" + roda + '\'' +
                    ", tetoSolar='" + tetoSolar + '\'' +
                    ", pneu='" + pneu + '\'' +
                    ", arCondicionado='" + arCondicionado + '\'' +
                    '}';
        }
    }
