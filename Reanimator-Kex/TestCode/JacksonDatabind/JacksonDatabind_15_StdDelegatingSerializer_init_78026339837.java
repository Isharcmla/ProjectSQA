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

public class StdDelegatingSerializer_init_78026339837 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4854;
     Object term4859;
     Object term4861;

    public StdDelegatingSerializer_init_78026339837() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4748 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        term4854 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        term4859 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        Object term4860 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term4859, term4859.getClass(), "_converter", null);
        setField(term4860, term4860.getClass(), "_elementType", null);
        setField(term4860, term4860.getClass(), "_canonicalName", null);
        setField(term4860, term4860.getClass(), "_class", null);
        setIntField(term4860, term4860.getClass(), "_hash", 0);
        setField(term4860, term4860.getClass(), "_valueHandler", null);
        setField(term4860, term4860.getClass(), "_typeHandler", null);
        setBooleanField(term4860, term4860.getClass(), "_asStatic", false);
        setField(term4859, term4859.getClass(), "_delegateType", term4860);
        setField(term4859, term4859.getClass(), "_delegateSerializer", null);
        setField(term4859, term4859.getClass(), "_handledType", null);
        term4861 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term4861, term4861.getClass(), "_elementType", null);
        setField(term4861, term4861.getClass(), "_canonicalName", null);
        setField(term4861, term4861.getClass(), "_class", null);
        setIntField(term4861, term4861.getClass(), "_hash", 0);
        setField(term4861, term4861.getClass(), "_valueHandler", null);
        setField(term4861, term4861.getClass(), "_typeHandler", null);
        setBooleanField(term4861, term4861.getClass(), "_asStatic", false);
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
        args[1] = term4854;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term4859));
        assertTrue(recursiveEquals(term4854, null));
    }

};


