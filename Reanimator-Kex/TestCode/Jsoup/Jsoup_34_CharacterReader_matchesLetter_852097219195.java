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

public class CharacterReader_matchesLetter_852097219195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30240;
     Object term30556;

    public CharacterReader_matchesLetter_852097219195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30240 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term30138 = (char[]) newCharArray(8);
        setIntField(term30240, term30240.getClass(), "pos", 6);
        setIntField(term30240, term30240.getClass(), "length", 7);
        setCharElement(term30138, 0, 'P');
        setCharElement(term30138, 1, 'P');
        setCharElement(term30138, 2, 'P');
        setCharElement(term30138, 3, 'P');
        setCharElement(term30138, 4, 'P');
        setCharElement(term30138, 5, 'P');
        setCharElement(term30138, 6, 'P');
        setCharElement(term30138, 7, 'P');
        setField(term30240, term30240.getClass(), "input", term30138);
        term30556 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term30557 = (char[]) newCharArray(8);
        setCharElement(term30557, 0, 'P');
        setCharElement(term30557, 1, 'P');
        setCharElement(term30557, 2, 'P');
        setCharElement(term30557, 3, 'P');
        setCharElement(term30557, 4, 'P');
        setCharElement(term30557, 5, 'P');
        setCharElement(term30557, 6, 'P');
        setCharElement(term30557, 7, 'P');
        setField(term30556, term30556.getClass(), "input", term30557);
        setIntField(term30556, term30556.getClass(), "length", 7);
        setIntField(term30556, term30556.getClass(), "pos", 6);
        setIntField(term30556, term30556.getClass(), "mark", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "matchesLetter", argTypes, term30240, args);
        assertTrue(recursiveEquals(term30240, term30556));
        assertTrue(recursiveEquals(retValue, true));
    }

};


