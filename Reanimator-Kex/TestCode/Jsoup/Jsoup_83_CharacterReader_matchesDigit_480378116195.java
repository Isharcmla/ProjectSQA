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

public class CharacterReader_matchesDigit_480378116195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38004;
     Object term38057;

    public CharacterReader_matchesDigit_480378116195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38004 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term38004, term38004.getClass(), "bufPos", -2147483648);
        setIntField(term38004, term38004.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term38004, term38004.getClass(), "bufLength", -2147483648);
        term38057 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term38057, term38057.getClass(), "charBuf", null);
        setField(term38057, term38057.getClass(), "reader", null);
        setIntField(term38057, term38057.getClass(), "bufLength", -2147483648);
        setIntField(term38057, term38057.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term38057, term38057.getClass(), "bufPos", -2147483648);
        setIntField(term38057, term38057.getClass(), "readerPos", 0);
        setIntField(term38057, term38057.getClass(), "bufMark", 0);
        setField(term38057, term38057.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "matchesDigit", argTypes, term38004, args);
        assertTrue(recursiveEquals(term38004, term38057));
        assertTrue(recursiveEquals(retValue, false));
    }

};


