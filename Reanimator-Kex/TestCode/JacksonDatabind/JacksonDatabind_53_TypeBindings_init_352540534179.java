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

public class TypeBindings_init_352540534179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59910;
     Object term59911;
     Object term60295;
     Object term60300;
     Object term60301;

    public TypeBindings_init_352540534179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term60056 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term59914 = (Object[]) newArray("java.lang.String", 0);
        Object[] term59915 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term60056, term60056.getClass(), "_names", term59914);
        setField(term60056, term60056.getClass(), "_types", term59915);
        term59910 = (Object[]) newArray("java.lang.String", 2);
        term59911 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 2);
        Object term60162 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term60268 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setIntField(term60162, term60162.getClass(), "_hash", 0);
        setElement(term59911, 0, term60162);
        setElement(term59911, 1, term60268);
        term60295 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term60296 = (Object[]) newArray("java.lang.String", 2);
        Object[] term60297 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 2);
        Object term60298 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term60299 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term60295, term60295.getClass(), "_names", term60296);
        setField(term60298, term60298.getClass(), "_elementType", null);
        setField(term60298, term60298.getClass(), "_superClass", null);
        setField(term60298, term60298.getClass(), "_superInterfaces", null);
        setField(term60298, term60298.getClass(), "_bindings", null);
        setField(term60298, term60298.getClass(), "_canonicalName", null);
        setField(term60298, term60298.getClass(), "_class", null);
        setIntField(term60298, term60298.getClass(), "_hash", 0);
        setField(term60298, term60298.getClass(), "_valueHandler", null);
        setField(term60298, term60298.getClass(), "_typeHandler", null);
        setBooleanField(term60298, term60298.getClass(), "_asStatic", false);
        setElement(term60297, 0, term60298);
        setField(term60299, term60299.getClass(), "_elementType", null);
        setField(term60299, term60299.getClass(), "_superClass", null);
        setField(term60299, term60299.getClass(), "_superInterfaces", null);
        setField(term60299, term60299.getClass(), "_bindings", null);
        setField(term60299, term60299.getClass(), "_canonicalName", null);
        setField(term60299, term60299.getClass(), "_class", null);
        setIntField(term60299, term60299.getClass(), "_hash", 0);
        setField(term60299, term60299.getClass(), "_valueHandler", null);
        setField(term60299, term60299.getClass(), "_typeHandler", null);
        setBooleanField(term60299, term60299.getClass(), "_asStatic", false);
        setElement(term60297, 1, term60299);
        setField(term60295, term60295.getClass(), "_types", term60297);
        setField(term60295, term60295.getClass(), "_unboundVariables", null);
        setIntField(term60295, term60295.getClass(), "_hashCode", 1);
        term60300 = (Object[]) newArray("java.lang.String", 2);
        term60301 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 2);
        Object term60302 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term60303 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term60302, term60302.getClass(), "_elementType", null);
        setField(term60302, term60302.getClass(), "_superClass", null);
        setField(term60302, term60302.getClass(), "_superInterfaces", null);
        setField(term60302, term60302.getClass(), "_bindings", null);
        setField(term60302, term60302.getClass(), "_canonicalName", null);
        setField(term60302, term60302.getClass(), "_class", null);
        setIntField(term60302, term60302.getClass(), "_hash", 0);
        setField(term60302, term60302.getClass(), "_valueHandler", null);
        setField(term60302, term60302.getClass(), "_typeHandler", null);
        setBooleanField(term60302, term60302.getClass(), "_asStatic", false);
        setElement(term60301, 0, term60302);
        setField(term60303, term60303.getClass(), "_elementType", null);
        setField(term60303, term60303.getClass(), "_superClass", null);
        setField(term60303, term60303.getClass(), "_superInterfaces", null);
        setField(term60303, term60303.getClass(), "_bindings", null);
        setField(term60303, term60303.getClass(), "_canonicalName", null);
        setField(term60303, term60303.getClass(), "_class", null);
        setIntField(term60303, term60303.getClass(), "_hash", 0);
        setField(term60303, term60303.getClass(), "_valueHandler", null);
        setField(term60303, term60303.getClass(), "_typeHandler", null);
        setBooleanField(term60303, term60303.getClass(), "_asStatic", false);
        setElement(term60301, 1, term60303);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term59910;
        args[1] = term59911;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term60295));
        assertTrue(recursiveEquals(term59910, term60300));
        assertTrue(recursiveEquals(term59911, term60301));
    }

};


