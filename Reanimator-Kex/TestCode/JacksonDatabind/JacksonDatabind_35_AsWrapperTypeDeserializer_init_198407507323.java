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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.databind.jsontype.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class AsWrapperTypeDeserializer_init_198407507323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4767;
     Object term4915;
     Object term4989;

    public AsWrapperTypeDeserializer_init_198407507323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4653 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(term4653, term4653.getClass(), "_baseType", null);
        setField(term4653, term4653.getClass(), "_idResolver", null);
        setField(term4653, term4653.getClass(), "_typePropertyName", null);
        setBooleanField(term4653, term4653.getClass(), "_typeIdVisible", false);
        setField(term4653, term4653.getClass(), "_deserializers", null);
        term4767 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        term4915 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver"));
        term4989 = Class.forName((String) "java.util.Collections$CheckedList$1");
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
        args[0] = term4767;
        args[1] = term4915;
        args[2] = "kex.java.util.ArrayList";
        args[3] = true;
        args[4] = term4989;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


