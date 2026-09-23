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

public class AsWrapperTypeDeserializer_init_198407507398 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88527;
     Object term88929;
     Object term89003;

    public AsWrapperTypeDeserializer_init_198407507398() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term88435 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(term88435, term88435.getClass(), "_baseType", null);
        setField(term88435, term88435.getClass(), "_idResolver", null);
        setField(term88435, term88435.getClass(), "_typePropertyName", null);
        setBooleanField(term88435, term88435.getClass(), "_typeIdVisible", false);
        setField(term88435, term88435.getClass(), "_deserializers", null);
        Class<? extends Object> term88563 = Class.forName((String) "java.util.concurrent.locks.ReentrantReadWriteLock$FairSync");
        term88527 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term88661 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        Object term88759 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term88527, term88527.getClass(), "_class", term88563);
        setIntField(term88661, term88661.getClass(), "_hash", 0);
        setField(term88527, term88527.getClass(), "_keyType", term88661);
        setField(term88527, term88527.getClass(), "_valueType", term88759);
        setField(term88527, term88527.getClass(), "_valueHandler", null);
        setField(term88527, term88527.getClass(), "_typeHandler", "byte[]");
        setBooleanField(term88527, term88527.getClass(), "_asStatic", false);
        term88929 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver"));
        term89003 = Class.forName((String) "java.lang.CharacterData");
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
        args[0] = term88527;
        args[1] = term88929;
        args[2] = "";
        args[3] = true;
        args[4] = term89003;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


