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

public class JsonTreeReader_locationString_117107013198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49713;
     Object term49817;

    public JsonTreeReader_locationString_117107013198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49713 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term49570 = (Object[]) newArray("java.lang.Object", 41);
        char[] term49571 = (char[]) newCharArray(0);
        Object term49751 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term49713, term49713.getClass(), "stackSize", 2);
        setElement(term49570, 0, term49571);
        setElement(term49570, 1, term49751);
        setField(term49713, term49713.getClass(), "stack", term49570);
        term49817 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term49818 = (Object[]) newArray("java.lang.Object", 41);
        char[] term49819 = (char[]) newCharArray(0);
        Object term49820 = newInstance(Class.forName("java.lang.Object"));
        setElement(term49818, 0, term49819);
        setElement(term49818, 1, term49820);
        setField(term49817, term49817.getClass(), "stack", term49818);
        setIntField(term49817, term49817.getClass(), "stackSize", 0);
        setField(term49817, term49817.getClass(), "pathNames", null);
        setField(term49817, term49817.getClass(), "pathIndices", null);
        setField(term49817, term49817.getClass(), "in", null);
        setBooleanField(term49817, term49817.getClass(), "lenient", false);
        setField(term49817, term49817.getClass(), "buffer", null);
        setIntField(term49817, term49817.getClass(), "pos", 0);
        setIntField(term49817, term49817.getClass(), "limit", 0);
        setIntField(term49817, term49817.getClass(), "lineNumber", 0);
        setIntField(term49817, term49817.getClass(), "lineStart", 0);
        setIntField(term49817, term49817.getClass(), "peeked", 0);
        setLongField(term49817, term49817.getClass(), "peekedLong", 0L);
        setIntField(term49817, term49817.getClass(), "peekedNumberLength", 0);
        setField(term49817, term49817.getClass(), "peekedString", null);
        setField(term49817, term49817.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "locationString", argTypes, term49713, args);
        assertTrue(recursiveEquals(term49713, term49817));
        assertTrue(recursiveEquals(retValue, " at path $"));
    }

};


