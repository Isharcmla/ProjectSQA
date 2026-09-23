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

public class JavaUtilCollectionsDeserializers_converter_180689703414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term401562;
     Object term401964;

    public JavaUtilCollectionsDeserializers_converter_180689703414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term401598 = Class.forName((String) "java.util.stream.SpinedBuffer$OfDouble$1Splitr");
        term401964 = Class.forName((String) "com.fasterxml.jackson.databind.node.JsonNodeFactory");
        term401562 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term401690 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term401796 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term401910 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        setField(term401562, term401562.getClass(), "_class", term401598);
        setField(term401690, term401690.getClass(), "_class", null);
        setField(term401796, term401796.getClass(), "_class", null);
        setField(term401910, term401910.getClass(), "_class", term401964);
        setField(term401796, term401796.getClass(), "_superClass", term401910);
        setField(term401690, term401690.getClass(), "_superClass", term401796);
        setField(term401562, term401562.getClass(), "_superClass", term401690);
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
        args[1] = term401562;
        args[2] = term401964;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


