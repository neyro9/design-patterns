package strategy;

public record Duck(MoveStrategy moveStrategy) implements AnimalAction, Movable {
    @Override
    public void makeSound() {
        System.out.println(SoundType.QUACK);
    }

    @Override
    public void move() {
        moveStrategy.move();
    }
}
