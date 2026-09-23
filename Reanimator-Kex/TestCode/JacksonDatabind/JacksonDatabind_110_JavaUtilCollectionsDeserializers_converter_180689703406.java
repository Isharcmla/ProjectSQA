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

public class JavaUtilCollectionsDeserializers_converter_180689703406 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term391088;
     Object term391436;

    public JavaUtilCollectionsDeserializers_converter_180689703406() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term391088 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term391180 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term391286 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term391400 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        setField(term391088, term391088.getClass(), "_class", null);
        setField(term391180, term391180.getClass(), "_class", null);
        setField(term391286, term391286.getClass(), "_class", null);
        setField(term391286, term391286.getClass(), "_superClass", term391400);
        setField(term391180, term391180.getClass(), "_superClass", term391286);
        setField(term391088, term391088.getClass(), "_superClass", term391180);
        term391436 = Class.forName((String) "com.fasterxml.jackson.annotation.JacksonAnnotationValue");
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
        args[1] = term391088;
        args[2] = term391436;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


