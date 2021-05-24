package binariosIniciales02;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class LeerBinario02 {

	public static void main(String[] args) {
		File archivo=new File("prueba.ddc");
		FileInputStream flujoR=null;
		
		if(archivo.exists()){
			try {
				flujoR=new FileInputStream(archivo);
				byte[] array=new byte[8];
				System.out.println("he leido "+flujoR.read(array));
				for (byte b : array) {
					System.out.print(b+" ");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				flujoR.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
