package com.automation.practice.others;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

import java.io.File;
import java.io.IOException;

public class ReadPdf2 {

    public static void main(String[] args) throws IOException {

        try (PDDocument document = PDDocument.load(new File("C:\\Users\\IBM_ADMIN\\Desktop\\Ticket.pdf"))) {

            document.getClass();

            if (!document.isEncrypted()) {
			
                PDFTextStripperByArea stripper = new PDFTextStripperByArea();
                stripper.setSortByPosition(true);

                PDFTextStripper tStripper = new PDFTextStripper();

                String pdfFileInText = tStripper.getText(document);
                //System.out.println("Text:" + st);

				// split by whitespace
                String lines[] = pdfFileInText.split("\\r?\\n");
                for (int i=0;i<lines.length-1;i++) {
                	if(lines[i].contains("e-Mail"))
                		
                	{
                		System.out.println("Email is ::" + lines[i].substring(9));
                		
                	}
                    //System.out.println(lines[i]);
                }

            }

        }

    }
}

