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

public class CharacterReader_matchesAnySorted_492648898154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41199;
     Object term41365;

    public CharacterReader_matchesAnySorted_492648898154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41199 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term41199, term41199.getClass(), "pos", -2147483648);
        setIntField(term41199, term41199.getClass(), "length", -2147483648);
        term41365 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term41365, term41365.getClass(), "input", null);
        setIntField(term41365, term41365.getClass(), "length", -2147483648);
        setIntField(term41365, term41365.getClass(), "pos", -2147483648);
        setIntField(term41365, term41365.getClass(), "mark", 0);
        setField(term41365, term41365.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "matchesAnySorted", argTypes, term41199, args);
        assertTrue(recursiveEquals(term41199, term41365));
        assertTrue(recursiveEquals(retValue, false));
    }

};


