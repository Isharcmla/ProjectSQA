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

public class JsonReader_nextInt_6776115551004 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1421802;

    public JsonReader_nextInt_6776115551004() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1421802 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term1421537 = (int[]) newIntArray(64);
        Object[] term1421603 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term1421802, term1421802.getClass(), "peeked", 11);
        setIntField(term1421802, term1421802.getClass(), "lineNumber", 0);
        setIntField(term1421802, term1421802.getClass(), "pos", 0);
        setIntField(term1421802, term1421802.getClass(), "lineStart", 0);
        setIntField(term1421802, term1421802.getClass(), "stackSize", 1);
        setIntElement(term1421537, 0, 3);
        setField(term1421802, term1421802.getClass(), "stack", term1421537);
        setField(term1421802, term1421802.getClass(), "pathNames", term1421603);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "nextInt", argTypes, term1421802, args);
    }

};


