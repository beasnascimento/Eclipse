package generation;

public class teste {
	
	public  static  void  main ( String [] args ) {
		
		cliente dadosCliente = new cliente ( "113.500.174-00" , "Ana Beatriz Nascimento" , "beatriz.nascimento@gmail.com", "Rua Frutuoso Gomes" );
		System.out.println(dadosCliente.getDadosCompletos());
		

}
}