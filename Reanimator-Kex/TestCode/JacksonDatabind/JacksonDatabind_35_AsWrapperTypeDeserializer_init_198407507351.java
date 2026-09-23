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

public class AsWrapperTypeDeserializer_init_198407507351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32485;
     Object term32785;

    public AsWrapperTypeDeserializer_init_198407507351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term32355 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(term32355, term32355.getClass(), "_baseType", null);
        setField(term32355, term32355.getClass(), "_idResolver", null);
        setField(term32355, term32355.getClass(), "_typePropertyName", "byte[]");
        setBooleanField(term32355, term32355.getClass(), "_typeIdVisible", false);
        setField(term32355, term32355.getClass(), "_deserializers", null);
        term32485 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term32577 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term32673 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term32485, term32485.getClass(), "_class", null);
        setIntField(term32577, term32577.getClass(), "_hash", 0);
        setField(term32485, term32485.getClass(), "_keyType", term32577);
        setField(term32485, term32485.getClass(), "_valueType", term32673);
        setField(term32485, term32485.getClass(), "_valueHandler", "byte");
        setField(term32485, term32485.getClass(), "_typeHandler", null);
        setBooleanField(term32485, term32485.getClass(), "_asStatic", false);
        term32785 = Class.forName((String) "java.lang.ProcessImpl");
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
        args[0] = term32485;
        args[1] = null;
        args[2] = "kex.java.util.ArrayList";
        args[3] = true;
        args[4] = term32785;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


