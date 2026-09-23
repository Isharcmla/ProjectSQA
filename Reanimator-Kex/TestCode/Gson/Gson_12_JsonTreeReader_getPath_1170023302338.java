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

public class JsonTreeReader_getPath_1170023302338 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129271;
     Object term129485;

    public JsonTreeReader_getPath_1170023302338() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term129271 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term128935 = (Object[]) newArray("java.lang.Object", 495);
        Object term129329 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term129387 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term129425 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term129271, term129271.getClass(), "stackSize", 15);
        setElement(term128935, 0, term129329);
        setElement(term128935, 2, term129387);
        setElement(term128935, 128, term129425);
        setField(term129271, term129271.getClass(), "stack", term128935);
        term129485 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term129486 = (Object[]) newArray("java.lang.Object", 495);
        Object term129487 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term129488 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term129489 = newInstance(Class.forName("java.lang.Object"));
        setField(term129487, term129487.getClass(), "members", null);
        setElement(term129486, 0, term129487);
        setField(term129488, term129488.getClass(), "members", null);
        setElement(term129486, 2, term129488);
        setElement(term129486, 128, term129489);
        setField(term129485, term129485.getClass(), "stack", term129486);
        setIntField(term129485, term129485.getClass(), "stackSize", 0);
        setField(term129485, term129485.getClass(), "pathNames", null);
        setField(term129485, term129485.getClass(), "pathIndices", null);
        setField(term129485, term129485.getClass(), "in", null);
        setBooleanField(term129485, term129485.getClass(), "lenient", false);
        setField(term129485, term129485.getClass(), "buffer", null);
        setIntField(term129485, term129485.getClass(), "pos", 0);
        setIntField(term129485, term129485.getClass(), "limit", 0);
        setIntField(term129485, term129485.getClass(), "lineNumber", 0);
        setIntField(term129485, term129485.getClass(), "lineStart", 0);
        setIntField(term129485, term129485.getClass(), "peeked", 0);
        setLongField(term129485, term129485.getClass(), "peekedLong", 0L);
        setIntField(term129485, term129485.getClass(), "peekedNumberLength", 0);
        setField(term129485, term129485.getClass(), "peekedString", null);
        setField(term129485, term129485.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term129271, args);
        assertTrue(recursiveEquals(term129271, term129485));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


