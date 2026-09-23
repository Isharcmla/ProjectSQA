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

public class CharacterReader_matches_2014332895246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52201;
     Object term52593;

    public CharacterReader_matches_2014332895246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52201 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term52104 = (char[]) newCharArray(8);
        setIntField(term52201, term52201.getClass(), "bufPos", 6);
        setIntField(term52201, term52201.getClass(), "bufLength", 7);
        setField(term52201, term52201.getClass(), "charBuf", term52104);
        term52593 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term52594 = (char[]) newCharArray(8);
        setField(term52593, term52593.getClass(), "charBuf", term52594);
        setField(term52593, term52593.getClass(), "reader", null);
        setIntField(term52593, term52593.getClass(), "bufLength", 7);
        setIntField(term52593, term52593.getClass(), "bufSplitPoint", 0);
        setIntField(term52593, term52593.getClass(), "bufPos", 6);
        setIntField(term52593, term52593.getClass(), "readerPos", 0);
        setIntField(term52593, term52593.getClass(), "bufMark", 0);
        setField(term52593, term52593.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = (char) 0;
        Object retValue = callMethod(klass, "matches", argTypes, term52201, args);
        assertTrue(recursiveEquals(term52201, term52593));
        assertTrue(recursiveEquals(retValue, true));
    }

};


