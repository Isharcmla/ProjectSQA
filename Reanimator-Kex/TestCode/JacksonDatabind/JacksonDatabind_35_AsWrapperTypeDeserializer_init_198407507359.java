package com.fasterxml.jackson.databind.jsontype.impl;

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
import static com.fasterxml.jackson.databind.jsontype.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class AsWrapperTypeDeserializer_init_198407507359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41343;
     Object term41509;

    public AsWrapperTypeDeserializer_init_198407507359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term41237 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(term41237, term41237.getClass(), "_baseType", null);
        setField(term41237, term41237.getClass(), "_idResolver", null);
        setField(term41237, term41237.getClass(), "_typePropertyName", null);
        setBooleanField(term41237, term41237.getClass(), "_typeIdVisible", false);
        setField(term41237, term41237.getClass(), "_deserializers", null);
        term41343 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term41435 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term41343, term41343.getClass(), "_class", null);
        setField(term41343, term41343.getClass(), "_elementType", term41435);
        setBooleanField(term41343, term41343.getClass(), "_asStatic", false);
        term41509 = Class.forName((String) "java.util.concurrent.Executors$PrivilegedCallable");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeIdResolver");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = boolean.class;
        argTypes[4] = Class.forName("java.lang.Class");
        Object[] args = new Object[5];
        args[0] = term41343;
        args[1] = null;
        args[2] = "";
        args[3] = true;
        args[4] = term41509;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


