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

public class JavaUtilCollectionsDeserializers_converter_180689703199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142794;
     Object term143218;

    public JavaUtilCollectionsDeserializers_converter_180689703199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term142830 = Class.forName((String) "java.lang.Throwable");
        Class<? extends Object> term142970 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.UUIDDeserializer");
        term142794 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term142934 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term143076 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term143182 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term142794, term142794.getClass(), "_class", term142830);
        setField(term142934, term142934.getClass(), "_class", term142970);
        setField(term143076, term143076.getClass(), "_class", null);
        setField(term143076, term143076.getClass(), "_superClass", term143182);
        setField(term142934, term142934.getClass(), "_superClass", term143076);
        setField(term142794, term142794.getClass(), "_superClass", term142934);
        term143218 = Class.forName((String) "java.util.stream.Nodes$EmptyNode$OfLong");
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
        args[1] = term142794;
        args[2] = term143218;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


