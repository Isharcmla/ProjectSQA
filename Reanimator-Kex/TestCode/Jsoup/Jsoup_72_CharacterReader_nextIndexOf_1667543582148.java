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

public class CharacterReader_nextIndexOf_1667543582148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27851;
     Object term27915;

    public CharacterReader_nextIndexOf_1667543582148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27851 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term27851, term27851.getClass(), "bufPos", -2147483648);
        setIntField(term27851, term27851.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term27851, term27851.getClass(), "bufLength", -2147483648);
        term27915 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term27915, term27915.getClass(), "charBuf", null);
        setField(term27915, term27915.getClass(), "reader", null);
        setIntField(term27915, term27915.getClass(), "bufLength", -2147483648);
        setIntField(term27915, term27915.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term27915, term27915.getClass(), "bufPos", -2147483648);
        setIntField(term27915, term27915.getClass(), "readerPos", 0);
        setIntField(term27915, term27915.getClass(), "bufMark", 0);
        setField(term27915, term27915.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = (char) 0;
        Object retValue = callMethod(klass, "nextIndexOf", argTypes, term27851, args);
        assertTrue(recursiveEquals(term27851, term27915));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


