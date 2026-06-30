package org.apache.commons.lang3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.IOException;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class CodexGeneratedAppendableJoinerTest {

    @Test
    void joinsArraysAndIterablesIntoExistingStringBuilder() {
        final AppendableJoiner<Object> joiner = AppendableJoiner.builder()
                .setPrefix("[")
                .setDelimiter(",")
                .setSuffix("]")
                .get();
        final StringBuilder builder = new StringBuilder("start");

        assertSame(builder, joiner.join(builder, "a", 2, null));
        assertEquals("start[a,2,null]", builder.toString());

        joiner.join(builder, Arrays.asList("x", "y"));
        assertEquals("start[a,2,null][x,y]", builder.toString());
    }

    @Test
    void joinsNullAndEmptyInputsWithOnlyPrefixAndSuffix() {
        final AppendableJoiner<String> joiner = AppendableJoiner.<String>builder()
                .setPrefix("(")
                .setSuffix(")")
                .setDelimiter("|")
                .get();

        assertEquals("()", joiner.join(new StringBuilder(), (String[]) null).toString());
        assertEquals("()", joiner.join(new StringBuilder(), Arrays.<String>asList()).toString());
        assertEquals("()", joiner.join(new StringBuilder(), (Iterable<String>) null).toString());
    }

    @Test
    void customAppenderIsUsedAndIOExceptionIsPropagatedForAppendable() throws Exception {
        final AppendableJoiner<String> joiner = AppendableJoiner.<String>builder()
                .setElementAppender((appendable, value) -> appendable.append(value.toUpperCase()))
                .setDelimiter("-")
                .get();
        assertEquals("A-B", joiner.joinA(new StringBuilder(), "a", "b").toString());

        final Appendable failing = new Appendable() {
            @Override
            public Appendable append(final CharSequence csq) throws IOException {
                throw new IOException("boom");
            }

            @Override
            public Appendable append(final CharSequence csq, final int start, final int end) throws IOException {
                throw new IOException("boom");
            }

            @Override
            public Appendable append(final char c) throws IOException {
                throw new IOException("boom");
            }
        };
        assertThrows(IOException.class, () -> joiner.joinA(failing, "a"));
    }
}
