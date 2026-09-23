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

public class JsonTreeReader_locationString_117107013222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63116;
     Object term63293;

    public JsonTreeReader_locationString_117107013222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63116 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term62967 = (Object[]) newArray("java.lang.Object", 490);
        Object term63210 = newInstance(Class.forName("com.google.gson.JsonArray"));
        setIntField(term63116, term63116.getClass(), "stackSize", 8);
        setElement(term62967, 0, "");
        setElement(term62967, 1, term63210);
        setField(term63116, term63116.getClass(), "stack", term62967);
        term63293 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term63294 = (Object[]) newArray("java.lang.Object", 490);
        Object term63297 = newInstance(Class.forName("com.google.gson.JsonArray"));
        setElement(term63294, 0, "");
        setField(term63297, term63297.getClass(), "elements", null);
        setElement(term63294, 1, term63297);
        setField(term63293, term63293.getClass(), "stack", term63294);
        setIntField(term63293, term63293.getClass(), "stackSize", 0);
        setField(term63293, term63293.getClass(), "pathNames", null);
        setField(term63293, term63293.getClass(), "pathIndices", null);
        setField(term63293, term63293.getClass(), "in", null);
        setBooleanField(term63293, term63293.getClass(), "lenient", false);
        setField(term63293, term63293.getClass(), "buffer", null);
        setIntField(term63293, term63293.getClass(), "pos", 0);
        setIntField(term63293, term63293.getClass(), "limit", 0);
        setIntField(term63293, term63293.getClass(), "lineNumber", 0);
        setIntField(term63293, term63293.getClass(), "lineStart", 0);
        setIntField(term63293, term63293.getClass(), "peeked", 0);
        setLongField(term63293, term63293.getClass(), "peekedLong", 0L);
        setIntField(term63293, term63293.getClass(), "peekedNumberLength", 0);
        setField(term63293, term63293.getClass(), "peekedString", null);
        setField(term63293, term63293.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "locationString", argTypes, term63116, args);
        assertTrue(recursiveEquals(term63116, term63293));
        assertTrue(recursiveEquals(retValue, " at path $"));
    }

};


