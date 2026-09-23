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

public class JsonReader_nextDouble_1411403318589 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term255825;

    public JsonReader_nextDouble_1411403318589() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term255825 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term255134 = (int[]) newIntArray(489);
        setIntField(term255825, term255825.getClass(), "peeked", 4);
        setIntField(term255825, term255825.getClass(), "lineNumber", 0);
        setIntField(term255825, term255825.getClass(), "pos", 0);
        setIntField(term255825, term255825.getClass(), "lineStart", 0);
        setIntField(term255825, term255825.getClass(), "stackSize", 1);
        setIntElement(term255134, 0, 7);
        setField(term255825, term255825.getClass(), "stack", term255134);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextDouble", argTypes, term255825, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


