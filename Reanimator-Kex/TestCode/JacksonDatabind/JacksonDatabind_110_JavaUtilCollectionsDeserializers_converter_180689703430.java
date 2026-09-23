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

public class JavaUtilCollectionsDeserializers_converter_180689703430 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term422165;
     Object term422477;

    public JavaUtilCollectionsDeserializers_converter_180689703430() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term422165 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term422257 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term422349 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term422441 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term422165, term422165.getClass(), "_class", null);
        setField(term422257, term422257.getClass(), "_class", null);
        setField(term422349, term422349.getClass(), "_class", null);
        setField(term422349, term422349.getClass(), "_superClass", term422441);
        setField(term422257, term422257.getClass(), "_superClass", term422349);
        setField(term422165, term422165.getClass(), "_superClass", term422257);
        term422477 = Class.forName((String) "java.io.SerializablePermission");
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
        args[1] = term422165;
        args[2] = term422477;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


