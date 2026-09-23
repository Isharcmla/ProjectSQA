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

public class JsonReader_nextInt_6776115551020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1440300;

    public JsonReader_nextInt_6776115551020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1440300 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term1440090 = (int[]) newIntArray(1);
        setIntField(term1440300, term1440300.getClass(), "peeked", 11);
        setIntField(term1440300, term1440300.getClass(), "lineNumber", 0);
        setIntField(term1440300, term1440300.getClass(), "pos", 0);
        setIntField(term1440300, term1440300.getClass(), "lineStart", 0);
        setIntField(term1440300, term1440300.getClass(), "stackSize", 2);
        setIntElement(term1440090, 0, 69);
        setField(term1440300, term1440300.getClass(), "stack", term1440090);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "nextInt", argTypes, term1440300, args);
    }

};


