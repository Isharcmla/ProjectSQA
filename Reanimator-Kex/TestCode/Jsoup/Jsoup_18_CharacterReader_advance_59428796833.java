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

public class CharacterReader_advance_59428796833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term153;
     Object term1433;

    public CharacterReader_advance_59428796833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term153 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term153, term153.getClass(), "input", "SzjVpOQTyS");
        setIntField(term153, term153.getClass(), "length", 597278769);
        setIntField(term153, term153.getClass(), "pos", -1685132342);
        setIntField(term153, term153.getClass(), "mark", -1456670397);
        term1433 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term1433, term1433.getClass(), "input", "SzjVpOQTyS");
        setIntField(term1433, term1433.getClass(), "length", 597278769);
        setIntField(term1433, term1433.getClass(), "pos", -1685132341);
        setIntField(term1433, term1433.getClass(), "mark", -1456670397);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "advance", argTypes, term153, args);
        assertTrue(recursiveEquals(term153, term1433));
    }

};


