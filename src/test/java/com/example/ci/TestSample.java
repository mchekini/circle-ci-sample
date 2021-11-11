package com.example.ci;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSample {


    @Test
    public void itShouldRunWithSuccess() {
        Assertions.assertEquals(10, 5 + 5);
    }


    @Test
    public void itShouldFail() {
        Assertions.assertEquals(11, 5 + 6);
    }
}
