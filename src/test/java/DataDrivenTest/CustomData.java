package DataDrivenTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class CustomData
{

	@DataProvider(name="testdata1")
		public Object[][] testData() 
		{
			Object data[][]= {{"Admin","admin123"},{"Sarang","test123"},{"Priya","pri123"},{"Pooja","poo123"}};
			return data;
		}
	

	
	
	@DataProvider(name="ExcelData")
	public Object[][] fileData()
	
	{
		
		XSSFWorkbook wb;
		Object data[][]=null;
		
		 File f1=new File("./"+"\\TestData\\data.xlsx");
		  FileInputStream fs;
		try {
			fs = new FileInputStream(f1);
			 //wb-->sheet-->row-->-->data
			  
			  wb=new XSSFWorkbook(fs);
			  
			//number of rows
			  int rows=wb.getSheet("UserData").getPhysicalNumberOfRows();
			  System.out.println("Number of rows are : "+rows);
			  
			  //number of cells
			  int cells=wb.getSheet("UserData").getRow(0).getPhysicalNumberOfCells();
			  System.out.println("Number of columns : "+cells);
			  
			  //create array as per file size
			  data=new Object[rows][cells];
			  
			  
			  //read data from file save it in array
			 
			  for(int r=1;r<rows;r++)
			  {
				  for(int c=0;c<cells;c++)
				  {
					 data[r-1][c]=wb.getSheet("UserData").getRow(r).getCell(c).getStringCellValue();
					// System.out.println(data[r][c]);
				  }
			  }  
			
			  
			  
			  
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		 
		  
		  return data;
		  
		  
		  
	}
	
	
}	

