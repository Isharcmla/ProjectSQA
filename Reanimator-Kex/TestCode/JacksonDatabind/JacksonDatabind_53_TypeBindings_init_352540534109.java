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
import static com.fasterxml.jackson.databind.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.type.EqualityUtils.*;
import java.lang.Object;

public class TypeBindings_init_352540534109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31881;
     Object term32009;
     Object term32012;

    public TypeBindings_init_352540534109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term31999 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(term31999, term31999.getClass(), "_names", null);
        term31881 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        term32009 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term32010 = (Object[]) newArray("java.lang.String", 0);
        Object[] term32011 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term32009, term32009.getClass(), "_names", term32010);
        setField(term32009, term32009.getClass(), "_types", term32011);
        setField(term32009, term32009.getClass(), "_unboundVariables", null);
        setIntField(term32009, term32009.getClass(), "_hashCode", 1);
        term32012 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term31881;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term32009));
        assertTrue(recursiveEquals(term31881, term32012));
    }

};


