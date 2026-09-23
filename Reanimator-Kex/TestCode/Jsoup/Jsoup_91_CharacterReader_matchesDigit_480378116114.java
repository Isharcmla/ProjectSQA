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

public class CharacterReader_matchesDigit_480378116114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23229;
     Object term23381;

    public CharacterReader_matchesDigit_480378116114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23229 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term23229, term23229.getClass(), "bufPos", -2147483648);
        setIntField(term23229, term23229.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term23229, term23229.getClass(), "bufLength", -2147483648);
        term23381 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term23381, term23381.getClass(), "charBuf", null);
        setField(term23381, term23381.getClass(), "reader", null);
        setIntField(term23381, term23381.getClass(), "bufLength", -2147483648);
        setIntField(term23381, term23381.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term23381, term23381.getClass(), "bufPos", -2147483648);
        setIntField(term23381, term23381.getClass(), "readerPos", 0);
        setIntField(term23381, term23381.getClass(), "bufMark", 0);
        setField(term23381, term23381.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "matchesDigit", argTypes, term23229, args);
        assertTrue(recursiveEquals(term23229, term23381));
        assertTrue(recursiveEquals(retValue, false));
    }

};


