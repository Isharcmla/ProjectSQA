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

public class AsWrapperTypeDeserializer_init_198407507383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68537;
     Object term68711;

    public AsWrapperTypeDeserializer_init_198407507383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term68339 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        Object term68431 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term68339, term68339.getClass(), "_baseType", term68431);
        setField(term68339, term68339.getClass(), "_idResolver", null);
        setField(term68339, term68339.getClass(), "_typePropertyName", null);
        setBooleanField(term68339, term68339.getClass(), "_typeIdVisible", false);
        setField(term68339, term68339.getClass(), "_deserializers", null);
        term68537 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term68637 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term68537, term68537.getClass(), "_class", null);
        setField(term68537, term68537.getClass(), "_elementType", term68637);
        setBooleanField(term68537, term68537.getClass(), "_asStatic", false);
        term68711 = Class.forName((String) "java.util.zip.Inflater$InflaterZStreamRef");
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
        args[0] = term68537;
        args[1] = null;
        args[2] = "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase";
        args[3] = true;
        args[4] = term68711;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


