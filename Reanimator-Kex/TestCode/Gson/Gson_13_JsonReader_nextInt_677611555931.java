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

public class JsonReader_nextInt_677611555931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1357633;

    public JsonReader_nextInt_677611555931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1357633 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term1357427 = (int[]) newIntArray(1);
        setIntField(term1357633, term1357633.getClass(), "peeked", 11);
        setIntField(term1357633, term1357633.getClass(), "lineNumber", 0);
        setIntField(term1357633, term1357633.getClass(), "pos", 0);
        setIntField(term1357633, term1357633.getClass(), "lineStart", 0);
        setIntField(term1357633, term1357633.getClass(), "stackSize", 1);
        setIntElement(term1357427, 0, 3);
        setField(term1357633, term1357633.getClass(), "stack", term1357427);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextInt", argTypes, term1357633, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


