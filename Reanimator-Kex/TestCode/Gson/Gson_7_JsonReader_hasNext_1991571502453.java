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

public class JsonReader_hasNext_1991571502453 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172740;
     Object term173041;

    public JsonReader_hasNext_1991571502453() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172740 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        setIntField(term172740, term172740.getClass(), "peeked", 4);
        term173041 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        setField(term173041, term173041.getClass(), "in", null);
        setBooleanField(term173041, term173041.getClass(), "lenient", false);
        setField(term173041, term173041.getClass(), "buffer", null);
        setIntField(term173041, term173041.getClass(), "pos", 0);
        setIntField(term173041, term173041.getClass(), "limit", 0);
        setIntField(term173041, term173041.getClass(), "lineNumber", 0);
        setIntField(term173041, term173041.getClass(), "lineStart", 0);
        setIntField(term173041, term173041.getClass(), "peeked", 4);
        setLongField(term173041, term173041.getClass(), "peekedLong", 0L);
        setIntField(term173041, term173041.getClass(), "peekedNumberLength", 0);
        setField(term173041, term173041.getClass(), "peekedString", null);
        setField(term173041, term173041.getClass(), "stack", null);
        setIntField(term173041, term173041.getClass(), "stackSize", 0);
        setField(term173041, term173041.getClass(), "pathNames", null);
        setField(term173041, term173041.getClass(), "pathIndices", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasNext", argTypes, term172740, args);
        assertTrue(recursiveEquals(term172740, term173041));
        assertTrue(recursiveEquals(retValue, false));
    }

};


