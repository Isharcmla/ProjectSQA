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

public class JavaUtilCollectionsDeserializers_converter_180689703258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210378;
     Object term210556;

    public JavaUtilCollectionsDeserializers_converter_180689703258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term210414 = Class.forName((String) "com.fasterxml.jackson.core.base.GeneratorBase");
        term210378 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        Object term210520 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term210378, term210378.getClass(), "_class", term210414);
        setField(term210378, term210378.getClass(), "_superClass", term210520);
        term210556 = Class.forName((String) "com.fasterxml.jackson.databind.ext.package-info");
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
        args[1] = term210378;
        args[2] = term210556;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


