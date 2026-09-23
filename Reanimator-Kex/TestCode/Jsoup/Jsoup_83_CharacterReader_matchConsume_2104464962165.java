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

public class CharacterReader_matchConsume_2104464962165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32271;
     Object term32838;

    public CharacterReader_matchConsume_2104464962165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32271 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term32271, term32271.getClass(), "bufPos", -2147483648);
        setIntField(term32271, term32271.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term32271, term32271.getClass(), "bufLength", 2147483647);
        term32838 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term32838, term32838.getClass(), "charBuf", null);
        setField(term32838, term32838.getClass(), "reader", null);
        setIntField(term32838, term32838.getClass(), "bufLength", 2147483647);
        setIntField(term32838, term32838.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term32838, term32838.getClass(), "bufPos", -2147483648);
        setIntField(term32838, term32838.getClass(), "readerPos", 0);
        setIntField(term32838, term32838.getClass(), "bufMark", 0);
        setField(term32838, term32838.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "matchConsume", argTypes, term32271, args);
        assertTrue(recursiveEquals(term32271, term32838));
        assertTrue(recursiveEquals(retValue, false));
    }

};


