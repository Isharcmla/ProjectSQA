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

public class JsonTreeReader_locationString_117107013398 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166505;
     Object term166789;

    public JsonTreeReader_locationString_117107013398() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term166505 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term166218 = (Object[]) newArray("java.lang.Object", 491);
        Object term166561 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term166687 = newInstance(Class.forName("java.lang.CharSequence$1CodePointIterator"));
        Object term166743 = newInstance(Class.forName("com.google.gson.JsonArray"));
        setIntField(term166505, term166505.getClass(), "stackSize", 5);
        setElement(term166218, 1, term166561);
        setElement(term166218, 2, "");
        setElement(term166218, 3, term166687);
        setElement(term166218, 4, term166743);
        setField(term166505, term166505.getClass(), "stack", term166218);
        term166789 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term166790 = (Object[]) newArray("java.lang.Object", 491);
        Object term166791 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term166794 = newInstance(Class.forName("java.lang.CharSequence$1CodePointIterator"));
        Object term166795 = newInstance(Class.forName("com.google.gson.JsonArray"));
        setField(term166791, term166791.getClass(), "elements", null);
        setElement(term166790, 1, term166791);
        setElement(term166790, 2, "");
        setIntField(term166794, term166794.getClass(), "cur", 0);
        setField(term166794, term166794.getClass(), "this$0", null);
        setElement(term166790, 3, term166794);
        setField(term166795, term166795.getClass(), "elements", null);
        setElement(term166790, 4, term166795);
        setField(term166789, term166789.getClass(), "stack", term166790);
        setIntField(term166789, term166789.getClass(), "stackSize", 0);
        setField(term166789, term166789.getClass(), "pathNames", null);
        setField(term166789, term166789.getClass(), "pathIndices", null);
        setField(term166789, term166789.getClass(), "in", null);
        setBooleanField(term166789, term166789.getClass(), "lenient", false);
        setField(term166789, term166789.getClass(), "buffer", null);
        setIntField(term166789, term166789.getClass(), "pos", 0);
        setIntField(term166789, term166789.getClass(), "limit", 0);
        setIntField(term166789, term166789.getClass(), "lineNumber", 0);
        setIntField(term166789, term166789.getClass(), "lineStart", 0);
        setIntField(term166789, term166789.getClass(), "peeked", 0);
        setLongField(term166789, term166789.getClass(), "peekedLong", 0L);
        setIntField(term166789, term166789.getClass(), "peekedNumberLength", 0);
        setField(term166789, term166789.getClass(), "peekedString", null);
        setField(term166789, term166789.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "locationString", argTypes, term166505, args);
        assertTrue(recursiveEquals(term166505, term166789));
        assertTrue(recursiveEquals(retValue, " at path $"));
    }

};


