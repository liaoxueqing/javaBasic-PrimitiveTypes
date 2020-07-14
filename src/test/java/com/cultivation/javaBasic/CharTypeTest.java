package com.cultivation.javaBasic;

import com.cultivation.javaBasic.util.EscapedChars;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CharTypeTest {
    @Test
    void should_describe_escaped_chars() {
        // TODO: please modify the following code to pass the test
        // <--start
        final char backspace = (char)0x0008;
        final char tab = (char)0x0009;
        final char lineFeed = (char)0x000a;
        final char carriageReturn = (char) 0x000d;
        final char doubleQuote = (char) 0x0022;
        final char singleQuote = (char) 0x0027;
        final char backslash = (char) 0x005c;
        // --end-->

        assertEquals(EscapedChars.BACKSPACE.getValue(), backspace);
        assertEquals(EscapedChars.TAB.getValue(), tab);
        assertEquals(EscapedChars.LINE_FEED.getValue(), lineFeed);
        assertEquals(EscapedChars.CARRIAGE_RETURN.getValue(), carriageReturn);
        assertEquals(EscapedChars.DOUBLE_QUOTE.getValue(), doubleQuote);
        assertEquals(EscapedChars.SINGLE_QUOTE.getValue(), singleQuote);
        assertEquals(EscapedChars.BACKSLASH.getValue(), backslash);
    }
}
