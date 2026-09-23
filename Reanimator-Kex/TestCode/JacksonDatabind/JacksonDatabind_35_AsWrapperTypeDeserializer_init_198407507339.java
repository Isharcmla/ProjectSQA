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

public class AsWrapperTypeDeserializer_init_198407507339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19900;
     Object term20202;

    public AsWrapperTypeDeserializer_init_198407507339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term19702 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        Object term19808 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term19702, term19702.getClass(), "_baseType", term19808);
        setField(term19702, term19702.getClass(), "_idResolver", null);
        setField(term19702, term19702.getClass(), "_typePropertyName", null);
        setBooleanField(term19702, term19702.getClass(), "_typeIdVisible", false);
        setField(term19702, term19702.getClass(), "_deserializers", null);
        term19900 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term19992 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term20090 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term19900, term19900.getClass(), "_class", null);
        setField(term19900, term19900.getClass(), "_keyType", term19992);
        setField(term19900, term19900.getClass(), "_valueType", term20090);
        setField(term19900, term19900.getClass(), "_valueHandler", "byte[]");
        setField(term19900, term19900.getClass(), "_typeHandler", "byte");
        setBooleanField(term19900, term19900.getClass(), "_asStatic", false);
        term20202 = Class.forName((String) "java.util.function.Predicate");
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
        args[0] = term19900;
        args[1] = null;
        args[2] = null;
        args[3] = true;
        args[4] = term20202;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


