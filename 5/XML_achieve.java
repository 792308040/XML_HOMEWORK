package text;
import java.io.FileOutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.crimson.tree.XmlDocument;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;


public class XML_Interface_achieve {
	//����xml�ĵ�
	     
	    public static void queryXml(){
	        try{
	            //�õ�DOM�������Ĺ���ʵ��
	            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	            //��DOM�����л��DOM������
	            DocumentBuilder dbBuilder = dbFactory.newDocumentBuilder();
	            //��Ҫ������xml�ĵ�����DOM������
	            Document doc = dbBuilder.parse("src\\text\\root.xml");
	            System.out.println("������ĵ���DomImplementation����  = "+ doc.getImplementation());
	            //�õ��ĵ�����ΪStudent��Ԫ�صĽڵ��б�
	            NodeList nList = doc.getElementsByTagName("Root");
	            
	            //�����ü��ϣ���ʾ����е�Ԫ�ؼ�����Ԫ�ص�����
	            System.out.println("���������ʾ��");
	            for(int i = 0; i< nList.getLength() ; i ++){
	                Element node = (Element)nList.item(i);
	                System.out.println("First: "+ node.getElementsByTagName("First").item(0).getFirstChild().getNodeValue());
	                System.out.println("Second: "+ node.getElementsByTagName("Second").item(0).getFirstChild().getNodeValue());
	               
	            }
	            
	        }catch (Exception e) {
	            // TODO: handle exception
	            e.printStackTrace();
	        }
	    }
	    public static void main(String[] args) {
	    	XML_Interface_achieve.queryXml();
	    }

}
