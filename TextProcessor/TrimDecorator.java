public class TrimDecorator implements TextProcessor{
    protected TextProcessor decoratedShape;
    public TrimDecorator (TextProcessor decoratedShape){
        this.decoratedShape = decoratedShape;
    }
    @Override
    public String process(String text){
        return text.trim();
    }
}
