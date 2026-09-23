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

public class JsonTreeReader_getPath_1170023302197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49183;
     Object term49775;

    public JsonTreeReader_getPath_1170023302197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49183 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term49048 = (Object[]) newArray("java.lang.Object", 489);
        Object term49239 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term49277 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term49183, term49183.getClass(), "stackSize", 2);
        setElement(term49048, 1, term49239);
        setElement(term49048, 32, term49277);
        setField(term49183, term49183.getClass(), "stack", term49048);
        term49775 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term49776 = (Object[]) newArray("java.lang.Object", 489);
        Object term49777 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term49778 = newInstance(Class.forName("java.lang.Object"));
        setField(term49777, term49777.getClass(), "elements", null);
        setElement(term49776, 1, term49777);
        setElement(term49776, 32, term49778);
        setField(term49775, term49775.getClass(), "stack", term49776);
        setIntField(term49775, term49775.getClass(), "stackSize", 0);
        setField(term49775, term49775.getClass(), "pathNames", null);
        setField(term49775, term49775.getClass(), "pathIndices", null);
        setField(term49775, term49775.getClass(), "in", null);
        setBooleanField(term49775, term49775.getClass(), "lenient", false);
        setField(term49775, term49775.getClass(), "buffer", null);
        setIntField(term49775, term49775.getClass(), "pos", 0);
        setIntField(term49775, term49775.getClass(), "limit", 0);
        setIntField(term49775, term49775.getClass(), "lineNumber", 0);
        setIntField(term49775, term49775.getClass(), "lineStart", 0);
        setIntField(term49775, term49775.getClass(), "peeked", 0);
        setLongField(term49775, term49775.getClass(), "peekedLong", 0L);
        setIntField(term49775, term49775.getClass(), "peekedNumberLength", 0);
        setField(term49775, term49775.getClass(), "peekedString", null);
        setField(term49775, term49775.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term49183, args);
        assertTrue(recursiveEquals(term49183, term49775));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


