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

public class TypeBindings_init_352540534429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term161405;
     Object term161413;

    public TypeBindings_init_352540534429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term161625 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term161422 = (Object[]) newArray("java.lang.String", 0);
        setField(term161625, term161625.getClass(), "_names", term161422);
        setField(term161625, term161625.getClass(), "_types", null);
        term161405 = (Object[]) newArray("java.lang.String", 9);
        setElement(term161405, 0, "");
        setElement(term161405, 1, "");
        setElement(term161405, 2, "");
        setElement(term161405, 3, "");
        setElement(term161405, 4, "");
        setElement(term161405, 5, "");
        setElement(term161405, 6, "");
        setElement(term161405, 7, "");
        setElement(term161405, 8, "");
        term161413 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 9);
        Object term162011 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term162115 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term162219 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term162339 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term162445 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term162551 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term162655 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term162761 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setIntField(term162011, term162011.getClass(), "_hash", 0);
        setElement(term161413, 0, term162011);
        setIntField(term162115, term162115.getClass(), "_hash", 0);
        setElement(term161413, 1, term162115);
        setIntField(term162219, term162219.getClass(), "_hash", 0);
        setElement(term161413, 2, term162219);
        setIntField(term162339, term162339.getClass(), "_hash", 0);
        setElement(term161413, 3, term162339);
        setIntField(term162445, term162445.getClass(), "_hash", 0);
        setElement(term161413, 4, term162445);
        setIntField(term162551, term162551.getClass(), "_hash", 0);
        setElement(term161413, 5, term162551);
        setIntField(term162655, term162655.getClass(), "_hash", 0);
        setElement(term161413, 6, term162655);
        setIntField(term162761, term162761.getClass(), "_hash", 0);
        setElement(term161413, 7, term162761);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term161405;
        args[1] = term161413;
        args[2] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


