package com.google.gson.stream;

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
import java.lang.AssertionError;
import static com.google.gson.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class JsonReader_nextString_108978116252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2133;

    public JsonReader_nextString_108978116252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2133 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term2135 = (char[]) newCharArray(2);
        int[] term2157 = (int[]) newIntArray(5);
        Object[] term2164 = (Object[]) newArray("java.lang.String", 0);
        int[] term2165 = (int[]) newIntArray(2);
        setField(term2133, term2133.getClass(), "in", null);
        setBooleanField(term2133, term2133.getClass(), "lenient", false);
        setCharElement(term2135, 0, 'z');
        setCharElement(term2135, 1, 'j');
        setField(term2133, term2133.getClass(), "buffer", term2135);
        setIntField(term2133, term2133.getClass(), "pos", 1270666529);
        setIntField(term2133, term2133.getClass(), "limit", -1146679443);
        setIntField(term2133, term2133.getClass(), "lineNumber", -860131894);
        setIntField(term2133, term2133.getClass(), "lineStart", -1022990421);
        setIntField(term2133, term2133.getClass(), "peeked", 1045547089);
        setLongField(term2133, term2133.getClass(), "peekedLong", 2535595959091595249L);
        setIntField(term2133, term2133.getClass(), "peekedNumberLength", -1122880881);
        setField(term2133, term2133.getClass(), "peekedString", "KoyGrUJeJW");
        setIntElement(term2157, 0, -542712742);
        setIntElement(term2157, 1, -1254072822);
        setIntElement(term2157, 2, -1111249833);
        setIntElement(term2157, 3, -1692331299);
        setIntElement(term2157, 4, 479531250);
        setField(term2133, term2133.getClass(), "stack", term2157);
        setIntField(term2133, term2133.getClass(), "stackSize", 1320570890);
        setField(term2133, term2133.getClass(), "pathNames", term2164);
        setIntElement(term2165, 0, -130649791);
        setIntElement(term2165, 1, 534834644);
        setField(term2133, term2133.getClass(), "pathIndices", term2165);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextString", argTypes, term2133, args);
            assertTrue(false);
        }
        catch (AssertionError e) {
        }

    }

};


