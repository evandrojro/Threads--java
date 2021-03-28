public class Principal{
	public static void main(String[] args){
		Produto produto = new Produto(200, "Coca-Cola 2L");
		Distribuidor um = new Distribuidor("Dist. 1",produto);
		Distribuidor dois = new Distribuidor("Dist. 2",produto);
		Distribuidor tres = new Distribuidor("Dist. 3",produto);
		Distribuidor quatro = new Distribuidor("Dist.4",produto);


		um.start();
		dois.start();
		tres.start();
		quatro.start();
	}
}