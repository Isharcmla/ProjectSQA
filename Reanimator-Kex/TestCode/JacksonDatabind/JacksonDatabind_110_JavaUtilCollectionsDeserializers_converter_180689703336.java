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

public class JavaUtilCollectionsDeserializers_converter_180689703336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term304076;
     Object term304600;

    public JavaUtilCollectionsDeserializers_converter_180689703336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term304112 = Class.forName((String) "java.nio.file.attribute.PosixFilePermissions$1");
        Class<? extends Object> term304240 = Class.forName((String) "java.util.concurrent.atomic.LongAdder$SerializationProxy");
        Class<? extends Object> term304372 = Class.forName((String) "java.lang.annotation.AnnotationTypeMismatchException");
        term304076 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term304204 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term304336 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term304464 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term304564 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term304076, term304076.getClass(), "_class", term304112);
        setField(term304204, term304204.getClass(), "_class", term304240);
        setField(term304336, term304336.getClass(), "_class", term304372);
        setField(term304464, term304464.getClass(), "_class", null);
        setField(term304464, term304464.getClass(), "_superClass", term304564);
        setField(term304336, term304336.getClass(), "_superClass", term304464);
        setField(term304204, term304204.getClass(), "_superClass", term304336);
        setField(term304076, term304076.getClass(), "_superClass", term304204);
        term304600 = Class.forName((String) "com.fasterxml.jackson.databind.PropertyNamingStrategy$LowerCaseWithUnderscoresStrategy");
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
        args[1] = term304076;
        args[2] = term304600;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


