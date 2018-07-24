package WorkWithStrings;

public class Main {

    public static void main(String[] args) {
        String testText = "Hi, I'm Tiffany. I am from California and I am here " +
                "to meet new people and visit some places.";
        //**  VARIANT A  TASK 19    **//
        StringBuilder sb = new StringBuilder("Hi, I'm Tiffany. I am from California and I am here " +
        "to meet new people and visit some places.");
        StringEditor stringEditor = new StringEditor();
        stringEditor.setTestText(testText);
        stringEditor.textConvertation("котозябра", 3);

        //** VARIANT B   TASK 16    **//
        /*WordConverter wordConverter = new WordConverter();
        wordConverter.setInputString(testText);
        wordConverter.convertation();*/

        //**  VARIANT C   TASK 8     **//
        /*TextFormatter textFormatter = new TextFormatter();
        textFormatter.setInputString(testText);
        textFormatter.setNecessaryStrLength(10);
        textFormatter.getFormatedText(testText);*/

    }

}
