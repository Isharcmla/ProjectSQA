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

public class JavaUtilCollectionsDeserializers_converter_180689703478 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term488855;
     Object term489235;

    public JavaUtilCollectionsDeserializers_converter_180689703478() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term488891 = Class.forName((String) "java.nio.channels.ScatteringByteChannel");
        term489235 = Class.forName((String) "java.util.function.ObjIntConsumer");
        term488855 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term488983 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term489075 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term489181 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term488855, term488855.getClass(), "_class", term488891);
        setField(term488983, term488983.getClass(), "_class", null);
        setField(term489075, term489075.getClass(), "_class", null);
        setField(term489181, term489181.getClass(), "_class", term489235);
        setField(term489075, term489075.getClass(), "_superClass", term489181);
        setField(term488983, term488983.getClass(), "_superClass", term489075);
        setField(term488855, term488855.getClass(), "_superClass", term488983);
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
        args[1] = term488855;
        args[2] = term489235;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


