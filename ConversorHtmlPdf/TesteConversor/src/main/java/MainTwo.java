import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.html2pdf.ConverterProperties;
import com.itextpdf.html2pdf.HtmlConverter;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

public class MainTwo {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		String src = "C:\\Users\\Statix\\Desktop\\workspace-testes\\TesteConversor\\src\\main\\resources\\Templates\\template_pdf_pai.html";
		String dest = "C:\\Users\\Statix\\Desktop\\workspace-testes\\TesteConversor\\src\\main\\resources\\Templates\\testando.pdf";
		
		ConverterProperties properties = new ConverterProperties();
		PdfWriter writer = new PdfWriter(dest);
		PdfDocument pdf = new PdfDocument(writer);
		PageSize pageSize = PageSize.A4.rotate();
		pdf.setDefaultPageSize(pageSize);
		
		Document document = HtmlConverter.convertToDocument(new FileInputStream(src), pdf, properties);
		document.close();
	}
}
