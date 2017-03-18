class TestaElevador{
	
	public static void main(String args[]){
		int[] andaresPermitidos = new int[4];
		andaresPermitidos[0] = 1;
		andaresPermitidos[1] = 2;
		andaresPermitidos[2] = 4;
		andaresPermitidos[3] = 6;
		Elevador e1 = new Elevador(andaresPermitidos);
		
		e1.exibeAndaresPermitidos();
		
		for(int k=0;k<args.length;k++){
			int j;
			j = Integer.parseInt(args[k]);
			e1.adicionaAndar(j);
		}
		
		e1.sobe();
		
	}
	
}