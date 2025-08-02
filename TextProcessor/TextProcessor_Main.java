public class TextProcessor_Main {
    public static void main(String[] args)
    {
        TextProcessor  circle = new SimpleTextProcessor();
        TextProcessor  circle1 = new UpperCaseDecorator(new SimpleTextProcessor());
        TextProcessor  circle2 = new TrimDecorator(new SimpleTextProcessor());
        TextProcessor  circle3 = new ReplaceDecorator(new SimpleTextProcessor());
        System.out.println( circle.process(" привет "));
        System.out.println( circle1.process(" привет "));
        System.out.println( circle2.process(" привет "));
        System.out.println( circle3.process(" привет "));
    }
}