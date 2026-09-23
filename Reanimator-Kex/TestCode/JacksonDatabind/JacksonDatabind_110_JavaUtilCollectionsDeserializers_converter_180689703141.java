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

public class JavaUtilCollectionsDeserializers_converter_180689703141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88926;
     Object term89206;

    public JavaUtilCollectionsDeserializers_converter_180689703141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term88962 = Class.forName((String) "java.io.FileOutputStream");
        term88926 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term89066 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term89170 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term88926, term88926.getClass(), "_class", term88962);
        setField(term89066, term89066.getClass(), "_class", null);
        setField(term89066, term89066.getClass(), "_superClass", term89170);
        setField(term88926, term88926.getClass(), "_superClass", term89066);
        term89206 = Class.forName((String) "com.fasterxml.jackson.databind.util.ArrayBuilders$ShortBuilder");
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
        args[1] = term88926;
        args[2] = term89206;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


