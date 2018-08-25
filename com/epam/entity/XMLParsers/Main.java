import parser.SAXParser;
import parser.StAXParser;

public class Main {
    SAXParser saxParser = new SAXParser();
    saxParser.parse();
    StAXParser staxParser = new StAXParser();
    staxParser.parse();
}
