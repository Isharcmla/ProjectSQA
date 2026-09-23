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

public class JavaUtilCollectionsDeserializers_converter_180689703532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term560611;
     Object term561147;

    public JavaUtilCollectionsDeserializers_converter_180689703532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term560647 = Class.forName((String) "java.lang.Iterable");
        Class<? extends Object> term560797 = Class.forName((String) "com.fasterxml.jackson.databind.BeanProperty");
        term560611 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term560761 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        Object term560903 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term561007 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term561111 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term560611, term560611.getClass(), "_class", term560647);
        setField(term560761, term560761.getClass(), "_class", term560797);
        setField(term560903, term560903.getClass(), "_class", null);
        setField(term561007, term561007.getClass(), "_class", null);
        setField(term561007, term561007.getClass(), "_superClass", term561111);
        setField(term560903, term560903.getClass(), "_superClass", term561007);
        setField(term560761, term560761.getClass(), "_superClass", term560903);
        setField(term560611, term560611.getClass(), "_superClass", term560761);
        term561147 = Class.forName((String) "java.util.stream.IntStream");
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
        args[1] = term560611;
        args[2] = term561147;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


