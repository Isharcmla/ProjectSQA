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

public class JsonTreeReader_locationString_117107013236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69359;

    public JsonTreeReader_locationString_117107013236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69359 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term69087 = (Object[]) newArray("java.lang.Object", 3);
        Object term69417 = newInstance(Class.forName("com.google.gson.JsonObject"));
        byte[] term69089 = (byte[]) newByteArray(0);
        Object term69475 = newInstance(Class.forName("com.google.gson.JsonObject"));
        setIntField(term69359, term69359.getClass(), "stackSize", 3);
        setElement(term69087, 0, term69417);
        setElement(term69087, 1, term69089);
        setElement(term69087, 2, term69475);
        setField(term69359, term69359.getClass(), "stack", term69087);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "locationString", argTypes, term69359, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


