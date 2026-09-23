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

public class JsonTreeReader_getPath_1170023302382 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term158596;
     Object term158787;

    public JsonTreeReader_getPath_1170023302382() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term158596 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term158297 = (Object[]) newArray("java.lang.Object", 495);
        Object term158654 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term158712 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term158750 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term158596, term158596.getClass(), "stackSize", 7);
        setElement(term158297, 0, term158654);
        setElement(term158297, 2, term158712);
        setElement(term158297, 6, term158712);
        setElement(term158297, 128, term158750);
        setField(term158596, term158596.getClass(), "stack", term158297);
        term158787 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term158788 = (Object[]) newArray("java.lang.Object", 495);
        Object term158789 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term158790 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term158791 = newInstance(Class.forName("java.lang.Object"));
        setField(term158789, term158789.getClass(), "members", null);
        setElement(term158788, 0, term158789);
        setField(term158790, term158790.getClass(), "members", null);
        setElement(term158788, 2, term158790);
        setElement(term158788, 6, term158790);
        setElement(term158788, 128, term158791);
        setField(term158787, term158787.getClass(), "stack", term158788);
        setIntField(term158787, term158787.getClass(), "stackSize", 0);
        setField(term158787, term158787.getClass(), "pathNames", null);
        setField(term158787, term158787.getClass(), "pathIndices", null);
        setField(term158787, term158787.getClass(), "in", null);
        setBooleanField(term158787, term158787.getClass(), "lenient", false);
        setField(term158787, term158787.getClass(), "buffer", null);
        setIntField(term158787, term158787.getClass(), "pos", 0);
        setIntField(term158787, term158787.getClass(), "limit", 0);
        setIntField(term158787, term158787.getClass(), "lineNumber", 0);
        setIntField(term158787, term158787.getClass(), "lineStart", 0);
        setIntField(term158787, term158787.getClass(), "peeked", 0);
        setLongField(term158787, term158787.getClass(), "peekedLong", 0L);
        setIntField(term158787, term158787.getClass(), "peekedNumberLength", 0);
        setField(term158787, term158787.getClass(), "peekedString", null);
        setField(term158787, term158787.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term158596, args);
        assertTrue(recursiveEquals(term158596, term158787));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


