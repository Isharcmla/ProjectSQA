package org.jsoup.parser;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import org.jsoup.UncheckedIOException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TokeniserState_handleDataEndTag_316813230113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184356;

    public TokeniserState_handleDataEndTag_316813230113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term184356 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term184394 = newInstance(Class.forName("java.io.Reader$1"));
        setIntField(term184356, term184356.getClass(), "bufPos", -2147483648);
        setIntField(term184356, term184356.getClass(), "bufSplitPoint", -2147483648);
        setField(term184356, term184356.getClass(), "reader", term184394);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokeniserState");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jsoup.parser.Tokeniser");
        argTypes[1] = Class.forName("org.jsoup.parser.CharacterReader");
        argTypes[2] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term184356;
        args[2] = null;
        try {
            callMethod(klass, "handleDataEndTag", argTypes, null, args);
            assertTrue(false);
        }
        catch (UncheckedIOException e) {
        }

    }

};


