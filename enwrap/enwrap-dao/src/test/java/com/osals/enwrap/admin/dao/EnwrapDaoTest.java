package com.osals.enwrap.admin.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.osals.base.dao.GenericDaoTestCase;
import com.osals.enwrap.admin.domain.Enwrap;

public class EnwrapDaoTest extends GenericDaoTestCase<Long, Enwrap, EnwrapDao>{
	
	@Autowired
	EnwrapDao enwrapDao;

	@Test
	public void testFindAll() {

		List<Enwrap> result = this.enwrapDao.findAll();
		if (logger.isInfoEnabled()) {
			logger.info("testFindAll() - List<Enwrap> result={}", result); //$NON-NLS-1$
		}

	}
}

/*
*//**
	 * @Description:Excel表格中读取数据并存入Mysql数据库
	 *//*
		 * @SuppressWarnings("resource")
		 * 
		 * @Test public void testExcel() throws Exception{ try {
		 * 
		 * //连接Excel表
		 * 
		 * File excelFile=new
		 * File("C:\\Users\\17905\\Desktop\\j2ee\\Enwrap.xlsx");//创建文件对象 FileInputStream
		 * in=new FileInputStream(excelFile);//文件流 Workbook wb=null; //HSSFWorkbook的实现类
		 * wb=new XSSFWorkbook(in);
		 * 
		 * Sheet sheet=wb.getSheetAt(0); int count=0,cellNum=0;//count计行数 long
		 * mark=3000; for(Row row:sheet) { if(count==0) { //跳过第一行 count++; continue; }
		 * if(row.getCell(0)==null) break;//若为空行，则该表格已读完，跳出循环
		 * cellNum=row.getLastCellNum();//得到列数 //Customer customer=new Customer();
		 * 
		 * 
		 * //创建数据库连接 String driver="com.mysql.cj.jdbc.Driver"; String
		 * url="jdbc:mysql://localhost:3306/enwrap"; String username="root"; String
		 * password="11q22q33q"; Connection conn=null; Class.forName(driver);
		 * conn=(Connection)DriverManager.getConnection(url, username, password);
		 * 
		 * String
		 * sql="insert into T_ADMIN_ENWRAP(ID,VERSION,ADDRESS_END,ADDRESS_ORIGIN,ENWRAP_TYPE) values(?,?,?,?,?)"
		 * ; PreparedStatement psmt; psmt=(PreparedStatement)conn.prepareStatement(sql);
		 * 
		 * for(int i=0;i<3;i++) { Cell cell=row.getCell(i); Object obj=null;
		 * switch(cell.getCellType()) { case BOOLEAN:
		 * obj=cell.getBooleanCellValue();break; case FORMULA:
		 * obj=cell.getCellFormula();break; case STRING:
		 * obj=cell.getStringCellValue();break; case NUMERIC:
		 * obj=cell.getDateCellValue();break; default: break; } String info=obj+"";
		 * if(i==0) {psmt.setLong(1, mark++); psmt.setLong(2,1);psmt.setString(3,
		 * info.trim());} if(i==1) psmt.setString(4, info.trim()); if(i==2)
		 * psmt.setString(5, info.trim()); //if(i==3) psmt.setString(6, info.trim());
		 * //if(i==4) psmt.setString(7, info.trim()); System.out.println(info); }
		 * psmt.executeUpdate(); psmt.close(); }
		 * 
		 * for(Customer c:list) {
		 * System.out.println("id:"+c.getId()+"    name:"+c.getC_name()+"    telephone:"
		 * +c.getC_telephone()); }
		 * 
		 * if (logger.isInfoEnabled()) logger.info("list" ); //$NON-NLS-1$ }
		 * 
		 * } catch (FileNotFoundException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }//文件流 }
		 */