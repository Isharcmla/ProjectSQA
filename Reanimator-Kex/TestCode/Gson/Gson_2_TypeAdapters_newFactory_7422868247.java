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
import static com.google.gson.internal.bind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.gson.internal.bind.EqualityUtils.*;
import java.lang.Object;

public class TypeAdapters_newFactory_7422868247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term360;
     Object term358;

    public TypeAdapters_newFactory_7422868247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.google.gson.reflect.TypeToken"));
        setField(term1, term1.getClass(), "rawType", null);
        setField(term1, term1.getClass(), "type", null);
        term360 = newInstance(Class.forName("com.google.gson.reflect.TypeToken"));
        setField(term360, term360.getClass(), "rawType", null);
        setField(term360, term360.getClass(), "type", null);
        term358 = newInstance(Class.forName("com.google.gson.internal.bind.TypeAdapters$27"));
        Object term359 = newInstance(Class.forName("com.google.gson.reflect.TypeToken"));
        setField(term359, term359.getClass(), "rawType", null);
        setField(term359, term359.getClass(), "type", null);
        setField(term358, term358.getClass(), "val$type", term359);
        setField(term358, term358.getClass(), "val$typeAdapter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.TypeAdapters");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.gson.reflect.TypeToken");
        argTypes[1] = Class.forName("com.google.gson.TypeAdapter");
        Object[] args = new Object[2];
        args[0] = term1;
        args[1] = null;
        Object retValue = callMethod(klass, "newFactory", argTypes, null, args);
        assertTrue(recursiveEquals(term1, term360));
        assertTrue(recursiveEquals(retValue, term358));
    }

};


