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

public class CharacterReader_matchesIgnoreCase_705501828121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35118;
     Object term35165;

    public CharacterReader_matchesIgnoreCase_705501828121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35118 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term35118, term35118.getClass(), "length", -1);
        setIntField(term35118, term35118.getClass(), "pos", 0);
        term35165 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term35165, term35165.getClass(), "input", null);
        setIntField(term35165, term35165.getClass(), "length", -1);
        setIntField(term35165, term35165.getClass(), "pos", 0);
        setIntField(term35165, term35165.getClass(), "mark", 0);
        setField(term35165, term35165.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "matchesIgnoreCase", argTypes, term35118, args);
        assertTrue(recursiveEquals(term35118, term35165));
        assertTrue(recursiveEquals(retValue, false));
    }

};


