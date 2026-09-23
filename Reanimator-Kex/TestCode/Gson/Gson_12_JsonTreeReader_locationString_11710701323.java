package com.google.gson.internal.bind;

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
import static com.google.gson.internal.bind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class JsonTreeReader_locationString_11710701323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5359;

    public JsonTreeReader_locationString_11710701323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5359 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term5360 = (Object[]) newArray("java.lang.Object", 8);
        Object term5361 = newInstance(Class.forName("java.lang.Object"));
        Object term5362 = newInstance(Class.forName("java.lang.Object"));
        Object term5363 = newInstance(Class.forName("java.lang.Object"));
        Object term5364 = newInstance(Class.forName("java.lang.Object"));
        Object term5365 = newInstance(Class.forName("java.lang.Object"));
        Object term5366 = newInstance(Class.forName("java.lang.Object"));
        Object term5367 = newInstance(Class.forName("java.lang.Object"));
        Object term5368 = newInstance(Class.forName("java.lang.Object"));
        Object[] term5464 = (Object[]) newArray("java.lang.String", 2);
        int[] term5489 = (int[]) newIntArray(7);
        char[] term5435 = (char[]) newCharArray(6);
        int[] term5461 = (int[]) newIntArray(1);
        setElement(term5360, 0, term5361);
        setElement(term5360, 1, term5362);
        setElement(term5360, 2, term5363);
        setElement(term5360, 3, term5364);
        setElement(term5360, 4, term5365);
        setElement(term5360, 5, term5366);
        setElement(term5360, 6, term5367);
        setElement(term5360, 7, term5368);
        setField(term5359, term5359.getClass(), "stack", term5360);
        setIntField(term5359, term5359.getClass(), "stackSize", -380787857);
        setElement(term5464, 0, "aSkmSwTnEw");
        setElement(term5464, 1, "xvkbvaEGYd");
        setField(term5359, term5359.getClass(), "pathNames", term5464);
        setIntElement(term5489, 0, 319853052);
        setIntElement(term5489, 1, -1097563716);
        setIntElement(term5489, 2, 1572907769);
        setIntElement(term5489, 3, 1608016787);
        setIntElement(term5489, 4, -516303035);
        setIntElement(term5489, 5, -2143043890);
        setIntElement(term5489, 6, -2138825831);
        setField(term5359, term5359.getClass(), "pathIndices", term5489);
        setField(term5359, term5359.getClass(), "in", null);
        setBooleanField(term5359, term5359.getClass(), "lenient", true);
        setCharElement(term5435, 0, 'r');
        setCharElement(term5435, 1, 'c');
        setCharElement(term5435, 2, 'R');
        setCharElement(term5435, 3, 'M');
        setCharElement(term5435, 4, 'F');
        setCharElement(term5435, 5, 'I');
        setField(term5359, term5359.getClass(), "buffer", term5435);
        setIntField(term5359, term5359.getClass(), "pos", 897010381);
        setIntField(term5359, term5359.getClass(), "limit", -15712667);
        setIntField(term5359, term5359.getClass(), "lineNumber", 1964967720);
        setIntField(term5359, term5359.getClass(), "lineStart", 1351900243);
        setIntField(term5359, term5359.getClass(), "peeked", -330897705);
        setLongField(term5359, term5359.getClass(), "peekedLong", 8059786003080744426L);
        setIntField(term5359, term5359.getClass(), "peekedNumberLength", 1065595802);
        setField(term5359, term5359.getClass(), "peekedString", "EwQBhZjCIT");
        setIntElement(term5461, 0, 21031843);
        setField(term5359, term5359.getClass(), "stack", term5461);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "locationString", argTypes, term5359, args);
    }

};


