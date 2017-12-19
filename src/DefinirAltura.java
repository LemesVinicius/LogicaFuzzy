
public class DefinirAltura {

	
	public void definiralturabinaria(Pessoa pessoa){
		
		if(pessoa.getAltura() >= 1.90) {
			pessoa.setDefaltbin(pessoa.getNome()+" � alto(a)");
		}else {
			pessoa.setDefaltbin(pessoa.getNome()+" � baixo(a)");
		}
		
	}
	public void difiniralturafuzzy(Pessoa pessoa){
		
		 double convertalt; 	
		 double alturaalto;
		 
		 alturaalto = 1.90;
		 
		 convertalt = pessoa.getAltura()/alturaalto;
		
		if(convertalt >= 1.0 ){
			pessoa.setDefaltfuzzy(pessoa.getNome()+" � alto(a)");
		}else if( convertalt < 1.0 && convertalt > 0.94){
			pessoa.setDefaltfuzzy(pessoa.getNome()+" � praticamente alto(a)");
		}else if( convertalt <= 0.94 && convertalt > 0.89){
			pessoa.setDefaltfuzzy(pessoa.getNome()+" � quase alto(a)");
		}else if(convertalt <= 0.89 && convertalt > 0.84){
			pessoa.setDefaltfuzzy(pessoa.getNome()+" � acima da m�dia");
		}else if(convertalt <= 0.84 && convertalt > 0.79){
			pessoa.setDefaltfuzzy(pessoa.getNome()+" � mediano");
		}else if(convertalt <= 0.79 && convertalt > 0.74){
			pessoa.setDefaltfuzzy(pessoa.getNome()+" � um pouco abaixo da m�dia");
		}else if(convertalt <= 0.74 && convertalt > 0.69){
			pessoa.setDefaltfuzzy(pessoa.getNome()+" � quase baixo(a)");
		}else if(convertalt <= 0.69 && convertalt > 0.65){
			pessoa.setDefaltfuzzy(pessoa.getNome()+" � praticamente baixo(a)");
		}else{
			pessoa.setDefaltfuzzy(pessoa.getNome()+" � baixo(a)");
		}
		
			
		
	}
	
}
