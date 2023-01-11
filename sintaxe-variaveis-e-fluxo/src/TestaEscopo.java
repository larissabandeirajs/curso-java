
public class TestaEscopo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("testando condicionais");
		
        int idade = 18;
        int quantidadeDePessoas = 3;
        
       
        
        boolean acompanhado = quantidadeDePessoas >=2;
        
        if(quantidadeDePessoas >=2) {
        	 acompanhado = true;
        	// não existe mais a variavel acompanhado pois fechou a chave
        }else {
        	 acompanhado = false;
        }// não existe mais a variavel acompanhado pois fechou a chave
        
        System.out.println("Valor de acompanhado = " + acompanhado);

      if(idade >=18  && acompanhado) {
    	  System.out.println("liberado");
    	  
      } else {
    	  System.out.println("Infelizmente não pode entrar");
      }
      
     
      
	}

}
