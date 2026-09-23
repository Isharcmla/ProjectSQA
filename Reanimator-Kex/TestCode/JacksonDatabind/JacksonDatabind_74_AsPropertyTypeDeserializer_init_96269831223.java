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
import java.lang.Object;
import java.lang.String;

public class AsPropertyTypeDeserializer_init_96269831223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3477;

    public AsPropertyTypeDeserializer_init_96269831223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term3421 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(term3421, term3421.getClass(), "_baseType", null);
        setField(term3421, term3421.getClass(), "_idResolver", null);
        Class<? extends Object> term3485 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$As");
        Field term3484 = ((Class) term3485).getDeclaredField((String) "PROPERTY");
        ((Field) term3484).setAccessible(true);
        Object enum1 = ((Field) term3484).get((Object) null);
        term3477 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        Object term3483 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term3477, term3477.getClass(), "_inclusion", enum1);
        setField(term3477, term3477.getClass(), "_idResolver", null);
        setField(term3477, term3477.getClass(), "_baseType", null);
        setField(term3477, term3477.getClass(), "_property", null);
        setField(term3477, term3477.getClass(), "_defaultImpl", null);
        setField(term3477, term3477.getClass(), "_typePropertyName", "");
        setBooleanField(term3477, term3477.getClass(), "_typeIdVisible", false);
        setField(term3483, term3483.getClass(), "table", null);
        setField(term3483, term3483.getClass(), "nextTable", null);
        setLongField(term3483, term3483.getClass(), "baseCount", 0L);
        setIntField(term3483, term3483.getClass(), "sizeCtl", 32);
        setIntField(term3483, term3483.getClass(), "transferIndex", 0);
        setIntField(term3483, term3483.getClass(), "cellsBusy", 0);
        setField(term3483, term3483.getClass(), "counterCells", null);
        setField(term3483, term3483.getClass(), "keySet", null);
        setField(term3483, term3483.getClass(), "values", null);
        setField(term3483, term3483.getClass(), "entrySet", null);
        setField(term3483, term3483.getClass(), "keySet", null);
        setField(term3483, term3483.getClass(), "values", null);
        setField(term3477, term3477.getClass(), "_deserializers", term3483);
        setField(term3477, term3477.getClass(), "_defaultImplDeserializer", null);
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
        args[2] = null;
        args[3] = false;
        args[4] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term3477));
    }

};


