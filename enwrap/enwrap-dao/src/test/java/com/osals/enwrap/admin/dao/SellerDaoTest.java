package com.osals.enwrap.admin.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.osals.base.dao.GenericDaoTestCase;
import com.osals.enwrap.admin.domain.Seller;

public class SellerDaoTest extends GenericDaoTestCase<Long,Seller, SellerDao> {
	
	@Autowired
	SellerDao sellerDao;

	@Test
	public void test() {
		Seller s = new Seller();
		s.setS_name("test_seller");
		Seller test_seller = this.sellerDao.save(s);
		Long seller_id = test_seller.getId();
		Seller result = this.sellerDao.getOne(seller_id);
		assertEquals(test_seller, result);
		List<Seller> all = this.sellerDao.findAll();
		if (logger.isInfoEnabled()) {
			logger.info("test() - List<Seller> all size ={}", all.size()); //$NON-NLS-1$
		}
	}
}

/**
 * @Description:Excel表格中读取数据并存入Mysql数据库
 *//*
	 * @SuppressWarnings("resource")
	 * 
	 * @Test public void testExcel() throws Exception{ try {
	 * 
	 * //连接Excel表
	 * 
	 * File excelFile=new
	 * File("C:\\Users\\17905\\Desktop\\j2ee\\Seller.xlsx");//创建文件对象 FileInputStream
	 * in=new FileInputStream(excelFile);//文件流 Workbook wb=null; //HSSFWorkbook的实现类
	 * wb=new XSSFWorkbook(in);
	 * 
	 * Sheet sheet=wb.getSheetAt(0); int count=0,cellNum=0;//count计行数 long
	 * mark=4000; for(Row row:sheet) { if(count==0) { //跳过第一行 count++; continue; }
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
	 * sql="insert into T_ADMIN_SELLER(ID,VERSION,S_NAME,S_TELEPHONE) values(?,?,?,?)"
	 * ; PreparedStatement psmt; psmt=(PreparedStatement)conn.prepareStatement(sql);
	 * 
	 * for(int i=0;i<cellNum;i++) { Cell cell=row.getCell(i); Object obj=null;
	 * switch(cell.getCellType()) { case BOOLEAN:
	 * obj=cell.getBooleanCellValue();break; case FORMULA:
	 * obj=cell.getCellFormula();break; case STRING:
	 * obj=cell.getStringCellValue();break; case NUMERIC:
	 * obj=cell.getDateCellValue();break; default: break; } String info=obj+"";
	 * if(i==0) {psmt.setLong(1, mark++); psmt.setLong(2,1);psmt.setString(3,
	 * info.trim());} if(i==1) psmt.setString(4, info.trim());
	 * System.out.println(info); } psmt.executeUpdate(); psmt.close(); }
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