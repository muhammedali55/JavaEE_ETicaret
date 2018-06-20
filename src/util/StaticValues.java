package util;

import javax.annotation.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean
public class StaticValues {

	public static String kullanici;

	public static String getKullanici() {
		return kullanici;
	}

	public static void setKullanici(String kullanici) {
		StaticValues.kullanici = kullanici;
	}
	
	
	
}
