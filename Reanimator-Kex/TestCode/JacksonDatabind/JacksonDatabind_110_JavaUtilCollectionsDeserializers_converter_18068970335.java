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

public class JavaUtilCollectionsDeserializers_converter_18068970335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12182;
     Object term12199;
     Object term12192;

    public JavaUtilCollectionsDeserializers_converter_18068970335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12182 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        term12199 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        setIntField(term12199, term12199.getClass(), "_ordinal", 0);
        setField(term12199, term12199.getClass(), "_actualType", null);
        setField(term12199, term12199.getClass(), "_superClass", null);
        setField(term12199, term12199.getClass(), "_superInterfaces", null);
        setField(term12199, term12199.getClass(), "_bindings", null);
        setField(term12199, term12199.getClass(), "_canonicalName", null);
        setField(term12199, term12199.getClass(), "_class", null);
        setIntField(term12199, term12199.getClass(), "_hash", 0);
        setField(term12199, term12199.getClass(), "_valueHandler", null);
        setField(term12199, term12199.getClass(), "_typeHandler", null);
        setBooleanField(term12199, term12199.getClass(), "_asStatic", false);
        term12192 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter"));
        Object term12188 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        setIntField(term12188, term12188.getClass(), "_ordinal", 0);
        setField(term12188, term12188.getClass(), "_actualType", null);
        setField(term12188, term12188.getClass(), "_superClass", null);
        setField(term12188, term12188.getClass(), "_superInterfaces", null);
        setField(term12188, term12188.getClass(), "_bindings", null);
        setField(term12188, term12188.getClass(), "_canonicalName", null);
        setField(term12188, term12188.getClass(), "_class", null);
        setIntField(term12188, term12188.getClass(), "_hash", 0);
        setField(term12188, term12188.getClass(), "_valueHandler", null);
        setField(term12188, term12188.getClass(), "_typeHandler", null);
        setBooleanField(term12188, term12188.getClass(), "_asStatic", false);
        setField(term12192, term12192.getClass(), "_inputType", term12188);
        setIntField(term12192, term12192.getClass(), "_kind", 0);
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
        args[1] = term12182;
        args[2] = null;
        Object retValue = callMethod(klass, "converter", argTypes, null, args);
        assertTrue(recursiveEquals(term12182, null));
        assertTrue(recursiveEquals(retValue, term12192));
    }

};


