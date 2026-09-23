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

public class TypeBindings_init_352540534111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32062;
     Object term32063;
     Object term32316;
     Object term32320;
     Object term32321;

    public TypeBindings_init_352540534111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term32191 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term32065 = (Object[]) newArray("java.lang.String", 0);
        setField(term32191, term32191.getClass(), "_names", term32065);
        setField(term32191, term32191.getClass(), "_types", null);
        term32062 = (Object[]) newArray("java.lang.String", 1);
        term32063 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 1);
        Object term32297 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setElement(term32063, 0, term32297);
        term32316 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term32317 = (Object[]) newArray("java.lang.String", 1);
        Object[] term32318 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 1);
        Object term32319 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term32316, term32316.getClass(), "_names", term32317);
        setField(term32319, term32319.getClass(), "_elementType", null);
        setField(term32319, term32319.getClass(), "_superClass", null);
        setField(term32319, term32319.getClass(), "_superInterfaces", null);
        setField(term32319, term32319.getClass(), "_bindings", null);
        setField(term32319, term32319.getClass(), "_canonicalName", null);
        setField(term32319, term32319.getClass(), "_class", null);
        setIntField(term32319, term32319.getClass(), "_hash", 0);
        setField(term32319, term32319.getClass(), "_valueHandler", null);
        setField(term32319, term32319.getClass(), "_typeHandler", null);
        setBooleanField(term32319, term32319.getClass(), "_asStatic", false);
        setElement(term32318, 0, term32319);
        setField(term32316, term32316.getClass(), "_types", term32318);
        setField(term32316, term32316.getClass(), "_unboundVariables", null);
        setIntField(term32316, term32316.getClass(), "_hashCode", 1);
        term32320 = (Object[]) newArray("java.lang.String", 1);
        term32321 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 1);
        Object term32322 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term32322, term32322.getClass(), "_elementType", null);
        setField(term32322, term32322.getClass(), "_superClass", null);
        setField(term32322, term32322.getClass(), "_superInterfaces", null);
        setField(term32322, term32322.getClass(), "_bindings", null);
        setField(term32322, term32322.getClass(), "_canonicalName", null);
        setField(term32322, term32322.getClass(), "_class", null);
        setIntField(term32322, term32322.getClass(), "_hash", 0);
        setField(term32322, term32322.getClass(), "_valueHandler", null);
        setField(term32322, term32322.getClass(), "_typeHandler", null);
        setBooleanField(term32322, term32322.getClass(), "_asStatic", false);
        setElement(term32321, 0, term32322);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term32062;
        args[1] = term32063;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term32316));
        assertTrue(recursiveEquals(term32062, term32320));
        assertTrue(recursiveEquals(term32063, term32321));
    }

};


