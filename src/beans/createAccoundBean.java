package beans;

import java.util.Properties;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

@ManagedBean
@SessionScoped
public class createAccoundBean {

	private String isim;
	private String email;
	private String telefon;
	private String sifre1;
	private String sifre2;
	private String durum;

	
	
		public void mailyolla() {
			System.out.println("Buradayız");
		 // email ID of Recipient.
	      String recipient = "muhammedali55@gmail.com";
	 
	      // email ID of  Sender.
	      String sender = "vektorelbilisim@gmail.com";
	 
	      // using host as localhost
	      String host = "127.0.0.1";
	 
	      // Getting system properties
	      Properties properties = System.getProperties();
	 
	      // Setting up mail server
	      properties.setProperty("mail.smtp.host", host);
	 
	      // creating session object to get properties
	      Session session = Session.getDefaultInstance(properties);
	 
	      try
	      {
	         // MimeMessage object.
	         MimeMessage message = new MimeMessage(session);
	 
	         // Set From Field: adding senders email to from field.
	         message.setFrom(new InternetAddress(sender));
	 
	         // Set To Field: adding recipient's email to from field.
	         message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
	 
	         // Set Subject: subject of the email
	         message.setSubject("Üyelik Kayıt Bilgileri");
	 
	         // set body of the email.
	         message.setText(" Kullanıcı Adı..:"+isim+
	        		 		 " Telefon........:"+telefon+
	        		 		 " Şifren.........:"+sifre1
	        		 );
	 
	         // Send email.
	         Transport.send(message);
	         System.out.println("Mail successfully sent");
	      }
	      catch (MessagingException mex) 
	      {
	         mex.printStackTrace();
	      }
		
	}


	
		
		public String getDurum() {
			return durum;
		}
		public void setDurum(String durum) {
			this.durum = durum;
		}
		public String getIsim() {
			return isim;
		}


		public void setIsim(String isim) {
			this.isim = isim;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public String getTelefon() {
			return telefon;
		}


		public void setTelefon(String telefon) {
			this.telefon = telefon;
		}


		public String getSifre1() {
			return sifre1;
		}


		public void setSifre1(String sifre1) {
			this.sifre1 = sifre1;
		}


		public String getSifre2() {
			return sifre2;
		}


		public void setSifre2(String sifre2) {
			this.sifre2 = sifre2;
		}

		
		
		
}
