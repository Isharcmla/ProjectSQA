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

public class JavaUtilCollectionsDeserializers_converter_180689703227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171841;
     Object term172113;

    public JavaUtilCollectionsDeserializers_converter_180689703227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term171877 = Class.forName((String) "java.lang.annotation.IncompleteAnnotationException");
        term171841 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term171981 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term172077 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term171841, term171841.getClass(), "_class", term171877);
        setField(term171981, term171981.getClass(), "_class", null);
        setField(term171981, term171981.getClass(), "_superClass", term172077);
        setField(term171841, term171841.getClass(), "_superClass", term171981);
        term172113 = Class.forName((String) "java.util.EnumMap$EntryIterator$Entry");
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
        args[1] = term171841;
        args[2] = term172113;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


