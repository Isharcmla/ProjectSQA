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

public class JavaUtilCollectionsDeserializers_converter_180689703516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term539648;
     Object term539798;
     Object term540218;
     Object term540263;
     Object term540215;

    public JavaUtilCollectionsDeserializers_converter_180689703516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term539648 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term539762 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        setField(term539648, term539648.getClass(), "_class", null);
        setField(term539648, term539648.getClass(), "_superClass", term539762);
        term539798 = Class.forName((String) "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonStringFormatVisitor$Base");
        term540218 = Class.forName((String) "com.fasterxml.jackson.databind.util.ArrayBuilders");
        term540263 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term540264 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        setField(term540263, term540263.getClass(), "_componentType", null);
        setField(term540263, term540263.getClass(), "_emptyArray", null);
        setIntField(term540264, term540264.getClass(), "_ordinal", 0);
        setField(term540264, term540264.getClass(), "_actualType", null);
        setField(term540264, term540264.getClass(), "_superClass", null);
        setField(term540264, term540264.getClass(), "_superInterfaces", null);
        setField(term540264, term540264.getClass(), "_bindings", null);
        setField(term540264, term540264.getClass(), "_canonicalName", null);
        setField(term540264, term540264.getClass(), "_class", null);
        setIntField(term540264, term540264.getClass(), "_hash", 0);
        setField(term540264, term540264.getClass(), "_valueHandler", null);
        setField(term540264, term540264.getClass(), "_typeHandler", null);
        setBooleanField(term540264, term540264.getClass(), "_asStatic", false);
        setField(term540263, term540263.getClass(), "_superClass", term540264);
        setField(term540263, term540263.getClass(), "_superInterfaces", null);
        setField(term540263, term540263.getClass(), "_bindings", null);
        setField(term540263, term540263.getClass(), "_canonicalName", null);
        setField(term540263, term540263.getClass(), "_class", null);
        setIntField(term540263, term540263.getClass(), "_hash", 0);
        setField(term540263, term540263.getClass(), "_valueHandler", null);
        setField(term540263, term540263.getClass(), "_typeHandler", null);
        setBooleanField(term540263, term540263.getClass(), "_asStatic", false);
        term540215 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter"));
        setField(term540215, term540215.getClass(), "_inputType", null);
        setIntField(term540215, term540215.getClass(), "_kind", 0);
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
        args[1] = term539648;
        args[2] = term539798;
        Object retValue = callMethod(klass, "converter", argTypes, null, args);
        assertTrue(recursiveEquals(term539648, term540263));
        assertTrue(recursiveEquals(term539798, 0));
        assertTrue(recursiveEquals(retValue, term540215));
    }

};


