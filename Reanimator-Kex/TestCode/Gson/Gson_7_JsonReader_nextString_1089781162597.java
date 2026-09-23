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
import static com.google.gson.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class JsonReader_nextString_1089781162597 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term269042;

    public JsonReader_nextString_1089781162597() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term269042 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term268840 = (int[]) newIntArray(4);
        setIntField(term269042, term269042.getClass(), "peeked", 7);
        setIntField(term269042, term269042.getClass(), "lineNumber", 0);
        setIntField(term269042, term269042.getClass(), "pos", 0);
        setIntField(term269042, term269042.getClass(), "lineStart", 0);
        setIntField(term269042, term269042.getClass(), "stackSize", 1);
        setIntElement(term268840, 0, 66);
        setIntElement(term268840, 1, 69);
        setIntElement(term268840, 2, 71);
        setIntElement(term268840, 3, 73);
        setField(term269042, term269042.getClass(), "stack", term268840);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "nextString", argTypes, term269042, args);
    }

};


