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

public class CharacterReader_containsIgnoreCase_201681704883 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11083;
     Object term11167;

    public CharacterReader_containsIgnoreCase_201681704883() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11083 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term11083, term11083.getClass(), "input", "");
        setIntField(term11083, term11083.getClass(), "pos", 0);
        term11167 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term11167, term11167.getClass(), "input", "");
        setIntField(term11167, term11167.getClass(), "length", 0);
        setIntField(term11167, term11167.getClass(), "pos", 0);
        setIntField(term11167, term11167.getClass(), "mark", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "containsIgnoreCase", argTypes, term11083, args);
        assertTrue(recursiveEquals(term11083, term11167));
        assertTrue(recursiveEquals(retValue, true));
    }

};


