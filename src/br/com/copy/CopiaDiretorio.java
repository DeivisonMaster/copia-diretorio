package br.com.copy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopiaDiretorio {
	
	/**
	 * @description Implementação que copia os arquivos de um diretório
	 * */
	public void copiaDiretorio(File src, File dest) {
		
		if  (src.isDirectory()) {
			
			// se diretorio não existe, o diretório é criado 
			if(!dest.exists()) {
				dest.mkdir();
				
				System.out.println("Diretorio copiado de " + src + " to " + dest);
			}
			
			String files[] = src.list();
			
			System.out.println(files);
			
			for (String fileName : files) {
				File srcFile = new File(src, fileName);
				File destFile = new File(dest, fileName);
				
				copiaDiretorio(srcFile, destFile);
			}
		} else {
			copiaArquivo(src, dest);
		}
	}
	
	public void copiaArquivo(File src, File dest) {
		InputStream		is = null;
		OutputStream	os = null;
		
		try {
			is = new FileInputStream(src);
			os = new FileOutputStream(dest);
			
			byte[] buffer = new byte[1024];
			
			int length;
			
			while((length = is.read(buffer)) > 0) {
				os.write(buffer, 0, length);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}



































