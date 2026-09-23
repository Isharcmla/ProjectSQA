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

public class JsonTreeReader_nextString_111839065358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7853;

    public JsonTreeReader_nextString_111839065358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7853 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        setField(term7853, term7853.getClass(), "stack", null);
        setIntField(term7853, term7853.getClass(), "stackSize", 0);
        setField(term7853, term7853.getClass(), "pathNames", null);
        setField(term7853, term7853.getClass(), "pathIndices", null);
        setField(term7853, term7853.getClass(), "in", null);
        setBooleanField(term7853, term7853.getClass(), "lenient", false);
        setField(term7853, term7853.getClass(), "buffer", null);
        setIntField(term7853, term7853.getClass(), "pos", 0);
        setIntField(term7853, term7853.getClass(), "limit", 0);
        setIntField(term7853, term7853.getClass(), "lineNumber", 0);
        setIntField(term7853, term7853.getClass(), "lineStart", 0);
        setIntField(term7853, term7853.getClass(), "peeked", 0);
        setLongField(term7853, term7853.getClass(), "peekedLong", 0L);
        setIntField(term7853, term7853.getClass(), "peekedNumberLength", 0);
        setField(term7853, term7853.getClass(), "peekedString", null);
        setField(term7853, term7853.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextString", argTypes, term7853, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


