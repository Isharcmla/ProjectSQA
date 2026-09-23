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

public class JavaUtilCollectionsDeserializers_converter_1806897037 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term894;
     Object term908;
     Object term902;

    public JavaUtilCollectionsDeserializers_converter_1806897037() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term894 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        term908 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term908, term908.getClass(), "_keyType", null);
        setField(term908, term908.getClass(), "_valueType", null);
        setField(term908, term908.getClass(), "_superClass", null);
        setField(term908, term908.getClass(), "_superInterfaces", null);
        setField(term908, term908.getClass(), "_bindings", null);
        setField(term908, term908.getClass(), "_canonicalName", null);
        setField(term908, term908.getClass(), "_class", null);
        setIntField(term908, term908.getClass(), "_hash", 0);
        setField(term908, term908.getClass(), "_valueHandler", null);
        setField(term908, term908.getClass(), "_typeHandler", null);
        setBooleanField(term908, term908.getClass(), "_asStatic", false);
        term902 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter"));
        Object term899 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term899, term899.getClass(), "_keyType", null);
        setField(term899, term899.getClass(), "_valueType", null);
        setField(term899, term899.getClass(), "_superClass", null);
        setField(term899, term899.getClass(), "_superInterfaces", null);
        setField(term899, term899.getClass(), "_bindings", null);
        setField(term899, term899.getClass(), "_canonicalName", null);
        setField(term899, term899.getClass(), "_class", null);
        setIntField(term899, term899.getClass(), "_hash", 0);
        setField(term899, term899.getClass(), "_valueHandler", null);
        setField(term899, term899.getClass(), "_typeHandler", null);
        setBooleanField(term899, term899.getClass(), "_asStatic", false);
        setField(term902, term902.getClass(), "_inputType", term899);
        setIntField(term902, term902.getClass(), "_kind", 0);
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
        args[1] = term894;
        args[2] = null;
        Object retValue = callMethod(klass, "converter", argTypes, null, args);
        assertTrue(recursiveEquals(term894, null));
        assertTrue(recursiveEquals(retValue, term902));
    }

};


