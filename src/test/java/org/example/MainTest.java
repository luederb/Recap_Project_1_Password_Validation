package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class MainTest {

    @Test
    void isLongerThan7Char() {
        // GIVEN
        String password = "RecapProject";
        boolean expected = password.length() > 7;
        // WHEN
        boolean actual = Main.isLongerThan7Char(password);
        // THEN
        assertTrue(actual);
    }

}