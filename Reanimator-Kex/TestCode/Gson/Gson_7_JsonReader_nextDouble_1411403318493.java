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

public class JsonReader_nextDouble_1411403318493 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term190464;

    public JsonReader_nextDouble_1411403318493() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term190464 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term189896 = (int[]) newIntArray(368);
        setIntField(term190464, term190464.getClass(), "peeked", 4);
        setIntField(term190464, term190464.getClass(), "lineNumber", 0);
        setIntField(term190464, term190464.getClass(), "pos", 0);
        setIntField(term190464, term190464.getClass(), "lineStart", 0);
        setIntField(term190464, term190464.getClass(), "stackSize", 1);
        setIntElement(term189896, 0, 66);
        setIntElement(term189896, 1, 69);
        setIntElement(term189896, 2, 71);
        setIntElement(term189896, 3, 73);
        setIntElement(term189896, 4, 78);
        setIntElement(term189896, 5, 95);
        setIntElement(term189896, 6, 79);
        setIntElement(term189896, 7, 66);
        setIntElement(term189896, 8, 74);
        setIntElement(term189896, 9, 69);
        setIntElement(term189896, 10, 67);
        setIntElement(term189896, 11, 84);
        setField(term190464, term190464.getClass(), "stack", term189896);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextDouble", argTypes, term190464, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


