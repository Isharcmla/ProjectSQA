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

public class JsonTreeReader_endObject_123071932051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7776;

    public JsonTreeReader_endObject_123071932051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7776 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        setField(term7776, term7776.getClass(), "stack", null);
        setIntField(term7776, term7776.getClass(), "stackSize", 0);
        setField(term7776, term7776.getClass(), "pathNames", null);
        setField(term7776, term7776.getClass(), "pathIndices", null);
        setField(term7776, term7776.getClass(), "in", null);
        setBooleanField(term7776, term7776.getClass(), "lenient", false);
        setField(term7776, term7776.getClass(), "buffer", null);
        setIntField(term7776, term7776.getClass(), "pos", 0);
        setIntField(term7776, term7776.getClass(), "limit", 0);
        setIntField(term7776, term7776.getClass(), "lineNumber", 0);
        setIntField(term7776, term7776.getClass(), "lineStart", 0);
        setIntField(term7776, term7776.getClass(), "peeked", 0);
        setLongField(term7776, term7776.getClass(), "peekedLong", 0L);
        setIntField(term7776, term7776.getClass(), "peekedNumberLength", 0);
        setField(term7776, term7776.getClass(), "peekedString", null);
        setField(term7776, term7776.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "endObject", argTypes, term7776, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


