package com.example.charoccurrence.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringProcessorTest {

    @Test
    void returnsCorrectString() {
        assertEquals(
                "\"l\": 3, \"o\": 2, \" \": 1, \"r\": 1, \"d\": 1, \"e\": 1, \"w\": 1, \"H\": 1",
                StringProcessor.getSortedDistinctByValueAsStringCharOccurrences("Hello world")
        );
    }

    @Test
    void returnsEmptyStringIfArgumentIsEmpty() {
        assertEquals("", StringProcessor.getSortedDistinctByValueAsStringCharOccurrences(""));
    }

    @Test
    void throwsIllegalArgumentExceptionIvArgumentIsNull() {
        assertThrows(
                IllegalArgumentException.class,
                () -> StringProcessor.getSortedDistinctByValueAsStringCharOccurrences(null)
        );
    }
}