package com.automation.practice.others;
import com.lowagie.text.Document;
import com.lowagie.text.Rectangle;
import com.lowagie.text.pdf.BaseFont;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfImportedPage;
import com.lowagie.text.pdf.PdfReader;
import com.lowagie.text.pdf.PdfWriter;
import java.io.FileOutputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class ReadPdf {
	private static Logger log = LoggerFactory.getLogger(ReadPdf.class);
	
	
	    public static void main(String[] args) {
	        try {
	            PdfReader reader = new PdfReader("C:\\Users\\IBM_ADMIN\\Desktop\\Ticket.pdf");
	            int n = reader.getNumberOfPages();
	            // we retrieve the size of the first page
	            Rectangle psize = reader.getPageSize(1);
	           
	            log.info("PDF version is --> " + reader.getPdfVersion());
	            log.info("Total file length--> " + reader.getFileLength());
	            log.info("Pdf height --> " +psize.getHeight());
	            log.info("Pdf page width--> " +psize.getWidth());
	            
	            
	        }
	        catch (Exception de) {
	            de.printStackTrace();
	        }
	    }
	}


