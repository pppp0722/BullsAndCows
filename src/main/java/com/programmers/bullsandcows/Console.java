package com.programmers.bullsandcows;

import com.programmers.bullsandcows.engine.io.Input;
import com.programmers.bullsandcows.engine.io.Output;
import com.programmers.bullsandcows.engine.model.BallCount;

import java.util.Scanner;

public class Console implements Input, Output {
    private final Scanner scanner = new Scanner(System.in);
    @Override
    public String input(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    @Override
    public void ballCount(BallCount bc) {
        System.out.println(bc.getStrike() + "S " + bc.getBall() + "B");
    }

    @Override
    public void inputError() {
        System.out.println("입력이 잘못되었습니다.");
    }

    @Override
    public void correct() {
        System.out.println("정답입니다.");
    }
}
