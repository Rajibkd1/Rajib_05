package Question_3;

public class PlainText implements TextPart{
    private String text;
    public PlainText(String text) {
        this.text = text;
    }
    @Override
    public String getText() {
        return text;
    }
    @Override
    public String format() {
        return text + "->";
    }
}
