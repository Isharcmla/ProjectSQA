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

public class JavaUtilCollectionsDeserializers_converter_180689703370 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term346091;
     Object term346805;

    public JavaUtilCollectionsDeserializers_converter_180689703370() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term346127 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonBackReference");
        Class<? extends Object> term346267 = Class.forName((String) "com.fasterxml.jackson.databind.deser.DeserializationProblemHandler");
        Class<? extends Object> term346409 = Class.forName((String) "java.util.Formatter$BigDecimalLayoutForm");
        Class<? extends Object> term346551 = Class.forName((String) "java.util.stream.Node$Builder$OfLong");
        term346091 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term346231 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term346373 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term346515 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term346655 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term346769 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term346091, term346091.getClass(), "_class", term346127);
        setField(term346231, term346231.getClass(), "_class", term346267);
        setField(term346373, term346373.getClass(), "_class", term346409);
        setField(term346515, term346515.getClass(), "_class", term346551);
        setField(term346655, term346655.getClass(), "_class", null);
        setField(term346655, term346655.getClass(), "_superClass", term346769);
        setField(term346515, term346515.getClass(), "_superClass", term346655);
        setField(term346373, term346373.getClass(), "_superClass", term346515);
        setField(term346231, term346231.getClass(), "_superClass", term346373);
        setField(term346091, term346091.getClass(), "_superClass", term346231);
        term346805 = Class.forName((String) "java.io.Console$1");
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
        args[1] = term346091;
        args[2] = term346805;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


