#include <iostream>  
#include "tinystr.h"  
#include "tinyxml.h"  
#include <string>  

using namespace std;

void readXml() 
{
	const char * xmlFile = "Library.xml";
	TiXmlDocument doc;
	if (doc.LoadFile(xmlFile)) {//��a.xml�ļ�
		doc.Print();
	}
	else {
		cout << "can not parse Library.xml" << endl;//��ʧ�ܵ�������
		return;
	}
	TiXmlElement* libraryElement = doc.RootElement();  //libraryԪ��  Ҳ���Ǹ�Ԫ��
	TiXmlElement* bookElement = libraryElement->FirstChildElement();  // bookԪ��  ��Ԫ�صĵ�һ������Ԫ��
	TiXmlAttribute* bookid = bookElement->FirstAttribute();  //���book��id����  
	cout << bookid->Name() << " : " << bookid->Value() << std::endl;  //��ʾbook������
	TiXmlElement* TietleElement = bookElement->FirstChildElement();//���TietleElement   title��book�ĵ�һ������ 

	for (; TietleElement != NULL; TietleElement = TietleElement->NextSiblingElement()) {  
		//��title�����ֵܽڵ㣬ѭ��һֱ����
		string contactType = TietleElement->Value();
		string contactValue = TietleElement->GetText();
		cout << contactType << " : " << contactValue << std::endl;//��ʾ��ǩ��ֵ
	}

	TiXmlElement* memberElement = bookElement->NextSiblingElement();  // memberԪ��   �Ǹ��ڵ�ĵڶ������ӣ�Ҳ����book�ڵ���ֵ�
	TiXmlElement* nameElement = memberElement->FirstChildElement();//name��member�ĵ�һ������
	TiXmlElement* FirstnameElement = nameElement->FirstChildElement();//Firstname����name�ĵ�һ������

	for (; FirstnameElement != NULL; FirstnameElement = FirstnameElement->NextSiblingElement()) {
		//��Firstname�����ֵܽڵ㣬ѭ��һֱ����
		string contactType = FirstnameElement->Value();
		string contactValue = FirstnameElement->GetText();
		cout << contactType << " : " << contactValue << std::endl;//��ʾ��ǩ��ֵ
	}

	TiXmlElement* addressElement = nameElement->NextSiblingElement();//addressԪ��   ��member�ĵڶ������ӣ�Ҳ����name�ڵ���ֵ�
	TiXmlElement* HouseNumberElement = addressElement->FirstChildElement();//Housenumber��address�ĵ�һ������

	for (; HouseNumberElement != NULL; HouseNumberElement = HouseNumberElement->NextSiblingElement()) {
		//��Housenumber�����ֵܽڵ㣬ѭ��һֱ����
		string contactType = HouseNumberElement->Value();
		string contactValue = HouseNumberElement->GetText();
		cout << contactType << " : " << contactValue << std::endl;//��ʾ��ǩ��ֵ
	}
}

int main() {
	readXml();
	system("pause");
	return 0;
}