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

public class CharacterReader_matchesAnySorted_492648898121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23902;
     Object term23915;

    public CharacterReader_matchesAnySorted_492648898121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23902 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term23902, term23902.getClass(), "bufPos", -2147483648);
        setIntField(term23902, term23902.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term23902, term23902.getClass(), "bufLength", -2147483648);
        term23915 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term23915, term23915.getClass(), "charBuf", null);
        setField(term23915, term23915.getClass(), "reader", null);
        setIntField(term23915, term23915.getClass(), "bufLength", -2147483648);
        setIntField(term23915, term23915.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term23915, term23915.getClass(), "bufPos", -2147483648);
        setIntField(term23915, term23915.getClass(), "readerPos", 0);
        setIntField(term23915, term23915.getClass(), "bufMark", 0);
        setField(term23915, term23915.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "matchesAnySorted", argTypes, term23902, args);
        assertTrue(recursiveEquals(term23902, term23915));
        assertTrue(recursiveEquals(retValue, false));
    }

};


