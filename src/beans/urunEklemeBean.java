package beans;



import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import dal.tblUrunDAO;
import models.tblurun;


@SuppressWarnings("deprecation")
@ManagedBean
@SessionScoped
public class urunEklemeBean {

		private List<tblurun> listeUrun;
		
		private tblurun urun = new tblurun();
		
		private tblUrunDAO db = new tblUrunDAO();
		public urunEklemeBean() {
		//	listeUrun = new ArrayList<>();
		//	
		//	tblurun item = new tblurun();
		//	
		//	item.setAd("Bilgisayar");
		//	item.setKod("bil0001mrv");
		//	item.setAciklama("Hp pavillion laptop i7 3,4ghz");
		//	db.kaydet(item);
		//	listeUrun.add(item);
		//	
		//	 item = new tblurun();
		//		
		//		item.setAd("Yazýcý");
		//		item.setKod("bil0002mrv");
		//		item.setAciklama("Lexmark 811");
		//		db.kaydet(item);
		//		listeUrun.add(item);
		//		
		//		 item = new tblurun();
		//		
		//			item.setAd("Monitör");
		//			item.setKod("bil0003mrv");
		//			item.setAciklama("Samsung 27' wide screen");
		//			db.kaydet(item);
		//			listeUrun.add(item);
		//			
		//			System.err.println("KAYIT TAMAM");
			
		}
	
		
		public void kaydet() {
			System.out.println("buradayým");
			saveMessage();
		}
		
		
		 public void saveMessage() {
		        FacesContext context = FacesContext.getCurrentInstance();
		         
		        context.addMessage(null, new FacesMessage("Successful",  "Kayýt Yapýldý ") );
		        
		    }
		
		public tblurun getUrun() {
			return urun;
		}


		public void setUrun(tblurun urun) {
			this.urun = urun;
		}


		public List<tblurun> getListeUrun() {
			return db.listele(new tblurun());
		}

		public void setListeUrun(List<tblurun> listeUrun) {
			this.listeUrun = listeUrun;
		}
		
		
		
	
}
