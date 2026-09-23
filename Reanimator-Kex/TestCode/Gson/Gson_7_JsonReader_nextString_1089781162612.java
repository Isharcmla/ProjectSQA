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

public class JsonReader_nextString_1089781162612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term290291;

    public JsonReader_nextString_1089781162612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term290291 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term289599 = (int[]) newIntArray(489);
        setIntField(term290291, term290291.getClass(), "peeked", 5);
        setIntField(term290291, term290291.getClass(), "lineNumber", 0);
        setIntField(term290291, term290291.getClass(), "pos", 0);
        setIntField(term290291, term290291.getClass(), "lineStart", 0);
        setIntField(term290291, term290291.getClass(), "stackSize", 2);
        setIntElement(term289599, 0, 7);
        setField(term290291, term290291.getClass(), "stack", term289599);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "nextString", argTypes, term290291, args);
    }

};


