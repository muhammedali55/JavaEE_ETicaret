package util;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean
public class StaticValues {

	public static String kullanici;

	private String user;
	public static String getKullanici() {
		
		return kullanici;
	}

	public static void setKullanici(String kullanici) {
		StaticValues.kullanici = kullanici;
	}

	public String getUser() {
		
		return kullanici;
	}

	public void setUser(String user) {
		this.user = user;
	}
	
	
	
	
}
