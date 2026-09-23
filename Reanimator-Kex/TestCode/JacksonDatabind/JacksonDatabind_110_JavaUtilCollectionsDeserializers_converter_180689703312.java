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

public class JavaUtilCollectionsDeserializers_converter_180689703312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term273136;
     Object term273654;

    public JavaUtilCollectionsDeserializers_converter_180689703312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term273172 = Class.forName((String) "java.util.stream.ReferencePipeline$10$1");
        Class<? extends Object> term273300 = Class.forName((String) "com.fasterxml.jackson.databind.AnnotationIntrospector");
        term273136 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term273264 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term273414 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        Object term273518 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term273618 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term273136, term273136.getClass(), "_class", term273172);
        setField(term273264, term273264.getClass(), "_class", term273300);
        setField(term273414, term273414.getClass(), "_class", null);
        setField(term273518, term273518.getClass(), "_class", null);
        setField(term273518, term273518.getClass(), "_superClass", term273618);
        setField(term273414, term273414.getClass(), "_superClass", term273518);
        setField(term273264, term273264.getClass(), "_superClass", term273414);
        setField(term273136, term273136.getClass(), "_superClass", term273264);
        term273654 = Class.forName((String) "java.nio.file.FileSystems$DefaultFileSystemHolder");
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
        args[1] = term273136;
        args[2] = term273654;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


