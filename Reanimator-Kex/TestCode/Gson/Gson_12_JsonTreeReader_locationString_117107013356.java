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

public class JsonTreeReader_locationString_117107013356 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141948;
     Object term142692;

    public JsonTreeReader_locationString_117107013356() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141948 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term141408 = (Object[]) newArray("java.lang.Object", 244);
        Object term142020 = newInstance(Class.forName("java.util.WeakHashMap$KeyIterator"));
        Object term142076 = newInstance(Class.forName("com.google.gson.JsonArray"));
        char[] term140888 = (char[]) newCharArray(257);
        Object term142134 = newInstance(Class.forName("com.google.gson.JsonObject"));
        setIntField(term141948, term141948.getClass(), "stackSize", 4);
        setElement(term141408, 0, term142020);
        setElement(term141408, 1, term142076);
        setElement(term141408, 2, term140888);
        setElement(term141408, 3, term142134);
        setField(term141948, term141948.getClass(), "stack", term141408);
        term142692 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term142693 = (Object[]) newArray("java.lang.Object", 244);
        Object term142694 = newInstance(Class.forName("java.util.WeakHashMap$KeyIterator"));
        Object term142695 = newInstance(Class.forName("com.google.gson.JsonArray"));
        char[] term142696 = (char[]) newCharArray(257);
        Object term142697 = newInstance(Class.forName("com.google.gson.JsonObject"));
        setField(term142694, term142694.getClass(), "this$0", null);
        setIntField(term142694, term142694.getClass(), "index", 0);
        setField(term142694, term142694.getClass(), "entry", null);
        setField(term142694, term142694.getClass(), "lastReturned", null);
        setIntField(term142694, term142694.getClass(), "expectedModCount", 0);
        setField(term142694, term142694.getClass(), "nextKey", null);
        setField(term142694, term142694.getClass(), "currentKey", null);
        setElement(term142693, 0, term142694);
        setField(term142695, term142695.getClass(), "elements", null);
        setElement(term142693, 1, term142695);
        setElement(term142693, 2, term142696);
        setField(term142697, term142697.getClass(), "members", null);
        setElement(term142693, 3, term142697);
        setField(term142692, term142692.getClass(), "stack", term142693);
        setIntField(term142692, term142692.getClass(), "stackSize", 0);
        setField(term142692, term142692.getClass(), "pathNames", null);
        setField(term142692, term142692.getClass(), "pathIndices", null);
        setField(term142692, term142692.getClass(), "in", null);
        setBooleanField(term142692, term142692.getClass(), "lenient", false);
        setField(term142692, term142692.getClass(), "buffer", null);
        setIntField(term142692, term142692.getClass(), "pos", 0);
        setIntField(term142692, term142692.getClass(), "limit", 0);
        setIntField(term142692, term142692.getClass(), "lineNumber", 0);
        setIntField(term142692, term142692.getClass(), "lineStart", 0);
        setIntField(term142692, term142692.getClass(), "peeked", 0);
        setLongField(term142692, term142692.getClass(), "peekedLong", 0L);
        setIntField(term142692, term142692.getClass(), "peekedNumberLength", 0);
        setField(term142692, term142692.getClass(), "peekedString", null);
        setField(term142692, term142692.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "locationString", argTypes, term141948, args);
        assertTrue(recursiveEquals(term141948, term142692));
        assertTrue(recursiveEquals(retValue, " at path $"));
    }

};


