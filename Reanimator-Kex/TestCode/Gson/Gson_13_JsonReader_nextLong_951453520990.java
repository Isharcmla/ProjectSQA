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
import java.lang.Object;

public class JsonReader_nextLong_951453520990 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1406065;

    public JsonReader_nextLong_951453520990() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1406065 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term1405727 = (int[]) newIntArray(128);
        Object[] term1405857 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term1406065, term1406065.getClass(), "peeked", 6);
        setIntField(term1406065, term1406065.getClass(), "lineNumber", 0);
        setIntField(term1406065, term1406065.getClass(), "pos", 0);
        setIntField(term1406065, term1406065.getClass(), "lineStart", 0);
        setIntField(term1406065, term1406065.getClass(), "stackSize", 1);
        setIntElement(term1405727, 0, 5);
        setField(term1406065, term1406065.getClass(), "stack", term1405727);
        setField(term1406065, term1406065.getClass(), "pathNames", term1405857);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "nextLong", argTypes, term1406065, args);
    }

};


