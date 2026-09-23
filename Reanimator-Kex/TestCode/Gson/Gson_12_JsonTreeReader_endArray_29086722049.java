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

public class JsonTreeReader_endArray_29086722049 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7754;

    public JsonTreeReader_endArray_29086722049() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7754 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        setField(term7754, term7754.getClass(), "stack", null);
        setIntField(term7754, term7754.getClass(), "stackSize", 0);
        setField(term7754, term7754.getClass(), "pathNames", null);
        setField(term7754, term7754.getClass(), "pathIndices", null);
        setField(term7754, term7754.getClass(), "in", null);
        setBooleanField(term7754, term7754.getClass(), "lenient", false);
        setField(term7754, term7754.getClass(), "buffer", null);
        setIntField(term7754, term7754.getClass(), "pos", 0);
        setIntField(term7754, term7754.getClass(), "limit", 0);
        setIntField(term7754, term7754.getClass(), "lineNumber", 0);
        setIntField(term7754, term7754.getClass(), "lineStart", 0);
        setIntField(term7754, term7754.getClass(), "peeked", 0);
        setLongField(term7754, term7754.getClass(), "peekedLong", 0L);
        setIntField(term7754, term7754.getClass(), "peekedNumberLength", 0);
        setField(term7754, term7754.getClass(), "peekedString", null);
        setField(term7754, term7754.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "endArray", argTypes, term7754, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


