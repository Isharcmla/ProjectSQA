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
import static com.fasterxml.jackson.databind.deser.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.deser.impl.EqualityUtils.*;
import java.lang.Object;
import java.lang.String;

public class JavaUtilCollectionsDeserializers_converter_18068970373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30755;
     Object term30905;
     Object term31447;
     Object term31492;
     Object term31444;

    public JavaUtilCollectionsDeserializers_converter_18068970373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30755 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term30869 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        setField(term30755, term30755.getClass(), "_class", null);
        setField(term30755, term30755.getClass(), "_superClass", term30869);
        term30905 = Class.forName((String) "java.util.Formatter$DateTime");
        term31447 = Class.forName((String) "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
        term31492 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term31493 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        setField(term31492, term31492.getClass(), "_keyType", null);
        setField(term31492, term31492.getClass(), "_valueType", null);
        setIntField(term31493, term31493.getClass(), "_ordinal", 0);
        setField(term31493, term31493.getClass(), "_actualType", null);
        setField(term31493, term31493.getClass(), "_superClass", null);
        setField(term31493, term31493.getClass(), "_superInterfaces", null);
        setField(term31493, term31493.getClass(), "_bindings", null);
        setField(term31493, term31493.getClass(), "_canonicalName", null);
        setField(term31493, term31493.getClass(), "_class", null);
        setIntField(term31493, term31493.getClass(), "_hash", 0);
        setField(term31493, term31493.getClass(), "_valueHandler", null);
        setField(term31493, term31493.getClass(), "_typeHandler", null);
        setBooleanField(term31493, term31493.getClass(), "_asStatic", false);
        setField(term31492, term31492.getClass(), "_superClass", term31493);
        setField(term31492, term31492.getClass(), "_superInterfaces", null);
        setField(term31492, term31492.getClass(), "_bindings", null);
        setField(term31492, term31492.getClass(), "_canonicalName", null);
        setField(term31492, term31492.getClass(), "_class", null);
        setIntField(term31492, term31492.getClass(), "_hash", 0);
        setField(term31492, term31492.getClass(), "_valueHandler", null);
        setField(term31492, term31492.getClass(), "_typeHandler", null);
        setBooleanField(term31492, term31492.getClass(), "_asStatic", false);
        term31444 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter"));
        setField(term31444, term31444.getClass(), "_inputType", null);
        setIntField(term31444, term31444.getClass(), "_kind", 0);
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
        args[1] = term30755;
        args[2] = term30905;
        Object retValue = callMethod(klass, "converter", argTypes, null, args);
        assertTrue(recursiveEquals(term30755, term31492));
        assertTrue(recursiveEquals(term30905, 0));
        assertTrue(recursiveEquals(retValue, term31444));
    }

};


