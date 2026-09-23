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

public class JsonReader_nextDouble_1411403318987 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1403400;

    public JsonReader_nextDouble_1411403318987() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1403400 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term1403189 = (int[]) newIntArray(2);
        setIntField(term1403400, term1403400.getClass(), "peeked", 5);
        setIntField(term1403400, term1403400.getClass(), "lineNumber", 0);
        setIntField(term1403400, term1403400.getClass(), "pos", 0);
        setIntField(term1403400, term1403400.getClass(), "lineStart", 0);
        setIntField(term1403400, term1403400.getClass(), "stackSize", 1);
        setIntElement(term1403189, 0, 2);
        setField(term1403400, term1403400.getClass(), "stack", term1403189);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextDouble", argTypes, term1403400, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


