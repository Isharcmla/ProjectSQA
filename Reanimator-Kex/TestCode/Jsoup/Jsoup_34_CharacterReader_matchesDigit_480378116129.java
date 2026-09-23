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

public class CharacterReader_matchesDigit_480378116129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17699;
     Object term17977;

    public CharacterReader_matchesDigit_480378116129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17699 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term17598 = (char[]) newCharArray(8);
        setIntField(term17699, term17699.getClass(), "pos", 6);
        setIntField(term17699, term17699.getClass(), "length", 7);
        setCharElement(term17598, 0, (char) 48);
        setCharElement(term17598, 1, (char) 48);
        setCharElement(term17598, 2, (char) 48);
        setCharElement(term17598, 3, (char) 48);
        setCharElement(term17598, 4, (char) 48);
        setCharElement(term17598, 5, (char) 48);
        setCharElement(term17598, 6, (char) 48);
        setCharElement(term17598, 7, (char) 48);
        setField(term17699, term17699.getClass(), "input", term17598);
        term17977 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term17978 = (char[]) newCharArray(8);
        setCharElement(term17978, 0, (char) 48);
        setCharElement(term17978, 1, (char) 48);
        setCharElement(term17978, 2, (char) 48);
        setCharElement(term17978, 3, (char) 48);
        setCharElement(term17978, 4, (char) 48);
        setCharElement(term17978, 5, (char) 48);
        setCharElement(term17978, 6, (char) 48);
        setCharElement(term17978, 7, (char) 48);
        setField(term17977, term17977.getClass(), "input", term17978);
        setIntField(term17977, term17977.getClass(), "length", 7);
        setIntField(term17977, term17977.getClass(), "pos", 6);
        setIntField(term17977, term17977.getClass(), "mark", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "matchesDigit", argTypes, term17699, args);
        assertTrue(recursiveEquals(term17699, term17977));
        assertTrue(recursiveEquals(retValue, true));
    }

};


