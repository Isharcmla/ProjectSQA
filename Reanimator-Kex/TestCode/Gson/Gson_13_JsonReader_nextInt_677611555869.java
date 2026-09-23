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
import java.lang.NullPointerException;
import static com.google.gson.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class JsonReader_nextInt_677611555869 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1317480;

    public JsonReader_nextInt_677611555869() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1317480 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term1317276 = (int[]) newIntArray(1);
        setIntField(term1317480, term1317480.getClass(), "peeked", 4);
        setIntField(term1317480, term1317480.getClass(), "lineNumber", 0);
        setIntField(term1317480, term1317480.getClass(), "pos", 0);
        setIntField(term1317480, term1317480.getClass(), "lineStart", 0);
        setIntField(term1317480, term1317480.getClass(), "stackSize", 1);
        setIntElement(term1317276, 0, 5);
        setField(term1317480, term1317480.getClass(), "stack", term1317276);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextInt", argTypes, term1317480, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


