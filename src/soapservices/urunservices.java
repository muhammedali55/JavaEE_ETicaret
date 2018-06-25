package soapservices;

import dal.tblUrunDAO;
import models.tblurun;

public class urunservices {
	tblUrunDAO DB = new tblUrunDAO();
	
	public String urunListesi() {
		String veri="";
		for (tblurun item : DB.listA(new tblurun())) {
			veri += item.getId()+","+item.getAd()+","+item.getFiyat()+" : ";
		}
		return veri;
	}
	
}
