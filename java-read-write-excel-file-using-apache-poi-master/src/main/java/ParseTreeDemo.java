import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ParseTreeDemo {
	private static final int NUM_COLUMNS = 4;

	public static void main(String[] args) {

		try {
			// FileInputStream file = new FileInputStream(new File("sample-xlsx-file.xlsx"));
			FileInputStream file = new FileInputStream(new File("projectItemaiZationSheet-2.xlsx"));

			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheetAt(0);
			

			// Use a column marker to save the 'farthest' column so far
			int currColMarker = -1;
			List<String> list = new ArrayList<>();

			// Iterate through each rows one by one
			Iterator<Row> rowIterator = sheet.iterator();
			Cell cell = null;
			StringBuilder sb = null;
			

			while (rowIterator.hasNext()) {
				Row row = rowIterator.next();
				if (cell == null  )
			continue;
					for (int currCol = 0; currCol < NUM_COLUMNS; currCol++) {
						cell = row.getCell(currCol);
						if (cell == null || cell.getCellTypeEnum() == CellType.BLANK)
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
					// String[] arrOfStr = data.split(">>");
					// System.out.println(data);
					// String[] removeDelemeterData=data.split("~");
					// System.out.println(Arrays.toString(removeDelemeter));
					/*
					 * for(int i=1;i<data.length()-1;i++) { if(data.contains("~") == false) {
					 * parentId=0; itemType="item"; System.out.println(data); } }
					 */
					/*
					 * for (String a : arrOfStr) {}
					 */
					// System.out.println(a);
					if (data.contains(">>") == true) {
						String index[] = data.split(">>");
						// System.out.println(data1.length+":::::::::::::::");
						for (int i = 0; i < index.length; i++) {

							parentId = index.length - 1;
							itemType = "Division";
							// itemTypeId=2;

						}

						System.out.println(
								data + "::::::::::PARENTID::::" + parentId + ":::::::ITEMTYPE:::::::::" + itemType);

					}

					if (data.contains(">>") == false) {
						parentId = 0;
						itemType = "Element";
						// itemTypeId=1;
						System.out.println(data + ":::ITEMTYPEID=" + itemTypeId + "::::::ITEMTYPE=" + itemType
								+ ":::::::::PARENTID=" + parentId + "");

					
				}
			

				// System.out.println(data.replaceAll(">>","<span class=\"text-dark p-l-10
				// p-r-10\"><i class=\"mdi mdi-chevron-double-right\"></i></span>"));

				 System.out.println(sb.toString());

			}

			/*
			 * for(int i=0;i<sb.length();i++) {
			 * System.out.println(sb.toString().split("~")); }
			 */
			file.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}