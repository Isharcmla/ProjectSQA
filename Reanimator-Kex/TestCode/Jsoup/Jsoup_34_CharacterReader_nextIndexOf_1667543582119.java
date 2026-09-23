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

public class CharacterReader_nextIndexOf_1667543582119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16251;
     Object term16508;

    public CharacterReader_nextIndexOf_1667543582119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16251 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term16251, term16251.getClass(), "pos", -2147483648);
        setIntField(term16251, term16251.getClass(), "length", -2147483648);
        term16508 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term16508, term16508.getClass(), "input", null);
        setIntField(term16508, term16508.getClass(), "length", -2147483648);
        setIntField(term16508, term16508.getClass(), "pos", -2147483648);
        setIntField(term16508, term16508.getClass(), "mark", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = (char) 0;
        Object retValue = callMethod(klass, "nextIndexOf", argTypes, term16251, args);
        assertTrue(recursiveEquals(term16251, term16508));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


