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

public class JavaUtilCollectionsDeserializers_converter_18068970345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16633;
     Object term16647;
     Object term16641;

    public JavaUtilCollectionsDeserializers_converter_18068970345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16633 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        term16647 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term16647, term16647.getClass(), "_componentType", null);
        setField(term16647, term16647.getClass(), "_emptyArray", null);
        setField(term16647, term16647.getClass(), "_superClass", null);
        setField(term16647, term16647.getClass(), "_superInterfaces", null);
        setField(term16647, term16647.getClass(), "_bindings", null);
        setField(term16647, term16647.getClass(), "_canonicalName", null);
        setField(term16647, term16647.getClass(), "_class", null);
        setIntField(term16647, term16647.getClass(), "_hash", 0);
        setField(term16647, term16647.getClass(), "_valueHandler", null);
        setField(term16647, term16647.getClass(), "_typeHandler", null);
        setBooleanField(term16647, term16647.getClass(), "_asStatic", false);
        term16641 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter"));
        Object term16638 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term16638, term16638.getClass(), "_componentType", null);
        setField(term16638, term16638.getClass(), "_emptyArray", null);
        setField(term16638, term16638.getClass(), "_superClass", null);
        setField(term16638, term16638.getClass(), "_superInterfaces", null);
        setField(term16638, term16638.getClass(), "_bindings", null);
        setField(term16638, term16638.getClass(), "_canonicalName", null);
        setField(term16638, term16638.getClass(), "_class", null);
        setIntField(term16638, term16638.getClass(), "_hash", 0);
        setField(term16638, term16638.getClass(), "_valueHandler", null);
        setField(term16638, term16638.getClass(), "_typeHandler", null);
        setBooleanField(term16638, term16638.getClass(), "_asStatic", false);
        setField(term16641, term16641.getClass(), "_inputType", term16638);
        setIntField(term16641, term16641.getClass(), "_kind", 0);
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
        args[1] = term16633;
        args[2] = null;
        Object retValue = callMethod(klass, "converter", argTypes, null, args);
        assertTrue(recursiveEquals(term16633, null));
        assertTrue(recursiveEquals(retValue, term16641));
    }

};


