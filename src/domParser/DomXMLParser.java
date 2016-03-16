package domParser;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * 
 * @author Bhavin
 * @since 15/03/2016; 19:58
 */

public class DomXMLParser {
	
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException{
		String location = "F:\\Cloudwick\\java_Cloudwick\\XML Parser\\data.xml";
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		
		Document document = builder.parse(new File(location));
		
		List<Employee> employees = new ArrayList<Employee>();
		NodeList nodeList = document.getDocumentElement().getChildNodes();
		
		for (int i = 0; i < nodeList.getLength(); i++) {
			Node node = nodeList.item(i);
			
			if (node.getNodeType() == Node.ELEMENT_NODE){
				Element element = (Element) node ;
				
				  // Get the value of the ID attribute.
				  String ID = node.getAttributes().getNamedItem("ID").getNodeValue();
				  
				  // Get the value of the Firstname attribute
				  String firstName = element.getElementsByTagName("Firstname").item(0).getChildNodes()
						  .item(0).getNodeValue();
				  
				  // Get the value of the Lastname attribute
				  String lastName = element.getElementsByTagName("Lastname").item(0).getChildNodes()
						  .item(0).getNodeValue();
				  
				  // Get the value of Age attribute
				  Integer age = Integer.parseInt(element.getElementsByTagName("Age").item(0).getChildNodes()
						  .item(0).getNodeValue());
				  
				  // Get the value of Salary attribute
				  Double salary = Double.parseDouble(element.getElementsByTagName("Salary").item(0).getChildNodes()
						  .item(0).getNodeValue());
				  
				  employees.add(new Employee(ID, firstName, lastName, age, salary));
				  
				
			}
			
					
		}
		for (Employee empl : employees){
			System.out.println(empl);
		}
	}
	

}
