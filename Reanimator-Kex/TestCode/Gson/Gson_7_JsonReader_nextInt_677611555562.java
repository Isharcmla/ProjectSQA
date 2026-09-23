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

public class JsonReader_nextInt_677611555562 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233398;

    public JsonReader_nextInt_677611555562() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term233398 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term233094 = (int[]) newIntArray(105);
        setIntField(term233398, term233398.getClass(), "peeked", 10);
        setIntField(term233398, term233398.getClass(), "lineNumber", 0);
        setIntField(term233398, term233398.getClass(), "pos", 0);
        setIntField(term233398, term233398.getClass(), "lineStart", 0);
        setIntField(term233398, term233398.getClass(), "stackSize", 1);
        setIntElement(term233094, 0, 66);
        setIntElement(term233094, 1, 69);
        setIntElement(term233094, 2, 71);
        setIntElement(term233094, 3, 73);
        setIntElement(term233094, 4, 78);
        setIntElement(term233094, 5, 95);
        setIntElement(term233094, 6, 79);
        setIntElement(term233094, 7, 66);
        setIntElement(term233094, 8, 74);
        setIntElement(term233094, 9, 69);
        setIntElement(term233094, 10, 67);
        setIntElement(term233094, 11, 84);
        setField(term233398, term233398.getClass(), "stack", term233094);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextInt", argTypes, term233398, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


