package strategy;

public record Tiger(MoveStrategy moveStrategy) implements AnimalAction, Movable {
    @Override
    public void makeSound() {
        System.out.println(SoundType.ROAR);
    }

    @Override
    public void move() {
        moveStrategy.move();
    }
}
