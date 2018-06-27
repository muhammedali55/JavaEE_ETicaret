package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import dal.tblUrunDAO;
import models.tblurun;
import util.StaticValues;

@SuppressWarnings("deprecation")
@ManagedBean
@SessionScoped
public class urunDetailBean {

	tblUrunDAO DB = new tblUrunDAO();
	
	private tblurun urun= new tblurun();

	public urunDetailBean() {
		System.out.println("gelen id...:"+ StaticValues.secilenurun);
		urun = DB.bul(StaticValues.secilenurun, new tblurun());
	}
	
	public tblurun getUrun() {
		
		return urun;
	}

	public void setUrun(tblurun urun) {
		this.urun = urun;
	}
	
	
	
	
}
