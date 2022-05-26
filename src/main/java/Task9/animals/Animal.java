package Task9.animals;

import Task9.mixins.Movable;
import Task9.mixins.Starveable;
import Task9.mixins.Voiceable;

public abstract class Animal implements Starveable, Movable, Voiceable {
    private String animalName;
    private int footNumber;
    private boolean hasMustache;

    public Animal(){}

    public Animal(String animalName, int footNumber, boolean hasMustache) {
        this.animalName = animalName;
        this.footNumber = footNumber;
        this.hasMustache = hasMustache;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getFootNumber() {
        return footNumber;
    }

    public void setFootNumber(int footNumber) {
        if (footNumber >= 0) {
            this.footNumber = footNumber;
        }
    }

    public boolean isHasMustache() {
        return hasMustache;
    }

    public void setHasMustache(boolean hasMustache) {
        this.hasMustache = hasMustache;
    }
}
