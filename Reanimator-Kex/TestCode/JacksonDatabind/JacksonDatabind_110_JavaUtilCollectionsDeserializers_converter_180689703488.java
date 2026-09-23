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

public class JavaUtilCollectionsDeserializers_converter_180689703488 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term500477;
     Object term501167;

    public JavaUtilCollectionsDeserializers_converter_180689703488() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term500513 = Class.forName((String) "java.io.ObjectInputStream$ValidationList$Callback");
        Class<? extends Object> term500641 = Class.forName((String) "java.lang.module.ModuleDescriptor$Provides");
        Class<? extends Object> term500769 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.NumberDeserializers$LongDeserializer");
        Class<? extends Object> term500911 = Class.forName((String) "java.util.function.DoubleToIntFunction");
        term500477 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term500605 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term500733 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term500875 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term501025 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        Object term501131 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term500477, term500477.getClass(), "_class", term500513);
        setField(term500605, term500605.getClass(), "_class", term500641);
        setField(term500733, term500733.getClass(), "_class", term500769);
        setField(term500875, term500875.getClass(), "_class", term500911);
        setField(term501025, term501025.getClass(), "_class", null);
        setField(term501025, term501025.getClass(), "_superClass", term501131);
        setField(term500875, term500875.getClass(), "_superClass", term501025);
        setField(term500733, term500733.getClass(), "_superClass", term500875);
        setField(term500605, term500605.getClass(), "_superClass", term500733);
        setField(term500477, term500477.getClass(), "_superClass", term500605);
        term501167 = Class.forName((String) "com.fasterxml.jackson.databind.deser.NullValueProvider");
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
        args[1] = term500477;
        args[2] = term501167;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


