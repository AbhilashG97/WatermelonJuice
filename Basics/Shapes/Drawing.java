public class Drawing {

    private Strategy strategy;

    public Drawing(Strategy strategy){
        this.strategy = strategy;
    }

    public void setShape(Strategy strategy){
        this.strategy = strategy;
    }

    public void drawShape(){
        strategy.draw();
    }

}