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

public class CharacterReader_consume_978790598204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39439;
     Object term39545;

    public CharacterReader_consume_978790598204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39439 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term39439, term39439.getClass(), "bufPos", -2147483648);
        setIntField(term39439, term39439.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term39439, term39439.getClass(), "bufLength", -2147483648);
        term39545 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term39545, term39545.getClass(), "charBuf", null);
        setField(term39545, term39545.getClass(), "reader", null);
        setIntField(term39545, term39545.getClass(), "bufLength", -2147483648);
        setIntField(term39545, term39545.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term39545, term39545.getClass(), "bufPos", -2147483647);
        setIntField(term39545, term39545.getClass(), "readerPos", 0);
        setIntField(term39545, term39545.getClass(), "bufMark", 0);
        setField(term39545, term39545.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "consume", argTypes, term39439, args);
        assertTrue(recursiveEquals(term39439, term39545));
        assertTrue(recursiveEquals(retValue, 65535));
    }

};


