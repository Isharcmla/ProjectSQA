package com.google.gson.stream;

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
import static com.google.gson.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.gson.stream.EqualityUtils.*;

public class JsonReader_peek_1619332198246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159944;
     Object term160596;

    public JsonReader_peek_1619332198246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term159944 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        setIntField(term159944, term159944.getClass(), "peeked", 0);
        term160596 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        setField(term160596, term160596.getClass(), "stack", null);
        setIntField(term160596, term160596.getClass(), "stackSize", 0);
        setField(term160596, term160596.getClass(), "pathNames", null);
        setField(term160596, term160596.getClass(), "pathIndices", null);
        setField(term160596, term160596.getClass(), "in", null);
        setBooleanField(term160596, term160596.getClass(), "lenient", false);
        setField(term160596, term160596.getClass(), "buffer", null);
        setIntField(term160596, term160596.getClass(), "pos", 0);
        setIntField(term160596, term160596.getClass(), "limit", 0);
        setIntField(term160596, term160596.getClass(), "lineNumber", 0);
        setIntField(term160596, term160596.getClass(), "lineStart", 0);
        setIntField(term160596, term160596.getClass(), "peeked", 0);
        setLongField(term160596, term160596.getClass(), "peekedLong", 0L);
        setIntField(term160596, term160596.getClass(), "peekedNumberLength", 0);
        setField(term160596, term160596.getClass(), "peekedString", null);
        setField(term160596, term160596.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "peek", argTypes, term159944, args);
        assertTrue(recursiveEquals(term159944, term160596));
    }

};


