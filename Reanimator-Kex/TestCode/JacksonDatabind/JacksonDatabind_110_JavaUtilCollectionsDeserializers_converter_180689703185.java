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

public class JavaUtilCollectionsDeserializers_converter_180689703185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130121;
     Object term130363;

    public JavaUtilCollectionsDeserializers_converter_180689703185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term130363 = Class.forName((String) "java.lang.invoke.ProxyClassesDumper$1");
        term130121 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term130217 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term130309 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term130121, term130121.getClass(), "_class", null);
        setField(term130217, term130217.getClass(), "_class", null);
        setField(term130309, term130309.getClass(), "_class", term130363);
        setField(term130217, term130217.getClass(), "_superClass", term130309);
        setField(term130121, term130121.getClass(), "_superClass", term130217);
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
        args[1] = term130121;
        args[2] = term130363;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


