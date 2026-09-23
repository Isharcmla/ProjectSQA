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

public class JavaUtilCollectionsDeserializers_converter_180689703368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term343968;
     Object term344352;

    public JavaUtilCollectionsDeserializers_converter_180689703368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term344004 = Class.forName((String) "java.nio.file.attribute.FileTime$1");
        term344352 = Class.forName((String) "com.fasterxml.jackson.databind.deser.DeserializationProblemHandler");
        term343968 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term344108 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term344200 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term344298 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term343968, term343968.getClass(), "_class", term344004);
        setField(term344108, term344108.getClass(), "_class", null);
        setField(term344200, term344200.getClass(), "_class", null);
        setField(term344298, term344298.getClass(), "_class", term344352);
        setField(term344200, term344200.getClass(), "_superClass", term344298);
        setField(term344108, term344108.getClass(), "_superClass", term344200);
        setField(term343968, term343968.getClass(), "_superClass", term344108);
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
        args[1] = term343968;
        args[2] = term344352;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


