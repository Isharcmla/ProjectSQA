package com.google.gson.internal.bind;

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
import static com.google.gson.internal.bind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class JsonTreeReader_locationString_117107013348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137489;

    public JsonTreeReader_locationString_117107013348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137489 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term137202 = (Object[]) newArray("java.lang.Object", 5);
        Object term137547 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term137641 = newInstance(Class.forName("com.google.gson.JsonArray"));
        char[] term137206 = (char[]) newCharArray(0);
        Object term137699 = newInstance(Class.forName("com.google.gson.JsonObject"));
        setIntField(term137489, term137489.getClass(), "stackSize", 12);
        setElement(term137202, 0, term137547);
        setElement(term137202, 1, "");
        setElement(term137202, 2, term137641);
        setElement(term137202, 3, term137206);
        setElement(term137202, 4, term137699);
        setField(term137489, term137489.getClass(), "stack", term137202);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "locationString", argTypes, term137489, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


