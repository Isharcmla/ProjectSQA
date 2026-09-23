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

public class AsPropertyTypeDeserializer_init_102604919722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3132;
     Object term3436;
     Object term3441;

    public AsPropertyTypeDeserializer_init_102604919722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term2816 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        Object term2908 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term3040 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver"));
        setField(term2816, term2816.getClass(), "_baseType", term2908);
        setField(term2816, term2816.getClass(), "_idResolver", term3040);
        term3132 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        term3436 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        Object term3437 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term3440 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term3436, term3436.getClass(), "_inclusion", null);
        setField(term3436, term3436.getClass(), "_idResolver", null);
        setField(term3437, term3437.getClass(), "_keyType", null);
        setField(term3437, term3437.getClass(), "_valueType", null);
        setField(term3437, term3437.getClass(), "_superClass", null);
        setField(term3437, term3437.getClass(), "_superInterfaces", null);
        setField(term3437, term3437.getClass(), "_bindings", null);
        setField(term3437, term3437.getClass(), "_canonicalName", null);
        setField(term3437, term3437.getClass(), "_class", null);
        setIntField(term3437, term3437.getClass(), "_hash", 0);
        setField(term3437, term3437.getClass(), "_valueHandler", null);
        setField(term3437, term3437.getClass(), "_typeHandler", null);
        setBooleanField(term3437, term3437.getClass(), "_asStatic", false);
        setField(term3436, term3436.getClass(), "_baseType", term3437);
        setField(term3436, term3436.getClass(), "_property", null);
        setField(term3436, term3436.getClass(), "_defaultImpl", null);
        setField(term3436, term3436.getClass(), "_typePropertyName", "");
        setBooleanField(term3436, term3436.getClass(), "_typeIdVisible", false);
        setField(term3440, term3440.getClass(), "table", null);
        setField(term3440, term3440.getClass(), "nextTable", null);
        setLongField(term3440, term3440.getClass(), "baseCount", 0L);
        setIntField(term3440, term3440.getClass(), "sizeCtl", 32);
        setIntField(term3440, term3440.getClass(), "transferIndex", 0);
        setIntField(term3440, term3440.getClass(), "cellsBusy", 0);
        setField(term3440, term3440.getClass(), "counterCells", null);
        setField(term3440, term3440.getClass(), "keySet", null);
        setField(term3440, term3440.getClass(), "values", null);
        setField(term3440, term3440.getClass(), "entrySet", null);
        setField(term3440, term3440.getClass(), "keySet", null);
        setField(term3440, term3440.getClass(), "values", null);
        setField(term3436, term3436.getClass(), "_deserializers", term3440);
        setField(term3436, term3436.getClass(), "_defaultImplDeserializer", null);
        term3441 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term3441, term3441.getClass(), "_keyType", null);
        setField(term3441, term3441.getClass(), "_valueType", null);
        setField(term3441, term3441.getClass(), "_superClass", null);
        setField(term3441, term3441.getClass(), "_superInterfaces", null);
        setField(term3441, term3441.getClass(), "_bindings", null);
        setField(term3441, term3441.getClass(), "_canonicalName", null);
        setField(term3441, term3441.getClass(), "_class", null);
        setIntField(term3441, term3441.getClass(), "_hash", 0);
        setField(term3441, term3441.getClass(), "_valueHandler", null);
        setField(term3441, term3441.getClass(), "_typeHandler", null);
        setBooleanField(term3441, term3441.getClass(), "_asStatic", false);
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
        args[0] = term3132;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        args[4] = null;
        args[5] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term3436));
        assertTrue(recursiveEquals(term3132, term3441));
    }

};


