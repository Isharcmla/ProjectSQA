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

public class CharacterReader_consumeToAnySorted_1690453021163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30758;
     Object term31040;

    public CharacterReader_consumeToAnySorted_1690453021163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30758 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term30758, term30758.getClass(), "bufPos", -2147483648);
        setIntField(term30758, term30758.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term30758, term30758.getClass(), "bufLength", -2147483648);
        setField(term30758, term30758.getClass(), "charBuf", null);
        term31040 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term31040, term31040.getClass(), "charBuf", null);
        setField(term31040, term31040.getClass(), "reader", null);
        setIntField(term31040, term31040.getClass(), "bufLength", -2147483648);
        setIntField(term31040, term31040.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term31040, term31040.getClass(), "bufPos", -2147483648);
        setIntField(term31040, term31040.getClass(), "readerPos", 0);
        setIntField(term31040, term31040.getClass(), "bufMark", 0);
        setField(term31040, term31040.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "consumeToAnySorted", argTypes, term30758, args);
        assertTrue(recursiveEquals(term30758, term31040));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


