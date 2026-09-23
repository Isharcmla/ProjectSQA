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

public class CharacterReader_matchesDigit_480378116472 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119895;
     Object term120201;

    public CharacterReader_matchesDigit_480378116472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119895 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term119790 = (char[]) newCharArray(8);
        setIntField(term119895, term119895.getClass(), "bufPos", 6);
        setIntField(term119895, term119895.getClass(), "bufSplitPoint", 7);
        setIntField(term119895, term119895.getClass(), "bufLength", 7);
        setCharElement(term119790, 0, (char) 58);
        setCharElement(term119790, 1, (char) 58);
        setCharElement(term119790, 2, (char) 58);
        setCharElement(term119790, 3, (char) 58);
        setCharElement(term119790, 4, (char) 58);
        setCharElement(term119790, 5, (char) 58);
        setCharElement(term119790, 6, (char) 58);
        setCharElement(term119790, 7, (char) 58);
        setField(term119895, term119895.getClass(), "charBuf", term119790);
        term120201 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term120202 = (char[]) newCharArray(8);
        setCharElement(term120202, 0, (char) 58);
        setCharElement(term120202, 1, (char) 58);
        setCharElement(term120202, 2, (char) 58);
        setCharElement(term120202, 3, (char) 58);
        setCharElement(term120202, 4, (char) 58);
        setCharElement(term120202, 5, (char) 58);
        setCharElement(term120202, 6, (char) 58);
        setCharElement(term120202, 7, (char) 58);
        setField(term120201, term120201.getClass(), "charBuf", term120202);
        setField(term120201, term120201.getClass(), "reader", null);
        setIntField(term120201, term120201.getClass(), "bufLength", 7);
        setIntField(term120201, term120201.getClass(), "bufSplitPoint", 7);
        setIntField(term120201, term120201.getClass(), "bufPos", 6);
        setIntField(term120201, term120201.getClass(), "readerPos", 0);
        setIntField(term120201, term120201.getClass(), "bufMark", 0);
        setField(term120201, term120201.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "matchesDigit", argTypes, term119895, args);
        assertTrue(recursiveEquals(term119895, term120201));
        assertTrue(recursiveEquals(retValue, false));
    }

};


