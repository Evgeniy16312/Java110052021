package Lesson8;

public abstract class Barrier {

    private String name;

    public Barrier(String name) {
        this.name = name;
    }

    protected abstract boolean moving(Participant participant);

    protected abstract int getBarrierValue();

    public String getName() {
        return name;
    }
}
