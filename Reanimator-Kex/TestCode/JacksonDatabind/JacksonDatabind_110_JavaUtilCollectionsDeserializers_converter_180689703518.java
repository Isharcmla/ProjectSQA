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

public class JavaUtilCollectionsDeserializers_converter_180689703518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term541214;
     Object term541606;

    public JavaUtilCollectionsDeserializers_converter_180689703518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term541250 = Class.forName((String) "java.util.stream.ReferencePipeline$5$1");
        term541606 = Class.forName((String) "java.nio.StringCharBuffer");
        term541214 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term541354 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term541460 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term541552 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term541214, term541214.getClass(), "_class", term541250);
        setField(term541354, term541354.getClass(), "_class", null);
        setField(term541460, term541460.getClass(), "_class", null);
        setField(term541552, term541552.getClass(), "_class", term541606);
        setField(term541460, term541460.getClass(), "_superClass", term541552);
        setField(term541354, term541354.getClass(), "_superClass", term541460);
        setField(term541214, term541214.getClass(), "_superClass", term541354);
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
        args[1] = term541214;
        args[2] = term541606;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


