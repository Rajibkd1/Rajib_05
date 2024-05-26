package Question_3;

class ItalicDeco extends TextDeco {
    public ItalicDeco(TextPart textPart) {
        super(textPart);
    }
    @Override
    public String format() {
        return super.format() + ", italic";
    }
}

