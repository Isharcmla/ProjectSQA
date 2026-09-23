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

public class JsonReader_nextBoolean_2075593930525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term884713;

    public JsonReader_nextBoolean_2075593930525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term884713 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term884025 = (int[]) newIntArray(489);
        setIntField(term884713, term884713.getClass(), "peeked", 13);
        setIntField(term884713, term884713.getClass(), "lineNumber", 0);
        setIntField(term884713, term884713.getClass(), "pos", 0);
        setIntField(term884713, term884713.getClass(), "lineStart", 0);
        setIntField(term884713, term884713.getClass(), "stackSize", 1);
        setIntElement(term884025, 0, 78);
        setIntElement(term884025, 1, 85);
        setIntElement(term884025, 2, 77);
        setIntElement(term884025, 3, 66);
        setIntElement(term884025, 4, 69);
        setIntElement(term884025, 5, 82);
        setField(term884713, term884713.getClass(), "stack", term884025);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextBoolean", argTypes, term884713, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


