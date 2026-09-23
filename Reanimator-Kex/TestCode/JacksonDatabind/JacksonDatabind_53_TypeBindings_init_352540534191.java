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

public class TypeBindings_init_352540534191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62892;
     Object term62893;
     Object term63276;
     Object term63281;
     Object term63282;

    public TypeBindings_init_352540534191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term63037 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term62896 = (Object[]) newArray("java.lang.String", 0);
        setField(term63037, term63037.getClass(), "_names", term62896);
        setField(term63037, term63037.getClass(), "_types", null);
        term62892 = (Object[]) newArray("java.lang.String", 4);
        term62893 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term63143 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term63239 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setIntField(term63143, term63143.getClass(), "_hash", 0);
        setElement(term62893, 0, term63143);
        setElement(term62893, 1, term63239);
        setElement(term62893, 2, term63239);
        setElement(term62893, 3, term63239);
        term63276 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term63277 = (Object[]) newArray("java.lang.String", 4);
        Object[] term63278 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term63279 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term63280 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term63276, term63276.getClass(), "_names", term63277);
        setField(term63279, term63279.getClass(), "_elementType", null);
        setField(term63279, term63279.getClass(), "_superClass", null);
        setField(term63279, term63279.getClass(), "_superInterfaces", null);
        setField(term63279, term63279.getClass(), "_bindings", null);
        setField(term63279, term63279.getClass(), "_canonicalName", null);
        setField(term63279, term63279.getClass(), "_class", null);
        setIntField(term63279, term63279.getClass(), "_hash", 0);
        setField(term63279, term63279.getClass(), "_valueHandler", null);
        setField(term63279, term63279.getClass(), "_typeHandler", null);
        setBooleanField(term63279, term63279.getClass(), "_asStatic", false);
        setElement(term63278, 0, term63279);
        setField(term63280, term63280.getClass(), "_componentType", null);
        setField(term63280, term63280.getClass(), "_emptyArray", null);
        setField(term63280, term63280.getClass(), "_superClass", null);
        setField(term63280, term63280.getClass(), "_superInterfaces", null);
        setField(term63280, term63280.getClass(), "_bindings", null);
        setField(term63280, term63280.getClass(), "_canonicalName", null);
        setField(term63280, term63280.getClass(), "_class", null);
        setIntField(term63280, term63280.getClass(), "_hash", 0);
        setField(term63280, term63280.getClass(), "_valueHandler", null);
        setField(term63280, term63280.getClass(), "_typeHandler", null);
        setBooleanField(term63280, term63280.getClass(), "_asStatic", false);
        setElement(term63278, 1, term63280);
        setElement(term63278, 2, term63280);
        setElement(term63278, 3, term63280);
        setField(term63276, term63276.getClass(), "_types", term63278);
        setField(term63276, term63276.getClass(), "_unboundVariables", null);
        setIntField(term63276, term63276.getClass(), "_hashCode", 1);
        term63281 = (Object[]) newArray("java.lang.String", 4);
        term63282 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term63283 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term63284 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term63283, term63283.getClass(), "_elementType", null);
        setField(term63283, term63283.getClass(), "_superClass", null);
        setField(term63283, term63283.getClass(), "_superInterfaces", null);
        setField(term63283, term63283.getClass(), "_bindings", null);
        setField(term63283, term63283.getClass(), "_canonicalName", null);
        setField(term63283, term63283.getClass(), "_class", null);
        setIntField(term63283, term63283.getClass(), "_hash", 0);
        setField(term63283, term63283.getClass(), "_valueHandler", null);
        setField(term63283, term63283.getClass(), "_typeHandler", null);
        setBooleanField(term63283, term63283.getClass(), "_asStatic", false);
        setElement(term63282, 0, term63283);
        setField(term63284, term63284.getClass(), "_componentType", null);
        setField(term63284, term63284.getClass(), "_emptyArray", null);
        setField(term63284, term63284.getClass(), "_superClass", null);
        setField(term63284, term63284.getClass(), "_superInterfaces", null);
        setField(term63284, term63284.getClass(), "_bindings", null);
        setField(term63284, term63284.getClass(), "_canonicalName", null);
        setField(term63284, term63284.getClass(), "_class", null);
        setIntField(term63284, term63284.getClass(), "_hash", 0);
        setField(term63284, term63284.getClass(), "_valueHandler", null);
        setField(term63284, term63284.getClass(), "_typeHandler", null);
        setBooleanField(term63284, term63284.getClass(), "_asStatic", false);
        setElement(term63282, 1, term63284);
        setElement(term63282, 2, term63284);
        setElement(term63282, 3, term63284);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term62892;
        args[1] = term62893;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term63276));
        assertTrue(recursiveEquals(term62892, term63281));
        assertTrue(recursiveEquals(term62893, term63282));
    }

};


