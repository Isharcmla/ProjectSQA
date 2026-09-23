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

public class JsonTreeReader_locationString_117107013322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120567;
     Object term121058;

    public JsonTreeReader_locationString_117107013322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120567 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term120101 = (Object[]) newArray("java.lang.Object", 503);
        Object term120625 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term120681 = newInstance(Class.forName("com.google.gson.JsonArray"));
        char[] term119882 = (char[]) newCharArray(74);
        Object term120775 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term120833 = newInstance(Class.forName("com.google.gson.JsonObject"));
        setIntField(term120567, term120567.getClass(), "stackSize", 14);
        setElement(term120101, 0, term120625);
        setElement(term120101, 2, term120681);
        setElement(term120101, 4, term119882);
        setElement(term120101, 6, term120775);
        setElement(term120101, 7, term120833);
        setField(term120567, term120567.getClass(), "stack", term120101);
        term121058 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term121059 = (Object[]) newArray("java.lang.Object", 503);
        Object term121060 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term121061 = newInstance(Class.forName("com.google.gson.JsonArray"));
        char[] term121062 = (char[]) newCharArray(74);
        Object term121063 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term121064 = newInstance(Class.forName("com.google.gson.JsonObject"));
        setField(term121060, term121060.getClass(), "members", null);
        setElement(term121059, 0, term121060);
        setField(term121061, term121061.getClass(), "elements", null);
        setElement(term121059, 2, term121061);
        setElement(term121059, 4, term121062);
        setField(term121063, term121063.getClass(), "stack", null);
        setIntField(term121063, term121063.getClass(), "stackSize", 0);
        setField(term121063, term121063.getClass(), "pathNames", null);
        setField(term121063, term121063.getClass(), "pathIndices", null);
        setField(term121063, term121063.getClass(), "in", null);
        setBooleanField(term121063, term121063.getClass(), "lenient", false);
        setField(term121063, term121063.getClass(), "buffer", null);
        setIntField(term121063, term121063.getClass(), "pos", 0);
        setIntField(term121063, term121063.getClass(), "limit", 0);
        setIntField(term121063, term121063.getClass(), "lineNumber", 0);
        setIntField(term121063, term121063.getClass(), "lineStart", 0);
        setIntField(term121063, term121063.getClass(), "peeked", 0);
        setLongField(term121063, term121063.getClass(), "peekedLong", 0L);
        setIntField(term121063, term121063.getClass(), "peekedNumberLength", 0);
        setField(term121063, term121063.getClass(), "peekedString", null);
        setField(term121063, term121063.getClass(), "stack", null);
        setElement(term121059, 6, term121063);
        setField(term121064, term121064.getClass(), "members", null);
        setElement(term121059, 7, term121064);
        setField(term121058, term121058.getClass(), "stack", term121059);
        setIntField(term121058, term121058.getClass(), "stackSize", 0);
        setField(term121058, term121058.getClass(), "pathNames", null);
        setField(term121058, term121058.getClass(), "pathIndices", null);
        setField(term121058, term121058.getClass(), "in", null);
        setBooleanField(term121058, term121058.getClass(), "lenient", false);
        setField(term121058, term121058.getClass(), "buffer", null);
        setIntField(term121058, term121058.getClass(), "pos", 0);
        setIntField(term121058, term121058.getClass(), "limit", 0);
        setIntField(term121058, term121058.getClass(), "lineNumber", 0);
        setIntField(term121058, term121058.getClass(), "lineStart", 0);
        setIntField(term121058, term121058.getClass(), "peeked", 0);
        setLongField(term121058, term121058.getClass(), "peekedLong", 0L);
        setIntField(term121058, term121058.getClass(), "peekedNumberLength", 0);
        setField(term121058, term121058.getClass(), "peekedString", null);
        setField(term121058, term121058.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "locationString", argTypes, term120567, args);
        assertTrue(recursiveEquals(term120567, term121058));
        assertTrue(recursiveEquals(retValue, " at path $"));
    }

};


