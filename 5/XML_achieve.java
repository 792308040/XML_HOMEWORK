package text;
import java.io.FileOutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.crimson.tree.XmlDocument;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;


public class XML_Interface_achieve {
	//遍历xml文档
	     
	    public static void queryXml(){
	        try{
	            //得到DOM解析器的工厂实例
	            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	            //从DOM工厂中获得DOM解析器
	            DocumentBuilder dbBuilder = dbFactory.newDocumentBuilder();
	            //把要解析的xml文档读入DOM解析器
	            Document doc = dbBuilder.parse("src\\text\\root.xml");
	            System.out.println("处理该文档的DomImplementation对象  = "+ doc.getImplementation());
	            //得到文档名称为Student的元素的节点列表
	            NodeList nList = doc.getElementsByTagName("Root");
	            
	            //遍历该集合，显示结合中的元素及其子元素的名字
	            System.out.println("解析结果显示：");
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
