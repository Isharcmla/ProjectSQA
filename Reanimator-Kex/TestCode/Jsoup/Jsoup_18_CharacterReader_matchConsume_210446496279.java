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

public class CharacterReader_matchConsume_210446496279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9263;
     Object term10354;

    public CharacterReader_matchConsume_210446496279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9263 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term9263, term9263.getClass(), "input", "  ");
        setIntField(term9263, term9263.getClass(), "pos", 0);
        term10354 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term10354, term10354.getClass(), "input", "  ");
        setIntField(term10354, term10354.getClass(), "length", 0);
        setIntField(term10354, term10354.getClass(), "pos", 0);
        setIntField(term10354, term10354.getClass(), "mark", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
        Object retValue = callMethod(klass, "matchConsume", argTypes, term9263, args);
        assertTrue(recursiveEquals(term9263, term10354));
        assertTrue(recursiveEquals(retValue, false));
    }

};


