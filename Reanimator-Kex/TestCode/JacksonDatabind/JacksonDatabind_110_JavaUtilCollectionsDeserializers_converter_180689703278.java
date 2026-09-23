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

public class JavaUtilCollectionsDeserializers_converter_180689703278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term234319;
     Object term234839;

    public JavaUtilCollectionsDeserializers_converter_180689703278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term234355 = Class.forName((String) "java.nio.channels.WritableByteChannel");
        Class<? extends Object> term234483 = Class.forName((String) "java.lang.invoke.InnerClassLambdaMetafactory");
        Class<? extends Object> term234615 = Class.forName((String) "java.util.regex.Pattern$TreeInfo");
        term234319 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term234447 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term234579 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term234711 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term234803 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term234319, term234319.getClass(), "_class", term234355);
        setField(term234447, term234447.getClass(), "_class", term234483);
        setField(term234579, term234579.getClass(), "_class", term234615);
        setField(term234711, term234711.getClass(), "_class", null);
        setField(term234711, term234711.getClass(), "_superClass", term234803);
        setField(term234579, term234579.getClass(), "_superClass", term234711);
        setField(term234447, term234447.getClass(), "_superClass", term234579);
        setField(term234319, term234319.getClass(), "_superClass", term234447);
        term234839 = Class.forName((String) "java.util.concurrent.ForkJoinPool$ForkJoinWorkerThreadFactory");
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
        args[1] = term234319;
        args[2] = term234839;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


