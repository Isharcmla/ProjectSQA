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

public class JsonTreeReader_locationString_117107013278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94991;
     Object term95092;

    public JsonTreeReader_locationString_117107013278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94991 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term94721 = (Object[]) newArray("java.lang.Object", 491);
        Object term95047 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object[] term94723 = (Object[]) newArray("java.lang.Object", 0);
        setIntField(term94991, term94991.getClass(), "stackSize", 6);
        setElement(term94721, 0, term95047);
        setElement(term94721, 1, term94723);
        setField(term94991, term94991.getClass(), "stack", term94721);
        term95092 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term95093 = (Object[]) newArray("java.lang.Object", 491);
        Object term95094 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object[] term95095 = (Object[]) newArray("java.lang.Object", 0);
        setField(term95094, term95094.getClass(), "elements", null);
        setElement(term95093, 0, term95094);
        setElement(term95093, 1, term95095);
        setField(term95092, term95092.getClass(), "stack", term95093);
        setIntField(term95092, term95092.getClass(), "stackSize", 0);
        setField(term95092, term95092.getClass(), "pathNames", null);
        setField(term95092, term95092.getClass(), "pathIndices", null);
        setField(term95092, term95092.getClass(), "in", null);
        setBooleanField(term95092, term95092.getClass(), "lenient", false);
        setField(term95092, term95092.getClass(), "buffer", null);
        setIntField(term95092, term95092.getClass(), "pos", 0);
        setIntField(term95092, term95092.getClass(), "limit", 0);
        setIntField(term95092, term95092.getClass(), "lineNumber", 0);
        setIntField(term95092, term95092.getClass(), "lineStart", 0);
        setIntField(term95092, term95092.getClass(), "peeked", 0);
        setLongField(term95092, term95092.getClass(), "peekedLong", 0L);
        setIntField(term95092, term95092.getClass(), "peekedNumberLength", 0);
        setField(term95092, term95092.getClass(), "peekedString", null);
        setField(term95092, term95092.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "locationString", argTypes, term94991, args);
        assertTrue(recursiveEquals(term94991, term95092));
        assertTrue(recursiveEquals(retValue, " at path $"));
    }

};


