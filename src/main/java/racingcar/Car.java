package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private String name;
    private int distance;

    Car() {
    }

    Car(String name) {
        this.name = name;
    }

    void moveForward() {
        distance++;
    }

    void stop() {

    }

    void decideMoveForwardOrStop() {
        if (Randoms.pickNumberInRange(0, 9) >= 4) {
            moveForward();
        } else {
            stop();
        }
    }

    int getDistance() {
        return distance;
    }

    String getName() {
        return name;
    }

    public String toString() {
        String distanceDash = "";

        for (int i=0; i<distance; i++) {
            distanceDash += "-";
        }

        return String.format("%s : %s", name, distanceDash);
    }

}
