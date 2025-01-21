public abstract class Exame{
    
    private String nomePaciente;
    private String tipoSanguineo;
    private int anoNascimento;
    
    public abstract String classificarResultado();
    public abstract void mostrarResultado();
    public abstract void cadastrarExame();

    public int calcularIdade(){
        int anoAtual = 2023;
        return anoAtual - anoNascimento;
    }
           
    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    
    
            
    
    
}
