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

public class CharacterReader_matchesDigit_480378116239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51286;
     Object term51602;

    public CharacterReader_matchesDigit_480378116239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51286 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term51286, term51286.getClass(), "bufPos", -2147483648);
        setIntField(term51286, term51286.getClass(), "bufLength", -2147483648);
        term51602 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term51602, term51602.getClass(), "charBuf", null);
        setField(term51602, term51602.getClass(), "reader", null);
        setIntField(term51602, term51602.getClass(), "bufLength", -2147483648);
        setIntField(term51602, term51602.getClass(), "bufSplitPoint", 0);
        setIntField(term51602, term51602.getClass(), "bufPos", -2147483648);
        setIntField(term51602, term51602.getClass(), "readerPos", 0);
        setIntField(term51602, term51602.getClass(), "bufMark", 0);
        setField(term51602, term51602.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "matchesDigit", argTypes, term51286, args);
        assertTrue(recursiveEquals(term51286, term51602));
        assertTrue(recursiveEquals(retValue, false));
    }

};


