package com.fasterxml.jackson.databind.deser.impl;

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
import java.lang.reflect.InaccessibleObjectException;
import static com.fasterxml.jackson.databind.deser.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class JavaUtilCollectionsDeserializers_converter_180689703284 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term241453;
     Object term241749;

    public JavaUtilCollectionsDeserializers_converter_180689703284() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term241489 = Class.forName((String) "java.util.Locale$1");
        Class<? extends Object> term241617 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.NumberDeserializers$IntegerDeserializer");
        term241453 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term241581 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term241713 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term241453, term241453.getClass(), "_class", term241489);
        setField(term241581, term241581.getClass(), "_class", term241617);
        setField(term241713, term241713.getClass(), "_class", null);
        setField(term241713, term241713.getClass(), "_superClass", null);
        setField(term241581, term241581.getClass(), "_superClass", term241713);
        setField(term241453, term241453.getClass(), "_superClass", term241581);
        term241749 = Class.forName((String) "java.util.ArraysParallelSortHelpers$FJChar$Merger");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("java.lang.Class");
        Object[] args = new Object[3];
        args[0] = 0;
        args[1] = term241453;
        args[2] = term241749;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


