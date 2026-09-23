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

public class JavaUtilCollectionsDeserializers_converter_180689703462 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term469052;
     Object term469320;

    public JavaUtilCollectionsDeserializers_converter_180689703462() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term469088 = Class.forName((String) "java.util.stream.WhileOps$1");
        term469052 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term469192 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term469284 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term469052, term469052.getClass(), "_class", term469088);
        setField(term469192, term469192.getClass(), "_class", null);
        setField(term469192, term469192.getClass(), "_superClass", term469284);
        setField(term469052, term469052.getClass(), "_superClass", term469192);
        term469320 = Class.forName((String) "java.lang.StrictMath");
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
        args[1] = term469052;
        args[2] = term469320;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


