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

public class CharacterReader_matchConsume_210446496256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term438;
     Object term5452;

    public CharacterReader_matchConsume_210446496256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term438 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term439 = (char[]) newCharArray(3);
        setCharElement(term439, 0, 'u');
        setCharElement(term439, 1, 'a');
        setCharElement(term439, 2, 'P');
        setField(term438, term438.getClass(), "input", term439);
        setIntField(term438, term438.getClass(), "length", 1551099402);
        setIntField(term438, term438.getClass(), "pos", -2027534003);
        setIntField(term438, term438.getClass(), "mark", 1063420942);
        term5452 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term5453 = (char[]) newCharArray(3);
        setCharElement(term5453, 0, 'u');
        setCharElement(term5453, 1, 'a');
        setCharElement(term5453, 2, 'P');
        setField(term5452, term5452.getClass(), "input", term5453);
        setIntField(term5452, term5452.getClass(), "length", 1551099402);
        setIntField(term5452, term5452.getClass(), "pos", -2027534003);
        setIntField(term5452, term5452.getClass(), "mark", 1063420942);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jJCZpVmanW";
        Object retValue = callMethod(klass, "matchConsume", argTypes, term438, args);
        assertTrue(recursiveEquals(term438, term5452));
        assertTrue(recursiveEquals(retValue, false));
    }

};


