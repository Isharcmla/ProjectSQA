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

public class JavaUtilCollectionsDeserializers_converter_18068970321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5963;
     Object term5977;
     Object term5971;

    public JavaUtilCollectionsDeserializers_converter_18068970321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5963 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        term5977 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term5977, term5977.getClass(), "_superClass", null);
        setField(term5977, term5977.getClass(), "_superInterfaces", null);
        setField(term5977, term5977.getClass(), "_bindings", null);
        setField(term5977, term5977.getClass(), "_canonicalName", null);
        setField(term5977, term5977.getClass(), "_class", null);
        setIntField(term5977, term5977.getClass(), "_hash", 0);
        setField(term5977, term5977.getClass(), "_valueHandler", null);
        setField(term5977, term5977.getClass(), "_typeHandler", null);
        setBooleanField(term5977, term5977.getClass(), "_asStatic", false);
        term5971 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter"));
        Object term5968 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term5968, term5968.getClass(), "_superClass", null);
        setField(term5968, term5968.getClass(), "_superInterfaces", null);
        setField(term5968, term5968.getClass(), "_bindings", null);
        setField(term5968, term5968.getClass(), "_canonicalName", null);
        setField(term5968, term5968.getClass(), "_class", null);
        setIntField(term5968, term5968.getClass(), "_hash", 0);
        setField(term5968, term5968.getClass(), "_valueHandler", null);
        setField(term5968, term5968.getClass(), "_typeHandler", null);
        setBooleanField(term5968, term5968.getClass(), "_asStatic", false);
        setField(term5971, term5971.getClass(), "_inputType", term5968);
        setIntField(term5971, term5971.getClass(), "_kind", 0);
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
        args[1] = term5963;
        args[2] = null;
        Object retValue = callMethod(klass, "converter", argTypes, null, args);
        assertTrue(recursiveEquals(term5963, null));
        assertTrue(recursiveEquals(retValue, term5971));
    }

};


