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

public class AsWrapperTypeDeserializer_init_198407507381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66188;
     Object term66506;

    public AsWrapperTypeDeserializer_init_198407507381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term65924 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        Object term66058 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver"));
        setField(term65924, term65924.getClass(), "_baseType", null);
        setField(term65924, term65924.getClass(), "_idResolver", term66058);
        setField(term65924, term65924.getClass(), "_typePropertyName", "byte");
        setBooleanField(term65924, term65924.getClass(), "_typeIdVisible", false);
        setField(term65924, term65924.getClass(), "_deserializers", null);
        term66188 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term66294 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term66394 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term66188, term66188.getClass(), "_class", null);
        setIntField(term66294, term66294.getClass(), "_hash", 0);
        setField(term66188, term66188.getClass(), "_keyType", term66294);
        setField(term66188, term66188.getClass(), "_valueType", term66394);
        setField(term66188, term66188.getClass(), "_valueHandler", "com.fasterxml.jackson.databind.type.MapLikeType");
        setField(term66188, term66188.getClass(), "_typeHandler", "byte[]");
        setBooleanField(term66188, term66188.getClass(), "_asStatic", false);
        term66506 = Class.forName((String) "java.util.Spliterators$DoubleArraySpliterator");
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
        args[0] = term66188;
        args[1] = null;
        args[2] = null;
        args[3] = true;
        args[4] = term66506;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


