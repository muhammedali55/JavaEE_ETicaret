package beans;

import javax.faces.bean.ManagedBean;

@SuppressWarnings("deprecation")
@ManagedBean

public class ListenerView {
     
    private String text="";
 
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
     
    public void handleKeyEvent() {
        text = text.toUpperCase();
    }
}