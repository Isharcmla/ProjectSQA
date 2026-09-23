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

public class JavaUtilCollectionsDeserializers_converter_180689703450 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term450767;
     Object term451271;

    public JavaUtilCollectionsDeserializers_converter_180689703450() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term451009 = Class.forName((String) "java.util.Spliterators$DoubleIteratorSpliterator");
        term451271 = Class.forName((String) "java.lang.invoke.AbstractConstantGroup$AsIterator");
        term450767 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term450859 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term450973 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        Object term451113 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term451217 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term450767, term450767.getClass(), "_class", null);
        setField(term450859, term450859.getClass(), "_class", null);
        setField(term450973, term450973.getClass(), "_class", term451009);
        setField(term451113, term451113.getClass(), "_class", null);
        setField(term451217, term451217.getClass(), "_class", term451271);
        setField(term451113, term451113.getClass(), "_superClass", term451217);
        setField(term450973, term450973.getClass(), "_superClass", term451113);
        setField(term450859, term450859.getClass(), "_superClass", term450973);
        setField(term450767, term450767.getClass(), "_superClass", term450859);
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
        args[1] = term450767;
        args[2] = term451271;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


