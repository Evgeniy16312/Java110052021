package Lesson8;

public class Human implements Participant {

    private String name;
    private int runDistance;
    private int jumpHeight;

    public Human(String name) {
        this.name = name;

    }

    @Override
    public boolean run(Barrier barrier) {
        if (barrier.getBarrierValue() <= runDistance) {
            System.out.println(this.name + " пробежал " + barrier.getName());
            return true;
        } else {
            System.out.println(this.name + " не пробежал " + barrier.getName());
            return false;
        }
    }

    @Override
    public boolean jump(Barrier barrier) {
        if (barrier.getBarrierValue() <= jumpHeight) {
            System.out.println(this.name + " перепгрыгнул " + barrier.getName());
            return true;
        } else {
            System.out.println(this.name + " не перепгрыгнул " + barrier.getName());
            return false;
        }
    }

    @Override
    public int getRunDistance() {
        return this.runDistance;
    }

    @Override
    public int getJumpHeight() {
        return this.jumpHeight;
    }

    @Override
    public void setRunDistance(int value) {
        this.runDistance = value;
    }

    @Override
    public void setJumpHeight(int value) {
        this.jumpHeight = value;
    }

    @Override
    public String getName() {
        return name;
    }
}
