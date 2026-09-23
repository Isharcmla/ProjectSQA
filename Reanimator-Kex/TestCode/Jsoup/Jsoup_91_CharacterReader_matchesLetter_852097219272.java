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

public class CharacterReader_matchesLetter_852097219272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58757;
     Object term58900;

    public CharacterReader_matchesLetter_852097219272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58757 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term58757, term58757.getClass(), "bufPos", -2147483648);
        setIntField(term58757, term58757.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term58757, term58757.getClass(), "bufLength", -2147483648);
        term58900 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term58900, term58900.getClass(), "charBuf", null);
        setField(term58900, term58900.getClass(), "reader", null);
        setIntField(term58900, term58900.getClass(), "bufLength", -2147483648);
        setIntField(term58900, term58900.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term58900, term58900.getClass(), "bufPos", -2147483648);
        setIntField(term58900, term58900.getClass(), "readerPos", 0);
        setIntField(term58900, term58900.getClass(), "bufMark", 0);
        setField(term58900, term58900.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "matchesLetter", argTypes, term58757, args);
        assertTrue(recursiveEquals(term58757, term58900));
        assertTrue(recursiveEquals(retValue, false));
    }

};


