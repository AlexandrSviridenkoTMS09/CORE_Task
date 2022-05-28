package Task9.mixins;

public interface Starveable {
    default void isHungry() {
        System.out.println("Not hungry");
    }
}
