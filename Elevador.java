import java.util.ArrayList;
import java.util.List;

class Elevador{

	private int andarAtual;
	//private int velocidade;
	private boolean portaAberta = false;
	//private int contadorAndaresSelecionados = 0;
	private static int numElevador = 0;
	
	/**
	 * Lista contendo os andares que estão configurados para o elevador.
	 * Somente os andares presente nesta lista serão acessíveis ao elevador.
	 */
	//lista dos andares que o elevador pode ir.
	//private int[] andares;
	private List andaresPermitido = new ArrayList();
	
	/**
	 * Lista dos andares solicitados pelos usuários. 
	 */
	//private int[] andaresSelecionados;
	private List andaresSelecionados = new ArrayList();
	
	//construtor
	public Elevador(int[] andares ){
		//this.andaresPermitido = new int[andares.length];
		for(int k=0; k<andares.length; k++){
			this.andaresPermitido.add(andares[k]);
		}
		this.numElevador++;
		this.andarAtual = 0;
		
		//Inicializando o array que armazena os andares selecionados.
		//this.andaresSelecionados = new int[this.andaresPermitido.size()];
	}
	
	/**
	 * Método responsável por adicionar os andares solicitados.
	 * @param numAndar
	 */
	//Preenche o array responsÃ¡vel por guardar os andares selecionados.
	public void adicionaAndar(int numAndar){
		if(this.andaresPermitido.contains(numAndar)){
			this.andaresSelecionados.add(numAndar);	
		}else{
			System.out.println("Andar inválido para este elevador.");
		}
	}
	
	public void fechaPorta(){
		this.portaAberta = false;
		System.out.println("Porta fechou no andar: "+this.andarAtual);
	}
	
	public void abrePorta(){
		this.portaAberta = true;
		System.out.println("Porta abriu no andar: "+this.andarAtual);
	}
	
	/**
	 * Método responsável por exibir todos os andares que estão configurados
	 * para o elevador.
	 */
	//Lista os andares configurados para o elevador ir.
	public void exibeAndaresPermitidos(){
		System.out.print("Andares permitidos para Elevador ["+this.numElevador+"]: ");
    	for(int k=0; k<this.andaresPermitido.size(); k++){
			System.out.print(this.andaresPermitido.get(k)+" ");
		}
		System.out.println(" ");
	}
	
	
	/**
	 * Faz com que o elevador percorra todos os andares do menor pro maior.
	 * Quando o andar atual for um dos selecionados, a porta se abre.
	 */
	public void sobe(){
		System.out.println("Você está no andar ["+this.andarAtual+"]. Subindo... ");
		for(int k=0; k<this.andaresPermitido.size(); k++){
			this.andarAtual++;
			
			for(int i=0; i<this.andaresSelecionados.size(); i++){
				if(this.andarAtual == (int) this.andaresSelecionados.get(i)){
					abrePorta();
				}
			}
		}
		this.andaresSelecionados.clear();
	}
	
	public void desce(){
		System.out.println("Você está no andar ["+this.andarAtual+"]. Descendo... ");
		for(int k=this.andaresPermitido.size(); k>=0; k--){
			
			for(int i=0; i<this.andaresSelecionados.size(); i++){
				if(this.andarAtual == (int) this.andaresSelecionados.get(i)){
					abrePorta();
				}
			}
			
			this.andarAtual--;
		}
		this.andaresSelecionados.clear();
	}

}