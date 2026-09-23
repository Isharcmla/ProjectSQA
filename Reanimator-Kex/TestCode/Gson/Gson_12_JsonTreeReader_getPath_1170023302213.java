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

public class JsonTreeReader_getPath_1170023302213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56060;
     Object term57099;

    public JsonTreeReader_getPath_1170023302213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56060 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term55918 = (Object[]) newArray("java.lang.Object", 490);
        Object term56098 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term56060, term56060.getClass(), "stackSize", 3);
        setElement(term55918, 128, term56098);
        setField(term56060, term56060.getClass(), "stack", term55918);
        term57099 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term57100 = (Object[]) newArray("java.lang.Object", 490);
        Object term57101 = newInstance(Class.forName("java.lang.Object"));
        setElement(term57100, 128, term57101);
        setField(term57099, term57099.getClass(), "stack", term57100);
        setIntField(term57099, term57099.getClass(), "stackSize", 0);
        setField(term57099, term57099.getClass(), "pathNames", null);
        setField(term57099, term57099.getClass(), "pathIndices", null);
        setField(term57099, term57099.getClass(), "in", null);
        setBooleanField(term57099, term57099.getClass(), "lenient", false);
        setField(term57099, term57099.getClass(), "buffer", null);
        setIntField(term57099, term57099.getClass(), "pos", 0);
        setIntField(term57099, term57099.getClass(), "limit", 0);
        setIntField(term57099, term57099.getClass(), "lineNumber", 0);
        setIntField(term57099, term57099.getClass(), "lineStart", 0);
        setIntField(term57099, term57099.getClass(), "peeked", 0);
        setLongField(term57099, term57099.getClass(), "peekedLong", 0L);
        setIntField(term57099, term57099.getClass(), "peekedNumberLength", 0);
        setField(term57099, term57099.getClass(), "peekedString", null);
        setField(term57099, term57099.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term56060, args);
        assertTrue(recursiveEquals(term56060, term57099));
        assertTrue(recursiveEquals(retValue, "$"));
    }

};


