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

public class JavaUtilCollectionsDeserializers_converter_180689703209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152123;
     Object term152521;

    public JavaUtilCollectionsDeserializers_converter_180689703209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term152159 = Class.forName((String) "java.util.stream.Node");
        term152123 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term152273 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        Object term152379 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term152485 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term152123, term152123.getClass(), "_class", term152159);
        setField(term152273, term152273.getClass(), "_class", null);
        setField(term152379, term152379.getClass(), "_class", null);
        setField(term152379, term152379.getClass(), "_superClass", term152485);
        setField(term152273, term152273.getClass(), "_superClass", term152379);
        setField(term152123, term152123.getClass(), "_superClass", term152273);
        term152521 = Class.forName((String) "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonBooleanFormatVisitor$Base");
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
        args[1] = term152123;
        args[2] = term152521;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


