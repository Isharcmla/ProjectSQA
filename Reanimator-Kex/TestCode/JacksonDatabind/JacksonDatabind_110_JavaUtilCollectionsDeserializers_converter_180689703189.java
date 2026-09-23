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

public class JavaUtilCollectionsDeserializers_converter_180689703189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133422;
     Object term133822;

    public JavaUtilCollectionsDeserializers_converter_180689703189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term133458 = Class.forName((String) "java.util.jar.JarFile$JarFileEntry");
        Class<? extends Object> term133586 = Class.forName((String) "java.nio.DirectIntBufferRS");
        term133422 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term133550 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term133682 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term133786 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term133422, term133422.getClass(), "_class", term133458);
        setField(term133550, term133550.getClass(), "_class", term133586);
        setField(term133682, term133682.getClass(), "_class", null);
        setField(term133682, term133682.getClass(), "_superClass", term133786);
        setField(term133550, term133550.getClass(), "_superClass", term133682);
        setField(term133422, term133422.getClass(), "_superClass", term133550);
        term133822 = Class.forName((String) "com.fasterxml.jackson.core.JsonFactory");
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
        args[1] = term133422;
        args[2] = term133822;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


