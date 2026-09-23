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

public class JavaUtilCollectionsDeserializers_converter_180689703434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term425108;
     Object term425474;

    public JavaUtilCollectionsDeserializers_converter_180689703434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term425236 = Class.forName((String) "java.util.stream.Nodes$DoubleSpinedNodeBuilder");
        term425474 = Class.forName((String) "com.fasterxml.jackson.core.util.DefaultPrettyPrinter$NopIndenter");
        term425108 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term425200 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term425328 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term425420 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term425108, term425108.getClass(), "_class", null);
        setField(term425200, term425200.getClass(), "_class", term425236);
        setField(term425328, term425328.getClass(), "_class", null);
        setField(term425420, term425420.getClass(), "_class", term425474);
        setField(term425328, term425328.getClass(), "_superClass", term425420);
        setField(term425200, term425200.getClass(), "_superClass", term425328);
        setField(term425108, term425108.getClass(), "_superClass", term425200);
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
        args[1] = term425108;
        args[2] = term425474;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


