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

public class JavaUtilCollectionsDeserializers_converter_180689703233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177770;
     Object term178140;
     Object term179087;
     Object term179094;
     Object term178984;

    public JavaUtilCollectionsDeserializers_converter_180689703233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term178140 = Class.forName((String) "java.nio.charset.CoderResult$Cache");
        term177770 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term177874 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term177980 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term178086 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term177770, term177770.getClass(), "_class", null);
        setField(term177874, term177874.getClass(), "_class", null);
        setField(term177980, term177980.getClass(), "_class", null);
        setField(term178086, term178086.getClass(), "_class", term178140);
        setField(term177980, term177980.getClass(), "_superClass", term178086);
        setField(term177874, term177874.getClass(), "_superClass", term177980);
        setField(term177770, term177770.getClass(), "_superClass", term177874);
        term179087 = Class.forName((String) "com.fasterxml.jackson.databind.RuntimeJsonMappingException");
        Class<? extends Object> term179098 = Class.forName((String) "com.fasterxml.jackson.databind.RuntimeJsonMappingException");
        term179094 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term179095 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term179096 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term179097 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term179094, term179094.getClass(), "_elementType", null);
        setField(term179095, term179095.getClass(), "_referencedType", null);
        setField(term179095, term179095.getClass(), "_anchorType", null);
        setField(term179096, term179096.getClass(), "_elementType", null);
        setField(term179097, term179097.getClass(), "_elementType", null);
        setField(term179097, term179097.getClass(), "_superClass", null);
        setField(term179097, term179097.getClass(), "_superInterfaces", null);
        setField(term179097, term179097.getClass(), "_bindings", null);
        setField(term179097, term179097.getClass(), "_canonicalName", null);
        setField(term179097, term179097.getClass(), "_class", term179098);
        setIntField(term179097, term179097.getClass(), "_hash", 0);
        setField(term179097, term179097.getClass(), "_valueHandler", null);
        setField(term179097, term179097.getClass(), "_typeHandler", null);
        setBooleanField(term179097, term179097.getClass(), "_asStatic", false);
        setField(term179096, term179096.getClass(), "_superClass", term179097);
        setField(term179096, term179096.getClass(), "_superInterfaces", null);
        setField(term179096, term179096.getClass(), "_bindings", null);
        setField(term179096, term179096.getClass(), "_canonicalName", null);
        setField(term179096, term179096.getClass(), "_class", null);
        setIntField(term179096, term179096.getClass(), "_hash", 0);
        setField(term179096, term179096.getClass(), "_valueHandler", null);
        setField(term179096, term179096.getClass(), "_typeHandler", null);
        setBooleanField(term179096, term179096.getClass(), "_asStatic", false);
        setField(term179095, term179095.getClass(), "_superClass", term179096);
        setField(term179095, term179095.getClass(), "_superInterfaces", null);
        setField(term179095, term179095.getClass(), "_bindings", null);
        setField(term179095, term179095.getClass(), "_canonicalName", null);
        setField(term179095, term179095.getClass(), "_class", null);
        setIntField(term179095, term179095.getClass(), "_hash", 0);
        setField(term179095, term179095.getClass(), "_valueHandler", null);
        setField(term179095, term179095.getClass(), "_typeHandler", null);
        setBooleanField(term179095, term179095.getClass(), "_asStatic", false);
        setField(term179094, term179094.getClass(), "_superClass", term179095);
        setField(term179094, term179094.getClass(), "_superInterfaces", null);
        setField(term179094, term179094.getClass(), "_bindings", null);
        setField(term179094, term179094.getClass(), "_canonicalName", null);
        setField(term179094, term179094.getClass(), "_class", null);
        setIntField(term179094, term179094.getClass(), "_hash", 0);
        setField(term179094, term179094.getClass(), "_valueHandler", null);
        setField(term179094, term179094.getClass(), "_typeHandler", null);
        setBooleanField(term179094, term179094.getClass(), "_asStatic", false);
        Class<? extends Object> term178461 = Class.forName((String) "com.fasterxml.jackson.databind.RuntimeJsonMappingException");
        term178984 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter"));
        Object term178975 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term178975, term178975.getClass(), "_elementType", null);
        setField(term178975, term178975.getClass(), "_superClass", null);
        setField(term178975, term178975.getClass(), "_superInterfaces", null);
        setField(term178975, term178975.getClass(), "_bindings", null);
        setField(term178975, term178975.getClass(), "_canonicalName", null);
        setField(term178975, term178975.getClass(), "_class", term178461);
        setIntField(term178975, term178975.getClass(), "_hash", 0);
        setField(term178975, term178975.getClass(), "_valueHandler", null);
        setField(term178975, term178975.getClass(), "_typeHandler", null);
        setBooleanField(term178975, term178975.getClass(), "_asStatic", false);
        setField(term178984, term178984.getClass(), "_inputType", term178975);
        setIntField(term178984, term178984.getClass(), "_kind", 0);
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
        args[1] = term177770;
        args[2] = term178140;
        Object retValue = callMethod(klass, "converter", argTypes, null, args);
        assertTrue(recursiveEquals(term177770, term179094));
        assertTrue(recursiveEquals(term178140, 0));
        assertTrue(recursiveEquals(retValue, term178984));
    }

};


