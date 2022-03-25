package com.programmers.bullsandcows.engine.io;

import com.programmers.bullsandcows.engine.model.BallCount;

public interface Output {
    void ballCount(BallCount bc);

    void inputError();

    void correct();
}
