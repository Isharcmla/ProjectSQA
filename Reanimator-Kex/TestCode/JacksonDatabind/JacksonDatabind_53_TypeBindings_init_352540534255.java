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

public class TypeBindings_init_352540534255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82929;
     Object term82934;

    public TypeBindings_init_352540534255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term83093 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(term83093, term83093.getClass(), "_names", null);
        setField(term83093, term83093.getClass(), "_types", null);
        term82929 = (Object[]) newArray("java.lang.String", 4);
        setElement(term82929, 0, "");
        setElement(term82929, 1, "");
        setElement(term82929, 2, "");
        setElement(term82929, 3, "");
        term82934 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term83351 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term83447 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term83553 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setIntField(term83351, term83351.getClass(), "_hash", 0);
        setElement(term82934, 0, term83351);
        setIntField(term83447, term83447.getClass(), "_hash", 0);
        setElement(term82934, 1, term83447);
        setIntField(term83553, term83553.getClass(), "_hash", 0);
        setElement(term82934, 2, term83553);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term82929;
        args[1] = term82934;
        args[2] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


