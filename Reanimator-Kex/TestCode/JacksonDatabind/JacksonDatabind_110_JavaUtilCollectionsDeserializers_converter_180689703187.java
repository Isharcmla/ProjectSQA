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

public class JavaUtilCollectionsDeserializers_converter_180689703187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131725;
     Object term131971;

    public JavaUtilCollectionsDeserializers_converter_180689703187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term131725 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term131829 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term131935 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term131725, term131725.getClass(), "_class", null);
        setField(term131829, term131829.getClass(), "_class", null);
        setField(term131829, term131829.getClass(), "_superClass", term131935);
        setField(term131725, term131725.getClass(), "_superClass", term131829);
        term131971 = Class.forName((String) "java.util.Spliterator$OfPrimitive");
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
        args[1] = term131725;
        args[2] = term131971;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


