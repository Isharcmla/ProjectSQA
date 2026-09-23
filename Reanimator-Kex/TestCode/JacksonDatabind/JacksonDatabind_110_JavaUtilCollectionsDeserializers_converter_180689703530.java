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

public class JavaUtilCollectionsDeserializers_converter_180689703530 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term557686;
     Object term558252;

    public JavaUtilCollectionsDeserializers_converter_180689703530() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term557722 = Class.forName((String) "java.nio.DirectCharBufferS");
        Class<? extends Object> term557850 = Class.forName((String) "java.nio.file.FileTreeWalker$EventType");
        Class<? extends Object> term557978 = Class.forName((String) "java.util.concurrent.Exchanger$Participant");
        term558252 = Class.forName((String) "kex.java.util.HashMap$HashIterator");
        term557686 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term557814 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term557942 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term558084 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term558198 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term557686, term557686.getClass(), "_class", term557722);
        setField(term557814, term557814.getClass(), "_class", term557850);
        setField(term557942, term557942.getClass(), "_class", term557978);
        setField(term558084, term558084.getClass(), "_class", null);
        setField(term558198, term558198.getClass(), "_class", term558252);
        setField(term558084, term558084.getClass(), "_superClass", term558198);
        setField(term557942, term557942.getClass(), "_superClass", term558084);
        setField(term557814, term557814.getClass(), "_superClass", term557942);
        setField(term557686, term557686.getClass(), "_superClass", term557814);
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
        args[1] = term557686;
        args[2] = term558252;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


