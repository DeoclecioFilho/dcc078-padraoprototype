    public class Opcionais implements Cloneable {
        private String roda;
        private boolean tetoSolar;
        private String pneu;
        private boolean arCondicionado;

        public Opcionais(String roda, boolean tetoSolar, String pneu, boolean arCondicionado) {
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

        public boolean getTetoSolar() {
            return tetoSolar;
        }

        public Opcionais setTetoSolar(boolean tetoSolar) {
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

        public boolean getArCondicionado() {
            return arCondicionado;
        }

        public Opcionais setArCondicionado(boolean arCondicionado) {
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
