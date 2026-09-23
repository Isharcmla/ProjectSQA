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

public class JavaUtilCollectionsDeserializers_converter_18068970387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40500;
     Object term40650;
     Object term41249;
     Object term41256;
     Object term41152;

    public JavaUtilCollectionsDeserializers_converter_18068970387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40650 = Class.forName((String) "java.util.Locale$Cache");
        term40500 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term40596 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term40500, term40500.getClass(), "_class", null);
        setField(term40596, term40596.getClass(), "_class", term40650);
        setField(term40500, term40500.getClass(), "_superClass", term40596);
        term41249 = Class.forName((String) "com.fasterxml.jackson.databind.util.JSONPObject");
        Class<? extends Object> term41258 = Class.forName((String) "com.fasterxml.jackson.databind.util.JSONPObject");
        term41256 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term41257 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term41256, term41256.getClass(), "_keyType", null);
        setField(term41256, term41256.getClass(), "_valueType", null);
        setField(term41257, term41257.getClass(), "_componentType", null);
        setField(term41257, term41257.getClass(), "_emptyArray", null);
        setField(term41257, term41257.getClass(), "_superClass", null);
        setField(term41257, term41257.getClass(), "_superInterfaces", null);
        setField(term41257, term41257.getClass(), "_bindings", null);
        setField(term41257, term41257.getClass(), "_canonicalName", null);
        setField(term41257, term41257.getClass(), "_class", term41258);
        setIntField(term41257, term41257.getClass(), "_hash", 0);
        setField(term41257, term41257.getClass(), "_valueHandler", null);
        setField(term41257, term41257.getClass(), "_typeHandler", null);
        setBooleanField(term41257, term41257.getClass(), "_asStatic", false);
        setField(term41256, term41256.getClass(), "_superClass", term41257);
        setField(term41256, term41256.getClass(), "_superInterfaces", null);
        setField(term41256, term41256.getClass(), "_bindings", null);
        setField(term41256, term41256.getClass(), "_canonicalName", null);
        setField(term41256, term41256.getClass(), "_class", null);
        setIntField(term41256, term41256.getClass(), "_hash", 0);
        setField(term41256, term41256.getClass(), "_valueHandler", null);
        setField(term41256, term41256.getClass(), "_typeHandler", null);
        setBooleanField(term41256, term41256.getClass(), "_asStatic", false);
        Class<? extends Object> term40926 = Class.forName((String) "com.fasterxml.jackson.databind.util.JSONPObject");
        term41152 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter"));
        Object term41147 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term41147, term41147.getClass(), "_componentType", null);
        setField(term41147, term41147.getClass(), "_emptyArray", null);
        setField(term41147, term41147.getClass(), "_superClass", null);
        setField(term41147, term41147.getClass(), "_superInterfaces", null);
        setField(term41147, term41147.getClass(), "_bindings", null);
        setField(term41147, term41147.getClass(), "_canonicalName", null);
        setField(term41147, term41147.getClass(), "_class", term40926);
        setIntField(term41147, term41147.getClass(), "_hash", 0);
        setField(term41147, term41147.getClass(), "_valueHandler", null);
        setField(term41147, term41147.getClass(), "_typeHandler", null);
        setBooleanField(term41147, term41147.getClass(), "_asStatic", false);
        setField(term41152, term41152.getClass(), "_inputType", term41147);
        setIntField(term41152, term41152.getClass(), "_kind", 0);
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
        args[1] = term40500;
        args[2] = term40650;
        Object retValue = callMethod(klass, "converter", argTypes, null, args);
        assertTrue(recursiveEquals(term40500, term41256));
        assertTrue(recursiveEquals(term40650, 0));
        assertTrue(recursiveEquals(retValue, term41152));
    }

};


