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

public class JavaUtilCollectionsDeserializers_converter_180689703468 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term477484;
     Object term477960;

    public JavaUtilCollectionsDeserializers_converter_180689703468() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term477520 = Class.forName((String) "java.util.stream.DoublePipeline$3");
        term477484 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term477612 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term477704 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term477810 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term477924 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term477484, term477484.getClass(), "_class", term477520);
        setField(term477612, term477612.getClass(), "_class", null);
        setField(term477704, term477704.getClass(), "_class", null);
        setField(term477810, term477810.getClass(), "_class", null);
        setField(term477810, term477810.getClass(), "_superClass", term477924);
        setField(term477704, term477704.getClass(), "_superClass", term477810);
        setField(term477612, term477612.getClass(), "_superClass", term477704);
        setField(term477484, term477484.getClass(), "_superClass", term477612);
        term477960 = Class.forName((String) "java.util.stream.StreamSpliterators$InfiniteSupplyingSpliterator");
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
        args[1] = term477484;
        args[2] = term477960;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


