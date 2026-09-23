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

public class AsWrapperTypeDeserializer_init_1984075073102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93980;
     Object term94226;

    public AsWrapperTypeDeserializer_init_1984075073102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term93788 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        Object term93888 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term93788, term93788.getClass(), "_baseType", term93888);
        setField(term93788, term93788.getClass(), "_idResolver", null);
        setField(term93788, term93788.getClass(), "_typePropertyName", null);
        setBooleanField(term93788, term93788.getClass(), "_typeIdVisible", false);
        setField(term93788, term93788.getClass(), "_deserializers", null);
        term93980 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term94076 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term94190 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term93980, term93980.getClass(), "_class", null);
        setIntField(term94076, term94076.getClass(), "_hash", 0);
        setField(term93980, term93980.getClass(), "_keyType", term94076);
        setField(term93980, term93980.getClass(), "_valueType", term94190);
        setField(term93980, term93980.getClass(), "_valueHandler", null);
        setField(term93980, term93980.getClass(), "_typeHandler", null);
        setBooleanField(term93980, term93980.getClass(), "_asStatic", false);
        term94226 = Class.forName((String) "java.nio.file.OpenOption");
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
        args[0] = term93980;
        args[1] = null;
        args[2] = null;
        args[3] = true;
        args[4] = term94226;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


