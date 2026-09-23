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

public class JavaUtilCollectionsDeserializers_converter_180689703183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128095;
     Object term128391;

    public JavaUtilCollectionsDeserializers_converter_180689703183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term128235 = Class.forName((String) "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper");
        term128095 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        Object term128199 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term128355 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term128095, term128095.getClass(), "_class", null);
        setField(term128199, term128199.getClass(), "_class", term128235);
        setField(term128199, term128199.getClass(), "_superClass", term128355);
        setField(term128095, term128095.getClass(), "_superClass", term128199);
        term128391 = Class.forName((String) "java.util.stream.SortedOps$AbstractRefSortingSink");
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
        args[1] = term128095;
        args[2] = term128391;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


