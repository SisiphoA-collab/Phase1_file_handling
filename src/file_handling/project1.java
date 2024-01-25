package file_handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class project1 {

	public static void main(String[] args) throws IOException {
		Scanner sc= new Scanner(System.in);
		
		File directory = new File("C:\\Users\\SLP11345\\Desktop\\files\\");
		char c;
		
		File f;
		
		String fname;
		do
			{
		System.out.println("1. File creation ");
		System.out.println("2. Writting operation ");
		System.out.println("3. Reading operation ");
		System.out.println("4. Delete operation ");
		System.out.println("5. Check file present or not !");
		System.out.println("6. To print list of files ");
		System.out.println("7. Search any specific file ");
		System.out.println("8. Exit ");
		
		System.out.println("Enter your choice ! ");
		int ch=sc.nextInt();
		
		switch(ch)
		{
		case 1:  // create file 
			
			System.out.println("Enter the file name !");
			fname=sc.next();
			
			f = new File("C:\\Users\\SLP11345\\Desktop\\files\\"+fname);
			
			if(f.createNewFile())
			{
			System.out.println("file created successfully!!");
			}
			
			else
			{
				if(f.exists())
				{
					System.out.println("file name already exist !");
				}
			}
			break;
			
		case 2: // writing inside the file 
			
			System.out.println("Enter file name where you want to write the data !");
			fname=sc.next();
			
			FileWriter fw = new FileWriter("C:\\Users\\SLP11345\\Desktop\\files\\"+fname);

			f= new File("C:\\Users\\SLP11345\\Desktop\\files\\"+fname);
			
			if(f.exists())
			{
			Scanner sc1 = new Scanner(System.in);
			System.out.println("enter the data you want write in the file !");
			String data = sc1.nextLine();
			
			fw.write(data);
			
			System.out.println("Data Written Successfully");
			}
			
			fw.close();
			break;
		
		case 3: // reading 
			
			System.out.println("enter file name whose data you wanna read !!");
			fname=sc.next();
			
			
			f= new File("C:\\Users\\SLP11345\\Desktop\\files\\"+fname);
			
			if(f.exists())
			{
			Scanner sc2 = new Scanner(f);
			
			while(sc2.hasNextLine())
			{
				String line =sc2.nextLine();
				System.out.println(line);
			}
			
			
			sc2.close();
			}
			
			else
			{
				System.out.println("file is not present !!");
			}
			
			break;
			
		case 4: // deletion 
			
			System.out.println("enter the file name you wanna delete !");
			fname=sc.next();
			
			f= new File("C:\\Users\\SLP11345\\Desktop\\files\\"+fname);
			
			if(f.exists())
			{
			
			f.delete();
			
			System.out.println("file deleted successfully !!");
			}
			
			else
			{
				System.out.println("file is not present !");
			}
			
			break;
			
		case 5:
			System.out.println("enter the file name to check it's present : ");
			fname=sc.next();
			
			f= new File("C:\\Users\\SLP11345\\Desktop\\files\\"+fname);
			
			if(f.exists())
			{
				System.out.println("file exist !!");
			}
			else
				
			{
				System.out.println("file not exist ");
			}
			break;
			
		case 6: //list of files 
			
			System.out.println("List of files and folders ");
			File f2 = new File("C:\\Users\\SLP11345\\Desktop\\files\\");
			File[] listoffiles = f2.listFiles();
			for(File i : listoffiles)
			{
				if(i.isDirectory())
				{
					System.out.println(i.getName());
				}
				else if(i.isFile())
				{
					System.out.println(i.getName());
				}
			}
			break;
			
		case 7:
			
			System.out.println("Enter the file name for searching ");
			fname=sc.next();
			
			int m=0;
			
			File f3 = new File("C:\\Users\\SLP11345\\Desktop\\files\\");
			
			String f_search[] = f3.list();
			
			if(f_search == null)
			{
				System.out.println("There is no file present in the directory !");
			}
			else
			{
				for(int i=0;i<f_search.length;i++)
				{
					String sf = f_search[i];
					if(sf.equalsIgnoreCase(fname))
					{
						System.out.println(sf+" is found ");
					}
					else
					{
						m=1;
					}
				}
				
				if(m==1)
				{
					System.out.println("file not found !");
				}
			}
			
			
			break;
			
		case 8: 
			
			System.out.println("Thankyou User !");
			
			break;
			
		default:
			System.out.println("you choice  is incorrect !");
		}
		
		System.out.println("Do you want to continue(y/n) ?");
		c=sc.next().charAt(0);
		
		
		
			}
			
			while(c=='y'|| c=='Y');
		}


	}


