public class Distribuidor extends Thread{
	private String nome;
	private Produto produtoDesejado;
	private int quantidadeCompra;
	private int quantidadecomprada;

	public Distribuidor(String nome,Produto conta){
		super(nome);
		this.nome = nome;
		this.produtoDesejado = conta;
		this.quantidadeCompra = 50;
		this.quantidadecomprada = 0;
	}
	
	 
	public void run(){
		
		 
		try{
			while(produtoDesejado.getquantidade() >0 )
			{
				int saldo = produtoDesejado.getquantidade();
				produtoDesejado.comprar(quantidadeCompra,nome);
				if(produtoDesejado.getquantidade() < saldo) 
				{
					quantidadecomprada += quantidadeCompra;
				} 
				else {
					break;
				}
				Thread.sleep(1000);
			}
			System.out.println("O comprador " + nome + " comprou um total de : " + quantidadecomprada);
		}catch(Exception e){}
	}
}