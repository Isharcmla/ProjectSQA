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

public class JsonReader_nextNull_1017823471623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term347496;

    public JsonReader_nextNull_1017823471623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term347496 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term347076 = (int[]) newIntArray(224);
        setIntField(term347496, term347496.getClass(), "peeked", 2);
        setIntField(term347496, term347496.getClass(), "lineNumber", 0);
        setIntField(term347496, term347496.getClass(), "pos", 0);
        setIntField(term347496, term347496.getClass(), "lineStart", 0);
        setIntField(term347496, term347496.getClass(), "stackSize", 1);
        setIntElement(term347076, 0, 66);
        setIntElement(term347076, 1, 69);
        setIntElement(term347076, 2, 71);
        setIntElement(term347076, 3, 73);
        setIntElement(term347076, 4, 78);
        setIntElement(term347076, 5, 95);
        setIntElement(term347076, 6, 79);
        setIntElement(term347076, 7, 66);
        setIntElement(term347076, 8, 74);
        setIntElement(term347076, 9, 69);
        setIntElement(term347076, 10, 67);
        setIntElement(term347076, 11, 84);
        setField(term347496, term347496.getClass(), "stack", term347076);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextNull", argTypes, term347496, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


