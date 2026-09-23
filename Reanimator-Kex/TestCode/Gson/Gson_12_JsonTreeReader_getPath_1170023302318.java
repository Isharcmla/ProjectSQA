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

public class JsonTreeReader_getPath_1170023302318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118206;
     Object term118469;

    public JsonTreeReader_getPath_1170023302318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118206 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term117871 = (Object[]) newArray("java.lang.Object", 495);
        Object term118264 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term118320 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term118378 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term118416 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term118206, term118206.getClass(), "stackSize", 13);
        setElement(term117871, 0, term118264);
        setElement(term117871, 1, term118320);
        setElement(term117871, 2, term118264);
        setElement(term117871, 9, term118378);
        setElement(term117871, 256, term118416);
        setField(term118206, term118206.getClass(), "stack", term117871);
        term118469 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term118470 = (Object[]) newArray("java.lang.Object", 495);
        Object term118471 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term118472 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term118473 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term118474 = newInstance(Class.forName("java.lang.Object"));
        setField(term118471, term118471.getClass(), "members", null);
        setElement(term118470, 0, term118471);
        setField(term118472, term118472.getClass(), "elements", null);
        setElement(term118470, 1, term118472);
        setElement(term118470, 2, term118471);
        setField(term118473, term118473.getClass(), "members", null);
        setElement(term118470, 9, term118473);
        setElement(term118470, 256, term118474);
        setField(term118469, term118469.getClass(), "stack", term118470);
        setIntField(term118469, term118469.getClass(), "stackSize", 0);
        setField(term118469, term118469.getClass(), "pathNames", null);
        setField(term118469, term118469.getClass(), "pathIndices", null);
        setField(term118469, term118469.getClass(), "in", null);
        setBooleanField(term118469, term118469.getClass(), "lenient", false);
        setField(term118469, term118469.getClass(), "buffer", null);
        setIntField(term118469, term118469.getClass(), "pos", 0);
        setIntField(term118469, term118469.getClass(), "limit", 0);
        setIntField(term118469, term118469.getClass(), "lineNumber", 0);
        setIntField(term118469, term118469.getClass(), "lineStart", 0);
        setIntField(term118469, term118469.getClass(), "peeked", 0);
        setLongField(term118469, term118469.getClass(), "peekedLong", 0L);
        setIntField(term118469, term118469.getClass(), "peekedNumberLength", 0);
        setField(term118469, term118469.getClass(), "peekedString", null);
        setField(term118469, term118469.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term118206, args);
        assertTrue(recursiveEquals(term118206, term118469));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


