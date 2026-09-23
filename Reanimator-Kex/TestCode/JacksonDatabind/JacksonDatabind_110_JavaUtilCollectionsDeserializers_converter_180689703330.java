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

public class JavaUtilCollectionsDeserializers_converter_180689703330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term294900;
     Object term295298;

    public JavaUtilCollectionsDeserializers_converter_180689703330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term294936 = Class.forName((String) "java.util.concurrent.locks.StampedLock$ReadWriteLockView");
        term295298 = Class.forName((String) "java.util.EnumMap$EntryIterator");
        term294900 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term295040 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term295146 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term295244 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term294900, term294900.getClass(), "_class", term294936);
        setField(term295040, term295040.getClass(), "_class", null);
        setField(term295146, term295146.getClass(), "_class", null);
        setField(term295244, term295244.getClass(), "_class", term295298);
        setField(term295146, term295146.getClass(), "_superClass", term295244);
        setField(term295040, term295040.getClass(), "_superClass", term295146);
        setField(term294900, term294900.getClass(), "_superClass", term295040);
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
        args[1] = term294900;
        args[2] = term295298;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


