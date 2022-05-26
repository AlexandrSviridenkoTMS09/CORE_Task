package Task9.mixins;

public interface Movable {
    default void move() {
        System.out.println("Movement");
    }
}
