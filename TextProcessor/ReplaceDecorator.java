public class ReplaceDecorator implements TextProcessor{
    protected TextProcessor decoratedShape;
    public ReplaceDecorator (TextProcessor decoratedShape){
        this.decoratedShape = decoratedShape;
    }
    @Override
    public String process(String text){
        return text.replaceAll(" ","_");
    }
}
