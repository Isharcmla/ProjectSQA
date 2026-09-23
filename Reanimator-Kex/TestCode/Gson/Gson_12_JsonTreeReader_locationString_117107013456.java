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

public class JsonTreeReader_locationString_117107013456 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term251994;
     Object term253824;

    public JsonTreeReader_locationString_117107013456() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term251994 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term251691 = (Object[]) newArray("java.lang.Object", 489);
        Object term252052 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term252108 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term252202 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term252314 = newInstance(Class.forName("java.util.TreeMap$NavigableSubMap$SubMapEntryIterator"));
        Object term252400 = newInstance(Class.forName("java.util.Collections$UnmodifiableList$1"));
        Object term252438 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term251994, term251994.getClass(), "stackSize", 6);
        setElement(term251691, 0, term252052);
        setElement(term251691, 2, term252108);
        setElement(term251691, 3, term252202);
        setElement(term251691, 4, term252314);
        setElement(term251691, 5, term252400);
        setElement(term251691, 16, term252438);
        setField(term251994, term251994.getClass(), "stack", term251691);
        term253824 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term253825 = (Object[]) newArray("java.lang.Object", 489);
        Object term253826 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term253827 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term253828 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term253829 = newInstance(Class.forName("java.util.TreeMap$NavigableSubMap$SubMapEntryIterator"));
        Object term253830 = newInstance(Class.forName("java.util.Collections$UnmodifiableList$1"));
        Object term253831 = newInstance(Class.forName("java.lang.Object"));
        setField(term253826, term253826.getClass(), "members", null);
        setElement(term253825, 0, term253826);
        setField(term253827, term253827.getClass(), "elements", null);
        setElement(term253825, 2, term253827);
        setField(term253828, term253828.getClass(), "stack", null);
        setIntField(term253828, term253828.getClass(), "stackSize", 0);
        setField(term253828, term253828.getClass(), "pathNames", null);
        setField(term253828, term253828.getClass(), "pathIndices", null);
        setField(term253828, term253828.getClass(), "in", null);
        setBooleanField(term253828, term253828.getClass(), "lenient", false);
        setField(term253828, term253828.getClass(), "buffer", null);
        setIntField(term253828, term253828.getClass(), "pos", 0);
        setIntField(term253828, term253828.getClass(), "limit", 0);
        setIntField(term253828, term253828.getClass(), "lineNumber", 0);
        setIntField(term253828, term253828.getClass(), "lineStart", 0);
        setIntField(term253828, term253828.getClass(), "peeked", 0);
        setLongField(term253828, term253828.getClass(), "peekedLong", 0L);
        setIntField(term253828, term253828.getClass(), "peekedNumberLength", 0);
        setField(term253828, term253828.getClass(), "peekedString", null);
        setField(term253828, term253828.getClass(), "stack", null);
        setElement(term253825, 3, term253828);
        setField(term253829, term253829.getClass(), "this$0", null);
        setField(term253829, term253829.getClass(), "lastReturned", null);
        setField(term253829, term253829.getClass(), "next", null);
        setField(term253829, term253829.getClass(), "fenceKey", null);
        setIntField(term253829, term253829.getClass(), "expectedModCount", 0);
        setElement(term253825, 4, term253829);
        setField(term253830, term253830.getClass(), "i", null);
        setIntField(term253830, term253830.getClass(), "val$index", 0);
        setField(term253830, term253830.getClass(), "this$0", null);
        setElement(term253825, 5, term253830);
        setElement(term253825, 16, term253831);
        setField(term253824, term253824.getClass(), "stack", term253825);
        setIntField(term253824, term253824.getClass(), "stackSize", 0);
        setField(term253824, term253824.getClass(), "pathNames", null);
        setField(term253824, term253824.getClass(), "pathIndices", null);
        setField(term253824, term253824.getClass(), "in", null);
        setBooleanField(term253824, term253824.getClass(), "lenient", false);
        setField(term253824, term253824.getClass(), "buffer", null);
        setIntField(term253824, term253824.getClass(), "pos", 0);
        setIntField(term253824, term253824.getClass(), "limit", 0);
        setIntField(term253824, term253824.getClass(), "lineNumber", 0);
        setIntField(term253824, term253824.getClass(), "lineStart", 0);
        setIntField(term253824, term253824.getClass(), "peeked", 0);
        setLongField(term253824, term253824.getClass(), "peekedLong", 0L);
        setIntField(term253824, term253824.getClass(), "peekedNumberLength", 0);
        setField(term253824, term253824.getClass(), "peekedString", null);
        setField(term253824, term253824.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "locationString", argTypes, term251994, args);
        assertTrue(recursiveEquals(term251994, term253824));
        assertTrue(recursiveEquals(retValue, " at path $"));
    }

};


