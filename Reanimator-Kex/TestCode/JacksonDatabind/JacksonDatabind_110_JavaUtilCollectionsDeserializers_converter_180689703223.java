package com.fasterxml.jackson.databind.deser.impl;

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
import static com.fasterxml.jackson.databind.deser.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class JavaUtilCollectionsDeserializers_converter_180689703223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166136;
     Object term166704;

    public JavaUtilCollectionsDeserializers_converter_180689703223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term166286 = Class.forName((String) "java.util.stream.Collectors$Partition");
        Class<? extends Object> term166428 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder");
        term166136 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term166250 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        Object term166392 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term166548 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term166668 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term166136, term166136.getClass(), "_class", null);
        setField(term166250, term166250.getClass(), "_class", term166286);
        setField(term166392, term166392.getClass(), "_class", term166428);
        setField(term166548, term166548.getClass(), "_class", null);
        setField(term166548, term166548.getClass(), "_superClass", term166668);
        setField(term166392, term166392.getClass(), "_superClass", term166548);
        setField(term166250, term166250.getClass(), "_superClass", term166392);
        setField(term166136, term166136.getClass(), "_superClass", term166250);
        term166704 = Class.forName((String) "java.io.PipedWriter");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("java.lang.Class");
        Object[] args = new Object[3];
        args[0] = 0;
        args[1] = term166136;
        args[2] = term166704;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


