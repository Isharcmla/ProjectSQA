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

public class TypeBindings_init_352540534331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111366;
     Object term111371;

    public TypeBindings_init_352540534331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term111538 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(term111538, term111538.getClass(), "_names", null);
        setField(term111538, term111538.getClass(), "_types", null);
        term111366 = (Object[]) newArray("java.lang.String", 5);
        setElement(term111366, 0, "");
        setElement(term111366, 1, "");
        setElement(term111366, 2, "");
        setElement(term111366, 3, "");
        setElement(term111366, 4, "");
        term111371 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 5);
        Object term111796 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term111892 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term111988 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setIntField(term111796, term111796.getClass(), "_hash", 0);
        setElement(term111371, 0, term111796);
        setIntField(term111892, term111892.getClass(), "_hash", 0);
        setElement(term111371, 1, term111892);
        setIntField(term111988, term111988.getClass(), "_hash", 0);
        setElement(term111371, 2, term111988);
        setElement(term111371, 3, term111988);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term111366;
        args[1] = term111371;
        args[2] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


