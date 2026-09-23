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

public class JavaUtilCollectionsDeserializers_converter_180689703247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196098;
     Object term196674;

    public JavaUtilCollectionsDeserializers_converter_180689703247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term196134 = Class.forName((String) "java.util.regex.Pattern$Prolog");
        Class<? extends Object> term196284 = Class.forName((String) "java.util.Spliterators$AbstractSpliterator");
        Class<? extends Object> term196426 = Class.forName((String) "java.util.regex.Pattern$1");
        term196098 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term196248 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        Object term196390 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term196546 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term196638 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term196098, term196098.getClass(), "_class", term196134);
        setField(term196248, term196248.getClass(), "_class", term196284);
        setField(term196390, term196390.getClass(), "_class", term196426);
        setField(term196546, term196546.getClass(), "_class", null);
        setField(term196546, term196546.getClass(), "_superClass", term196638);
        setField(term196390, term196390.getClass(), "_superClass", term196546);
        setField(term196248, term196248.getClass(), "_superClass", term196390);
        setField(term196098, term196098.getClass(), "_superClass", term196248);
        term196674 = Class.forName((String) "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap");
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
        args[1] = term196098;
        args[2] = term196674;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


