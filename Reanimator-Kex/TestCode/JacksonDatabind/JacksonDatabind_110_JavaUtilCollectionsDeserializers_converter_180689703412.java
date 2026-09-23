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

public class JavaUtilCollectionsDeserializers_converter_180689703412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term399316;
     Object term399792;

    public JavaUtilCollectionsDeserializers_converter_180689703412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term399352 = Class.forName((String) "java.util.Vector$VectorSpliterator");
        term399316 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term399444 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term399548 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term399652 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term399756 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term399316, term399316.getClass(), "_class", term399352);
        setField(term399444, term399444.getClass(), "_class", null);
        setField(term399548, term399548.getClass(), "_class", null);
        setField(term399652, term399652.getClass(), "_class", null);
        setField(term399652, term399652.getClass(), "_superClass", term399756);
        setField(term399548, term399548.getClass(), "_superClass", term399652);
        setField(term399444, term399444.getClass(), "_superClass", term399548);
        setField(term399316, term399316.getClass(), "_superClass", term399444);
        term399792 = Class.forName((String) "java.nio.file.WatchKey");
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
        args[1] = term399316;
        args[2] = term399792;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


