package Lesson8;

import java.util.Random;

public class HomeWork8 {
    public static void main(String[] args) {

        Random rand = new Random();
        Participant[] participants = new Participant[3];
        initParticipants(rand, participants);
        Barrier[] barriers = new Barrier[6];
        initBarriers(rand,barriers);

        for (int i = 0; i < participants.length; i++) {
            System.out.println(participants[i].getName() + " Высота прыжка: " + participants[i].getJumpHeight() +
                    " Длина дистанции: " + participants[i].getRunDistance());
            for (int j = 0; j < barriers.length; j++) {
                System.out.println(barriers[j].getName() + " Значение препятствия: " + barriers[j].getBarrierValue());
                if (!barriers[j].moving(participants[i])) {
                    break;
                }
            }

        }
    }

    public static void initParticipants(Random random, Participant[] participants) {
        Robot robot = new Robot("Robocop");
        Human human = new Human("Evgeniy");
        Cat cat = new Cat("Pushistik");
        participants[0] = robot;
        participants[1] = human;
        participants[2] = cat;
        for (int i = 0; i < participants.length; i++) {
            int maxDistance = random.nextInt(20);
            int maxHeight = random.nextInt(20);
            participants[i].setJumpHeight(maxHeight);
            participants[i].setRunDistance(maxDistance);
        }
    }

    public static void initBarriers (Random random, Barrier[] barriers) {
        int barrierValue;
        boolean isWall;
        for (int i = 0; i < barriers.length; i++) {
            barrierValue = random.nextInt(25);
            isWall = random.nextBoolean();
            if (isWall) {
                barriers[i] = new Wall("Стена №" + i,barrierValue);
            } else {
               barriers[i] = new Track("Беговая дорожка №" + i,barrierValue);
            }
        }
    }
}

