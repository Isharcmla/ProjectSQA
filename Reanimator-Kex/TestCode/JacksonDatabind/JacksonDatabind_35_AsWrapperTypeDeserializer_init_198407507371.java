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

public class AsWrapperTypeDeserializer_init_198407507371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53797;
     Object term54102;

    public AsWrapperTypeDeserializer_init_198407507371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term53667 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(term53667, term53667.getClass(), "_baseType", null);
        setField(term53667, term53667.getClass(), "_idResolver", null);
        setField(term53667, term53667.getClass(), "_typePropertyName", "byte");
        setBooleanField(term53667, term53667.getClass(), "_typeIdVisible", false);
        setField(term53667, term53667.getClass(), "_deserializers", null);
        term53797 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term53903 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term54009 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term53797, term53797.getClass(), "_class", null);
        setIntField(term53903, term53903.getClass(), "_hash", 0);
        setField(term53797, term53797.getClass(), "_keyType", term53903);
        setField(term53797, term53797.getClass(), "_valueType", term54009);
        setField(term53797, term53797.getClass(), "_valueHandler", null);
        setField(term53797, term53797.getClass(), "_typeHandler", "byte");
        setBooleanField(term53797, term53797.getClass(), "_asStatic", false);
        term54102 = Class.forName((String) "java.nio.DirectFloatBufferU");
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
        args[0] = term53797;
        args[1] = null;
        args[2] = "byte[]";
        args[3] = true;
        args[4] = term54102;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


