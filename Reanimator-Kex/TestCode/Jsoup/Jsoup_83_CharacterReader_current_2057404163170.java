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

public class CharacterReader_current_2057404163170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33012;
     Object term33374;

    public CharacterReader_current_2057404163170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33012 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term33012, term33012.getClass(), "bufPos", -2147483648);
        setIntField(term33012, term33012.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term33012, term33012.getClass(), "bufLength", -2147483648);
        term33374 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term33374, term33374.getClass(), "charBuf", null);
        setField(term33374, term33374.getClass(), "reader", null);
        setIntField(term33374, term33374.getClass(), "bufLength", -2147483648);
        setIntField(term33374, term33374.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term33374, term33374.getClass(), "bufPos", -2147483648);
        setIntField(term33374, term33374.getClass(), "readerPos", 0);
        setIntField(term33374, term33374.getClass(), "bufMark", 0);
        setField(term33374, term33374.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "current", argTypes, term33012, args);
        assertTrue(recursiveEquals(term33012, term33374));
        assertTrue(recursiveEquals(retValue, 65535));
    }

};


