package Task10.mixins;

public interface Movable {
    default void move() {
        System.out.println("movement");
    }
}
