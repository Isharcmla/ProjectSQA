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

public class JsonTreeReader_locationString_117107013314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115688;

    public JsonTreeReader_locationString_117107013314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term115688 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term115411 = (Object[]) newArray("java.lang.Object", 8);
        Object term115746 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term115804 = newInstance(Class.forName("com.google.gson.JsonObject"));
        setIntField(term115688, term115688.getClass(), "stackSize", 18);
        setElement(term115411, 0, term115746);
        setElement(term115411, 2, term115804);
        setField(term115688, term115688.getClass(), "stack", term115411);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "locationString", argTypes, term115688, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


