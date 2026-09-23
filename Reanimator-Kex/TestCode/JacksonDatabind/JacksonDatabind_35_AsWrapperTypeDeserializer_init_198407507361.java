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
import java.util.HashMap;
import java.lang.String;

public class AsWrapperTypeDeserializer_init_198407507361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43377;
     Object term43565;

    public AsWrapperTypeDeserializer_init_198407507361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term43285 = new HashMap();
        Object term43237 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(term43237, term43237.getClass(), "_baseType", null);
        setField(term43237, term43237.getClass(), "_idResolver", null);
        setField(term43237, term43237.getClass(), "_typePropertyName", null);
        setBooleanField(term43237, term43237.getClass(), "_typeIdVisible", false);
        setField(term43237, term43237.getClass(), "_deserializers", term43285);
        term43377 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term43491 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term43377, term43377.getClass(), "_class", null);
        setField(term43377, term43377.getClass(), "_keyType", term43491);
        setField(term43377, term43377.getClass(), "_valueType", null);
        setField(term43377, term43377.getClass(), "_valueHandler", null);
        setField(term43377, term43377.getClass(), "_typeHandler", "byte");
        setBooleanField(term43377, term43377.getClass(), "_asStatic", false);
        term43565 = Class.forName((String) "java.util.stream.Nodes$EmptyNode$OfLong");
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
        args[0] = term43377;
        args[1] = null;
        args[2] = null;
        args[3] = true;
        args[4] = term43565;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


