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

public class JavaUtilCollectionsDeserializers_converter_180689703272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term226236;
     Object term226492;

    public JavaUtilCollectionsDeserializers_converter_180689703272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term226364 = Class.forName((String) "java.lang.FdLibm$Cbrt");
        term226236 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term226328 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term226456 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term226236, term226236.getClass(), "_class", null);
        setField(term226328, term226328.getClass(), "_class", term226364);
        setField(term226328, term226328.getClass(), "_superClass", term226456);
        setField(term226236, term226236.getClass(), "_superClass", term226328);
        term226492 = Class.forName((String) "com.fasterxml.jackson.databind.ser.impl.WritableObjectId");
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
        args[1] = term226236;
        args[2] = term226492;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


