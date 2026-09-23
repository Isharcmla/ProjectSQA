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

public class JsonReader_nextInt_677611555961 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1384412;

    public JsonReader_nextInt_677611555961() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1384412 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term1383221 = (int[]) newIntArray(489);
        setIntField(term1384412, term1384412.getClass(), "peeked", 4);
        setIntField(term1384412, term1384412.getClass(), "lineNumber", 0);
        setIntField(term1384412, term1384412.getClass(), "pos", 0);
        setIntField(term1384412, term1384412.getClass(), "lineStart", 0);
        setIntField(term1384412, term1384412.getClass(), "stackSize", 2);
        setIntElement(term1383221, 0, 69);
        setIntElement(term1383221, 1, 3);
        setField(term1384412, term1384412.getClass(), "stack", term1383221);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextInt", argTypes, term1384412, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


