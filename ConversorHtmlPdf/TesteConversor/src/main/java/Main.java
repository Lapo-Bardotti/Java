import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

import org.apache.commons.io.IOUtils;

import com.itextpdf.html2pdf.HtmlConverter;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		String caminhoEntrada = "C:\\Users\\Statix\\Desktop\\workspace-testes\\TesteConversor\\src\\main\\resources\\Templates\\template_pdf_pai.html";
		String caminhoSaida = "C:\\Users\\Statix\\Desktop\\workspace-testes\\TesteConversor\\src\\main\\resources\\Templates\\template_pdf_pai.pdf";
		final StringBuilder contentBuilder = new StringBuilder();
		try {
			IOUtils.readLines(new FileInputStream(new File(caminhoEntrada)), "UTF-8")
			.forEach(line -> {
				contentBuilder.append(line);
			});
		} catch (IOException e) {
		}
		
		String htmlRetorno = contentBuilder.toString();
		htmlRetorno = htmlRetorno
				.replaceAll("CLIENTE_VARIAVEL", "teste_cliente_01")
				.replaceAll("PERIODO_VARIAVEL", "xx/xx/xxxx - yy/yy/yyyy")
				.replaceAll("FILTROS_VARIAVEL", "Filtro 1, 2, 3");
		
		HtmlConverter.convertToPdf(IOUtils.toInputStream(htmlRetorno, "UTF-8"), new FileOutputStream(caminhoSaida));

		System.out.println("PDF Created!");
	}

}