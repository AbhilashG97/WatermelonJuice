public class Demo {

    // Demo of Dependency Injection

    public static void main(String[] args) {
        Drawing drawing = new Drawing(new Square());
        drawing.drawShape();
        drawing.setShape(new Circle());
        drawing.drawShape();
        
    }
}