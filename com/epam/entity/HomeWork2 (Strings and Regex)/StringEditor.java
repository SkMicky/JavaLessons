package WorkWithStrings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringEditor {

    StringBuilder sb = new StringBuilder();

    private static String SENTENCE_REGEX = "\\p{Pe}";

    public void setStringBuilder(StringBuilder sb){
        this.sb = sb;
    }

    String testText;

    Pattern pattern = Pattern.compile(SENTENCE_REGEX);
    String[] sentence = pattern.split(testText);

    void textConvertation(String replacementString, int necessaryWordLength){
        final String WORDS_REGEX = "\\s+\\w"+"{"+necessaryWordLength +"}+\\s";
        Pattern wordPattern = Pattern.compile(WORDS_REGEX);
        String result = "";
        for(String words:sentence){
            Matcher m = wordPattern.matcher(words);
            if(m.find()){
                result = testText.replaceAll(WORDS_REGEX, " " + replacementString + " ");
            }
        }
        System.out.println(result);
    }

    public void setTestText(String testText) {
        this.testText = testText;
    }
}
