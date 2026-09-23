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

public class JsonTreeReader_getPath_1170023302227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65051;
     Object term66333;

    public JsonTreeReader_getPath_1170023302227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65051 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term64786 = (Object[]) newArray("java.lang.Object", 491);
        Object term65109 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term65147 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term65051, term65051.getClass(), "stackSize", 6);
        setElement(term64786, 1, term65109);
        setElement(term64786, 128, term65147);
        setField(term65051, term65051.getClass(), "stack", term64786);
        term66333 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term66334 = (Object[]) newArray("java.lang.Object", 491);
        Object term66335 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term66336 = newInstance(Class.forName("java.lang.Object"));
        setField(term66335, term66335.getClass(), "members", null);
        setElement(term66334, 1, term66335);
        setElement(term66334, 128, term66336);
        setField(term66333, term66333.getClass(), "stack", term66334);
        setIntField(term66333, term66333.getClass(), "stackSize", 0);
        setField(term66333, term66333.getClass(), "pathNames", null);
        setField(term66333, term66333.getClass(), "pathIndices", null);
        setField(term66333, term66333.getClass(), "in", null);
        setBooleanField(term66333, term66333.getClass(), "lenient", false);
        setField(term66333, term66333.getClass(), "buffer", null);
        setIntField(term66333, term66333.getClass(), "pos", 0);
        setIntField(term66333, term66333.getClass(), "limit", 0);
        setIntField(term66333, term66333.getClass(), "lineNumber", 0);
        setIntField(term66333, term66333.getClass(), "lineStart", 0);
        setIntField(term66333, term66333.getClass(), "peeked", 0);
        setLongField(term66333, term66333.getClass(), "peekedLong", 0L);
        setIntField(term66333, term66333.getClass(), "peekedNumberLength", 0);
        setField(term66333, term66333.getClass(), "peekedString", null);
        setField(term66333, term66333.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term65051, args);
        assertTrue(recursiveEquals(term65051, term66333));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


