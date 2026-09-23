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
import static com.google.gson.internal.bind.EqualityUtils.*;
import java.lang.Object;

public class JsonTreeReader_getPath_1170023302258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81381;
     Object term81508;

    public JsonTreeReader_getPath_1170023302258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81381 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term81121 = (Object[]) newArray("java.lang.Object", 491);
        Object term81437 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term81475 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term81381, term81381.getClass(), "stackSize", 6);
        setElement(term81121, 1, term81437);
        setElement(term81121, 32, term81475);
        setField(term81381, term81381.getClass(), "stack", term81121);
        term81508 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term81509 = (Object[]) newArray("java.lang.Object", 491);
        Object term81510 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term81511 = newInstance(Class.forName("java.lang.Object"));
        setField(term81510, term81510.getClass(), "elements", null);
        setElement(term81509, 1, term81510);
        setElement(term81509, 32, term81511);
        setField(term81508, term81508.getClass(), "stack", term81509);
        setIntField(term81508, term81508.getClass(), "stackSize", 0);
        setField(term81508, term81508.getClass(), "pathNames", null);
        setField(term81508, term81508.getClass(), "pathIndices", null);
        setField(term81508, term81508.getClass(), "in", null);
        setBooleanField(term81508, term81508.getClass(), "lenient", false);
        setField(term81508, term81508.getClass(), "buffer", null);
        setIntField(term81508, term81508.getClass(), "pos", 0);
        setIntField(term81508, term81508.getClass(), "limit", 0);
        setIntField(term81508, term81508.getClass(), "lineNumber", 0);
        setIntField(term81508, term81508.getClass(), "lineStart", 0);
        setIntField(term81508, term81508.getClass(), "peeked", 0);
        setLongField(term81508, term81508.getClass(), "peekedLong", 0L);
        setIntField(term81508, term81508.getClass(), "peekedNumberLength", 0);
        setField(term81508, term81508.getClass(), "peekedString", null);
        setField(term81508, term81508.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term81381, args);
        assertTrue(recursiveEquals(term81381, term81508));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


