package Lesson8;

public class Wall extends Barrier {

    private int heigth;

    public Wall(String name, int heigth) {
        super(name);
        this.heigth = heigth;
    }

    @Override
    protected boolean moving(Participant participant) {
       return participant.jump(this);
    }

    @Override
    protected int getBarrierValue() {
        return heigth;
    }
}
