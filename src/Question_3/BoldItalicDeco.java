package Question_3;

class BoldItalicDeco extends TextDeco {
    public BoldItalicDeco(TextPart textPart) {
        super(textPart);
    }
    @Override
    public String format() {
        return super.format() + ", bold and italic";
    }
}