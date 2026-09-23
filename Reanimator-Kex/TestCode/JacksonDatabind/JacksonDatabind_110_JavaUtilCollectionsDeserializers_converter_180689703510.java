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

public class JavaUtilCollectionsDeserializers_converter_180689703510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term532339;
     Object term532817;

    public JavaUtilCollectionsDeserializers_converter_180689703510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term532375 = Class.forName((String) "java.lang.invoke.BoundMethodHandle$Specializer");
        term532339 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term532467 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term532571 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term532675 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term532781 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term532339, term532339.getClass(), "_class", term532375);
        setField(term532467, term532467.getClass(), "_class", null);
        setField(term532571, term532571.getClass(), "_class", null);
        setField(term532675, term532675.getClass(), "_class", null);
        setField(term532675, term532675.getClass(), "_superClass", term532781);
        setField(term532571, term532571.getClass(), "_superClass", term532675);
        setField(term532467, term532467.getClass(), "_superClass", term532571);
        setField(term532339, term532339.getClass(), "_superClass", term532467);
        term532817 = Class.forName((String) "java.util.Properties$LineReader");
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
        args[1] = term532339;
        args[2] = term532817;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


