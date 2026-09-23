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

public class JavaUtilCollectionsDeserializers_converter_180689703157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104167;
     Object term104437;

    public JavaUtilCollectionsDeserializers_converter_180689703157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term104295 = Class.forName((String) "java.util.AbstractList$SubList");
        term104167 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term104259 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term104401 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term104167, term104167.getClass(), "_class", null);
        setField(term104259, term104259.getClass(), "_class", term104295);
        setField(term104259, term104259.getClass(), "_superClass", term104401);
        setField(term104167, term104167.getClass(), "_superClass", term104259);
        term104437 = Class.forName((String) "java.util.TreeMap$EntrySpliterator");
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
        args[1] = term104167;
        args[2] = term104437;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


