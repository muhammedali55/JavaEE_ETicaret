package beans;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import dal.tblCatDAO;
import dal.tblUrunDAO;
import models.tblcategori;
import models.tblurun;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

@SuppressWarnings("deprecation")
@ManagedBean
@SessionScoped
public class urunBean {

	
	List<tblurun> listem = new ArrayList<>();
	List<tblcategori> listeC = new ArrayList<>();
	private String ad;
	private String fiyat;
	private int kategoriid;
	private String aciklama;
	private String kategoriadi;
	private int silinecekid=0;
	tblUrunDAO DataB = new tblUrunDAO();
		
	tblCatDAO Cdb = new tblCatDAO();
		
	public void kaydet() {
		
		tblurun item = new tblurun();
		item.setAciklama(aciklama);
		item.setAd(ad);
		item.setFiyat(fiyat);
		item.setKategori_id(kategoriid);
		item.setSil_id(1);
		DataB.kaydet(item);
		ad="";
		fiyat="";
		kategoriid=0;
		aciklama="";
		
		
	}
	
	public void sil() {
		
		if(silinecekid!=0) {
			
			DataB.sil(silinecekid);
			silinecekid=0;
		}
		
	}
	
	
	
	
	public int getSilinecekid() {
		return silinecekid;
	}

	public void setSilinecekid(int silinecekid) {
		
		this.silinecekid = silinecekid;
	}

	public String getKategoriadi() {
		return kategoriadi;
	}



	public void setKategoriadi(String kategoriadi) {
		this.kategoriadi = kategoriadi;
	}



	public String getAd() {
		return ad;
	}


	public void setAd(String ad) {
		this.ad = ad;
	}


	public String getFiyat() {
		return fiyat;
	}


	public void setFiyat(String fiyat) {
		this.fiyat = fiyat;
	}


	public int getKategoriid() {
		return kategoriid;
	}


	public void setKategoriid(int kategoriid) {
		this.kategoriid = kategoriid;
	}


	public String getAciklama() {
		return aciklama;
	}


	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}


	public List<tblcategori> getListeC() {
		return Cdb.listA(new tblcategori());
	}


	public void setListeC(List<tblcategori> listeC) {
		this.listeC = listeC;
	}


		public List<tblurun> getListem() {
		return DataB.listA(new tblurun());
	}


	public void setListem(List<tblurun> listem) {
		this.listem = listem;
	}

	
	
	
	
	
	

	
		
}
