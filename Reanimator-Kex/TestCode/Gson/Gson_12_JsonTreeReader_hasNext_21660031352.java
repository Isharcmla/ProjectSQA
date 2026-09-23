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

public class JsonTreeReader_hasNext_21660031352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7787;
     Object term9476;

    public JsonTreeReader_hasNext_21660031352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7787 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        setField(term7787, term7787.getClass(), "stack", null);
        setIntField(term7787, term7787.getClass(), "stackSize", 0);
        setField(term7787, term7787.getClass(), "pathNames", null);
        setField(term7787, term7787.getClass(), "pathIndices", null);
        setField(term7787, term7787.getClass(), "in", null);
        setBooleanField(term7787, term7787.getClass(), "lenient", false);
        setField(term7787, term7787.getClass(), "buffer", null);
        setIntField(term7787, term7787.getClass(), "pos", 0);
        setIntField(term7787, term7787.getClass(), "limit", 0);
        setIntField(term7787, term7787.getClass(), "lineNumber", 0);
        setIntField(term7787, term7787.getClass(), "lineStart", 0);
        setIntField(term7787, term7787.getClass(), "peeked", 0);
        setLongField(term7787, term7787.getClass(), "peekedLong", 0L);
        setIntField(term7787, term7787.getClass(), "peekedNumberLength", 0);
        setField(term7787, term7787.getClass(), "peekedString", null);
        setField(term7787, term7787.getClass(), "stack", null);
        term9476 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        setField(term9476, term9476.getClass(), "stack", null);
        setIntField(term9476, term9476.getClass(), "stackSize", 0);
        setField(term9476, term9476.getClass(), "pathNames", null);
        setField(term9476, term9476.getClass(), "pathIndices", null);
        setField(term9476, term9476.getClass(), "in", null);
        setBooleanField(term9476, term9476.getClass(), "lenient", false);
        setField(term9476, term9476.getClass(), "buffer", null);
        setIntField(term9476, term9476.getClass(), "pos", 0);
        setIntField(term9476, term9476.getClass(), "limit", 0);
        setIntField(term9476, term9476.getClass(), "lineNumber", 0);
        setIntField(term9476, term9476.getClass(), "lineStart", 0);
        setIntField(term9476, term9476.getClass(), "peeked", 0);
        setLongField(term9476, term9476.getClass(), "peekedLong", 0L);
        setIntField(term9476, term9476.getClass(), "peekedNumberLength", 0);
        setField(term9476, term9476.getClass(), "peekedString", null);
        setField(term9476, term9476.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasNext", argTypes, term7787, args);
        assertTrue(recursiveEquals(term7787, term9476));
        assertTrue(recursiveEquals(retValue, true));
    }

};


