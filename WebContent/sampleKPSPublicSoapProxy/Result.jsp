<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleKPSPublicSoapProxyid" scope="session" class="tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleKPSPublicSoapProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleKPSPublicSoapProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleKPSPublicSoapProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        tr.gov.nvi.tckimlik.WS.KPSPublicSoap getKPSPublicSoap10mtemp = sampleKPSPublicSoapProxyid.getKPSPublicSoap();
if(getKPSPublicSoap10mtemp == null){
%>
<%=getKPSPublicSoap10mtemp %>
<%
}else{
        if(getKPSPublicSoap10mtemp!= null){
        String tempreturnp11 = getKPSPublicSoap10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String TCKimlikNo_1id=  request.getParameter("TCKimlikNo16");
        long TCKimlikNo_1idTemp  = Long.parseLong(TCKimlikNo_1id);
        String ad_2id=  request.getParameter("ad18");
            java.lang.String ad_2idTemp = null;
        if(!ad_2id.equals("")){
         ad_2idTemp  = ad_2id;
        }
        String soyad_3id=  request.getParameter("soyad20");
            java.lang.String soyad_3idTemp = null;
        if(!soyad_3id.equals("")){
         soyad_3idTemp  = soyad_3id;
        }
        String dogumYili_4id=  request.getParameter("dogumYili22");
        int dogumYili_4idTemp  = Integer.parseInt(dogumYili_4id);
        boolean TCKimlikNoDogrula13mtemp = sampleKPSPublicSoapProxyid.TCKimlikNoDogrula(TCKimlikNo_1idTemp,ad_2idTemp,soyad_3idTemp,dogumYili_4idTemp);
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(TCKimlikNoDogrula13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>