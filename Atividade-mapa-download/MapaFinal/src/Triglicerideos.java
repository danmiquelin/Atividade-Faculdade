import javax.swing.JOptionPane;

public class Triglicerideos extends Exame {
    
    private int qtdTriglicerideos;

    public int getQtdTriglicerideos() {
        return qtdTriglicerideos;
    }

    public void setQtdTriglicerideos(int qtdTriglicerideos) {
        this.qtdTriglicerideos = qtdTriglicerideos;
    }

    
    @Override
    public String classificarResultado() {
        if ( calcularIdade() >= 0 && calcularIdade() <= 9 && this.getQtdTriglicerideos() < 75){
            return "Triglicerideo Bom ";
        } else if (calcularIdade() >= 10 && calcularIdade() <= 19 && this.getQtdTriglicerideos() < 90){
            return "Triglicerideos Bom ";
        } else if (calcularIdade() >= 20 && this.getQtdTriglicerideos() < 150){
            return "Triglicerideo Bom ";
        }else {
            return "Triglicerideo Ruim";
        }
    }

    @Override
    public void mostrarResultado() {
      JOptionPane.showMessageDialog(null, "Paciente: " + this.getNomePaciente()
                + "\nTriglicerideo: " + this.getQtdTriglicerideos() + " mg/dL "
                + "\nClassificação: " + this.classificarResultado());
    }

    @Override
    public void cadastrarExame() {
        this.setNomePaciente(JOptionPane.showInputDialog("Informe o nome do paciente: "));
        this.setTipoSanguineo(JOptionPane.showInputDialog("Informe o tipo sanguineo: "));
        this.setAnoNascimento(Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de nascimento:")));
        this.setQtdTriglicerideos(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de Triglicerideos: ")));
  
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
