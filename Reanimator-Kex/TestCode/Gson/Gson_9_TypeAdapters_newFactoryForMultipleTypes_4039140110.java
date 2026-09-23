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

public class TypeAdapters_newFactoryForMultipleTypes_4039140110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term363;

    public TypeAdapters_newFactoryForMultipleTypes_4039140110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term363 = newInstance(Class.forName("com.google.gson.internal.bind.TypeAdapters$34"));
        setField(term363, term363.getClass(), "val$base", null);
        setField(term363, term363.getClass(), "val$sub", null);
        setField(term363, term363.getClass(), "val$typeAdapter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.TypeAdapters");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Class.forName("java.lang.Class");
        argTypes[2] = Class.forName("com.google.gson.TypeAdapter");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        Object retValue = callMethod(klass, "newFactoryForMultipleTypes", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term363));
    }

};


