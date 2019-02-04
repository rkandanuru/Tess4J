package tess4J;

import java.io.File;
import java.io.*;
import net.sourceforge.tess4j.*;


public class test {

	public static void main(String[] args) throws IOException{
		File imageFile = new File("/Users/rkandanuru/Downloads/Tess4J-2/images/Pc1.png");
		ITesseract instance = new Tesseract();
		instance.setDatapath("/Users/rkandanuru/Downloads/Tess4J-2/src/tessdata");
		
		try {
			String result = instance.doOCR(imageFile);
			System.out.println(result);
			
		} catch (TesseractException e) {
			System.err.println(e.getMessage());
		}
	}
}
