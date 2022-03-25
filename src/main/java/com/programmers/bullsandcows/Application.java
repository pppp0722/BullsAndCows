package com.programmers.bullsandcows;

import com.programmers.bullsandcows.engine.BaseBall;
import com.programmers.bullsandcows.engine.io.Input;
import com.programmers.bullsandcows.engine.io.NumberGenerator;
import com.programmers.bullsandcows.engine.io.Output;

public class Application {
    public static void main(String[] args) {
        NumberGenerator generator = new FakerNumberGenerator();
        Console console = new Console();

        new BaseBall(generator, console, console).run();
    }
}