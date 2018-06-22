package beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.catalina.connector.Request;

import dal.tblMusteriDAO;
import models.tblmusteri;

@SuppressWarnings("deprecation")
@ManagedBean
@SessionScoped
public class aktivasyonBean {

	private tblMusteriDAO DB = new tblMusteriDAO();
	
	public aktivasyonBean() {
		
		
	}
	
	private String gelenkod;

	public String getGelenkod() {
		String Name = ((HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest()).getParameter("kod"); 
		int uzunluk = Name.split("_").length;
		String[] maillist = Name.split("_");
		String mail="";
		for(int i=0;i<uzunluk;i++) {
			char b = (char)(Integer.parseInt(maillist[i])/13); 
			mail += b;
		}
	 	
		List<tblmusteri> listemusteri = DB.araFull("email", mail, new tblmusteri());
	 	tblmusteri bulunan = null;
		for (tblmusteri item : listemusteri) {
			bulunan = item;
		}
		String result ="";
		if(bulunan!=null)
		{
			bulunan.setDurum(1);
			DB.duzenle(bulunan);
			result = "Aktivasyon Ýþlemi Gerçekleþmiþtir.";
		}
		else
			result="Böyle bir kullanýcý bulunamamýþtýr.";
		return result;
	}

	public void setGelenkod(String gelenkod) {
		this.gelenkod = gelenkod;
	}
	
	
	
	
}
