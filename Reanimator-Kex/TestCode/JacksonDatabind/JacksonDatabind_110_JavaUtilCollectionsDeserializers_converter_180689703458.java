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

public class JavaUtilCollectionsDeserializers_converter_180689703458 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term462208;
     Object term462746;

    public JavaUtilCollectionsDeserializers_converter_180689703458() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term462244 = Class.forName((String) "java.util.stream.Nodes$ConcNode$OfDouble");
        Class<? extends Object> term462372 = Class.forName((String) "java.util.Collections$EmptyList");
        Class<? extends Object> term462500 = Class.forName((String) "java.util.stream.SortedOps$SizedRefSortingSink");
        term462208 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term462336 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term462464 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term462604 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term462710 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term462208, term462208.getClass(), "_class", term462244);
        setField(term462336, term462336.getClass(), "_class", term462372);
        setField(term462464, term462464.getClass(), "_class", term462500);
        setField(term462604, term462604.getClass(), "_class", null);
        setField(term462604, term462604.getClass(), "_superClass", term462710);
        setField(term462464, term462464.getClass(), "_superClass", term462604);
        setField(term462336, term462336.getClass(), "_superClass", term462464);
        setField(term462208, term462208.getClass(), "_superClass", term462336);
        term462746 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.StdArraySerializers$DoubleArraySerializer");
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
        args[1] = term462208;
        args[2] = term462746;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


