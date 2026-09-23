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

public class JsonReader_nextInt_677611555858 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1307323;

    public JsonReader_nextInt_677611555858() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1307323 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term1307119 = (int[]) newIntArray(1);
        setIntField(term1307323, term1307323.getClass(), "peeked", 4);
        setIntField(term1307323, term1307323.getClass(), "lineNumber", 0);
        setIntField(term1307323, term1307323.getClass(), "pos", 0);
        setIntField(term1307323, term1307323.getClass(), "lineStart", 0);
        setIntField(term1307323, term1307323.getClass(), "stackSize", 1);
        setIntElement(term1307119, 0, 7);
        setField(term1307323, term1307323.getClass(), "stack", term1307119);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextInt", argTypes, term1307323, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


