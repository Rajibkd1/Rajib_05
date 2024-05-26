package Question_3;

public class TextDesign {
    public static void main(String[] args) {
        TextPart myText = new PlainText("I am a DP");
        System.out.println(myText.format());

        myText = new BoldDeco(myText);
        System.out.println(myText.format());
        myText = new ItalicDeco(myText);
        System.out.println(myText.format());

        myText = new UnderlineDeco(myText);
        System.out.println(myText.format());
        TextPart newText = new PlainText("This is New text");
        newText = new BoldItalicDeco(newText);
        System.out.println(newText.format());
    }
}
