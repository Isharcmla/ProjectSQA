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

public class JavaUtilCollectionsDeserializers_converter_18068970397 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47645;
     Object term47913;

    public JavaUtilCollectionsDeserializers_converter_18068970397() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term47681 = Class.forName((String) "java.lang.invoke.VarHandleInts$FieldStaticReadOnly");
        term47645 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term47773 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term47877 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term47645, term47645.getClass(), "_class", term47681);
        setField(term47773, term47773.getClass(), "_class", null);
        setField(term47773, term47773.getClass(), "_superClass", term47877);
        setField(term47645, term47645.getClass(), "_superClass", term47773);
        term47913 = Class.forName((String) "java.util.stream.DistinctOps");
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
        args[1] = term47645;
        args[2] = term47913;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


