package text;

import java.io.File;
import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;


public class xml{
  public static void main(String [] args){
	  
	 try {
		 
	 DocumentBuilderFactory factory =  DocumentBuilderFactory.newInstance();
	 DocumentBuilder builder = factory.newDocumentBuilder();
		 
         Document document = builder.newDocument();	
	 //��������������ֵ
         Element root = document.createElement("Team");
     //������һ�����ڵ㡢��ֵ
		 Element TeamMember = document.createElement("TeamMember");
		 Element Empno = document.createElement("Empno");
		 Empno.setAttribute("value", "30772");
		 Element Name = document.createElement("Name");
		 Name.setAttribute("value", "Manjeet Singh");
		 Element Designation=document.createElement("Designation");
		 Designation.setAttribute("value", "Team Leader");
		 TeamMember.appendChild(Empno);
		 TeamMember.appendChild(Name);
		 TeamMember.appendChild(Designation);
		
	//��ӵ������С�
		 root.appendChild(TeamMember);
         document.appendChild(root);
		 
    //���������ڴ���ת��ָ��Լ�ִ�д�Դ�������ת����
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		
		transformer.setOutputProperty("encoding", "UTF-8");
		transformer.setOutputProperty(OutputKeys.INDENT,"yes");
		document.setXmlStandalone(true);
		

		StringWriter writer = new StringWriter();
		transformer.transform(new DOMSource(document), new StreamResult(writer));
		
		System.out.println(writer.toString());
		
		transformer.transform(new DOMSource(document), new StreamResult(new File("F:\\JAVA\\eclipseLODG\\JavaDom1\\text\\DOM_Create_Xml.xml")));   
		
		
		
		
		
	} catch (ParserConfigurationException | TransformerException e) {
		e.printStackTrace();
	}
  }
}
