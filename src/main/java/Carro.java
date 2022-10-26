    public class Carro implements Cloneable {
        private int chassi;
        private String modelo;
        private Opcionais opcionais;
        private String tipo;

        public Carro(int chassi, String modelo, Opcionais opacionais, String tipo) {
            this.chassi = chassi;
            this.modelo = modelo;
            this.opcionais = opacionais;
            this.tipo = tipo;
        }

        public int getChassi() {
            return chassi;
        }

        public Carro setChassi(int chassi) {
            this.chassi = chassi;
            return this;
        }

        public String getModelo() {
            return modelo;
        }

        public Carro setModelo(String modelo) {
            this.modelo = modelo;
            return this;
        }

        public Opcionais getOpacionais() {
            return opcionais;
        }

        public Carro setOpacionais(Opcionais opcionais) {
            this.opcionais = opcionais;
            return this;
        }

        public String getTipo() {
            return tipo;
        }

        public Carro setTipo(String tipo) {
            this.tipo = tipo;
            return this;
        }

        @Override
        public Carro clone() throws CloneNotSupportedException {
            Carro alunoClone = (Carro) super.clone();
            alunoClone.opcionais = (Opcionais) alunoClone.opcionais.clone();
            return alunoClone;
        }

        @Override
        public String toString() {
            return "Carro{" +
                    "chassi=" + chassi +
                    ", modelo='" + modelo + '\'' +
                    ", opacionais=" + opcionais +
                    ", tipo='" + tipo + '\'' +
                    '}';
        }
    }
