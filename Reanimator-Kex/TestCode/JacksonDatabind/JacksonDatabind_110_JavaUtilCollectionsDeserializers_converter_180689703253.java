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
import static com.fasterxml.jackson.databind.deser.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class JavaUtilCollectionsDeserializers_converter_180689703253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205206;
     Object term205800;

    public JavaUtilCollectionsDeserializers_converter_180689703253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term205242 = Class.forName((String) "java.util.zip.ZipError");
        Class<? extends Object> term205498 = Class.forName((String) "com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator");
        Class<? extends Object> term205654 = Class.forName((String) "java.io.FilterReader");
        term205800 = Class.forName((String) "java.io.ObjectStreamClass$EntryFuture");
        term205206 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term205356 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        Object term205462 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term205618 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term205746 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term205206, term205206.getClass(), "_class", term205242);
        setField(term205356, term205356.getClass(), "_class", null);
        setField(term205462, term205462.getClass(), "_class", term205498);
        setField(term205618, term205618.getClass(), "_class", term205654);
        setField(term205746, term205746.getClass(), "_class", term205800);
        setField(term205618, term205618.getClass(), "_superClass", term205746);
        setField(term205462, term205462.getClass(), "_superClass", term205618);
        setField(term205356, term205356.getClass(), "_superClass", term205462);
        setField(term205206, term205206.getClass(), "_superClass", term205356);
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
        args[1] = term205206;
        args[2] = term205800;
        callMethod(klass, "converter", argTypes, null, args);
    }

};


