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

public class JavaUtilCollectionsDeserializers_converter_180689703165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111507;
     Object term111925;

    public JavaUtilCollectionsDeserializers_converter_180689703165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term111543 = Class.forName((String) "java.util.EnumMap$EntryIterator");
        Class<? extends Object> term111671 = Class.forName((String) "com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor");
        term111507 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term111635 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term111785 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        Object term111889 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term111507, term111507.getClass(), "_class", term111543);
        setField(term111635, term111635.getClass(), "_class", term111671);
        setField(term111785, term111785.getClass(), "_class", null);
        setField(term111785, term111785.getClass(), "_superClass", term111889);
        setField(term111635, term111635.getClass(), "_superClass", term111785);
        setField(term111507, term111507.getClass(), "_superClass", term111635);
        term111925 = Class.forName((String) "java.util.stream.SliceOps$2$1");
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
        args[1] = term111507;
        args[2] = term111925;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


