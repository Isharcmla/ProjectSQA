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

public class JsonReader_nextInt_677611555623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term308668;

    public JsonReader_nextInt_677611555623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term308668 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term308463 = (int[]) newIntArray(6);
        setIntField(term308668, term308668.getClass(), "peeked", 10);
        setIntField(term308668, term308668.getClass(), "lineNumber", 0);
        setIntField(term308668, term308668.getClass(), "pos", 0);
        setIntField(term308668, term308668.getClass(), "lineStart", 0);
        setIntField(term308668, term308668.getClass(), "stackSize", 1);
        setIntElement(term308463, 0, 5);
        setField(term308668, term308668.getClass(), "stack", term308463);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "nextInt", argTypes, term308668, args);
    }

};


