package com.fasterxml.jackson.databind.type;

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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.databind.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeBindings_init_352540534286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92888;
     Object term92893;

    public TypeBindings_init_352540534286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term93056 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(term93056, term93056.getClass(), "_names", null);
        setField(term93056, term93056.getClass(), "_types", null);
        term92888 = (Object[]) newArray("java.lang.String", 4);
        setElement(term92888, 0, "");
        setElement(term92888, 1, "");
        setElement(term92888, 2, "");
        setElement(term92888, 3, "");
        term92893 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term93314 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term93410 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term93502 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setIntField(term93314, term93314.getClass(), "_hash", 0);
        setElement(term92893, 0, term93314);
        setIntField(term93410, term93410.getClass(), "_hash", 0);
        setElement(term92893, 1, term93410);
        setIntField(term93502, term93502.getClass(), "_hash", 0);
        setElement(term92893, 2, term93502);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term92888;
        args[1] = term92893;
        args[2] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


