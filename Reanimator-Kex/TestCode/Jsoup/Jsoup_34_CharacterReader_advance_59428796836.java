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

public class CharacterReader_advance_59428796836 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82;
     Object term1024;

    public CharacterReader_advance_59428796836() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term83 = (char[]) newCharArray(6);
        setCharElement(term83, 0, 'R');
        setCharElement(term83, 1, 'r');
        setCharElement(term83, 2, 'b');
        setCharElement(term83, 3, 'M');
        setCharElement(term83, 4, 'u');
        setCharElement(term83, 5, 'L');
        setField(term82, term82.getClass(), "input", term83);
        setIntField(term82, term82.getClass(), "length", 597278769);
        setIntField(term82, term82.getClass(), "pos", -1685132342);
        setIntField(term82, term82.getClass(), "mark", -1456670397);
        term1024 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term1025 = (char[]) newCharArray(6);
        setCharElement(term1025, 0, 'R');
        setCharElement(term1025, 1, 'r');
        setCharElement(term1025, 2, 'b');
        setCharElement(term1025, 3, 'M');
        setCharElement(term1025, 4, 'u');
        setCharElement(term1025, 5, 'L');
        setField(term1024, term1024.getClass(), "input", term1025);
        setIntField(term1024, term1024.getClass(), "length", 597278769);
        setIntField(term1024, term1024.getClass(), "pos", -1685132341);
        setIntField(term1024, term1024.getClass(), "mark", -1456670397);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "advance", argTypes, term82, args);
        assertTrue(recursiveEquals(term82, term1024));
    }

};


