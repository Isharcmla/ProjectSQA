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

public class AsWrapperTypeDeserializer_init_1984075073100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91667;
     Object term91931;

    public AsWrapperTypeDeserializer_init_1984075073100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term91523 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(term91523, term91523.getClass(), "_baseType", null);
        setField(term91523, term91523.getClass(), "_idResolver", null);
        setField(term91523, term91523.getClass(), "_typePropertyName", "com.fasterxml.jackson.databind.type.ArrayType");
        setBooleanField(term91523, term91523.getClass(), "_typeIdVisible", false);
        setField(term91523, term91523.getClass(), "_deserializers", null);
        term91667 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term91763 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term91895 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver"));
        setField(term91667, term91667.getClass(), "_class", null);
        setIntField(term91763, term91763.getClass(), "_hash", 73);
        setField(term91667, term91667.getClass(), "_elementType", term91763);
        setBooleanField(term91667, term91667.getClass(), "_asStatic", true);
        setField(term91667, term91667.getClass(), "_valueHandler", term91895);
        setField(term91667, term91667.getClass(), "_typeHandler", term91667);
        term91931 = Class.forName((String) "java.util.AbstractCollection");
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
        args[0] = term91667;
        args[1] = null;
        args[2] = null;
        args[3] = true;
        args[4] = term91931;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


