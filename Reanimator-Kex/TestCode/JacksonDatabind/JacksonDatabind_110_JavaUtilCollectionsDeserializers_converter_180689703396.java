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

public class JavaUtilCollectionsDeserializers_converter_180689703396 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term381458;
     Object term381778;

    public JavaUtilCollectionsDeserializers_converter_180689703396() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term381458 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term381550 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term381642 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term381742 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term381458, term381458.getClass(), "_class", null);
        setField(term381550, term381550.getClass(), "_class", null);
        setField(term381642, term381642.getClass(), "_class", null);
        setField(term381642, term381642.getClass(), "_superClass", term381742);
        setField(term381550, term381550.getClass(), "_superClass", term381642);
        setField(term381458, term381458.getClass(), "_superClass", term381550);
        term381778 = Class.forName((String) "java.util.Properties$EntrySet");
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
        args[1] = term381458;
        args[2] = term381778;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


