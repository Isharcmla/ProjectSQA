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

public class JavaUtilCollectionsDeserializers_converter_180689703171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117730;
     Object term117870;
     Object term118284;
     Object term118329;
     Object term118281;

    public JavaUtilCollectionsDeserializers_converter_180689703171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term117730 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term117834 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term117730, term117730.getClass(), "_class", null);
        setField(term117730, term117730.getClass(), "_superClass", term117834);
        term117870 = Class.forName((String) "java.lang.annotation.Target");
        term118284 = Class.forName((String) "com.fasterxml.jackson.databind.type.TypeModifier");
        term118329 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term118330 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term118329, term118329.getClass(), "_keyType", null);
        setField(term118329, term118329.getClass(), "_valueType", null);
        setField(term118330, term118330.getClass(), "_referencedType", null);
        setField(term118330, term118330.getClass(), "_anchorType", null);
        setField(term118330, term118330.getClass(), "_superClass", null);
        setField(term118330, term118330.getClass(), "_superInterfaces", null);
        setField(term118330, term118330.getClass(), "_bindings", null);
        setField(term118330, term118330.getClass(), "_canonicalName", null);
        setField(term118330, term118330.getClass(), "_class", null);
        setIntField(term118330, term118330.getClass(), "_hash", 0);
        setField(term118330, term118330.getClass(), "_valueHandler", null);
        setField(term118330, term118330.getClass(), "_typeHandler", null);
        setBooleanField(term118330, term118330.getClass(), "_asStatic", false);
        setField(term118329, term118329.getClass(), "_superClass", term118330);
        setField(term118329, term118329.getClass(), "_superInterfaces", null);
        setField(term118329, term118329.getClass(), "_bindings", null);
        setField(term118329, term118329.getClass(), "_canonicalName", null);
        setField(term118329, term118329.getClass(), "_class", null);
        setIntField(term118329, term118329.getClass(), "_hash", 0);
        setField(term118329, term118329.getClass(), "_valueHandler", null);
        setField(term118329, term118329.getClass(), "_typeHandler", null);
        setBooleanField(term118329, term118329.getClass(), "_asStatic", false);
        term118281 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter"));
        setField(term118281, term118281.getClass(), "_inputType", null);
        setIntField(term118281, term118281.getClass(), "_kind", 0);
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
        args[1] = term117730;
        args[2] = term117870;
        Object retValue = callMethod(klass, "converter", argTypes, null, args);
        assertTrue(recursiveEquals(term117730, term118329));
        assertTrue(recursiveEquals(term117870, 0));
        assertTrue(recursiveEquals(retValue, term118281));
    }

};


