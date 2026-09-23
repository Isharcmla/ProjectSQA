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

public class CharacterReader_matchesLetter_852097219198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30681;
     Object term30804;

    public CharacterReader_matchesLetter_852097219198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30681 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term30578 = (char[]) newCharArray(8);
        setIntField(term30681, term30681.getClass(), "pos", 6);
        setIntField(term30681, term30681.getClass(), "length", 7);
        setCharElement(term30578, 0, (char) 123);
        setCharElement(term30578, 1, (char) 123);
        setCharElement(term30578, 2, (char) 123);
        setCharElement(term30578, 3, (char) 123);
        setCharElement(term30578, 4, (char) 123);
        setCharElement(term30578, 5, (char) 123);
        setCharElement(term30578, 6, (char) 123);
        setCharElement(term30578, 7, (char) 123);
        setField(term30681, term30681.getClass(), "input", term30578);
        term30804 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term30805 = (char[]) newCharArray(8);
        setCharElement(term30805, 0, (char) 123);
        setCharElement(term30805, 1, (char) 123);
        setCharElement(term30805, 2, (char) 123);
        setCharElement(term30805, 3, (char) 123);
        setCharElement(term30805, 4, (char) 123);
        setCharElement(term30805, 5, (char) 123);
        setCharElement(term30805, 6, (char) 123);
        setCharElement(term30805, 7, (char) 123);
        setField(term30804, term30804.getClass(), "input", term30805);
        setIntField(term30804, term30804.getClass(), "length", 7);
        setIntField(term30804, term30804.getClass(), "pos", 6);
        setIntField(term30804, term30804.getClass(), "mark", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "matchesLetter", argTypes, term30681, args);
        assertTrue(recursiveEquals(term30681, term30804));
        assertTrue(recursiveEquals(retValue, false));
    }

};


