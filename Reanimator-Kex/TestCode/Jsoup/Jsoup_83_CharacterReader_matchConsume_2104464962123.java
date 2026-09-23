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

public class CharacterReader_matchConsume_2104464962123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22845;
     Object term23672;

    public CharacterReader_matchConsume_2104464962123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22845 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term22845, term22845.getClass(), "bufPos", -2147483648);
        setIntField(term22845, term22845.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term22845, term22845.getClass(), "bufLength", -2147483648);
        term23672 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term23672, term23672.getClass(), "charBuf", null);
        setField(term23672, term23672.getClass(), "reader", null);
        setIntField(term23672, term23672.getClass(), "bufLength", -2147483648);
        setIntField(term23672, term23672.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term23672, term23672.getClass(), "bufPos", -2147483648);
        setIntField(term23672, term23672.getClass(), "readerPos", 0);
        setIntField(term23672, term23672.getClass(), "bufMark", 0);
        setField(term23672, term23672.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "matchConsume", argTypes, term22845, args);
        assertTrue(recursiveEquals(term22845, term23672));
        assertTrue(recursiveEquals(retValue, true));
    }

};


