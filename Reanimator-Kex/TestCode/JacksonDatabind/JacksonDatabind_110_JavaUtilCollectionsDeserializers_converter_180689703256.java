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
import java.lang.String;
import java.lang.Object;

public class JavaUtilCollectionsDeserializers_converter_180689703256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207928;
     Object term208370;

    public JavaUtilCollectionsDeserializers_converter_180689703256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term207964 = Class.forName((String) "java.util.stream.DoublePipeline$3$1");
        Class<? extends Object> term208114 = Class.forName((String) "com.fasterxml.jackson.databind.ser.ContextualSerializer");
        term207928 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term208078 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        Object term208220 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term208334 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term207928, term207928.getClass(), "_class", term207964);
        setField(term208078, term208078.getClass(), "_class", term208114);
        setField(term208220, term208220.getClass(), "_class", null);
        setField(term208220, term208220.getClass(), "_superClass", term208334);
        setField(term208078, term208078.getClass(), "_superClass", term208220);
        setField(term207928, term207928.getClass(), "_superClass", term208078);
        term208370 = Class.forName((String) "java.util.concurrent.locks.StampedLock$WNode");
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
        args[1] = term207928;
        args[2] = term208370;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


