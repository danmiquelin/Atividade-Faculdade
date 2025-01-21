public class Principal {
   
    public static void main (String[] args) {
        
        //TESTE GLICEMIA
          
        Glicemia gl = new Glicemia();
        gl.cadastrarExame();
        gl.mostrarResultado();
       
        //TESTE TRIGLICERIDEOS
        
        Triglicerideos tg = new Triglicerideos();
        tg.cadastrarExame();
        tg.mostrarResultado();
        
        //TESTE DE COLESTEROL
       
        Colesterol cl = new Colesterol();
        cl.cadastrarExame();
        cl.mostrarResultado();
  }
}