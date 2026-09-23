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

public class JsonTreeReader_getPath_1170023302215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56887;
     Object term58024;

    public JsonTreeReader_getPath_1170023302215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56887 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term56617 = (Object[]) newArray("java.lang.Object", 2);
        Object term56943 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term57055 = newInstance(Class.forName("com.google.gson.internal.LinkedHashTreeMap$EntrySet$1"));
        int[] term56621 = (int[]) newIntArray(18);
        setIntField(term56887, term56887.getClass(), "stackSize", 1);
        setElement(term56617, 0, term56943);
        setElement(term56617, 1, term57055);
        setField(term56887, term56887.getClass(), "stack", term56617);
        setField(term56887, term56887.getClass(), "pathIndices", term56621);
        term58024 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term58025 = (Object[]) newArray("java.lang.Object", 2);
        Object term58026 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term58027 = newInstance(Class.forName("com.google.gson.internal.LinkedHashTreeMap$EntrySet$1"));
        setField(term58026, term58026.getClass(), "elements", null);
        setElement(term58025, 0, term58026);
        setField(term58027, term58027.getClass(), "this$1", null);
        setField(term58027, term58027.getClass(), "next", null);
        setField(term58027, term58027.getClass(), "lastReturned", null);
        setIntField(term58027, term58027.getClass(), "expectedModCount", 0);
        setField(term58027, term58027.getClass(), "this$0", null);
        setElement(term58025, 1, term58027);
        setField(term58024, term58024.getClass(), "stack", term58025);
        setIntField(term58024, term58024.getClass(), "stackSize", 0);
        setField(term58024, term58024.getClass(), "pathNames", null);
        setField(term58024, term58024.getClass(), "pathIndices", null);
        setField(term58024, term58024.getClass(), "in", null);
        setBooleanField(term58024, term58024.getClass(), "lenient", false);
        setField(term58024, term58024.getClass(), "buffer", null);
        setIntField(term58024, term58024.getClass(), "pos", 0);
        setIntField(term58024, term58024.getClass(), "limit", 0);
        setIntField(term58024, term58024.getClass(), "lineNumber", 0);
        setIntField(term58024, term58024.getClass(), "lineStart", 0);
        setIntField(term58024, term58024.getClass(), "peeked", 0);
        setLongField(term58024, term58024.getClass(), "peekedLong", 0L);
        setIntField(term58024, term58024.getClass(), "peekedNumberLength", 0);
        setField(term58024, term58024.getClass(), "peekedString", null);
        setField(term58024, term58024.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPath", argTypes, term56887, args);
        assertTrue(recursiveEquals(term56887, term58024));
        assertTrue(recursiveEquals(retValue, "$[0]"));
    }

};


