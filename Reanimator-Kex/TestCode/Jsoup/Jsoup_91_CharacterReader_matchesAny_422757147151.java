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

public class CharacterReader_matchesAny_422757147151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28934;
     Object term29201;

    public CharacterReader_matchesAny_422757147151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28934 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term28934, term28934.getClass(), "bufPos", -2147483648);
        setIntField(term28934, term28934.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term28934, term28934.getClass(), "bufLength", -2147483648);
        term29201 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term29201, term29201.getClass(), "charBuf", null);
        setField(term29201, term29201.getClass(), "reader", null);
        setIntField(term29201, term29201.getClass(), "bufLength", -2147483648);
        setIntField(term29201, term29201.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term29201, term29201.getClass(), "bufPos", -2147483648);
        setIntField(term29201, term29201.getClass(), "readerPos", 0);
        setIntField(term29201, term29201.getClass(), "bufMark", 0);
        setField(term29201, term29201.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "matchesAny", argTypes, term28934, args);
        assertTrue(recursiveEquals(term28934, term29201));
        assertTrue(recursiveEquals(retValue, false));
    }

};


