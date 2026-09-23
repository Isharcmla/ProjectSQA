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
import java.lang.Object;

public class JavaUtilCollectionsDeserializers_converter_180689703499 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term516338;
     Object term516834;
     Object term519025;
     Object term519044;
     Object term519022;

    public JavaUtilCollectionsDeserializers_converter_180689703499() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term516374 = Class.forName((String) "java.lang.invoke.MethodType");
        term516338 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term516466 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term516572 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term516678 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term516798 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term516338, term516338.getClass(), "_class", term516374);
        setField(term516466, term516466.getClass(), "_class", null);
        setField(term516572, term516572.getClass(), "_class", null);
        setField(term516678, term516678.getClass(), "_class", null);
        setField(term516678, term516678.getClass(), "_superClass", term516798);
        setField(term516572, term516572.getClass(), "_superClass", term516678);
        setField(term516466, term516466.getClass(), "_superClass", term516572);
        setField(term516338, term516338.getClass(), "_superClass", term516466);
        term516834 = Class.forName((String) "com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$SingleView");
        term519025 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.DateDeserializers$SqlDateDeserializer");
        Class<? extends Object> term519049 = Class.forName((String) "com.fasterxml.jackson.databind.deser.NullValueProvider");
        term519044 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term519045 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term519046 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term519047 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term519048 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term519044, term519044.getClass(), "_elementType", null);
        setField(term519045, term519045.getClass(), "_keyType", null);
        setField(term519045, term519045.getClass(), "_valueType", null);
        setField(term519046, term519046.getClass(), "_elementType", null);
        setField(term519047, term519047.getClass(), "_elementType", null);
        setField(term519048, term519048.getClass(), "_referencedType", null);
        setField(term519048, term519048.getClass(), "_superClass", null);
        setField(term519048, term519048.getClass(), "_superInterfaces", null);
        setField(term519048, term519048.getClass(), "_bindings", null);
        setField(term519048, term519048.getClass(), "_canonicalName", null);
        setField(term519048, term519048.getClass(), "_class", null);
        setIntField(term519048, term519048.getClass(), "_hash", 0);
        setField(term519048, term519048.getClass(), "_valueHandler", null);
        setField(term519048, term519048.getClass(), "_typeHandler", null);
        setBooleanField(term519048, term519048.getClass(), "_asStatic", false);
        setField(term519047, term519047.getClass(), "_superClass", term519048);
        setField(term519047, term519047.getClass(), "_superInterfaces", null);
        setField(term519047, term519047.getClass(), "_bindings", null);
        setField(term519047, term519047.getClass(), "_canonicalName", null);
        setField(term519047, term519047.getClass(), "_class", null);
        setIntField(term519047, term519047.getClass(), "_hash", 0);
        setField(term519047, term519047.getClass(), "_valueHandler", null);
        setField(term519047, term519047.getClass(), "_typeHandler", null);
        setBooleanField(term519047, term519047.getClass(), "_asStatic", false);
        setField(term519046, term519046.getClass(), "_superClass", term519047);
        setField(term519046, term519046.getClass(), "_superInterfaces", null);
        setField(term519046, term519046.getClass(), "_bindings", null);
        setField(term519046, term519046.getClass(), "_canonicalName", null);
        setField(term519046, term519046.getClass(), "_class", null);
        setIntField(term519046, term519046.getClass(), "_hash", 0);
        setField(term519046, term519046.getClass(), "_valueHandler", null);
        setField(term519046, term519046.getClass(), "_typeHandler", null);
        setBooleanField(term519046, term519046.getClass(), "_asStatic", false);
        setField(term519045, term519045.getClass(), "_superClass", term519046);
        setField(term519045, term519045.getClass(), "_superInterfaces", null);
        setField(term519045, term519045.getClass(), "_bindings", null);
        setField(term519045, term519045.getClass(), "_canonicalName", null);
        setField(term519045, term519045.getClass(), "_class", null);
        setIntField(term519045, term519045.getClass(), "_hash", 0);
        setField(term519045, term519045.getClass(), "_valueHandler", null);
        setField(term519045, term519045.getClass(), "_typeHandler", null);
        setBooleanField(term519045, term519045.getClass(), "_asStatic", false);
        setField(term519044, term519044.getClass(), "_superClass", term519045);
        setField(term519044, term519044.getClass(), "_superInterfaces", null);
        setField(term519044, term519044.getClass(), "_bindings", null);
        setField(term519044, term519044.getClass(), "_canonicalName", null);
        setField(term519044, term519044.getClass(), "_class", term519049);
        setIntField(term519044, term519044.getClass(), "_hash", 0);
        setField(term519044, term519044.getClass(), "_valueHandler", null);
        setField(term519044, term519044.getClass(), "_typeHandler", null);
        setBooleanField(term519044, term519044.getClass(), "_asStatic", false);
        term519022 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter"));
        setField(term519022, term519022.getClass(), "_inputType", null);
        setIntField(term519022, term519022.getClass(), "_kind", 0);
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
        args[1] = term516338;
        args[2] = term516834;
        Object retValue = callMethod(klass, "converter", argTypes, null, args);
        assertTrue(recursiveEquals(term516338, term519044));
        assertTrue(recursiveEquals(term516834, 0));
        assertTrue(recursiveEquals(retValue, term519022));
    }

};


