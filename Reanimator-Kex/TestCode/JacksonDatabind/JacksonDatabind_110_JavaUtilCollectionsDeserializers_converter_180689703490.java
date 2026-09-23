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

public class JavaUtilCollectionsDeserializers_converter_180689703490 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term505273;
     Object term505871;

    public JavaUtilCollectionsDeserializers_converter_180689703490() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term505309 = Class.forName((String) "java.util.ArraysParallelSortHelpers$FJByte$Sorter");
        Class<? extends Object> term505459 = Class.forName((String) "java.util.function.IntPredicate");
        Class<? extends Object> term505601 = Class.forName((String) "java.util.Stack");
        term505273 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term505423 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        Object term505565 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term505721 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term505835 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term505273, term505273.getClass(), "_class", term505309);
        setField(term505423, term505423.getClass(), "_class", term505459);
        setField(term505565, term505565.getClass(), "_class", term505601);
        setField(term505721, term505721.getClass(), "_class", null);
        setField(term505721, term505721.getClass(), "_superClass", term505835);
        setField(term505565, term505565.getClass(), "_superClass", term505721);
        setField(term505423, term505423.getClass(), "_superClass", term505565);
        setField(term505273, term505273.getClass(), "_superClass", term505423);
        term505871 = Class.forName((String) "java.util.stream.Nodes$ConcNode$OfInt");
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
        args[1] = term505273;
        args[2] = term505871;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


