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
import java.lang.Boolean;
import java.util.HashMap;

public class AsWrapperTypeDeserializer_init_19840750739 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13;
     Object term58;

    public AsWrapperTypeDeserializer_init_19840750739() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13 = new Boolean(false);
        HashMap term61 = new HashMap();
        term58 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(term58, term58.getClass(), "_idResolver", null);
        setField(term58, term58.getClass(), "_baseType", null);
        setField(term58, term58.getClass(), "_property", null);
        setField(term58, term58.getClass(), "_defaultImpl", null);
        setField(term58, term58.getClass(), "_typePropertyName", "PAEBtnZtTD");
        setBooleanField(term58, term58.getClass(), "_typeIdVisible", false);
        setField(term58, term58.getClass(), "_deserializers", term61);
        setField(term58, term58.getClass(), "_defaultImplDeserializer", null);
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
        args[0] = null;
        args[1] = null;
        args[2] = "PAEBtnZtTD";
        args[3] = term13;
        args[4] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term58));
        assertTrue(recursiveEquals(term13, false));
    }

};


