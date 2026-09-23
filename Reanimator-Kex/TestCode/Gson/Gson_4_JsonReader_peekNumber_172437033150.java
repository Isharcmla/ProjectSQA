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

public class JsonReader_peekNumber_172437033150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9422;

    public JsonReader_peekNumber_172437033150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9422 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        setField(term9422, term9422.getClass(), "in", null);
        setBooleanField(term9422, term9422.getClass(), "lenient", false);
        setField(term9422, term9422.getClass(), "buffer", null);
        setIntField(term9422, term9422.getClass(), "pos", 0);
        setIntField(term9422, term9422.getClass(), "limit", 0);
        setIntField(term9422, term9422.getClass(), "lineNumber", 0);
        setIntField(term9422, term9422.getClass(), "lineStart", 0);
        setIntField(term9422, term9422.getClass(), "peeked", 0);
        setLongField(term9422, term9422.getClass(), "peekedLong", 0L);
        setIntField(term9422, term9422.getClass(), "peekedNumberLength", 0);
        setField(term9422, term9422.getClass(), "peekedString", null);
        setField(term9422, term9422.getClass(), "stack", null);
        setIntField(term9422, term9422.getClass(), "stackSize", 0);
        setField(term9422, term9422.getClass(), "pathNames", null);
        setField(term9422, term9422.getClass(), "pathIndices", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "peekNumber", argTypes, term9422, args);
    }

};


