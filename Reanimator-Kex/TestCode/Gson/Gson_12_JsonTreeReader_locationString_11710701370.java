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

public class JsonTreeReader_locationString_11710701370 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7985;
     Object term13979;

    public JsonTreeReader_locationString_11710701370() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7985 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        setField(term7985, term7985.getClass(), "stack", null);
        setIntField(term7985, term7985.getClass(), "stackSize", 0);
        setField(term7985, term7985.getClass(), "pathNames", null);
        setField(term7985, term7985.getClass(), "pathIndices", null);
        setField(term7985, term7985.getClass(), "in", null);
        setBooleanField(term7985, term7985.getClass(), "lenient", false);
        setField(term7985, term7985.getClass(), "buffer", null);
        setIntField(term7985, term7985.getClass(), "pos", 0);
        setIntField(term7985, term7985.getClass(), "limit", 0);
        setIntField(term7985, term7985.getClass(), "lineNumber", 0);
        setIntField(term7985, term7985.getClass(), "lineStart", 0);
        setIntField(term7985, term7985.getClass(), "peeked", 0);
        setLongField(term7985, term7985.getClass(), "peekedLong", 0L);
        setIntField(term7985, term7985.getClass(), "peekedNumberLength", 0);
        setField(term7985, term7985.getClass(), "peekedString", null);
        setField(term7985, term7985.getClass(), "stack", null);
        term13979 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        setField(term13979, term13979.getClass(), "stack", null);
        setIntField(term13979, term13979.getClass(), "stackSize", 0);
        setField(term13979, term13979.getClass(), "pathNames", null);
        setField(term13979, term13979.getClass(), "pathIndices", null);
        setField(term13979, term13979.getClass(), "in", null);
        setBooleanField(term13979, term13979.getClass(), "lenient", false);
        setField(term13979, term13979.getClass(), "buffer", null);
        setIntField(term13979, term13979.getClass(), "pos", 0);
        setIntField(term13979, term13979.getClass(), "limit", 0);
        setIntField(term13979, term13979.getClass(), "lineNumber", 0);
        setIntField(term13979, term13979.getClass(), "lineStart", 0);
        setIntField(term13979, term13979.getClass(), "peeked", 0);
        setLongField(term13979, term13979.getClass(), "peekedLong", 0L);
        setIntField(term13979, term13979.getClass(), "peekedNumberLength", 0);
        setField(term13979, term13979.getClass(), "peekedString", null);
        setField(term13979, term13979.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "locationString", argTypes, term7985, args);
        assertTrue(recursiveEquals(term7985, term13979));
        assertTrue(recursiveEquals(retValue, " at path $"));
    }

};


