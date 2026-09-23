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

public class JsonReader_hasNext_1991571502147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45286;
     Object term45649;

    public JsonReader_hasNext_1991571502147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45286 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        setIntField(term45286, term45286.getClass(), "peeked", 4);
        term45649 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        setField(term45649, term45649.getClass(), "in", null);
        setBooleanField(term45649, term45649.getClass(), "lenient", false);
        setField(term45649, term45649.getClass(), "buffer", null);
        setIntField(term45649, term45649.getClass(), "pos", 0);
        setIntField(term45649, term45649.getClass(), "limit", 0);
        setIntField(term45649, term45649.getClass(), "lineNumber", 0);
        setIntField(term45649, term45649.getClass(), "lineStart", 0);
        setIntField(term45649, term45649.getClass(), "peeked", 4);
        setLongField(term45649, term45649.getClass(), "peekedLong", 0L);
        setIntField(term45649, term45649.getClass(), "peekedNumberLength", 0);
        setField(term45649, term45649.getClass(), "peekedString", null);
        setField(term45649, term45649.getClass(), "stack", null);
        setIntField(term45649, term45649.getClass(), "stackSize", 0);
        setField(term45649, term45649.getClass(), "pathNames", null);
        setField(term45649, term45649.getClass(), "pathIndices", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasNext", argTypes, term45286, args);
        assertTrue(recursiveEquals(term45286, term45649));
        assertTrue(recursiveEquals(retValue, false));
    }

};


