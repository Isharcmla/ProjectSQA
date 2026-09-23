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

public class JsonTreeReader_locationString_117107013378 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157085;
     Object term157463;

    public JsonTreeReader_locationString_117107013378() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term157297 = new StringBuilder();
        term157085 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term156760 = (Object[]) newArray("java.lang.Object", 41);
        Object term157143 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term157199 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term157365 = newInstance(Class.forName("java.util.Spliterators$3Adapter"));
        setIntField(term157085, term157085.getClass(), "stackSize", 16);
        setElement(term156760, 0, term157143);
        setElement(term156760, 2, term157199);
        setElement(term156760, 3, "");
        setElement(term156760, 4, term157297);
        setElement(term156760, 7, term157365);
        setField(term157085, term157085.getClass(), "stack", term156760);
        term157463 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term157464 = (Object[]) newArray("java.lang.Object", 41);
        Object term157465 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term157466 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term157469 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term157470 = (byte[]) newByteArray(16);
        Object term157471 = newInstance(Class.forName("java.util.Spliterators$3Adapter"));
        setField(term157465, term157465.getClass(), "members", null);
        setElement(term157464, 0, term157465);
        setField(term157466, term157466.getClass(), "elements", null);
        setElement(term157464, 2, term157466);
        setElement(term157464, 3, "");
        setField(term157469, term157469.getClass(), "value", term157470);
        setByteField(term157469, term157469.getClass(), "coder", (byte) 0);
        setIntField(term157469, term157469.getClass(), "count", 0);
        setElement(term157464, 4, term157469);
        setBooleanField(term157471, term157471.getClass(), "valueReady", false);
        setLongField(term157471, term157471.getClass(), "nextElement", 0L);
        setField(term157471, term157471.getClass(), "val$spliterator", null);
        setElement(term157464, 7, term157471);
        setField(term157463, term157463.getClass(), "stack", term157464);
        setIntField(term157463, term157463.getClass(), "stackSize", 0);
        setField(term157463, term157463.getClass(), "pathNames", null);
        setField(term157463, term157463.getClass(), "pathIndices", null);
        setField(term157463, term157463.getClass(), "in", null);
        setBooleanField(term157463, term157463.getClass(), "lenient", false);
        setField(term157463, term157463.getClass(), "buffer", null);
        setIntField(term157463, term157463.getClass(), "pos", 0);
        setIntField(term157463, term157463.getClass(), "limit", 0);
        setIntField(term157463, term157463.getClass(), "lineNumber", 0);
        setIntField(term157463, term157463.getClass(), "lineStart", 0);
        setIntField(term157463, term157463.getClass(), "peeked", 0);
        setLongField(term157463, term157463.getClass(), "peekedLong", 0L);
        setIntField(term157463, term157463.getClass(), "peekedNumberLength", 0);
        setField(term157463, term157463.getClass(), "peekedString", null);
        setField(term157463, term157463.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "locationString", argTypes, term157085, args);
        assertTrue(recursiveEquals(term157085, term157463));
        assertTrue(recursiveEquals(retValue, " at path $"));
    }

};


