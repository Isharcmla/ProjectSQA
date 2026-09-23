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

public class CharacterReader_containsIgnoreCase_201681704852 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term781;
     Object term4909;

    public CharacterReader_containsIgnoreCase_201681704852() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term781 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term781, term781.getClass(), "input", "OWDIEULEFu");
        setIntField(term781, term781.getClass(), "length", 1540719661);
        setIntField(term781, term781.getClass(), "pos", 1265463001);
        setIntField(term781, term781.getClass(), "mark", 335112684);
        term4909 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term4909, term4909.getClass(), "input", "OWDIEULEFu");
        setIntField(term4909, term4909.getClass(), "length", 1540719661);
        setIntField(term4909, term4909.getClass(), "pos", 1265463001);
        setIntField(term4909, term4909.getClass(), "mark", 335112684);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "dWRymuLBtr";
        Object retValue = callMethod(klass, "containsIgnoreCase", argTypes, term781, args);
        assertTrue(recursiveEquals(term781, term4909));
        assertTrue(recursiveEquals(retValue, false));
    }

};


