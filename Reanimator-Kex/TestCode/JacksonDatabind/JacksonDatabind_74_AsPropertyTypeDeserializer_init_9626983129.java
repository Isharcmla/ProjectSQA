package com.fasterxml.jackson.databind.jsontype.impl;

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
import static com.fasterxml.jackson.databind.jsontype.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.jsontype.impl.EqualityUtils.*;
import java.lang.Boolean;
import java.lang.String;
import java.lang.Object;

public class AsPropertyTypeDeserializer_init_9626983129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13;
     Object term106;

    public AsPropertyTypeDeserializer_init_9626983129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13 = new Boolean(false);
        Class<? extends Object> term215 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$As");
        Field term214 = ((Class) term215).getDeclaredField((String) "PROPERTY");
        ((Field) term214).setAccessible(true);
        Object enum0 = ((Field) term214).get((Object) null);
        term106 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        Object term112 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term106, term106.getClass(), "_inclusion", enum0);
        setField(term106, term106.getClass(), "_idResolver", null);
        setField(term106, term106.getClass(), "_baseType", null);
        setField(term106, term106.getClass(), "_property", null);
        setField(term106, term106.getClass(), "_defaultImpl", null);
        setField(term106, term106.getClass(), "_typePropertyName", "PAEBtnZtTD");
        setBooleanField(term106, term106.getClass(), "_typeIdVisible", false);
        setField(term112, term112.getClass(), "table", null);
        setField(term112, term112.getClass(), "nextTable", null);
        setLongField(term112, term112.getClass(), "baseCount", 0L);
        setIntField(term112, term112.getClass(), "sizeCtl", 32);
        setIntField(term112, term112.getClass(), "transferIndex", 0);
        setIntField(term112, term112.getClass(), "cellsBusy", 0);
        setField(term112, term112.getClass(), "counterCells", null);
        setField(term112, term112.getClass(), "keySet", null);
        setField(term112, term112.getClass(), "values", null);
        setField(term112, term112.getClass(), "entrySet", null);
        setField(term112, term112.getClass(), "keySet", null);
        setField(term112, term112.getClass(), "values", null);
        setField(term106, term106.getClass(), "_deserializers", term112);
        setField(term106, term106.getClass(), "_defaultImplDeserializer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeIdResolver");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = boolean.class;
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = null;
        args[2] = "PAEBtnZtTD";
        args[3] = term13;
        args[4] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term106));
        assertTrue(recursiveEquals(term13, false));
    }

};


