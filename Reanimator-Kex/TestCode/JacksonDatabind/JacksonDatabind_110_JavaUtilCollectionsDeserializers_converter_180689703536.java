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

public class JavaUtilCollectionsDeserializers_converter_180689703536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term566706;
     Object term566940;
     Object term567333;
     Object term567378;
     Object term567330;

    public JavaUtilCollectionsDeserializers_converter_180689703536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term566706 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term566812 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term566904 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term566706, term566706.getClass(), "_class", null);
        setField(term566812, term566812.getClass(), "_class", null);
        setField(term566812, term566812.getClass(), "_superClass", term566904);
        setField(term566706, term566706.getClass(), "_superClass", term566812);
        term566940 = Class.forName((String) "com.fasterxml.jackson.annotation.ObjectIdGenerators$StringIdGenerator");
        term567333 = Class.forName((String) "com.fasterxml.jackson.core.io.UTF32Reader");
        term567378 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term567379 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term567380 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term567378, term567378.getClass(), "_keyType", null);
        setField(term567378, term567378.getClass(), "_valueType", null);
        setField(term567379, term567379.getClass(), "_elementType", null);
        setField(term567380, term567380.getClass(), "_keyType", null);
        setField(term567380, term567380.getClass(), "_valueType", null);
        setField(term567380, term567380.getClass(), "_superClass", null);
        setField(term567380, term567380.getClass(), "_superInterfaces", null);
        setField(term567380, term567380.getClass(), "_bindings", null);
        setField(term567380, term567380.getClass(), "_canonicalName", null);
        setField(term567380, term567380.getClass(), "_class", null);
        setIntField(term567380, term567380.getClass(), "_hash", 0);
        setField(term567380, term567380.getClass(), "_valueHandler", null);
        setField(term567380, term567380.getClass(), "_typeHandler", null);
        setBooleanField(term567380, term567380.getClass(), "_asStatic", false);
        setField(term567379, term567379.getClass(), "_superClass", term567380);
        setField(term567379, term567379.getClass(), "_superInterfaces", null);
        setField(term567379, term567379.getClass(), "_bindings", null);
        setField(term567379, term567379.getClass(), "_canonicalName", null);
        setField(term567379, term567379.getClass(), "_class", null);
        setIntField(term567379, term567379.getClass(), "_hash", 0);
        setField(term567379, term567379.getClass(), "_valueHandler", null);
        setField(term567379, term567379.getClass(), "_typeHandler", null);
        setBooleanField(term567379, term567379.getClass(), "_asStatic", false);
        setField(term567378, term567378.getClass(), "_superClass", term567379);
        setField(term567378, term567378.getClass(), "_superInterfaces", null);
        setField(term567378, term567378.getClass(), "_bindings", null);
        setField(term567378, term567378.getClass(), "_canonicalName", null);
        setField(term567378, term567378.getClass(), "_class", null);
        setIntField(term567378, term567378.getClass(), "_hash", 0);
        setField(term567378, term567378.getClass(), "_valueHandler", null);
        setField(term567378, term567378.getClass(), "_typeHandler", null);
        setBooleanField(term567378, term567378.getClass(), "_asStatic", false);
        term567330 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter"));
        setField(term567330, term567330.getClass(), "_inputType", null);
        setIntField(term567330, term567330.getClass(), "_kind", 0);
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
        args[1] = term566706;
        args[2] = term566940;
        Object retValue = callMethod(klass, "converter", argTypes, null, args);
        assertTrue(recursiveEquals(term566706, term567378));
        assertTrue(recursiveEquals(term566940, 0));
        assertTrue(recursiveEquals(retValue, term567330));
    }

};


