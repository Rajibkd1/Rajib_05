package Question_3;

class UnderlineDeco extends TextDeco {
    public UnderlineDeco(TextPart textPart) {
        super(textPart);
    }
    @Override
    public String format() {
        return super.format() + ", underline";
    }
}