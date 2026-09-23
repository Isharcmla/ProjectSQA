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

public class JavaUtilCollectionsDeserializers_converter_180689703149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95863;
     Object term96173;

    public JavaUtilCollectionsDeserializers_converter_180689703149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term95899 = Class.forName((String) "java.util.regex.Pattern$Qtype");
        term96173 = Class.forName((String) "com.fasterxml.jackson.databind.type.ResolvedRecursiveType");
        term95863 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term96013 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        Object term96119 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term95863, term95863.getClass(), "_class", term95899);
        setField(term96013, term96013.getClass(), "_class", null);
        setField(term96119, term96119.getClass(), "_class", term96173);
        setField(term96013, term96013.getClass(), "_superClass", term96119);
        setField(term95863, term95863.getClass(), "_superClass", term96013);
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
        args[1] = term95863;
        args[2] = term96173;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


