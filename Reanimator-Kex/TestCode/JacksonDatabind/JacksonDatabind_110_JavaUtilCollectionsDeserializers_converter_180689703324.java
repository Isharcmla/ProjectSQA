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

public class JavaUtilCollectionsDeserializers_converter_180689703324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term286271;
     Object term286687;

    public JavaUtilCollectionsDeserializers_converter_180689703324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term286399 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonSetter$Value");
        Class<? extends Object> term286527 = Class.forName((String) "java.util.concurrent.atomic.AtomicStampedReference$Pair");
        term286687 = Class.forName((String) "java.util.stream.SortedOps$LongSortingSink");
        term286271 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term286363 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term286491 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term286633 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term286271, term286271.getClass(), "_class", null);
        setField(term286363, term286363.getClass(), "_class", term286399);
        setField(term286491, term286491.getClass(), "_class", term286527);
        setField(term286633, term286633.getClass(), "_class", term286687);
        setField(term286491, term286491.getClass(), "_superClass", term286633);
        setField(term286363, term286363.getClass(), "_superClass", term286491);
        setField(term286271, term286271.getClass(), "_superClass", term286363);
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
        args[1] = term286271;
        args[2] = term286687;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


