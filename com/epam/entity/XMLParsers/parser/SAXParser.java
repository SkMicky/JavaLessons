package parser;

import entity.Client;
import entity.Terminal;
import entity.TerminalAdress;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.sql.Date;

public class SAXParser {

    public boolean parse(String xmlFileName) {

        class ParserSelf extends DefaultHandler {

            Terminal terminal = new Terminal();
            TerminalAdress terminalAdress = new TerminalAdress();
            Client client = new Client();
            String thisElement = "";

            public Terminal getTerminal() {
                return terminal;
            }

            public TerminalAdress getTerminalAdress() {
                return terminalAdress;
            }

            public Client getClient() {
                return client;
            }

            @Override
            public void startDocument() throws SAXException {
                System.out.println("Start parse XML...");
            }

            @Override
            public void startElement(String namespaceURI, String localName, String qName, Attributes atts) throws
                    SAXException {
                thisElement = qName;
            }

            @Override
            public void endElement(String namespaceURI, String localName, String qName) throws SAXException {
                thisElement = "";
            }

            @Override
            public void characters(char[] ch, int start, int length) throws SAXException {
                if (thisElement.equals("id")) {
                    terminal.setId(new Integer(new String(ch, start, length)));
                }
                if (thisElement.equals("city")) {
                    terminalAdress.setCity(new String(ch, start, length));
                }
                if (thisElement.equals("street")) {
                    terminalAdress.setStreet(new String(ch, start, length));
                }
                if (thisElement.equals("building")) {
                    terminalAdress.setBuilding(new Integer(new String(ch, start, length)));
                }
                if (thisElement.equals("nameOfService")) {
                    terminal.setNameOfService(new String(ch, start, length));
                }
                if (thisElement.equals("Client id")) {
                    client.setId(new Integer(new String(ch, start, length)));
                }
                if (thisElement.equals("lastName")) {
                    client.setLastName(new String(ch, start, length));
                }
                if (thisElement.equals("firstName")) {
                    client.setFirstName(new String(ch, start, length));
                }
                if (thisElement.equals("parentName")) {
                    client.setParentName(new String(ch, start, length));
                }
                if (thisElement.equals("phoneNumber")) {
                    client.setPhoneNumber(new String(ch, start, length));
                }
                if (thisElement.equals("dateOfMadenService")) {
                    terminal.setDateOfMadenService(Date.valueOf(new String(ch, start, length)));
                }
                if (thisElement.equals("amount")) {
                    terminal.setAmount(new Integer(new String(ch, start, length)));
                }
            }

            @Override
            public void endDocument() {
                System.out.println("Stop parse XML...");
            }
        }
        return true;
    }
}
