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

public class JavaUtilCollectionsDeserializers_converter_180689703203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147036;
     Object term147424;

    public JavaUtilCollectionsDeserializers_converter_180689703203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term147072 = Class.forName((String) "java.util.TimerTask");
        Class<? extends Object> term147200 = Class.forName((String) "com.fasterxml.jackson.core.util.BufferRecycler");
        term147036 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term147164 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term147296 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term147388 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term147036, term147036.getClass(), "_class", term147072);
        setField(term147164, term147164.getClass(), "_class", term147200);
        setField(term147296, term147296.getClass(), "_class", null);
        setField(term147296, term147296.getClass(), "_superClass", term147388);
        setField(term147164, term147164.getClass(), "_superClass", term147296);
        setField(term147036, term147036.getClass(), "_superClass", term147164);
        term147424 = Class.forName((String) "java.lang.PublicMethods$MethodList");
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
        args[1] = term147036;
        args[2] = term147424;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


