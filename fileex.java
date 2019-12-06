import java.io.*;
 import java.util.*;
import java.io.FileReader;
import java.io.IOException;

public class fileex {

	public static void main(String[] args)  throws  Exception{
		// BufferedReader reader;
		try {
			// reader = new BufferedReader(new FileReader(
			// 		"emp.txt"));
			// String line = reader.readLine();
			// while (line != null) {
			// 	System.out.println(line);
			// 	// read next line
			// 	line = reader.readLine();
			int i=0,j=0,k=0;
			  String enamearray[]=new String[500];
           String edeptidarray[]=new String[500];
           
           String didarray[]=new String[500];
            String dnamearray[]=new String[500];

            String salesoidarray[]=new String[500];
            String salesenamearray[]=new String[500];
           String salesvalarray[]=new String[500];
            

			Scanner empreader = new Scanner(new File("emp.txt"));
			Scanner deptreader = new Scanner(new File("dept.txt"));
			Scanner salesreader = new Scanner(new File("sales.txt"));
        // PrintWriter writer = new PrintWriter(new File("FILE_PATH/myfile2.txt"));
        while (deptreader.hasNextLine())
         {
               String deptline = deptreader.nextLine();
            String[] depttokens = deptline.split(",");

			
           didarray[i]=depttokens[0];
           dnamearray[i]=depttokens[1];
           i++;
 			}
 			while ( empreader.hasNextLine())
 			 {
			String empline = empreader.nextLine();
            String[] emptokens = empline.split(",");
			edeptidarray[j]=emptokens[0];
            enamearray[j]=emptokens[1];
           j++;
			}
			

			while (salesreader.hasNextLine())
			  {

	 		String salesline = salesreader.nextLine();
            String[] salestokens = salesline.split(",");
           
           // System.out.println(salestokens[2]);

           System.out.println("Emp data=");
           int p1,p;
           for(p=0;p<=j;p++)
           {
           	for(p1=0;p1<=j;p1++)
             {
           	if(didarray[p]==edeptidarray[p1])
           		 
           			System.out.println(enamearray[p] +"MATCH "+edeptidarray[p]);
           	 
           		 
           	// System.out.println(didarray[p]+"\t"+dnamearray[p]);

           }


         
			}




           // int p;
           // System.out.println("Department data=");
           // for(p=0;p<=i;p++)
           // {
           // 	System.out.println(didarray[p]+"\t"+dnamearray[p]);

           // }

           // System.out.println("Emp data=");
           // for(p=0;p<=j;p++)
           // {
           // 	System.out.println(edeptidarray[p]+"\t"+enamearray[p]);

           // }

           // System.out.println("Sales data=");
           // for(p=0;p<=k;p++)
           // {
           // 	System.out.println(salesoidarray[p]+"\t"+salesenamearray[p]+"\t"+salesvalarray[p]);

           // }
         
		 }
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

