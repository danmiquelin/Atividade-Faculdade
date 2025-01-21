import javax.swing.JOptionPane;

public class Colesterol extends Exame{
    
    private int ldl;
    private int hdl;
    private String risco;

    public int getLdl() {
        return ldl;
    }

    public void setLdl(int ldl) {
        this.ldl = ldl;
    }

    public int getHdl() {
        return hdl;
    }

    public void setHdl(int hdl) {
        this.hdl = hdl;
    }

    public String getRisco() {
        return risco;
    }

    public void setRisco(String risco) {
        this.risco = risco;
    }
    
    public String HDL(){
        //HDL
        if(this.calcularIdade() < 19 && hdl > 45){
            return "(HDL-BOM)";
        }

        else if(this.calcularIdade() >= 20 && hdl > 40){
            return "(HDL-BOM)";
        }

        return "(HDL-RUIM)";
    }

    public String LDL(){
        switch (risco) {
            case "ALTO":
                if (ldl < 50){
                    return "(LDL Bom)";
                }else{
                    return "(LDL Ruim)";
                }
            case "MEDIO":
                if (ldl < 70){
                    return "(LDL Bom)";
                }else{
                    return "(LDL Ruim)";
                }
            case "BAIXO":
                if (ldl < 100){
                    return "(LDL Bom)";
                }else{
                    return "(LDL Ruim)";
                }
            default:
                break;
        }
return "Valor invalido";
    }
    
    
    
    
    
    @Override
    public String classificarResultado() {
        return LDL() + "\n"  + HDL (); 
    }

    @Override
    public void mostrarResultado() {
      JOptionPane.showMessageDialog(null,"Paciente: " + this.getNomePaciente()
      + "\nColesterol HDL: " + hdl  + "mg/dL" 
      + "\nColesterol LDL: " + ldl  + "mg/dL"
      + "\nRisco LDL : " + risco
      + "\nClassificação: " + this.classificarResultado());  
    }

    @Override
    public void cadastrarExame() {
        this.setNomePaciente(JOptionPane.showInputDialog("Informe o nome do paciente: "));
        this.setTipoSanguineo(JOptionPane.showInputDialog( "Informe o tipo sanguíneo: "));
        this.setAnoNascimento(Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de nascimento: ")));
        this.setLdl(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade do LDL ")));
        this.setHdl(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade do HDL ")));
        this.setRisco(JOptionPane.showInputDialog("Informe o risco: BAIXO - MEDIO - ALTO ").toUpperCase());
   }
    

}