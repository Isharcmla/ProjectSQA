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

public class JavaUtilCollectionsDeserializers_converter_180689703466 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term475786;
     Object term476130;
     Object term476532;
     Object term476577;
     Object term476529;

    public JavaUtilCollectionsDeserializers_converter_180689703466() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term475786 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term475878 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term475974 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term476094 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term475786, term475786.getClass(), "_class", null);
        setField(term475878, term475878.getClass(), "_class", null);
        setField(term475974, term475974.getClass(), "_class", null);
        setField(term475974, term475974.getClass(), "_superClass", term476094);
        setField(term475878, term475878.getClass(), "_superClass", term475974);
        setField(term475786, term475786.getClass(), "_superClass", term475878);
        term476130 = Class.forName((String) "com.fasterxml.jackson.databind.ser.BeanPropertyWriter");
        term476532 = Class.forName((String) "com.fasterxml.jackson.core.Base64Variant");
        term476577 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term476578 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term476579 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term476580 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term476577, term476577.getClass(), "_keyType", null);
        setField(term476577, term476577.getClass(), "_valueType", null);
        setField(term476578, term476578.getClass(), "_keyType", null);
        setField(term476578, term476578.getClass(), "_valueType", null);
        setField(term476579, term476579.getClass(), "_componentType", null);
        setField(term476579, term476579.getClass(), "_emptyArray", null);
        setField(term476580, term476580.getClass(), "_referencedType", null);
        setField(term476580, term476580.getClass(), "_superClass", null);
        setField(term476580, term476580.getClass(), "_superInterfaces", null);
        setField(term476580, term476580.getClass(), "_bindings", null);
        setField(term476580, term476580.getClass(), "_canonicalName", null);
        setField(term476580, term476580.getClass(), "_class", null);
        setIntField(term476580, term476580.getClass(), "_hash", 0);
        setField(term476580, term476580.getClass(), "_valueHandler", null);
        setField(term476580, term476580.getClass(), "_typeHandler", null);
        setBooleanField(term476580, term476580.getClass(), "_asStatic", false);
        setField(term476579, term476579.getClass(), "_superClass", term476580);
        setField(term476579, term476579.getClass(), "_superInterfaces", null);
        setField(term476579, term476579.getClass(), "_bindings", null);
        setField(term476579, term476579.getClass(), "_canonicalName", null);
        setField(term476579, term476579.getClass(), "_class", null);
        setIntField(term476579, term476579.getClass(), "_hash", 0);
        setField(term476579, term476579.getClass(), "_valueHandler", null);
        setField(term476579, term476579.getClass(), "_typeHandler", null);
        setBooleanField(term476579, term476579.getClass(), "_asStatic", false);
        setField(term476578, term476578.getClass(), "_superClass", term476579);
        setField(term476578, term476578.getClass(), "_superInterfaces", null);
        setField(term476578, term476578.getClass(), "_bindings", null);
        setField(term476578, term476578.getClass(), "_canonicalName", null);
        setField(term476578, term476578.getClass(), "_class", null);
        setIntField(term476578, term476578.getClass(), "_hash", 0);
        setField(term476578, term476578.getClass(), "_valueHandler", null);
        setField(term476578, term476578.getClass(), "_typeHandler", null);
        setBooleanField(term476578, term476578.getClass(), "_asStatic", false);
        setField(term476577, term476577.getClass(), "_superClass", term476578);
        setField(term476577, term476577.getClass(), "_superInterfaces", null);
        setField(term476577, term476577.getClass(), "_bindings", null);
        setField(term476577, term476577.getClass(), "_canonicalName", null);
        setField(term476577, term476577.getClass(), "_class", null);
        setIntField(term476577, term476577.getClass(), "_hash", 0);
        setField(term476577, term476577.getClass(), "_valueHandler", null);
        setField(term476577, term476577.getClass(), "_typeHandler", null);
        setBooleanField(term476577, term476577.getClass(), "_asStatic", false);
        term476529 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter"));
        setField(term476529, term476529.getClass(), "_inputType", null);
        setIntField(term476529, term476529.getClass(), "_kind", 0);
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
        args[1] = term475786;
        args[2] = term476130;
        Object retValue = callMethod(klass, "converter", argTypes, null, args);
        assertTrue(recursiveEquals(term475786, term476577));
        assertTrue(recursiveEquals(term476130, 0));
        assertTrue(recursiveEquals(retValue, term476529));
    }

};


