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

public class JsonTreeReader_popStack_38752429255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7820;

    public JsonTreeReader_popStack_38752429255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7820 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        setField(term7820, term7820.getClass(), "stack", null);
        setIntField(term7820, term7820.getClass(), "stackSize", 0);
        setField(term7820, term7820.getClass(), "pathNames", null);
        setField(term7820, term7820.getClass(), "pathIndices", null);
        setField(term7820, term7820.getClass(), "in", null);
        setBooleanField(term7820, term7820.getClass(), "lenient", false);
        setField(term7820, term7820.getClass(), "buffer", null);
        setIntField(term7820, term7820.getClass(), "pos", 0);
        setIntField(term7820, term7820.getClass(), "limit", 0);
        setIntField(term7820, term7820.getClass(), "lineNumber", 0);
        setIntField(term7820, term7820.getClass(), "lineStart", 0);
        setIntField(term7820, term7820.getClass(), "peeked", 0);
        setLongField(term7820, term7820.getClass(), "peekedLong", 0L);
        setIntField(term7820, term7820.getClass(), "peekedNumberLength", 0);
        setField(term7820, term7820.getClass(), "peekedString", null);
        setField(term7820, term7820.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "popStack", argTypes, term7820, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


