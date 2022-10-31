    public class Carro implements Cloneable {
        private String chassi;
        private String modelo;
        private Opcionais opcionais;
        private String versao;

        public Carro(String chassi, String modelo, Opcionais opacionais, String versao) {
            this.chassi = chassi;
            this.modelo = modelo;
            this.opcionais = opacionais;
            this.versao = versao;
        }

        public String getChassi() {
            return chassi;
        }

        public Carro setChassi(String chassi) {
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

        public String getversao() {
            return versao;
        }

        public Carro setversao(String versao) {
            this.versao = versao;
            return this;
        }

        @Override
        public Carro clone() throws CloneNotSupportedException {
            Carro carroClone = (Carro) super.clone();
            carroClone.opcionais = (Opcionais) carroClone.opcionais.clone();
            return carroClone;
        }

        @Override
        public String toString() {
            return "Carro{" +
                    "chassi='" + chassi + '\'' +
                    ", modelo='" + modelo + '\'' +
                    ", opcionais=" + opcionais +
                    ", versao='" + versao + '\'' +
                    '}';
        }
    }
