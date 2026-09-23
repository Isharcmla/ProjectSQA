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
import java.lang.NullPointerException;
import static com.google.gson.internal.bind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class JsonTreeReader_push_69099376968 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7963;

    public JsonTreeReader_push_69099376968() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7963 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        setField(term7963, term7963.getClass(), "stack", null);
        setIntField(term7963, term7963.getClass(), "stackSize", 0);
        setField(term7963, term7963.getClass(), "pathNames", null);
        setField(term7963, term7963.getClass(), "pathIndices", null);
        setField(term7963, term7963.getClass(), "in", null);
        setBooleanField(term7963, term7963.getClass(), "lenient", false);
        setField(term7963, term7963.getClass(), "buffer", null);
        setIntField(term7963, term7963.getClass(), "pos", 0);
        setIntField(term7963, term7963.getClass(), "limit", 0);
        setIntField(term7963, term7963.getClass(), "lineNumber", 0);
        setIntField(term7963, term7963.getClass(), "lineStart", 0);
        setIntField(term7963, term7963.getClass(), "peeked", 0);
        setLongField(term7963, term7963.getClass(), "peekedLong", 0L);
        setIntField(term7963, term7963.getClass(), "peekedNumberLength", 0);
        setField(term7963, term7963.getClass(), "peekedString", null);
        setField(term7963, term7963.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "push", argTypes, term7963, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


