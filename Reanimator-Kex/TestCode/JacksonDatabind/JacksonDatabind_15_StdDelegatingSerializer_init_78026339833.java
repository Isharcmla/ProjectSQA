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

public class StdDelegatingSerializer_init_78026339833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4346;
     Object term4351;
     Object term4353;

    public StdDelegatingSerializer_init_78026339833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4248 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        term4346 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        term4351 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        Object term4352 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term4351, term4351.getClass(), "_converter", null);
        setField(term4352, term4352.getClass(), "_typeParametersFor", null);
        setField(term4352, term4352.getClass(), "_typeParameters", null);
        setField(term4352, term4352.getClass(), "_typeNames", null);
        setField(term4352, term4352.getClass(), "_canonicalName", null);
        setField(term4352, term4352.getClass(), "_class", null);
        setIntField(term4352, term4352.getClass(), "_hash", 0);
        setField(term4352, term4352.getClass(), "_valueHandler", null);
        setField(term4352, term4352.getClass(), "_typeHandler", null);
        setBooleanField(term4352, term4352.getClass(), "_asStatic", false);
        setField(term4351, term4351.getClass(), "_delegateType", term4352);
        setField(term4351, term4351.getClass(), "_delegateSerializer", null);
        setField(term4351, term4351.getClass(), "_handledType", null);
        term4353 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term4353, term4353.getClass(), "_typeParametersFor", null);
        setField(term4353, term4353.getClass(), "_typeParameters", null);
        setField(term4353, term4353.getClass(), "_typeNames", null);
        setField(term4353, term4353.getClass(), "_canonicalName", null);
        setField(term4353, term4353.getClass(), "_class", null);
        setIntField(term4353, term4353.getClass(), "_hash", 0);
        setField(term4353, term4353.getClass(), "_valueHandler", null);
        setField(term4353, term4353.getClass(), "_typeHandler", null);
        setBooleanField(term4353, term4353.getClass(), "_asStatic", false);
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
        args[1] = term4346;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term4351));
        assertTrue(recursiveEquals(term4346, null));
    }

};


