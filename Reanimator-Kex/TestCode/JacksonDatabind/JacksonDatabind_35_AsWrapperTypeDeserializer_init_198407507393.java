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

public class AsWrapperTypeDeserializer_init_198407507393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82248;
     Object term82526;

    public AsWrapperTypeDeserializer_init_198407507393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term82156 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(term82156, term82156.getClass(), "_baseType", null);
        setField(term82156, term82156.getClass(), "_idResolver", null);
        setField(term82156, term82156.getClass(), "_typePropertyName", null);
        setBooleanField(term82156, term82156.getClass(), "_typeIdVisible", false);
        setField(term82156, term82156.getClass(), "_deserializers", null);
        term82248 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term82354 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term82452 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term82248, term82248.getClass(), "_class", null);
        setIntField(term82354, term82354.getClass(), "_hash", 0);
        setField(term82248, term82248.getClass(), "_keyType", term82354);
        setField(term82248, term82248.getClass(), "_valueType", term82452);
        setField(term82248, term82248.getClass(), "_valueHandler", "byte");
        setField(term82248, term82248.getClass(), "_typeHandler", null);
        setBooleanField(term82248, term82248.getClass(), "_asStatic", false);
        term82526 = Class.forName((String) "java.util.MissingFormatArgumentException");
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
        args[0] = term82248;
        args[1] = null;
        args[2] = null;
        args[3] = true;
        args[4] = term82526;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


