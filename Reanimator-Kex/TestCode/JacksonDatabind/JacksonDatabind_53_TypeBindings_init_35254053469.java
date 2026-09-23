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

public class TypeBindings_init_35254053469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13137;
     Object term13262;
     Object term13265;

    public TypeBindings_init_35254053469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term13252 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(term13252, term13252.getClass(), "_names", null);
        term13137 = (Object[]) newArray("java.lang.String", 0);
        term13262 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term13263 = (Object[]) newArray("java.lang.String", 0);
        Object[] term13264 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term13262, term13262.getClass(), "_names", term13263);
        setField(term13262, term13262.getClass(), "_types", term13264);
        setField(term13262, term13262.getClass(), "_unboundVariables", null);
        setIntField(term13262, term13262.getClass(), "_hashCode", 1);
        term13265 = (Object[]) newArray("java.lang.String", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term13137;
        args[1] = null;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term13262));
        assertTrue(recursiveEquals(term13137, term13265));
    }

};


