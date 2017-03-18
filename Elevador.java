class Elevador{

	private int andarAtual;
	private int velocidade;
	private boolean portaAberta = false;
	private int contadorAndaresSelecionados = 0;
	private static int numElevador = 0;
	
	
	//lista dos andares que o elevador pode ir.
	private int[] andares;
	
	//Lista dos andares solicitados pelos usuários.
	private int[] andaresSelecionados;
	
	//construtor
	public Elevador(int[] andares ){
		this.andares = new int[andares.length];
		for(int k=0; k<andares.length; k++){
			this.andares[k] = andares[k];
		}
		this.numElevador++;
		this.andarAtual = 0;
		
		//Inicializando o array que armazena os andares selecionados.
		this.andaresSelecionados = new int[this.andares.length];
	}
	
	//Preenche o array responsável por guardar os andares selecionados.
	public void adicionaAndar(int numAndar){
		
		/* Implementar a comparação com os andares permitidos (array andares)*/

		
		this.andaresSelecionados[contadorAndaresSelecionados] = numAndar;
		this.contadorAndaresSelecionados++;
	}
	
	public void fechaPorta(){
		this.portaAberta = false;
		System.out.println("Porta fechou no andar: "+this.andarAtual);
	}
	
	public void abrePorta(){
		this.portaAberta = true;
		System.out.println("Porta abriu no andar: "+this.andarAtual);
	}
	
	//Lista os andares configurados para o elevador ir.
	public void exibeAndaresPermitidos(){
		System.out.print("Andares permitidos para Elevador ["+this.numElevador+"]: ");
    	for(int k=0; k<this.andares.length; k++){
			System.out.print(this.andares[k]+" ");
		}
		System.out.println(" ");
	}
	
	/*Faz com que o elevador percorra todos os andares do menor pro maior.
	  Quando o andar atual for um dos selecionados, a porta se abre.
	*/
	public void sobe(){
		System.out.println("Você está no andar ["+this.andarAtual+"]. Subindo... ");
		for(int k=0; k<this.andares.length; k++){
			this.andarAtual++;
			
			for(int i=0; i<this.andaresSelecionados.length; i++){
				if(this.andarAtual == this.andaresSelecionados[i]){
					abrePorta();
				}
			}
		}
		System.out.println("Você está no andar ["+this.andarAtual+"]. Descendo... ");
	}
	
	public void desce(){
		this.andarAtual--;
	}

}