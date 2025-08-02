public class UpperCaseDecorator implements TextProcessor{
    protected TextProcessor decoratedShape;
    public UpperCaseDecorator (TextProcessor decoratedShape){
        this.decoratedShape = decoratedShape;
    }
    @Override
    public String process(String text){
        return text.toUpperCase();
    }
}
