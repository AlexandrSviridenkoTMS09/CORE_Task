package Task9.mixins;

public interface Voiceable {
    default void voice() {
        System.out.println("Voice");
    }
}
