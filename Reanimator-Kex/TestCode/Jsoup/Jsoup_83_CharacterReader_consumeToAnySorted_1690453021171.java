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

public class CharacterReader_consumeToAnySorted_1690453021171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33103;
     Object term33388;

    public CharacterReader_consumeToAnySorted_1690453021171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33103 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term33103, term33103.getClass(), "bufPos", -2147483648);
        setIntField(term33103, term33103.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term33103, term33103.getClass(), "bufLength", -2147483648);
        setField(term33103, term33103.getClass(), "charBuf", null);
        term33388 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term33388, term33388.getClass(), "charBuf", null);
        setField(term33388, term33388.getClass(), "reader", null);
        setIntField(term33388, term33388.getClass(), "bufLength", -2147483648);
        setIntField(term33388, term33388.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term33388, term33388.getClass(), "bufPos", -2147483648);
        setIntField(term33388, term33388.getClass(), "readerPos", 0);
        setIntField(term33388, term33388.getClass(), "bufMark", 0);
        setField(term33388, term33388.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "consumeToAnySorted", argTypes, term33103, args);
        assertTrue(recursiveEquals(term33103, term33388));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


