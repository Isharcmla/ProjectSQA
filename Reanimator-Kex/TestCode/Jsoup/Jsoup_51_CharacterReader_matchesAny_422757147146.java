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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.parser.EqualityUtils.*;

public class CharacterReader_matchesAny_422757147146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39216;
     Object term39416;

    public CharacterReader_matchesAny_422757147146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39216 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term39216, term39216.getClass(), "pos", -2147483648);
        setIntField(term39216, term39216.getClass(), "length", -2147483648);
        term39416 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term39416, term39416.getClass(), "input", null);
        setIntField(term39416, term39416.getClass(), "length", -2147483648);
        setIntField(term39416, term39416.getClass(), "pos", -2147483648);
        setIntField(term39416, term39416.getClass(), "mark", 0);
        setField(term39416, term39416.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "matchesAny", argTypes, term39216, args);
        assertTrue(recursiveEquals(term39216, term39416));
        assertTrue(recursiveEquals(retValue, false));
    }

};


