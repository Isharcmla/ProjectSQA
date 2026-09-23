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

public class JsonTreeReader_getPath_1170023302449 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term209491;

    public JsonTreeReader_getPath_1170023302449() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term209491 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term209221 = (Object[]) newArray("java.lang.Object", 4);
        Object term209585 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object term209643 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term209699 = newInstance(Class.forName("com.google.gson.JsonArray"));
        setIntField(term209491, term209491.getClass(), "stackSize", 5);
        setElement(term209221, 0, term209585);
        setElement(term209221, 1, term209643);
        setElement(term209221, 2, term209585);
        setElement(term209221, 3, term209699);
        setField(term209491, term209491.getClass(), "stack", term209221);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getPath", argTypes, term209491, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


