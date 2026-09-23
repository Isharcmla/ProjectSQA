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

public class CharacterReader_isEmpty_80380485190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26923;
     Object term27087;

    public CharacterReader_isEmpty_80380485190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26923 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term26923, term26923.getClass(), "pos", -2147483648);
        setIntField(term26923, term26923.getClass(), "length", -2147483648);
        term27087 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term27087, term27087.getClass(), "input", null);
        setIntField(term27087, term27087.getClass(), "length", -2147483648);
        setIntField(term27087, term27087.getClass(), "pos", -2147483648);
        setIntField(term27087, term27087.getClass(), "mark", 0);
        setField(term27087, term27087.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isEmpty", argTypes, term26923, args);
        assertTrue(recursiveEquals(term26923, term27087));
        assertTrue(recursiveEquals(retValue, true));
    }

};


