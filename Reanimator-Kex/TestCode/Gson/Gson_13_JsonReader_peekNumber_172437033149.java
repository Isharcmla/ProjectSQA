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

public class JsonReader_peekNumber_172437033149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9302;

    public JsonReader_peekNumber_172437033149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9302 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        setField(term9302, term9302.getClass(), "in", null);
        setBooleanField(term9302, term9302.getClass(), "lenient", false);
        setField(term9302, term9302.getClass(), "buffer", null);
        setIntField(term9302, term9302.getClass(), "pos", 0);
        setIntField(term9302, term9302.getClass(), "limit", 0);
        setIntField(term9302, term9302.getClass(), "lineNumber", 0);
        setIntField(term9302, term9302.getClass(), "lineStart", 0);
        setIntField(term9302, term9302.getClass(), "peeked", 0);
        setLongField(term9302, term9302.getClass(), "peekedLong", 0L);
        setIntField(term9302, term9302.getClass(), "peekedNumberLength", 0);
        setField(term9302, term9302.getClass(), "peekedString", null);
        setField(term9302, term9302.getClass(), "stack", null);
        setIntField(term9302, term9302.getClass(), "stackSize", 0);
        setField(term9302, term9302.getClass(), "pathNames", null);
        setField(term9302, term9302.getClass(), "pathIndices", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "peekNumber", argTypes, term9302, args);
    }

};


