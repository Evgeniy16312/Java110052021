package Lesson8;

public interface Participant {

    boolean run(Barrier barrier);

    boolean jump(Barrier barrier);

    int getRunDistance();

    int getJumpHeight();

    void setRunDistance(int value);

    void setJumpHeight(int value);

    String getName();

}
