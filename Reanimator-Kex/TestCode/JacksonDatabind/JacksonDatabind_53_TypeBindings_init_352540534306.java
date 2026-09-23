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

public class TypeBindings_init_352540534306 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101512;
     Object term101516;

    public TypeBindings_init_352540534306() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term101668 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term101519 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term101668, term101668.getClass(), "_names", null);
        setField(term101668, term101668.getClass(), "_types", term101519);
        term101512 = (Object[]) newArray("java.lang.String", 3);
        setElement(term101512, 0, "");
        setElement(term101512, 1, "");
        setElement(term101512, 2, "");
        term101516 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 3);
        Object term101886 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term101990 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setIntField(term101886, term101886.getClass(), "_hash", 0);
        setElement(term101516, 0, term101886);
        setIntField(term101990, term101990.getClass(), "_hash", 0);
        setElement(term101516, 1, term101990);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term101512;
        args[1] = term101516;
        args[2] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


