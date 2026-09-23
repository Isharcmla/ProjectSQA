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

public class AsWrapperTypeDeserializer_init_198407507349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30420;
     Object term30570;

    public AsWrapperTypeDeserializer_init_198407507349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term30276 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(term30276, term30276.getClass(), "_baseType", null);
        setField(term30276, term30276.getClass(), "_idResolver", null);
        setField(term30276, term30276.getClass(), "_typePropertyName", "byte");
        setBooleanField(term30276, term30276.getClass(), "_typeIdVisible", false);
        setField(term30276, term30276.getClass(), "_deserializers", null);
        term30420 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term30534 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term30420, term30420.getClass(), "_class", null);
        setField(term30420, term30420.getClass(), "_elementType", term30534);
        setBooleanField(term30420, term30420.getClass(), "_asStatic", false);
        term30570 = Class.forName((String) "com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey");
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
        args[0] = term30420;
        args[1] = null;
        args[2] = null;
        args[3] = true;
        args[4] = term30570;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


