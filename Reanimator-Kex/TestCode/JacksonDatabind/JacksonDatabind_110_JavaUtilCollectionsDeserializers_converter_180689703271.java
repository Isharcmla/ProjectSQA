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

public class JavaUtilCollectionsDeserializers_converter_180689703271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term224908;
     Object term225342;

    public JavaUtilCollectionsDeserializers_converter_180689703271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term224944 = Class.forName((String) "com.fasterxml.jackson.databind.util.ArrayBuilders$IntBuilder");
        Class<? extends Object> term225072 = Class.forName((String) "java.lang.InternalError");
        term224908 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term225036 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term225186 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        Object term225306 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term224908, term224908.getClass(), "_class", term224944);
        setField(term225036, term225036.getClass(), "_class", term225072);
        setField(term225186, term225186.getClass(), "_class", null);
        setField(term225186, term225186.getClass(), "_superClass", term225306);
        setField(term225036, term225036.getClass(), "_superClass", term225186);
        setField(term224908, term224908.getClass(), "_superClass", term225036);
        term225342 = Class.forName((String) "java.util.zip.CRC32C");
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
        args[1] = term224908;
        args[2] = term225342;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


