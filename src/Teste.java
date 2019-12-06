import java.io.File;

import br.com.copy.CopiaDiretorio;

public class Teste {
	public static void main(String[] args) {
		
		File src   = new File("");
		File dest  = new File("");
		
		CopiaDiretorio cd = new CopiaDiretorio();
		cd.copiaDiretorio(src, dest);
	}
}
