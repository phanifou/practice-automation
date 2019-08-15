package com.automation.practice.others;

import java.io.File;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileSystemTest {
	
	
	public static void main(String...strings) throws IOException{
		
		new FileSystemTest().listDirectory("C:\\Users\\IBM_ADMIN\\Desktop\\TestMe", 0);
	}
	
	public void listDirectory(String dirPath, int level) {
	    File dir = new File(dirPath);
	    File[] firstLevelFiles = dir.listFiles();
	    if (firstLevelFiles != null && firstLevelFiles.length > 0) {
	        for (File aFile : firstLevelFiles) {
	            for (int i = 0; i < level; i++) {
	                System.out.print("\t");
	            }
	            if (aFile.isDirectory()) {
	                System.out.println("[" + aFile.getName() + "]");
	                listDirectory(aFile.getAbsolutePath(), level + 1);
	            } else {
	            	String regx = ".txt";
	            	Pattern p = Pattern.compile(regx,Pattern.CASE_INSENSITIVE);
	            	Matcher m = p.matcher(aFile.getName());
	            	if(m.find())
	                System.out.println(aFile.getName());
	            }
	        }
	    }
	}

}
