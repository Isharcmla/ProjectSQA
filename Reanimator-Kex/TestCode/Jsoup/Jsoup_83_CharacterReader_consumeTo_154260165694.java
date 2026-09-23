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

public class CharacterReader_consumeTo_154260165694 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18435;
     Object term19021;

    public CharacterReader_consumeTo_154260165694() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18435 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term18435, term18435.getClass(), "bufPos", -2147483648);
        setIntField(term18435, term18435.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term18435, term18435.getClass(), "bufLength", -2147483648);
        term19021 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term19021, term19021.getClass(), "charBuf", null);
        setField(term19021, term19021.getClass(), "reader", null);
        setIntField(term19021, term19021.getClass(), "bufLength", -2147483648);
        setIntField(term19021, term19021.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term19021, term19021.getClass(), "bufPos", -2147483648);
        setIntField(term19021, term19021.getClass(), "readerPos", 0);
        setIntField(term19021, term19021.getClass(), "bufMark", 0);
        setField(term19021, term19021.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = (char) 0;
        Object retValue = callMethod(klass, "consumeTo", argTypes, term18435, args);
        assertTrue(recursiveEquals(term18435, term19021));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


