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
import java.lang.StringBuffer;

public class JsonTreeReader_locationString_117107013304 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110271;
     Object term110598;

    public JsonTreeReader_locationString_117107013304() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term110385 = new StringBuffer();
        term110271 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term109970 = (Object[]) newArray("java.lang.Object", 238);
        Object term110327 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term110463 = newInstance(Class.forName("java.lang.CharSequence$1CharIterator"));
        Object term110521 = newInstance(Class.forName("com.google.gson.JsonObject"));
        setIntField(term110271, term110271.getClass(), "stackSize", 10);
        setElement(term109970, 1, term110327);
        setElement(term109970, 2, term110385);
        setElement(term109970, 3, term110463);
        setElement(term109970, 5, term110521);
        setField(term110271, term110271.getClass(), "stack", term109970);
        term110598 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term110599 = (Object[]) newArray("java.lang.Object", 238);
        Object term110600 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term110601 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term110602 = (byte[]) newByteArray(16);
        Object term110603 = newInstance(Class.forName("java.lang.CharSequence$1CharIterator"));
        Object term110604 = newInstance(Class.forName("com.google.gson.JsonObject"));
        setField(term110600, term110600.getClass(), "elements", null);
        setElement(term110599, 1, term110600);
        setField(term110601, term110601.getClass(), "toStringCache", null);
        setField(term110601, term110601.getClass(), "value", term110602);
        setByteField(term110601, term110601.getClass(), "coder", (byte) 0);
        setIntField(term110601, term110601.getClass(), "count", 0);
        setElement(term110599, 2, term110601);
        setIntField(term110603, term110603.getClass(), "cur", 0);
        setField(term110603, term110603.getClass(), "this$0", null);
        setElement(term110599, 3, term110603);
        setField(term110604, term110604.getClass(), "members", null);
        setElement(term110599, 5, term110604);
        setField(term110598, term110598.getClass(), "stack", term110599);
        setIntField(term110598, term110598.getClass(), "stackSize", 0);
        setField(term110598, term110598.getClass(), "pathNames", null);
        setField(term110598, term110598.getClass(), "pathIndices", null);
        setField(term110598, term110598.getClass(), "in", null);
        setBooleanField(term110598, term110598.getClass(), "lenient", false);
        setField(term110598, term110598.getClass(), "buffer", null);
        setIntField(term110598, term110598.getClass(), "pos", 0);
        setIntField(term110598, term110598.getClass(), "limit", 0);
        setIntField(term110598, term110598.getClass(), "lineNumber", 0);
        setIntField(term110598, term110598.getClass(), "lineStart", 0);
        setIntField(term110598, term110598.getClass(), "peeked", 0);
        setLongField(term110598, term110598.getClass(), "peekedLong", 0L);
        setIntField(term110598, term110598.getClass(), "peekedNumberLength", 0);
        setField(term110598, term110598.getClass(), "peekedString", null);
        setField(term110598, term110598.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "locationString", argTypes, term110271, args);
        assertTrue(recursiveEquals(term110271, term110598));
        assertTrue(recursiveEquals(retValue, " at path $"));
    }

};


