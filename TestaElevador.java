class TestaElevador{
	
	public static void main(String args[]){
		int[] andaresPermitidos = new int[4];
		andaresPermitidos[0] = 1;
		andaresPermitidos[1] = 2;
		andaresPermitidos[2] = 3;
		andaresPermitidos[3] = 4;
		Elevador e1 = new Elevador(andaresPermitidos);
		
		e1.exibeAndaresPermitidos();
		
		/*for(int k=0;k<args.length;k++){
			int j;
			j = Integer.parseInt(args[k]);
			e1.adicionaAndar(j);
		}*/
		
		//Andares subindo
		e1.adicionaAndar(1);
		e1.adicionaAndar(3);
		e1.adicionaAndar(4);
		
		e1.sobe();
		
		//Andares descendo
		e1.adicionaAndar(2);
		e1.adicionaAndar(3);
		
		e1.desce();

	}
	
}