package Task10.mixins;

public interface Voiceable {
    default void voice() {
        System.out.println("voice");
    }
}
