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
import java.lang.Object;

public class CharacterReader_init_39390631792 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19387;

    public CharacterReader_init_39390631792() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term18878 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object[] term18750 = (Object[]) newArray("java.lang.String", 0);
        Object term18916 = newInstance(Class.forName("java.io.Reader$1"));
        char[] term18753 = (char[]) newCharArray(0);
        setField(term18878, term18878.getClass(), "stringCache", term18750);
        setField(term18878, term18878.getClass(), "reader", term18916);
        setField(term18878, term18878.getClass(), "charBuf", term18753);
        setIntField(term18878, term18878.getClass(), "bufPos", -2147483648);
        setIntField(term18878, term18878.getClass(), "bufSplitPoint", -2147483648);
        setIntField(term18878, term18878.getClass(), "readerPos", 0);
        setIntField(term18878, term18878.getClass(), "bufLength", 0);
        setIntField(term18878, term18878.getClass(), "bufMark", 0);
        term19387 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term19388 = (char[]) newCharArray(0);
        Object term19389 = newInstance(Class.forName("java.io.StringReader"));
        Object[] term19392 = (Object[]) newArray("java.lang.String", 512);
        setField(term19387, term19387.getClass(), "charBuf", term19388);
        setField(term19389, term19389.getClass(), "str", "");
        setIntField(term19389, term19389.getClass(), "length", 0);
        setIntField(term19389, term19389.getClass(), "next", 0);
        setIntField(term19389, term19389.getClass(), "mark", 0);
        setField(term19389, term19389.getClass(), "lock", term19389);
        setField(term19389, term19389.getClass(), "skipBuffer", null);
        setField(term19387, term19387.getClass(), "reader", term19389);
        setIntField(term19387, term19387.getClass(), "bufLength", 0);
        setIntField(term19387, term19387.getClass(), "bufSplitPoint", 0);
        setIntField(term19387, term19387.getClass(), "bufPos", 0);
        setIntField(term19387, term19387.getClass(), "readerPos", 0);
        setIntField(term19387, term19387.getClass(), "bufMark", 0);
        setField(term19387, term19387.getClass(), "stringCache", term19392);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term19387));
    }

};


