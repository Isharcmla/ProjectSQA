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

public class JavaUtilCollectionsDeserializers_converter_180689703113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60487;
     Object term60765;

    public JavaUtilCollectionsDeserializers_converter_180689703113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term60523 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.ClassSerializer");
        term60765 = Class.forName((String) "java.lang.StackStreamFactory");
        term60487 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term60615 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term60711 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term60487, term60487.getClass(), "_class", term60523);
        setField(term60615, term60615.getClass(), "_class", null);
        setField(term60711, term60711.getClass(), "_class", term60765);
        setField(term60615, term60615.getClass(), "_superClass", term60711);
        setField(term60487, term60487.getClass(), "_superClass", term60615);
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
        args[1] = term60487;
        args[2] = term60765;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


