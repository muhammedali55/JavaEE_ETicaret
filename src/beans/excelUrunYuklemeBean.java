package beans;

import java.io.File;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

import dal.tblUrunDAO;
import models.tblurun;

@ManagedBean
@SessionScoped
public class excelUrunYuklemeBean {

	 //AÇIKLAMA SATIRI EKLENECEK TÜM SAYFAYA
	 public static XSSFSheet xlsTablo ;
	 

		public void XLSDosyaAl(FileUploadEvent event) throws Exception {

			
			UploadedFile uploadedFile = (UploadedFile) event.getFile();
			
			File dosya= new File("tmp.xlsx");
			FileUtils.copyInputStreamToFile(uploadedFile.getInputstream(), dosya);
		
			
			XSSFWorkbook workbook = new XSSFWorkbook(dosya);
			
			xlsTablo = workbook.getSheetAt(0);
	 
			 
			workbook.close();
		}
		
		
		public void XSLSistemeAktar() throws Exception{
			
		
			int rowNum = xlsTablo.getLastRowNum() + 1;
			
			tblUrunDAO DB = new tblUrunDAO();
			tblurun urun;
			for (int i = 1; i < rowNum; i++) {
				
				Row row = xlsTablo.getRow(i);
		
				 if(row == null){
					 
				 }else{
					 				 
					 if(row.getCell(0) != null && row.getCell(2)!=null && row.getCell(1)!=null);
					
					 
					
					 urun = new tblurun();
					 urun.setAd(row.getCell(0).getStringCellValue());
					 urun.setAciklama(row.getCell(2).getStringCellValue());
					 urun.setFiyat(row.getCell(5).getNumericCellValue()+"");
					 urun.setKategori_id((int)row.getCell(3).getNumericCellValue());
					 urun.setKategoriadi(row.getCell(4).getStringCellValue());
					 urun.setKod(row.getCell(1).getStringCellValue());
					 urun.setSil_id((int)row.getCell(6).getNumericCellValue());
					 DB.kaydet(urun);
					 //dao.ExcelGuncelle((int)row.getCell(0).getNumericCellValue(), row.getCell(2).getStringCellValue(), row.getCell(1).getStringCellValue());
					
				 }
			
						
				
			}
			
			// FacesContext context = FacesContext.getCurrentInstance();
	         
		   //  context.addMessage(null, new FacesMessage("Sisteme Aktarým Mesajý",  "Ýþlem Baþarý ile Gerçekleþtirilmiþtir. ") );
			
		}


	
	
}
