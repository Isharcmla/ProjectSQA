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

public class CharacterReader_isEmpty_80380485129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49;
     Object term977;

    public CharacterReader_isEmpty_80380485129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term49, term49.getClass(), "input", "MuLcgQHgqz");
        setIntField(term49, term49.getClass(), "length", 391863371);
        setIntField(term49, term49.getClass(), "pos", -1922583790);
        setIntField(term49, term49.getClass(), "mark", -616727354);
        term977 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term977, term977.getClass(), "input", "MuLcgQHgqz");
        setIntField(term977, term977.getClass(), "length", 391863371);
        setIntField(term977, term977.getClass(), "pos", -1922583790);
        setIntField(term977, term977.getClass(), "mark", -616727354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isEmpty", argTypes, term49, args);
        assertTrue(recursiveEquals(term49, term977));
        assertTrue(recursiveEquals(retValue, false));
    }

};


