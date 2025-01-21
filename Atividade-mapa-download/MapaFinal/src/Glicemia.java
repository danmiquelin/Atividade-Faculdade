import javax.swing.JOptionPane;

public class Glicemia extends Exame{
   
    public int quantidadeGlicose;

    public int getQuantidadeGlicose() {
        return quantidadeGlicose;
    }

    public void setQuantidadeGlicose(int quantidadeGlicose) {
        this.quantidadeGlicose = quantidadeGlicose;
    }

     @Override
    public void cadastrarExame(){
        
        this.setNomePaciente(JOptionPane.showInputDialog("Informe o nome do paciente: "));
        this.setTipoSanguineo(JOptionPane.showInputDialog("Informe o tipo sanguineo: "));
        this.setAnoNascimento(Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de nascimento:")));
        this.setQuantidadeGlicose(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de Glicose: ")));
    }
     
   
    @Override 
    public String classificarResultado(){
        if (this.getQuantidadeGlicose() < 100){
            return "Normoglicemia";
        } else if (this.getQuantidadeGlicose() >= 100 && this.getQuantidadeGlicose()< 126){
            return "Pré diabetes";
        } else if (this.getQuantidadeGlicose() >= 126){
            return "Diabetes estabelecida";
        } else {
            return "Valor invalido";
        }
                }
    
    @Override
    public void mostrarResultado(){
        JOptionPane.showMessageDialog(null,"Paciente: " +  this.getNomePaciente()
        + "\nGlicemia: " + this.getQuantidadeGlicose() + "mg/dL"
        + "\nClassificação: " + this.classificarResultado());
    }
    
}
