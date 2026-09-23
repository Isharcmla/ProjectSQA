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
import java.lang.NullPointerException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CharacterReader_mark_322114795544 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136367;

    public CharacterReader_mark_322114795544() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term136367 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term136413 = newInstance(Class.forName("java.io.StringReader"));
        setIntField(term136367, term136367.getClass(), "bufSplitPoint", 0);
        setIntField(term136367, term136367.getClass(), "bufPos", 0);
        setField(term136367, term136367.getClass(), "reader", term136413);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "mark", argTypes, term136367, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


