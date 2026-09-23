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

public class JavaUtilCollectionsDeserializers_converter_180689703344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term316489;
     Object term316967;

    public JavaUtilCollectionsDeserializers_converter_180689703344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term316525 = Class.forName((String) "java.util.Vector$ListItr");
        term316967 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer");
        term316489 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term316617 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term316713 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term316809 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term316913 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term316489, term316489.getClass(), "_class", term316525);
        setField(term316617, term316617.getClass(), "_class", null);
        setField(term316713, term316713.getClass(), "_class", null);
        setField(term316809, term316809.getClass(), "_class", null);
        setField(term316913, term316913.getClass(), "_class", term316967);
        setField(term316809, term316809.getClass(), "_superClass", term316913);
        setField(term316713, term316713.getClass(), "_superClass", term316809);
        setField(term316617, term316617.getClass(), "_superClass", term316713);
        setField(term316489, term316489.getClass(), "_superClass", term316617);
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
        args[1] = term316489;
        args[2] = term316967;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


