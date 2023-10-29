package racingcar;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class CarRacingGame {
    private List<Car> car = new ArrayList<>();
    private int trial;

    void setCar() throws IllegalArgumentException {
        String input = Console.readLine();
        Console.close();

        if(!(input.contains(","))) {
            throw new IllegalArgumentException();
        }

        List<String> carName = List.of(input.split(","));

        for (String element: carName) {
            if (element.length() > 5) {
                throw new IllegalArgumentException();
            }
        }

        for (String element: carName) {
            car.add(new Car(element));
        }

    }

    void setTrialInput() throws IllegalArgumentException {
        int input = Integer.parseInt(Console.readLine()); // 정수값으로 변환 안될 경우 NumberFormatException 발생
        Console.close();

        if (input <= 0) {
            throw new IllegalArgumentException();
        }

        this.trial = input;
    }

}
