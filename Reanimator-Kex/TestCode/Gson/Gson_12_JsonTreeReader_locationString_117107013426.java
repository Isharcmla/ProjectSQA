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
import java.lang.StringBuilder;

public class JsonTreeReader_locationString_117107013426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179296;
     Object term179640;

    public JsonTreeReader_locationString_117107013426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term179356 = new StringBuilder();
        term179296 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term179015 = (Object[]) newArray("java.lang.Object", 236);
        Object term179412 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term179470 = newInstance(Class.forName("com.google.gson.JsonObject"));
        setIntField(term179296, term179296.getClass(), "stackSize", 4);
        setElement(term179015, 0, term179356);
        setElement(term179015, 1, term179412);
        setElement(term179015, 2, term179470);
        setField(term179296, term179296.getClass(), "stack", term179015);
        term179640 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term179641 = (Object[]) newArray("java.lang.Object", 236);
        Object term179642 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term179643 = (byte[]) newByteArray(16);
        Object term179644 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term179645 = newInstance(Class.forName("com.google.gson.JsonObject"));
        setField(term179642, term179642.getClass(), "value", term179643);
        setByteField(term179642, term179642.getClass(), "coder", (byte) 0);
        setIntField(term179642, term179642.getClass(), "count", 0);
        setElement(term179641, 0, term179642);
        setField(term179644, term179644.getClass(), "elements", null);
        setElement(term179641, 1, term179644);
        setField(term179645, term179645.getClass(), "members", null);
        setElement(term179641, 2, term179645);
        setField(term179640, term179640.getClass(), "stack", term179641);
        setIntField(term179640, term179640.getClass(), "stackSize", 0);
        setField(term179640, term179640.getClass(), "pathNames", null);
        setField(term179640, term179640.getClass(), "pathIndices", null);
        setField(term179640, term179640.getClass(), "in", null);
        setBooleanField(term179640, term179640.getClass(), "lenient", false);
        setField(term179640, term179640.getClass(), "buffer", null);
        setIntField(term179640, term179640.getClass(), "pos", 0);
        setIntField(term179640, term179640.getClass(), "limit", 0);
        setIntField(term179640, term179640.getClass(), "lineNumber", 0);
        setIntField(term179640, term179640.getClass(), "lineStart", 0);
        setIntField(term179640, term179640.getClass(), "peeked", 0);
        setLongField(term179640, term179640.getClass(), "peekedLong", 0L);
        setIntField(term179640, term179640.getClass(), "peekedNumberLength", 0);
        setField(term179640, term179640.getClass(), "peekedString", null);
        setField(term179640, term179640.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "locationString", argTypes, term179296, args);
        assertTrue(recursiveEquals(term179296, term179640));
        assertTrue(recursiveEquals(retValue, " at path $"));
    }

};


