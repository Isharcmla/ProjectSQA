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

public class StdDelegatingSerializer_init_78026339839 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5094;
     Object term5099;
     Object term5101;

    public StdDelegatingSerializer_init_78026339839() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5002 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        term5094 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        term5099 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        Object term5100 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term5099, term5099.getClass(), "_converter", null);
        setField(term5100, term5100.getClass(), "_keyType", null);
        setField(term5100, term5100.getClass(), "_valueType", null);
        setField(term5100, term5100.getClass(), "_canonicalName", null);
        setField(term5100, term5100.getClass(), "_class", null);
        setIntField(term5100, term5100.getClass(), "_hash", 0);
        setField(term5100, term5100.getClass(), "_valueHandler", null);
        setField(term5100, term5100.getClass(), "_typeHandler", null);
        setBooleanField(term5100, term5100.getClass(), "_asStatic", false);
        setField(term5099, term5099.getClass(), "_delegateType", term5100);
        setField(term5099, term5099.getClass(), "_delegateSerializer", null);
        setField(term5099, term5099.getClass(), "_handledType", null);
        term5101 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term5101, term5101.getClass(), "_keyType", null);
        setField(term5101, term5101.getClass(), "_valueType", null);
        setField(term5101, term5101.getClass(), "_canonicalName", null);
        setField(term5101, term5101.getClass(), "_class", null);
        setIntField(term5101, term5101.getClass(), "_hash", 0);
        setField(term5101, term5101.getClass(), "_valueHandler", null);
        setField(term5101, term5101.getClass(), "_typeHandler", null);
        setBooleanField(term5101, term5101.getClass(), "_asStatic", false);
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
        args[1] = term5094;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term5099));
        assertTrue(recursiveEquals(term5094, null));
    }

};


