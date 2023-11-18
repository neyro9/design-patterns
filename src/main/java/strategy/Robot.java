package strategy;

public record Robot(MoveStrategy moveStrategy) implements Movable {
    @Override
    public void move() {
        moveStrategy.move();
    }
}
