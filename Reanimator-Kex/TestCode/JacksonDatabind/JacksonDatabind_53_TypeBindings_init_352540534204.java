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

public class TypeBindings_init_352540534204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67409;
     Object term67413;

    public TypeBindings_init_352540534204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term67575 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term67417 = (Object[]) newArray("java.lang.String", 0);
        setField(term67575, term67575.getClass(), "_names", term67417);
        setField(term67575, term67575.getClass(), "_types", null);
        term67409 = (Object[]) newArray("java.lang.String", 4);
        setElement(term67409, 0, "");
        setElement(term67409, 1, "");
        setElement(term67409, 2, "");
        setElement(term67409, 3, "");
        term67413 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term67795 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term67899 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term68003 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setIntField(term67795, term67795.getClass(), "_hash", 0);
        setElement(term67413, 0, term67795);
        setIntField(term67899, term67899.getClass(), "_hash", 0);
        setElement(term67413, 1, term67899);
        setIntField(term68003, term68003.getClass(), "_hash", 0);
        setElement(term67413, 2, term68003);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term67409;
        args[1] = term67413;
        args[2] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


