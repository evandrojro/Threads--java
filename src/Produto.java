import java.util.concurrent.Semaphore;

public class Produto {
    public int quantidade;
    private final Semaphore semaforo = new Semaphore(1);
    private String nome;

    public Produto(int quantidade, String nome){
    	 
    	this.quantidade = quantidade;
    	this.nome = nome;}
    
 
    public int getquantidade() {
		 return quantidade;
	 }

    public void comprar(int quant,String nome) {
    	 try{
    		semaforo.acquire();
    	 
		    
			  if(this.quantidade >= quant){
			    this.quantidade = this.quantidade - quant;
			    System.out.println(nome +" comprou "+quant+" unidade(s) do produto "+this.nome+" | Saldo atual: "+this.quantidade);
		    } else{
		    	System.out.println(nome+":Saldo insuficiente!");
		    }
    	}catch(Exception e){
    		e.printStackTrace();
    	}finally{
    	    semaforo.release();
    	}
    	
        
    }
}