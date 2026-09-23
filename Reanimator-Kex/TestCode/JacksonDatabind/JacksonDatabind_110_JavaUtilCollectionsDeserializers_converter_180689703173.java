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

public class JavaUtilCollectionsDeserializers_converter_180689703173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119190;
     Object term119414;
     Object term119954;
     Object term119999;
     Object term119951;

    public JavaUtilCollectionsDeserializers_converter_180689703173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119190 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term119282 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term119378 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term119190, term119190.getClass(), "_class", null);
        setField(term119282, term119282.getClass(), "_class", null);
        setField(term119282, term119282.getClass(), "_superClass", term119378);
        setField(term119190, term119190.getClass(), "_superClass", term119282);
        term119414 = Class.forName((String) "java.lang.reflect.Type");
        term119954 = Class.forName((String) "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor");
        term119999 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term120000 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term120001 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term119999, term119999.getClass(), "_elementType", null);
        setField(term120000, term120000.getClass(), "_keyType", null);
        setField(term120000, term120000.getClass(), "_valueType", null);
        setField(term120001, term120001.getClass(), "_componentType", null);
        setField(term120001, term120001.getClass(), "_emptyArray", null);
        setField(term120001, term120001.getClass(), "_superClass", null);
        setField(term120001, term120001.getClass(), "_superInterfaces", null);
        setField(term120001, term120001.getClass(), "_bindings", null);
        setField(term120001, term120001.getClass(), "_canonicalName", null);
        setField(term120001, term120001.getClass(), "_class", null);
        setIntField(term120001, term120001.getClass(), "_hash", 0);
        setField(term120001, term120001.getClass(), "_valueHandler", null);
        setField(term120001, term120001.getClass(), "_typeHandler", null);
        setBooleanField(term120001, term120001.getClass(), "_asStatic", false);
        setField(term120000, term120000.getClass(), "_superClass", term120001);
        setField(term120000, term120000.getClass(), "_superInterfaces", null);
        setField(term120000, term120000.getClass(), "_bindings", null);
        setField(term120000, term120000.getClass(), "_canonicalName", null);
        setField(term120000, term120000.getClass(), "_class", null);
        setIntField(term120000, term120000.getClass(), "_hash", 0);
        setField(term120000, term120000.getClass(), "_valueHandler", null);
        setField(term120000, term120000.getClass(), "_typeHandler", null);
        setBooleanField(term120000, term120000.getClass(), "_asStatic", false);
        setField(term119999, term119999.getClass(), "_superClass", term120000);
        setField(term119999, term119999.getClass(), "_superInterfaces", null);
        setField(term119999, term119999.getClass(), "_bindings", null);
        setField(term119999, term119999.getClass(), "_canonicalName", null);
        setField(term119999, term119999.getClass(), "_class", null);
        setIntField(term119999, term119999.getClass(), "_hash", 0);
        setField(term119999, term119999.getClass(), "_valueHandler", null);
        setField(term119999, term119999.getClass(), "_typeHandler", null);
        setBooleanField(term119999, term119999.getClass(), "_asStatic", false);
        term119951 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter"));
        setField(term119951, term119951.getClass(), "_inputType", null);
        setIntField(term119951, term119951.getClass(), "_kind", 0);
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
        args[1] = term119190;
        args[2] = term119414;
        Object retValue = callMethod(klass, "converter", argTypes, null, args);
        assertTrue(recursiveEquals(term119190, term119999));
        assertTrue(recursiveEquals(term119414, 0));
        assertTrue(recursiveEquals(retValue, term119951));
    }

};


