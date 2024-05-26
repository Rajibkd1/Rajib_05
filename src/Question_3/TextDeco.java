package Question_3;

abstract class TextDeco implements TextPart {
    protected TextPart textPart;
    public TextDeco(TextPart textPart) {
        this.textPart = textPart;
    }
    @Override
    public String getText() {
        return textPart.getText();
    }
    @Override
    public String format() {
        return textPart.format();
    }
}
