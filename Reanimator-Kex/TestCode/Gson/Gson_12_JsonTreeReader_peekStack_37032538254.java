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

public class JsonTreeReader_peekStack_37032538254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7809;

    public JsonTreeReader_peekStack_37032538254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7809 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        setField(term7809, term7809.getClass(), "stack", null);
        setIntField(term7809, term7809.getClass(), "stackSize", 0);
        setField(term7809, term7809.getClass(), "pathNames", null);
        setField(term7809, term7809.getClass(), "pathIndices", null);
        setField(term7809, term7809.getClass(), "in", null);
        setBooleanField(term7809, term7809.getClass(), "lenient", false);
        setField(term7809, term7809.getClass(), "buffer", null);
        setIntField(term7809, term7809.getClass(), "pos", 0);
        setIntField(term7809, term7809.getClass(), "limit", 0);
        setIntField(term7809, term7809.getClass(), "lineNumber", 0);
        setIntField(term7809, term7809.getClass(), "lineStart", 0);
        setIntField(term7809, term7809.getClass(), "peeked", 0);
        setLongField(term7809, term7809.getClass(), "peekedLong", 0L);
        setIntField(term7809, term7809.getClass(), "peekedNumberLength", 0);
        setField(term7809, term7809.getClass(), "peekedString", null);
        setField(term7809, term7809.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "peekStack", argTypes, term7809, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


