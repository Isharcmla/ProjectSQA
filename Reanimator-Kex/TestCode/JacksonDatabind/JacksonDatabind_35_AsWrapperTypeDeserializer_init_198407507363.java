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

public class AsWrapperTypeDeserializer_init_198407507363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45376;
     Object term45662;
     Object term45736;

    public AsWrapperTypeDeserializer_init_198407507363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term45164 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        Object term45270 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term45164, term45164.getClass(), "_baseType", term45270);
        setField(term45164, term45164.getClass(), "_idResolver", null);
        setField(term45164, term45164.getClass(), "_typePropertyName", null);
        setBooleanField(term45164, term45164.getClass(), "_typeIdVisible", false);
        setField(term45164, term45164.getClass(), "_deserializers", null);
        term45376 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term45476 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term45376, term45376.getClass(), "_class", null);
        setField(term45376, term45376.getClass(), "_elementType", term45476);
        setField(term45376, term45376.getClass(), "_valueHandler", "com.fasterxml.jackson.databind.type.CollectionLikeType");
        setField(term45376, term45376.getClass(), "_typeHandler", null);
        setBooleanField(term45376, term45376.getClass(), "_asStatic", false);
        term45662 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver"));
        term45736 = Class.forName((String) "java.lang.WeakPairMap$WeakRefPeer");
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
        args[0] = term45376;
        args[1] = term45662;
        args[2] = "byte[]";
        args[3] = true;
        args[4] = term45736;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


