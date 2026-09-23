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

public class AsWrapperTypeDeserializer_init_198407507389 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76502;
     Object term76783;

    public AsWrapperTypeDeserializer_init_198407507389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term76410 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(term76410, term76410.getClass(), "_baseType", null);
        setField(term76410, term76410.getClass(), "_idResolver", null);
        setField(term76410, term76410.getClass(), "_typePropertyName", null);
        setBooleanField(term76410, term76410.getClass(), "_typeIdVisible", false);
        setField(term76410, term76410.getClass(), "_deserializers", null);
        term76502 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term76598 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term76690 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term76502, term76502.getClass(), "_class", null);
        setField(term76502, term76502.getClass(), "_keyType", term76598);
        setField(term76502, term76502.getClass(), "_valueType", term76690);
        setField(term76502, term76502.getClass(), "_valueHandler", "byte");
        setField(term76502, term76502.getClass(), "_typeHandler", null);
        setBooleanField(term76502, term76502.getClass(), "_asStatic", false);
        term76783 = Class.forName((String) "com.fasterxml.jackson.databind.util.ArrayBuilders$ShortBuilder");
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
        args[0] = term76502;
        args[1] = null;
        args[2] = "byte";
        args[3] = true;
        args[4] = term76783;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


