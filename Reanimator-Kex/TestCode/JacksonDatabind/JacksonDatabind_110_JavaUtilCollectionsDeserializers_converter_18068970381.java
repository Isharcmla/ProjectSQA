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
import java.lang.String;

public class JavaUtilCollectionsDeserializers_converter_18068970381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35997;
     Object term36033;
     Object term36434;
     Object term36435;
     Object term36431;

    public JavaUtilCollectionsDeserializers_converter_18068970381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35997 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        setField(term35997, term35997.getClass(), "_class", null);
        term36033 = Class.forName((String) "java.util.jar.JarInputStream");
        term36434 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        setIntField(term36434, term36434.getClass(), "_ordinal", 0);
        setField(term36434, term36434.getClass(), "_actualType", null);
        setField(term36434, term36434.getClass(), "_superClass", null);
        setField(term36434, term36434.getClass(), "_superInterfaces", null);
        setField(term36434, term36434.getClass(), "_bindings", null);
        setField(term36434, term36434.getClass(), "_canonicalName", null);
        setField(term36434, term36434.getClass(), "_class", null);
        setIntField(term36434, term36434.getClass(), "_hash", 0);
        setField(term36434, term36434.getClass(), "_valueHandler", null);
        setField(term36434, term36434.getClass(), "_typeHandler", null);
        setBooleanField(term36434, term36434.getClass(), "_asStatic", false);
        term36435 = Class.forName((String) "com.fasterxml.jackson.databind.ser.package-info");
        term36431 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter"));
        setField(term36431, term36431.getClass(), "_inputType", null);
        setIntField(term36431, term36431.getClass(), "_kind", 0);
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
        args[1] = term35997;
        args[2] = term36033;
        Object retValue = callMethod(klass, "converter", argTypes, null, args);
        assertTrue(recursiveEquals(term35997, term36435));
        assertTrue(recursiveEquals(term36033, 0));
        assertTrue(recursiveEquals(retValue, term36431));
    }

};


