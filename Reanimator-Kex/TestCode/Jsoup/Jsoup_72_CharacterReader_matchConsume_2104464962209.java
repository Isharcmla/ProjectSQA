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

public class CharacterReader_matchConsume_2104464962209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39974;
     Object term40314;

    public CharacterReader_matchConsume_2104464962209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39974 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term39974, term39974.getClass(), "bufPos", -2147483648);
        setIntField(term39974, term39974.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term39974, term39974.getClass(), "bufLength", -2147483648);
        term40314 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term40314, term40314.getClass(), "charBuf", null);
        setField(term40314, term40314.getClass(), "reader", null);
        setIntField(term40314, term40314.getClass(), "bufLength", -2147483648);
        setIntField(term40314, term40314.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term40314, term40314.getClass(), "bufPos", -2147483648);
        setIntField(term40314, term40314.getClass(), "readerPos", 0);
        setIntField(term40314, term40314.getClass(), "bufMark", 0);
        setField(term40314, term40314.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "matchConsume", argTypes, term39974, args);
        assertTrue(recursiveEquals(term39974, term40314));
        assertTrue(recursiveEquals(retValue, true));
    }

};


