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
import java.lang.Object;

public class AsPropertyTypeDeserializer_init_102604919710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37;
     Object term538;

    public AsPropertyTypeDeserializer_init_102604919710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37 = new Boolean(false);
        term538 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        Object term541 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term538, term538.getClass(), "_inclusion", null);
        setField(term538, term538.getClass(), "_idResolver", null);
        setField(term538, term538.getClass(), "_baseType", null);
        setField(term538, term538.getClass(), "_property", null);
        setField(term538, term538.getClass(), "_defaultImpl", null);
        setField(term538, term538.getClass(), "_typePropertyName", "sjlJAEtRrb");
        setBooleanField(term538, term538.getClass(), "_typeIdVisible", false);
        setField(term541, term541.getClass(), "table", null);
        setField(term541, term541.getClass(), "nextTable", null);
        setLongField(term541, term541.getClass(), "baseCount", 0L);
        setIntField(term541, term541.getClass(), "sizeCtl", 32);
        setIntField(term541, term541.getClass(), "transferIndex", 0);
        setIntField(term541, term541.getClass(), "cellsBusy", 0);
        setField(term541, term541.getClass(), "counterCells", null);
        setField(term541, term541.getClass(), "keySet", null);
        setField(term541, term541.getClass(), "values", null);
        setField(term541, term541.getClass(), "entrySet", null);
        setField(term541, term541.getClass(), "keySet", null);
        setField(term541, term541.getClass(), "values", null);
        setField(term538, term538.getClass(), "_deserializers", term541);
        setField(term538, term538.getClass(), "_defaultImplDeserializer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeIdResolver");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = boolean.class;
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[5] = Class.forName("com.fasterxml.jackson.annotation.JsonTypeInfo$As");
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = null;
        args[2] = "sjlJAEtRrb";
        args[3] = term37;
        args[4] = null;
        args[5] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term538));
        assertTrue(recursiveEquals(term37, false));
    }

};


