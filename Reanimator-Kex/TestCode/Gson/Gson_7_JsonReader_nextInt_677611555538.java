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

public class JsonReader_nextInt_677611555538 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term221368;

    public JsonReader_nextInt_677611555538() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term221368 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term221164 = (int[]) newIntArray(1);
        setIntField(term221368, term221368.getClass(), "peeked", 3);
        setIntField(term221368, term221368.getClass(), "lineNumber", 0);
        setIntField(term221368, term221368.getClass(), "pos", 0);
        setIntField(term221368, term221368.getClass(), "lineStart", 0);
        setIntField(term221368, term221368.getClass(), "stackSize", 1);
        setIntElement(term221164, 0, 5);
        setField(term221368, term221368.getClass(), "stack", term221164);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextInt", argTypes, term221368, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


