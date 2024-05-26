package Question_3;

class BoldDeco extends TextDeco {
    public BoldDeco(TextPart textPart) {
        super(textPart);
    }
    @Override
    public String format() {
        return super.format() + ", bold";
    }
}
