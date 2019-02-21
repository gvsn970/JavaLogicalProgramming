import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TreeParse {

	//private static final int NUM_COLUMNS = 100;
	
	public static boolean isSheetEmpty(XSSFSheet xssfSheet){
	       Iterator rows = xssfSheet.rowIterator();
	       while (rows.hasNext()) {
	           Row row = (Row) rows.next();
	           
	           Iterator cells = row.cellIterator();
	           while (cells.hasNext()) {
	                Cell cell = (Cell) cells.next();
	                if(!cell.getStringCellValue().isEmpty()){
	                
	                    return true;
	                }
	           }
	       }
	       return false;
	}

    public static void main(String[] args)
    {

        try
        {
        	//FileInputStream file = new FileInputStream(new File("projectItemaiZationSheet-2.xls"));
			//FileInputStream file = new FileInputStream(new File("empty-sheet.xlsx"));
			//FileInputStream file = new FileInputStream(new File("projectItemaiZationSheet-4-duplicate.xlsx"));
        	FileInputStream file = new FileInputStream(new File("sample-xls-file.xls"));
        	Workbook wb = WorkbookFactory.create(new File("MyExcel.xls"));

            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheetAt(0);
         /*   for(int i = 0; i < workbook.getNumberOfSheets(); i++){
                System.out.println("Sheet " + i + " has data: " + isSheetEmpty(workbook.getSheetAt(i)));
         }*/
            XSSFRow row1 = sheet.getRow(0);
          //  int colNum = row1.getLastCellNum();
          //  System.out.println("Total Number of Columns in the excel is : "+colNum);
            int rowNum = sheet.getLastRowNum()+1;
            System.out.println("Total Number of Rows in the excel is : "+rowNum);
          

            boolean emptySheet=isSheetEmpty(sheet);
            if(!emptySheet) {
            	System.out.println("the Excel Sheet Contains Empty Data");
            }else {
            	 // Use a column marker to save the 'farthest' column so far
                int currColMarker = -1;
                List<String> list = new ArrayList<>();

                //Iterate through each rows one by one
                Iterator<Row> rowIterator = sheet.iterator();
                int count=0;
                int parent=0;
                while (rowIterator.hasNext()) 
                {
                    Row row = rowIterator.next();
                   
                  //  System.err.println(row.toString()+"..........row data");
                    for(int currCol = 0; currCol < rowNum; currCol++)
                    {
                        Cell cell = row.getCell(currCol);
                      //  System.err.println(currCol+"....................currCol");
                        if(cell == null)
                            continue;

                        if(cell.getCellType() == Cell.CELL_TYPE_STRING) {

                            if(currCol > currColMarker) {
                               // System.err.println(currCol+"....................currCol in if 1");

                                // A farther column, simply append and
                                // update column marker
                                currColMarker = currCol;
                              //  System.err.println(cell.getStringCellValue()+"......cell value");

                                list.add(cell.getStringCellValue());
                               // System.err.println(list.isEmpty()+"....................list");

                            }
                            else if (currCol == currColMarker) {
                               // System.err.println(currCol+"....................currCol in else if 1");

                                // At same level as column marker
                                // Remove old value at same level, before appending
                                list.remove(list.size() - 1);
                                list.add(cell.getStringCellValue());
                            }
                            else {
                               // System.err.println(currCol+"....................currCol in else 1");

                                // At a 'nearer' column, remove those values beyond
                                // this level before appending
                                currColMarker = currCol;

                                list = list.subList(0, currCol);
                                list.add(cell.getStringCellValue());
                            }
                        }
                    }
                  //  System.err.println(list.isEmpty()+"....................list");

                    // For displaying the current contents
                    StringBuilder sb = new StringBuilder();
                    for(String s : list) {
                        if(sb.length() != 0) {
                            sb.append("-->");
                        }
                        sb.append(s);
                     //   System.out.println(s+".......................s value");

                    }
                  //  System.out.println(count++);
                    String data= sb.toString();
                  
                   
                   // System.out.println(data1.length);
                  //  System.err.println(data1[data1.length-1]);
                  
                  if(!data.isEmpty()) {
                	  System.out.println(data);
                  }
                

                }
            }
           
            file.close();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }

    }

}
