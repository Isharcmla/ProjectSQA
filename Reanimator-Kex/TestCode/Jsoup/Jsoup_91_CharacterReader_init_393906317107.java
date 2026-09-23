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

public class CharacterReader_init_393906317107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20300;

    public CharacterReader_init_393906317107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term19931 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term19981 = newInstance(Class.forName("java.io.BufferedReader"));
        char[] term19809 = (char[]) newCharArray(0);
        setIntField(term19931, term19931.getClass(), "bufMark", 0);
        setField(term19931, term19931.getClass(), "stringCache", null);
        setField(term19931, term19931.getClass(), "reader", term19981);
        setField(term19931, term19931.getClass(), "charBuf", term19809);
        setIntField(term19931, term19931.getClass(), "bufPos", -2147483648);
        setIntField(term19931, term19931.getClass(), "bufSplitPoint", -2147483648);
        setIntField(term19931, term19931.getClass(), "bufLength", 0);
        setIntField(term19931, term19931.getClass(), "readerPos", 0);
        term20300 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term20301 = (char[]) newCharArray(0);
        Object term20302 = newInstance(Class.forName("java.io.StringReader"));
        Object[] term20305 = (Object[]) newArray("java.lang.String", 512);
        setField(term20300, term20300.getClass(), "charBuf", term20301);
        setField(term20302, term20302.getClass(), "str", "");
        setIntField(term20302, term20302.getClass(), "length", 0);
        setIntField(term20302, term20302.getClass(), "next", 0);
        setIntField(term20302, term20302.getClass(), "mark", 0);
        setField(term20302, term20302.getClass(), "lock", term20302);
        setField(term20302, term20302.getClass(), "skipBuffer", null);
        setField(term20300, term20300.getClass(), "reader", term20302);
        setIntField(term20300, term20300.getClass(), "bufLength", 0);
        setIntField(term20300, term20300.getClass(), "bufSplitPoint", 0);
        setIntField(term20300, term20300.getClass(), "bufPos", 0);
        setIntField(term20300, term20300.getClass(), "readerPos", 0);
        setIntField(term20300, term20300.getClass(), "bufMark", -1);
        setField(term20300, term20300.getClass(), "stringCache", term20305);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term20300));
    }

};


