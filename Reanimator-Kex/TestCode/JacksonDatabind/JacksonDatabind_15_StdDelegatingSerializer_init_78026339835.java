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

public class StdDelegatingSerializer_init_78026339835 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4600;
     Object term4605;
     Object term4607;

    public StdDelegatingSerializer_init_78026339835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4494 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        term4600 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        term4605 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        Object term4606 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term4605, term4605.getClass(), "_converter", null);
        setField(term4606, term4606.getClass(), "_elementType", null);
        setField(term4606, term4606.getClass(), "_canonicalName", null);
        setField(term4606, term4606.getClass(), "_class", null);
        setIntField(term4606, term4606.getClass(), "_hash", 0);
        setField(term4606, term4606.getClass(), "_valueHandler", null);
        setField(term4606, term4606.getClass(), "_typeHandler", null);
        setBooleanField(term4606, term4606.getClass(), "_asStatic", false);
        setField(term4605, term4605.getClass(), "_delegateType", term4606);
        setField(term4605, term4605.getClass(), "_delegateSerializer", null);
        setField(term4605, term4605.getClass(), "_handledType", null);
        term4607 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term4607, term4607.getClass(), "_elementType", null);
        setField(term4607, term4607.getClass(), "_canonicalName", null);
        setField(term4607, term4607.getClass(), "_class", null);
        setIntField(term4607, term4607.getClass(), "_hash", 0);
        setField(term4607, term4607.getClass(), "_valueHandler", null);
        setField(term4607, term4607.getClass(), "_typeHandler", null);
        setBooleanField(term4607, term4607.getClass(), "_asStatic", false);
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
        args[1] = term4600;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term4605));
        assertTrue(recursiveEquals(term4600, null));
    }

};


