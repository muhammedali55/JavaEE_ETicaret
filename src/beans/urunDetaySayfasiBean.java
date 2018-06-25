package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import dal.tblUrunDAO;
import models.tblurun;
import util.StaticValues;

@SessionScoped
@ManagedBean
public class urunDetaySayfasiBean {
	
	tblUrunDAO DB = new tblUrunDAO();
	
	private tblurun urunbilgisi;

	public tblurun getUrunbilgisi() {
		return DB.bul(StaticValues.secilenurun, new tblurun());
	}

	public void setUrunbilgisi(tblurun urunbilgisi) {
		this.urunbilgisi = urunbilgisi;
	}
	
	
	
	
}
