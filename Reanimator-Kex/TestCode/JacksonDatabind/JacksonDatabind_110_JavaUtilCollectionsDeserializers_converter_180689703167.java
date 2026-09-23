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

public class JavaUtilCollectionsDeserializers_converter_180689703167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113715;
     Object term113861;
     Object term114468;
     Object term114475;
     Object term114372;

    public JavaUtilCollectionsDeserializers_converter_180689703167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113861 = Class.forName((String) "java.math.MutableBigInteger");
        term113715 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term113807 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term113715, term113715.getClass(), "_class", null);
        setField(term113807, term113807.getClass(), "_class", term113861);
        setField(term113715, term113715.getClass(), "_superClass", term113807);
        term114468 = Class.forName((String) "com.fasterxml.jackson.databind.AbstractTypeResolver");
        Class<? extends Object> term114477 = Class.forName((String) "com.fasterxml.jackson.databind.AbstractTypeResolver");
        term114475 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term114476 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term114475, term114475.getClass(), "_elementType", null);
        setField(term114476, term114476.getClass(), "_keyType", null);
        setField(term114476, term114476.getClass(), "_valueType", null);
        setField(term114476, term114476.getClass(), "_superClass", null);
        setField(term114476, term114476.getClass(), "_superInterfaces", null);
        setField(term114476, term114476.getClass(), "_bindings", null);
        setField(term114476, term114476.getClass(), "_canonicalName", null);
        setField(term114476, term114476.getClass(), "_class", term114477);
        setIntField(term114476, term114476.getClass(), "_hash", 0);
        setField(term114476, term114476.getClass(), "_valueHandler", null);
        setField(term114476, term114476.getClass(), "_typeHandler", null);
        setBooleanField(term114476, term114476.getClass(), "_asStatic", false);
        setField(term114475, term114475.getClass(), "_superClass", term114476);
        setField(term114475, term114475.getClass(), "_superInterfaces", null);
        setField(term114475, term114475.getClass(), "_bindings", null);
        setField(term114475, term114475.getClass(), "_canonicalName", null);
        setField(term114475, term114475.getClass(), "_class", null);
        setIntField(term114475, term114475.getClass(), "_hash", 0);
        setField(term114475, term114475.getClass(), "_valueHandler", null);
        setField(term114475, term114475.getClass(), "_typeHandler", null);
        setBooleanField(term114475, term114475.getClass(), "_asStatic", false);
        Class<? extends Object> term114148 = Class.forName((String) "com.fasterxml.jackson.databind.AbstractTypeResolver");
        term114372 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter"));
        Object term114367 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term114367, term114367.getClass(), "_keyType", null);
        setField(term114367, term114367.getClass(), "_valueType", null);
        setField(term114367, term114367.getClass(), "_superClass", null);
        setField(term114367, term114367.getClass(), "_superInterfaces", null);
        setField(term114367, term114367.getClass(), "_bindings", null);
        setField(term114367, term114367.getClass(), "_canonicalName", null);
        setField(term114367, term114367.getClass(), "_class", term114148);
        setIntField(term114367, term114367.getClass(), "_hash", 0);
        setField(term114367, term114367.getClass(), "_valueHandler", null);
        setField(term114367, term114367.getClass(), "_typeHandler", null);
        setBooleanField(term114367, term114367.getClass(), "_asStatic", false);
        setField(term114372, term114372.getClass(), "_inputType", term114367);
        setIntField(term114372, term114372.getClass(), "_kind", 0);
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
        args[1] = term113715;
        args[2] = term113861;
        Object retValue = callMethod(klass, "converter", argTypes, null, args);
        assertTrue(recursiveEquals(term113715, term114475));
        assertTrue(recursiveEquals(term113861, 0));
        assertTrue(recursiveEquals(retValue, term114372));
    }

};


