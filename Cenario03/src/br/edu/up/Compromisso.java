package br.edu.up;


    public class Compromisso {
        private String pessoa;
        private String local;
        private String assunto;
        private int hora;
    
        public Compromisso(String pessoa, String local, String assunto, int hora) {
            this.pessoa = pessoa;
            this.local = local;
            this.assunto = assunto;
            this.hora = hora;
        }
    
        public void setPessoa(String pessoa) {
            this.pessoa = pessoa;
        }
    
        public String getPessoa() {
            return pessoa;
        }
    
        public void setLocal(String local) {
            this.local = local;
        }
    
        public String getLocal() {
            return local;
        }
    
        public void setAssunto(String assunto) {
            this.assunto = assunto;
        }
    
        public String getAssunto() {
            return assunto;
        }
    
        public void setHora(int hora) {
            this.hora = hora;
        }
    
        public int getHora() {
            return hora;
        }
    
        @Override
        public String toString() {
            return "Compromisso [Pessoa=" + pessoa + ", Local=" + local + ", Assunto=" + assunto + ", Hora=" + hora + "]";
        }

        public String getNome() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'getNome'");
        }

        public void adicionarCompromisso(String pessoa2, String local2, String assunto2, int hora2, int diaMes) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'adicionarCompromisso'");
        }
    }
