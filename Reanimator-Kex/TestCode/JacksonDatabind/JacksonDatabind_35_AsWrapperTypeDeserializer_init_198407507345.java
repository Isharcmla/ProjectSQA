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
import java.util.HashMap;
import java.lang.String;

public class AsWrapperTypeDeserializer_init_198407507345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26414;
     Object term26748;

    public AsWrapperTypeDeserializer_init_198407507345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term26322 = new HashMap();
        Object term26102 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        Object term26236 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver"));
        setField(term26102, term26102.getClass(), "_baseType", null);
        setField(term26102, term26102.getClass(), "_idResolver", term26236);
        setField(term26102, term26102.getClass(), "_typePropertyName", "");
        setBooleanField(term26102, term26102.getClass(), "_typeIdVisible", false);
        setField(term26102, term26102.getClass(), "_deserializers", term26322);
        term26414 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term26506 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term26598 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term26414, term26414.getClass(), "_class", null);
        setIntField(term26506, term26506.getClass(), "_hash", 0);
        setField(term26414, term26414.getClass(), "_keyType", term26506);
        setField(term26414, term26414.getClass(), "_valueType", term26598);
        setField(term26414, term26414.getClass(), "_valueHandler", "java.lang.Class");
        setField(term26414, term26414.getClass(), "_typeHandler", "byte[]");
        setBooleanField(term26414, term26414.getClass(), "_asStatic", false);
        term26748 = Class.forName((String) "com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer");
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
        args[0] = term26414;
        args[1] = null;
        args[2] = "";
        args[3] = true;
        args[4] = term26748;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


