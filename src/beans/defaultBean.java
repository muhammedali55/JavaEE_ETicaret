package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class defaultBean {

	
	
	
	public void sec(int id) {
		switch (id) {
		case 1: url="urun.xhtml";	break;
		case 2: url="urunekleme.xhtml";break;
		default: url="";			break;
		}
		
	}
	
	
	
	private String url="";

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	
	
}
