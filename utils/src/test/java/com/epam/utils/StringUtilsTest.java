package com.epam.utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void TestisPositiveNumber() {

        assertEquals(true,StringUtils.isPositiveNumber("5"));
    }
}