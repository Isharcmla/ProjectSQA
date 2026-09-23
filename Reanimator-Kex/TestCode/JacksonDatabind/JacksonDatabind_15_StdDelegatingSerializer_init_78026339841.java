package com.fasterxml.jackson.databind.ser.std;

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
import static com.fasterxml.jackson.databind.ser.std.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.ser.std.EqualityUtils.*;
import java.lang.Object;

public class StdDelegatingSerializer_init_78026339841 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5338;
     Object term5343;
     Object term5345;

    public StdDelegatingSerializer_init_78026339841() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5242 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        term5338 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        term5343 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        Object term5344 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term5343, term5343.getClass(), "_converter", null);
        setField(term5344, term5344.getClass(), "_componentType", null);
        setField(term5344, term5344.getClass(), "_emptyArray", null);
        setField(term5344, term5344.getClass(), "_canonicalName", null);
        setField(term5344, term5344.getClass(), "_class", null);
        setIntField(term5344, term5344.getClass(), "_hash", 0);
        setField(term5344, term5344.getClass(), "_valueHandler", null);
        setField(term5344, term5344.getClass(), "_typeHandler", null);
        setBooleanField(term5344, term5344.getClass(), "_asStatic", false);
        setField(term5343, term5343.getClass(), "_delegateType", term5344);
        setField(term5343, term5343.getClass(), "_delegateSerializer", null);
        setField(term5343, term5343.getClass(), "_handledType", null);
        term5345 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term5345, term5345.getClass(), "_componentType", null);
        setField(term5345, term5345.getClass(), "_emptyArray", null);
        setField(term5345, term5345.getClass(), "_canonicalName", null);
        setField(term5345, term5345.getClass(), "_class", null);
        setIntField(term5345, term5345.getClass(), "_hash", 0);
        setField(term5345, term5345.getClass(), "_valueHandler", null);
        setField(term5345, term5345.getClass(), "_typeHandler", null);
        setBooleanField(term5345, term5345.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.util.Converter");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JsonSerializer");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term5338;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term5343));
        assertTrue(recursiveEquals(term5338, null));
    }

};


