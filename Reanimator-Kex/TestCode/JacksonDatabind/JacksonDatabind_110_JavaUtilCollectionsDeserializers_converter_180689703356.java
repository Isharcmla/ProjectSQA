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

public class JavaUtilCollectionsDeserializers_converter_180689703356 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term329866;
     Object term330126;

    public JavaUtilCollectionsDeserializers_converter_180689703356() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term329902 = Class.forName((String) "java.lang.module.ModuleDescriptor$Exports");
        term329866 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term329994 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term330090 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term329866, term329866.getClass(), "_class", term329902);
        setField(term329994, term329994.getClass(), "_class", null);
        setField(term329994, term329994.getClass(), "_superClass", term330090);
        setField(term329866, term329866.getClass(), "_superClass", term329994);
        term330126 = Class.forName((String) "java.util.LinkedList$Node");
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
        args[1] = term329866;
        args[2] = term330126;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


