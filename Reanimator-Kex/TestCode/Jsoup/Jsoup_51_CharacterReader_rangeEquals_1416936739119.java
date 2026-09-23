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

public class CharacterReader_rangeEquals_1416936739119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34967;
     Object term35021;

    public CharacterReader_rangeEquals_1416936739119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34967 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        term35021 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term35021, term35021.getClass(), "input", null);
        setIntField(term35021, term35021.getClass(), "length", 0);
        setIntField(term35021, term35021.getClass(), "pos", 0);
        setIntField(term35021, term35021.getClass(), "mark", 0);
        setField(term35021, term35021.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = 0;
        args[1] = 0;
        args[2] = "";
        Object retValue = callMethod(klass, "rangeEquals", argTypes, term34967, args);
        assertTrue(recursiveEquals(term34967, term35021));
        assertTrue(recursiveEquals(retValue, true));
    }

};


