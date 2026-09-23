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

public class JsonTreeReader_locationString_117107013288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101627;

    public JsonTreeReader_locationString_117107013288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101627 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term101359 = (Object[]) newArray("java.lang.Object", 3);
        Object term101683 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term101779 = newInstance(Class.forName("com.google.gson.JsonObject"));
        setIntField(term101627, term101627.getClass(), "stackSize", 8);
        setElement(term101359, 0, term101683);
        setElement(term101359, 1, "");
        setElement(term101359, 2, term101779);
        setField(term101627, term101627.getClass(), "stack", term101359);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "locationString", argTypes, term101627, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


