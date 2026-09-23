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

public class JavaUtilCollectionsDeserializers_converter_180689703480 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term490931;
     Object term491629;

    public JavaUtilCollectionsDeserializers_converter_180689703480() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term490967 = Class.forName((String) "java.util.zip.ZipFile$InflaterCleanupAction");
        Class<? extends Object> term491095 = Class.forName((String) "java.lang.Error");
        Class<? extends Object> term491223 = Class.forName((String) "java.util.regex.Pattern$BmpCharProperty");
        Class<? extends Object> term491479 = Class.forName((String) "java.util.stream.ReduceOps$4ReducingSink");
        term490931 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term491059 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term491187 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term491329 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term491443 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object term491593 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term490931, term490931.getClass(), "_class", term490967);
        setField(term491059, term491059.getClass(), "_class", term491095);
        setField(term491187, term491187.getClass(), "_class", term491223);
        setField(term491329, term491329.getClass(), "_class", null);
        setField(term491443, term491443.getClass(), "_class", term491479);
        setField(term491443, term491443.getClass(), "_superClass", term491593);
        setField(term491329, term491329.getClass(), "_superClass", term491443);
        setField(term491187, term491187.getClass(), "_superClass", term491329);
        setField(term491059, term491059.getClass(), "_superClass", term491187);
        setField(term490931, term490931.getClass(), "_superClass", term491059);
        term491629 = Class.forName((String) "java.util.concurrent.LinkedBlockingQueue$Node");
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
        args[1] = term490931;
        args[2] = term491629;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


