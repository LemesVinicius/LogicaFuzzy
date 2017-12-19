
public class DefinirAltura {

	
	public void definiralturabinaria(Pessoa pessoa){
		
		if(pessoa.getAltura() >= 1.90) {
			pessoa.setDefaltbin(pessoa.getNome()+" è alto(a)");
		}else {
			pessoa.setDefaltbin(pessoa.getNome()+" è baixo(a)");
		}
		
	}
	public void difiniralturafuzzy(Pessoa pessoa){
		
		 double convertalt; 	
		 double alturaalto;
		 
		 alturaalto = 1.90;
		 
		 convertalt = pessoa.getAltura()/alturaalto;
		
		if(convertalt >= 1.0 ){
			pessoa.setDefaltfuzzy(pessoa.getNome()+" è alto(a)");
		}else if( convertalt < 1.0 && convertalt > 0.94){
			pessoa.setDefaltfuzzy(pessoa.getNome()+" é praticamente alto(a)");
		}else if( convertalt <= 0.94 && convertalt > 0.89){
			pessoa.setDefaltfuzzy(pessoa.getNome()+" é quase alto(a)");
		}else if(convertalt <= 0.89 && convertalt > 0.84){
			pessoa.setDefaltfuzzy(pessoa.getNome()+" è acima da média");
		}else if(convertalt <= 0.84 && convertalt > 0.79){
			pessoa.setDefaltfuzzy(pessoa.getNome()+" è mediano");
		}else if(convertalt <= 0.79 && convertalt > 0.74){
			pessoa.setDefaltfuzzy(pessoa.getNome()+" è um pouco abaixo da média");
		}else if(convertalt <= 0.74 && convertalt > 0.69){
			pessoa.setDefaltfuzzy(pessoa.getNome()+" è quase baixo(a)");
		}else if(convertalt <= 0.69 && convertalt > 0.65){
			pessoa.setDefaltfuzzy(pessoa.getNome()+" è praticamente baixo(a)");
		}else{
			pessoa.setDefaltfuzzy(pessoa.getNome()+" è baixo(a)");
		}
		
			
		
	}
	
}
