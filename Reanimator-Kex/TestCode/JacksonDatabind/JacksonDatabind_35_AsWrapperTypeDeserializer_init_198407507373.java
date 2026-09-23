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
import java.lang.reflect.InaccessibleObjectException;
import static com.fasterxml.jackson.databind.jsontype.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class AsWrapperTypeDeserializer_init_198407507373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56040;
     Object term56460;
     Object term56496;

    public AsWrapperTypeDeserializer_init_198407507373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term55948 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(term55948, term55948.getClass(), "_baseType", null);
        setField(term55948, term55948.getClass(), "_idResolver", null);
        setField(term55948, term55948.getClass(), "_typePropertyName", null);
        setBooleanField(term55948, term55948.getClass(), "_typeIdVisible", false);
        setField(term55948, term55948.getClass(), "_deserializers", null);
        Class<? extends Object> term56076 = Class.forName((String) "java.util.concurrent.CopyOnWriteArrayList");
        term56040 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term56168 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term56274 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term56040, term56040.getClass(), "_class", term56076);
        setIntField(term56168, term56168.getClass(), "_hash", 0);
        setField(term56040, term56040.getClass(), "_keyType", term56168);
        setField(term56040, term56040.getClass(), "_valueType", term56274);
        setField(term56040, term56040.getClass(), "_valueHandler", "com.fasterxml.jackson.databind.type.CollectionType");
        setField(term56040, term56040.getClass(), "_typeHandler", null);
        setBooleanField(term56040, term56040.getClass(), "_asStatic", false);
        term56460 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver"));
        term56496 = Class.forName((String) "java.util.regex.Pattern$SliceIS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeIdResolver");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = boolean.class;
        argTypes[4] = Class.forName("java.lang.Class");
        Object[] args = new Object[5];
        args[0] = term56040;
        args[1] = term56460;
        args[2] = null;
        args[3] = true;
        args[4] = term56496;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


