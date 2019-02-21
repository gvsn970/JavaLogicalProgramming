import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ParseTreeDemoForRemoveDuplicates {
	private static final int NUM_COLUMNS = 4;

	public static void main(String[] args) {

		try {
			 FileInputStream file = new FileInputStream(new File("sample-xlsx-file.xlsx"));
		//FileInputStream file = new FileInputStream(new File("emptyfile.xlsx"));
			// FileInputStream file = new FileInputStream(new File("duplicate-Sheet.xlsx"));

			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheetAt(0);
			for(int i = 0; i < workbook.getNumberOfSheets(); i++){
			       System.out.println("Sheet " + i + " has data: " + isSheetEmpty(workbook.getSheetAt(i)));
			}

			// Use a column marker to save the 'farthest' column so far
			int currColMarker = -1;
			List<String> list = new ArrayList<>();

			// Iterate through each rows one by one
			Iterator<Row> rowIterator = sheet.iterator();
			Cell cell = null;
			StringBuilder sb = null;
			

			while (rowIterator.hasNext()) {
				Row row = rowIterator.next();
			
					for (int currCol = 0; currCol < NUM_COLUMNS; currCol++) {
						cell = row.getCell(currCol);
						if (cell == null )
							continue;
						if (cell.getCellType() == Cell.CELL_TYPE_STRING) {

							if (currCol > currColMarker) {

								// A farther column, simply append and
								// update column marker
								currColMarker = currCol;

								list.add(cell.getStringCellValue());
							} else if (currCol == currColMarker) {

								// At same level as column marker
								// Remove old value at same level, before appending
								list.remove(list.size() - 1);
						
								list.add(cell.getStringCellValue());
							} else {

								// At a 'nearer' column, remove those values beyond
								// this level before appending
								currColMarker = currCol;

								list = list.subList(0, currCol);
								list.add(cell.getStringCellValue());
								System.out.println(list.toString());
							}
						}
					}
					int parentId = 0;
					String itemType = null;
					int itemTypeId = 0;
					// For displaying the current contents
					sb = new StringBuilder();
					for (String s : list) {
						if (sb.length() != 0) {
							sb.append(">>");
						}
						sb.append(s);
					}

					String data = sb.toString();
				
					if (data.contains(">>") == true) {
						String index[] = data.split(">>");
						for (int i = 0; i < index.length; i++) {
							//parentId = index.length - 1;
							//itemType = "Division";
						}

						//System.out.println(data);
						
					}

					if (data.contains(">>") == false) {
						parentId = 0;
						itemType = "Element";
						// itemTypeId=1;
						//System.out.println(data);

				}
					
			
			}

		
			file.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	public static boolean isSheetEmpty(XSSFSheet xssfSheet){
	       Iterator rows = xssfSheet.rowIterator();
	       while (rows.hasNext()) {
	           HSSFRow row = (HSSFRow) rows.next();
	           Iterator cells = row.cellIterator();
	           while (cells.hasNext()) {
	                HSSFCell cell = (HSSFCell) cells.next();
	                if(!cell.getStringCellValue().isEmpty()){
	                    return true;
	                }
	           }
	       }
	       return false;
	}
}