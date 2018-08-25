package parser;

import entity.Client;
import entity.Terminal;
import entity.TerminalAdress;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Date;

public class StAXParser {

    public boolean parse(String xmlFileName) {

        Terminal terminal = null;
        TerminalAdress terminalAdress = null;
        Client client = null;
        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();

        try{
            XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(new FileInputStream(xmlFileName));

            while(xmlEventReader.hasNext()){
                XMLEvent xmlEvent = xmlEventReader.nextEvent();

                if(xmlEvent.isStartElement()){
                    StartElement startElement = xmlEvent.asStartElement();

                    if(startElement.getName().getLocalPart().equals("Terminal")){
                        terminal = new Terminal();

                        Attribute id = startElement.getAttributeByName(new QName("id"));

                        if(id != null){
                            terminal.setId(Integer.parseInt(id.getValue()));
                        }
                    } else if(startElement.getName().getLocalPart().equals("nameOfService")) {
                        xmlEvent = xmlEventReader.nextEvent();
                        terminal.setNameOfService(xmlEvent.asCharacters().getData());
                    } else if(startElement.getName().getLocalPart().equals("dateOfMadenService")) {
                        xmlEvent = xmlEventReader.nextEvent();
                        terminal.setDateOfMadenService(Date.valueOf(xmlEvent.asCharacters().getData()));
                    } else if(startElement.getName().getLocalPart().equals("amount")) {
                        xmlEvent = xmlEventReader.nextEvent();
                        terminal.setAmount(Integer.parseInt(xmlEvent.asCharacters().getData()));
                    }

                    if(startElement.getName().getLocalPart().equals("TerminalAdress")){
                        terminalAdress = new TerminalAdress();
                    } else if(startElement.getName().getLocalPart().equals("city")) {
                        xmlEvent = xmlEventReader.nextEvent();
                        terminalAdress.setCity(xmlEvent.asCharacters().getData());
                    } else if(startElement.getName().getLocalPart().equals("street")) {
                        xmlEvent = xmlEventReader.nextEvent();
                        terminalAdress.setStreet(xmlEvent.asCharacters().getData());
                    } else if(startElement.getName().getLocalPart().equals("building")) {
                        xmlEvent = xmlEventReader.nextEvent();
                        terminalAdress.setBuilding(Integer.parseInt(xmlEvent.asCharacters().getData()));
                    }

                    if(startElement.getName().getLocalPart().equals("Client")){
                        client = new Client();

                        Attribute id = startElement.getAttributeByName(new QName("id"));

                        if(id != null){
                            client.setId(Integer.parseInt(id.getValue()));
                        }
                    } else if(startElement.getName().getLocalPart().equals("lastName")) {
                        xmlEvent = xmlEventReader.nextEvent();
                        client.setLastName(xmlEvent.asCharacters().getData());
                    } else if(startElement.getName().getLocalPart().equals("firstName")) {
                        xmlEvent = xmlEventReader.nextEvent();
                        client.setFirstName(xmlEvent.asCharacters().getData());
                    } else if(startElement.getName().getLocalPart().equals("parentName")) {
                        xmlEvent = xmlEventReader.nextEvent();
                        client.setParentName(xmlEvent.asCharacters().getData());
                    } else if(startElement.getName().getLocalPart().equals("phoneNumber")) {
                        xmlEvent = xmlEventReader.nextEvent();
                        client.setPhoneNumber(xmlEvent.asCharacters().getData());
                    }
                }
                if (xmlEvent.isEndElement()) {
                    EndElement endElement = xmlEvent.asEndElement();
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return true;
    }
}
