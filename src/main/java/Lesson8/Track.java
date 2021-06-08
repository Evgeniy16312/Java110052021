package Lesson8;

public class Track extends Barrier {

    private int length;

    public Track(String name, int length) {
        super(name);
        this.length = length;
    }

    @Override
    protected boolean moving(Participant participant) {
       return participant.run(this);
    }

    @Override
    protected int getBarrierValue() {
        return length;
    }
}
