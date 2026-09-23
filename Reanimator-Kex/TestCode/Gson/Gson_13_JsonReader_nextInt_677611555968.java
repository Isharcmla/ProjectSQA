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
import java.lang.ArrayIndexOutOfBoundsException;
import static com.google.gson.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class JsonReader_nextInt_677611555968 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1389854;

    public JsonReader_nextInt_677611555968() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1389854 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term1389642 = (int[]) newIntArray(1);
        Object[] term1389645 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term1389854, term1389854.getClass(), "peeked", 4);
        setIntField(term1389854, term1389854.getClass(), "lineNumber", 0);
        setIntField(term1389854, term1389854.getClass(), "pos", 0);
        setIntField(term1389854, term1389854.getClass(), "lineStart", 0);
        setIntField(term1389854, term1389854.getClass(), "stackSize", 1);
        setIntElement(term1389642, 0, 3);
        setField(term1389854, term1389854.getClass(), "stack", term1389642);
        setField(term1389854, term1389854.getClass(), "pathNames", term1389645);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextInt", argTypes, term1389854, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


