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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.databind.jsontype.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class AsWrapperTypeDeserializer_init_198407507337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18022;
     Object term18202;

    public AsWrapperTypeDeserializer_init_198407507337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term17832 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        Object term17930 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term17832, term17832.getClass(), "_baseType", term17930);
        setField(term17832, term17832.getClass(), "_idResolver", null);
        setField(term17832, term17832.getClass(), "_typePropertyName", null);
        setBooleanField(term17832, term17832.getClass(), "_typeIdVisible", false);
        setField(term17832, term17832.getClass(), "_deserializers", null);
        term18022 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term18128 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term18022, term18022.getClass(), "_class", null);
        setField(term18022, term18022.getClass(), "_keyType", term18128);
        setField(term18022, term18022.getClass(), "_valueType", null);
        setField(term18022, term18022.getClass(), "_valueHandler", null);
        setField(term18022, term18022.getClass(), "_typeHandler", null);
        setBooleanField(term18022, term18022.getClass(), "_asStatic", false);
        term18202 = Class.forName((String) "java.io.StringBufferInputStream");
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
        args[0] = term18022;
        args[1] = null;
        args[2] = "byte[]";
        args[3] = true;
        args[4] = term18202;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


