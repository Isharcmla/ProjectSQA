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

public class CharacterReader_nextIndexOf_1587279337626 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2130159;

    public CharacterReader_nextIndexOf_1587279337626() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2130159 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term2130197 = newInstance(Class.forName("java.io.Reader$1"));
        setIntField(term2130159, term2130159.getClass(), "bufPos", -2147483648);
        setIntField(term2130159, term2130159.getClass(), "bufSplitPoint", -2147483648);
        setIntField(term2130159, term2130159.getClass(), "readerPos", 0);
        setField(term2130159, term2130159.getClass(), "reader", term2130197);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.CharSequence");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "nextIndexOf", argTypes, term2130159, args);
            assertTrue(false);
        }
        catch (UncheckedIOException e) {
        }

    }

};


