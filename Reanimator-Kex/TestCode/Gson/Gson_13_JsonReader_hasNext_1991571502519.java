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

public class JsonReader_hasNext_1991571502519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term878867;
     Object term878882;

    public JsonReader_hasNext_1991571502519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term878867 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        setIntField(term878867, term878867.getClass(), "peeked", 4);
        term878882 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        setField(term878882, term878882.getClass(), "in", null);
        setBooleanField(term878882, term878882.getClass(), "lenient", false);
        setField(term878882, term878882.getClass(), "buffer", null);
        setIntField(term878882, term878882.getClass(), "pos", 0);
        setIntField(term878882, term878882.getClass(), "limit", 0);
        setIntField(term878882, term878882.getClass(), "lineNumber", 0);
        setIntField(term878882, term878882.getClass(), "lineStart", 0);
        setIntField(term878882, term878882.getClass(), "peeked", 4);
        setLongField(term878882, term878882.getClass(), "peekedLong", 0L);
        setIntField(term878882, term878882.getClass(), "peekedNumberLength", 0);
        setField(term878882, term878882.getClass(), "peekedString", null);
        setField(term878882, term878882.getClass(), "stack", null);
        setIntField(term878882, term878882.getClass(), "stackSize", 0);
        setField(term878882, term878882.getClass(), "pathNames", null);
        setField(term878882, term878882.getClass(), "pathIndices", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasNext", argTypes, term878867, args);
        assertTrue(recursiveEquals(term878867, term878882));
        assertTrue(recursiveEquals(retValue, false));
    }

};


