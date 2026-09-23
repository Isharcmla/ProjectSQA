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

public class CharacterReader_matchesAnySorted_492648898313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66491;

    public CharacterReader_matchesAnySorted_492648898313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66491 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term66529 = newInstance(Class.forName("java.io.Reader$1"));
        setIntField(term66491, term66491.getClass(), "bufPos", -2147483648);
        setIntField(term66491, term66491.getClass(), "bufSplitPoint", -2147483648);
        setField(term66491, term66491.getClass(), "reader", term66529);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "matchesAnySorted", argTypes, term66491, args);
            assertTrue(false);
        }
        catch (UncheckedIOException e) {
        }

    }

};


