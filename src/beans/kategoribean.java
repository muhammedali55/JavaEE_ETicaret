package beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import dal.tblCatDAO;
import models.tblcategori;
@SuppressWarnings("deprecation")
@ManagedBean
@SessionScoped
public class kategoribean {

	private String kategoriadi;
	private List<tblcategori> klist = new ArrayList<>();
	private int silnecekid=0;
	tblCatDAO db = new tblCatDAO();
	
	public void ekle() {
		
		tblcategori model = new tblcategori();
		model.setAd(kategoriadi);
		model.setSil_id(1);
		db.kaydet(model);	
		kategoriadi="";
	}

	public void sil() {
		
		if(silnecekid!=0) {
			db.sil(silnecekid);			
		}
		
	}
	
	
	
	public int getSilnecekid() {
		return silnecekid;
	}

	public void setSilnecekid(int silnecekid) {
		this.silnecekid = silnecekid;
	}

	public tblCatDAO getDb() {
		return db;
	}

	public void setDb(tblCatDAO db) {
		this.db = db;
	}

	public String getKategoriadi() {
		return kategoriadi;
	}

	public void setKategoriadi(String kategoriadi) {
		this.kategoriadi = kategoriadi;
	}

	public List<tblcategori> getKlist() {
		return db.listA(new tblcategori());
	}

	public void setKlist(List<tblcategori> klist) {
		this.klist = klist;
	}
	
}
