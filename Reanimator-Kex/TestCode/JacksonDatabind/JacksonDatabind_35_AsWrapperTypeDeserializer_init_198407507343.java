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

public class AsWrapperTypeDeserializer_init_198407507343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24498;
     Object term24646;
     Object term24682;

    public AsWrapperTypeDeserializer_init_198407507343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term24272 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        Object term24406 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver"));
        setField(term24272, term24272.getClass(), "_baseType", null);
        setField(term24272, term24272.getClass(), "_idResolver", term24406);
        setField(term24272, term24272.getClass(), "_typePropertyName", null);
        setBooleanField(term24272, term24272.getClass(), "_typeIdVisible", false);
        setField(term24272, term24272.getClass(), "_deserializers", null);
        term24498 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        term24646 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver"));
        term24682 = Class.forName((String) "java.util.zip.Adler32");
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
        args[0] = term24498;
        args[1] = term24646;
        args[2] = null;
        args[3] = true;
        args[4] = term24682;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


