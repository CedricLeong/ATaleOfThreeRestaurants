/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ator;

import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
 /**
 *
 * @author cedric
 */
public class ATORDM {

    /**
     * @param args the command line arguments
     */
    
   public static void generateCsvFile(LinkedList<String> ll)
   {
	try
	{
	    FileWriter writer = new FileWriter("/home/cedric/NetBeansProjects/data.csv");
            for (String d: ll)
            {
            System.out.println(d);
	    writer.append(d);
	    writer.append(',');
            }
            writer.append('\n');


 
	    //generate whatever data you want
 
	    writer.flush();
	    writer.close();
	}
	catch(IOException e)
	{
	     e.printStackTrace();
	} 
    }

}
